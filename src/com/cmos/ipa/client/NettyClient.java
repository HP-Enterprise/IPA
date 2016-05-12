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

    public void run(){
        closed = false;
        workerGroup = new NioEventLoopGroup();
        bootstrap = new Bootstrap();
        bootstrap.group(workerGroup);
        bootstrap.channel(NioSocketChannel.class);
        bootstrap.handler(new ChannelInitializer<SocketChannel>() {
            @Override
            public void initChannel(SocketChannel ch) throws Exception {
                ChannelPipeline pipeline = ch.pipeline();
                //重连处理
                pipeline.addFirst(new ChannelInboundHandlerAdapter() {
                    @Override
                    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
                        super.channelInactive(ctx);
                        ctx.channel().eventLoop().schedule(new Runnable() {
                            @Override
                            public void run() {
                                doConnect();
                            }
                        }, reConnection, TimeUnit.SECONDS);
                    }
                });

                pipeline.addLast(new LengthFieldBasedFrameDecoder(1024, 2, 2, -4, 0));
                pipeline.addLast("NettyClientHandler",new NettyClientHandler());
            }
        });
        doConnect();
    }

    private void doConnect() {
        if (closed) {
            return;
        }
        ChannelFuture future = bootstrap.connect(new InetSocketAddress(remoteWGHost, remoteWGPort));
        future.addListener(new ChannelFutureListener() {
            public void operationComplete(ChannelFuture f) throws Exception {
                if (f.isSuccess()) {
                    log.log_info("Started Tcp Client: " + getServerInfo());
                } else {
                    log.log_info("Started Tcp Client Failed: " + getServerInfo());
                    f.channel().eventLoop().schedule(new Runnable() {
                        @Override
                        public void run() {
                            doConnect();
                        }
                    }, 1, TimeUnit.SECONDS);
                }
            }
        });
    }

    public void close() {
        closed = true;
        workerGroup.shutdownGracefully();
    }

    private String getServerInfo() {
        return String.format("RemoteWGHost=%s RemoteWGPort=%d",
                remoteWGHost,
                remoteWGPort);
    }

}
