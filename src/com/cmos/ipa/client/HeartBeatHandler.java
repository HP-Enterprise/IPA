package com.cmos.ipa.client;

import com.cmos.ipa.pojo.MsgHeart;
import com.cmos.ipa.utils.DataTool;
import com.cmos.ipa.utils.log.Logger;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.PooledByteBufAllocator;
import io.netty.channel.ChannelHandlerContext;
/**
 * <code>心跳处理器</code>
 * @author Hardy
 * @date 2016/5/4 4:18
 * @version 1.0
 */
public class HeartBeatHandler extends Thread{


    private boolean canDo;
    private Logger log;
    private DataTool dataTool;
    private MsgHeart mh;
    private final ChannelHandlerContext ctx;


    public HeartBeatHandler(final ChannelHandlerContext ctx){
        this.canDo = true;
        this.log = Logger.getInstance();
        this.mh  = new MsgHeart();
        this.dataTool = new DataTool();
        this.ctx = ctx;
    }

        @Override
        public void run() {
            ByteBuf buffer= PooledByteBufAllocator.DEFAULT.heapBuffer(10);
            buffer.writeBytes(mh.encoded());
            ctx.channel().writeAndFlush(buffer);
        }

}
