package com.cmos.ipa.client;

import com.cmos.ipa.service.SocketService;
import com.cmos.ipa.utils.DataTool;
import com.cmos.ipa.utils.Global;
import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.PooledByteBufAllocator;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;

/**
 * <code>Nettyclient</code>
 * @author Hardy
 * @date 2016/4/30 2:52
 * @version 1.0
 */
public class NettyClient {

    private DataTool dataTool;
    private SocketService socketService;
    private static NettyClient nc;

    public static NettyClient init(){
        if(nc == null){
            nc = new NettyClient();
        }
        return nc;
    }

    public void run(){
        EventLoopGroup workerGroup = new NioEventLoopGroup();
        try {
            Bootstrap bootstrap = new Bootstrap();
            bootstrap.group( workerGroup).channel(NioSocketChannel.class) ;

            bootstrap.option(ChannelOption.SO_KEEPALIVE, true) ;
            bootstrap.handler(new ChannelInitializer<SocketChannel>() {

                @Override
                protected void initChannel(SocketChannel ch) throws Exception {
                    ch.pipeline().addLast(new LengthFieldBasedFrameDecoder(1024, 2, 2, -4, 0));
                    ch.pipeline().addLast(new NettyClientHandler(socketService,dataTool));
                }
            });

            ChannelFuture channelFuture = null;
            try {
                channelFuture = bootstrap.connect(Global.GWHostAddr,Global.GWHostPort).sync();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Channel channel=channelFuture.channel();

//            while (true){
//                ByteBuf buffer= PooledByteBufAllocator.DEFAULT.heapBuffer(10);
//                buffer.writeShort(Short.MIN_VALUE);//包长占2字节
//                buffer.writeByte(1);
//                buffer.writeByte(0);
//                buffer.setShort(0,buffer.writerIndex()-0x2);
//                channel.writeAndFlush(buffer) ;
//
//                try {
//                    Thread.sleep(5000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }


        }finally {
            workerGroup.shutdownGracefully();
        }

    }

}
