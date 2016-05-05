package com.cmos.ipa.client;

import com.cmos.ipa.pojo.MsgHeart;
import com.cmos.ipa.utils.DataTool;
import com.cmos.ipa.utils.log.Logger;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.PooledByteBufAllocator;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.concurrent.ScheduledFuture;

import java.util.concurrent.TimeUnit;

/**
 * <code>心跳处理器</code>
 * @author Hardy
 * @date 2016/5/4 4:18
 * @version 1.0
 */
public class HeartBeatHandler extends ChannelInboundHandlerAdapter {


    private boolean canDo;
    private boolean flag;
    private Logger log;
    private DataTool dataTool;
    private  MsgHeart mh;
    private volatile ScheduledFuture<?> heartBeat;

    public HeartBeatHandler(){
        this.canDo = true;
        this.flag  = true;
        this.log = Logger.getInstance();
        this.mh  = new MsgHeart();
        this.dataTool = new DataTool();
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        System.err.println("++++++++++++HeartBeatHandler+++++++++++++++");
        while(canDo) {
            ByteBuf buffer = PooledByteBufAllocator.DEFAULT.heapBuffer(10);
            buffer.writeBytes(mh.encoded());
            ctx.channel().writeAndFlush(buffer);
            canDo = false;
        }
    }


    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg)
            throws Exception {
        ByteBuf m = (ByteBuf) msg;
        byte[] receiveData= dataTool.getBytesFromByteBuf(m);

        if (receiveData.length > 0){
            System.err.println(dataTool.bytes2hex(receiveData));
        }
        MsgHeart mh = new MsgHeart();
        mh.decoded(receiveData);
//        mh.toString();
        // 握手成功，启动心跳发送任务
        System.err.println("********************");
        while(flag) {
            log.log_info("start HeartBeatTask");
            heartBeat = ctx.executor().scheduleAtFixedRate(
                    new HeartBeatTask(ctx), 0, 10000,
                    TimeUnit.MILLISECONDS);
            flag = false;
        }


    }

    private class HeartBeatTask implements Runnable {
        private final ChannelHandlerContext ctx;

        public HeartBeatTask(final ChannelHandlerContext ctx) {
            this.ctx = ctx;
        }

        @Override
        public void run() {
            ByteBuf buffer= PooledByteBufAllocator.DEFAULT.heapBuffer(10);
            buffer.writeBytes(mh.encoded());
            ctx.channel().writeAndFlush(buffer);
        }
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
