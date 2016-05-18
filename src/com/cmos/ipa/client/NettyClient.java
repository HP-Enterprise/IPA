package com.cmos.ipa.client;

import com.cmos.ipa.utils.DataTool;
import com.cmos.ipa.utils.Global;
import com.cmos.ipa.utils.log.Logger;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;

import java.net.InetSocketAddress;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * <code>Nettyclient</code>
 * @author Hardy
 * @date 2016/4/30 2:52
 * @version 1.0
 */
public class NettyClient {

    private DataTool dataTool;
    private volatile EventLoopGroup workerGroup;
    private volatile Bootstrap bootstrap;
    private volatile boolean closed = false;
    private  String remoteWGHost;
    private  int remoteWGPort;
    private  int reConnection;
    protected static Channel channel;
    private static NettyClient nc;
    private Logger log = Logger.getInstance();

    private ScheduledExecutorService executor = Executors
            .newScheduledThreadPool(1);
    EventLoopGroup group = new NioEventLoopGroup();

    public static NettyClient init(){
        if(nc == null){
            nc = new NettyClient();
        }
        return nc;
    }

    public NettyClient(){
        this.remoteWGHost = Global.GWHostAddr;
        this.remoteWGPort = Global.GWHostPort;
        this.reConnection = Global.RECONNECTION;
    }

    public void connect() {
        // 配置客户端NIO线程组
        log.log_info("try connect to server @" + remoteWGHost + ":"+remoteWGPort);
        Global.ThreadFlag = false;
        try {
            Bootstrap b = new Bootstrap();
            b.group(group).channel(NioSocketChannel.class)
                    .option(ChannelOption.TCP_NODELAY, true)
                    .handler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        public void initChannel(SocketChannel ch)
                                throws Exception {
                            Global.ThreadFlag = true;
                            ch.pipeline().addLast(new LengthFieldBasedFrameDecoder(1024, 2, 2, -4, 0));
                            ch.pipeline().addLast("NettyClientHandler", new NettyClientHandler());

                        }
                    });
            // 发起异步连接操作
            ChannelFuture future = b.connect(
                    new InetSocketAddress(remoteWGHost, remoteWGPort)).sync();
            future.channel().closeFuture().sync();
        } catch (InterruptedException e) {
            Global.ThreadFlag = false;
            connect();// 发起重连操作
        } finally {
            // 所有资源释放完成之后，清空资源，再次发起重连操作
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        TimeUnit.SECONDS.sleep(reConnection);
                        try {
                            connect();// 发起重连操作
                        } catch (Exception e) {
                            Global.ThreadFlag = false;
                        }
                    } catch (InterruptedException e) {
                        Global.ThreadFlag = false;
                    }
                }
            });
        }
    }


    private String getServerInfo() {
        return String.format("RemoteWGHost=%s RemoteWGPort=%d",
                remoteWGHost,
                remoteWGPort);
    }

}
