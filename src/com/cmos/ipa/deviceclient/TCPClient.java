package com.cmos.ipa.deviceclient;

import com.cmos.ipa.utils.Global;
import com.cmos.ipa.utils.log.Logger;
import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.PooledByteBufAllocator;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;

import java.net.InetSocketAddress;
import java.util.concurrent.TimeUnit;

/**
 * <code>TCP Client</code>
 * @author Hardy
 * @date 2016/5/9 4:17
 * @version 1.0
 */
public class TCPClient {

    private volatile EventLoopGroup workerGroup;
    private volatile Bootstrap bootstrap;
    private volatile boolean closed = false;
    private  String deviceHost;
    private  int devicePort;
    protected static Channel channel;
    private Logger log;
    private  int reConnection;
    private static TCPClient tcpClient;

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

                pipeline.addLast("TCPClientHandler",new TCPClientHandler());

            }
        });
        doConnect();
    }

    private void doConnect() {
        if (closed) {
            return;
        }
        ChannelFuture future = bootstrap.connect(new InetSocketAddress(deviceHost, devicePort));
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
        return String.format("DeviceHost=%s DevicePort=%d",
                deviceHost,
                devicePort);
    }
}
