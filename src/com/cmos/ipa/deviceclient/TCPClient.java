package com.cmos.ipa.deviceclient;

import com.cmos.ipa.client.NettyClientHandler;
import com.cmos.ipa.utils.Global;
import com.cmos.ipa.utils.log.Logger;
import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.PooledByteBufAllocator;
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
 * <code>TCP Client</code>
 * @author Hardy
 * @date 2016/5/9 4:17
 * @version 1.0
 */
public class TCPClient extends  Thread{

    private volatile EventLoopGroup workerGroup;
    private volatile Bootstrap bootstrap;
    private volatile boolean closed = false;
    private  String deviceHost;
    private  int devicePort;
    protected static Channel channel;
    private Logger log;
    private  int reConnection;
    private static TCPClient tcpClient;

    private ScheduledExecutorService executor = Executors
            .newScheduledThreadPool(1);
    EventLoopGroup group = new NioEventLoopGroup();

    public TCPClient(){
        this.deviceHost = Global.DeviceAddr;
        this.devicePort = Global.DevicePort;
        this.reConnection = Global.RECONNECTION;
        log = Logger.getInstance();
    }

    public static TCPClient getInstance(){
        if(tcpClient == null){
            synchronized (TCPClient.class){
                if(tcpClient == null){
                    tcpClient = new TCPClient();
                }
            }
        }
        return tcpClient;
    }

    public void run(){
        connect();
    }


    public void connect() {
        // 配置客户端NIO线程组
        log.log_info("try connect to deviceServer @" + deviceHost + ":"+devicePort);
        try {
            Bootstrap b = new Bootstrap();
            b.group(group).channel(NioSocketChannel.class)
                    .option(ChannelOption.TCP_NODELAY, true)
                    .handler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        public void initChannel(SocketChannel ch)
                                throws Exception {
                            ch.pipeline().addLast("TCPClientHandler", new TCPClientHandler());

                        }
                    });
            // 发起异步连接操作
            ChannelFuture future = b.connect(
                    new InetSocketAddress(deviceHost, devicePort)).sync();
            future.channel().closeFuture().sync();
        } catch (InterruptedException e) {
            connect();// 发起重连操作
            Thread.currentThread().interrupt();
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
                        }
                    } catch (InterruptedException e) {
                    	e.printStackTrace();
                    	Thread.currentThread().interrupt();
                    }
                }
            });
        }
    }


    private String getServerInfo() {
        return String.format("DeviceHost=%s DevicePort=%d",
                deviceHost,
                devicePort);
    }
}
