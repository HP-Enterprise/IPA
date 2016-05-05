package com.cmos.ipa.client;

import com.cmos.ipa.utils.DataTool;
import com.cmos.ipa.utils.log.Logger;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.PooledByteBufAllocator;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.concurrent.ScheduledFuture;

/**
 * <code>参数下载处理器</code>
 * @author Hardy
 * @date 2016/5/4 4:18
 * @version 1.0
 */
public class ParamdownloadHandler extends ChannelInboundHandlerAdapter {

    private boolean canDo;
    private boolean flag;
    private Logger log;
    private DataTool dataTool;
    private volatile ScheduledFuture<?> heartBeat;

    public ParamdownloadHandler(){
        this.canDo = true;
        this.flag  = true;
        this.log = Logger.getInstance();
        this.dataTool = new DataTool();
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        System.err.println("++++++++++++ParamdownloadHandler+++++++++++++++");
        while(canDo) {
            ByteBuf buffer = PooledByteBufAllocator.DEFAULT.heapBuffer(10);
//            buffer.writeBytes();
            ctx.channel().writeAndFlush(buffer);
            canDo = false;
        }
    }


    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg)
            throws Exception {
        ByteBuf m = (ByteBuf) msg;
        byte[] receiveData= dataTool.getBytesFromByteBuf(m);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause)
            throws Exception {
        cause.printStackTrace();
        if (heartBeat != null) {
            heartBeat.cancel(true);
            heartBeat = null;
        }
        ctx.fireExceptionCaught(cause);
    }

}
