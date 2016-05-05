package com.cmos.ipa.client;

import com.cmos.ipa.utils.DataTool;
import com.cmos.ipa.utils.log.Logger;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.PooledByteBufAllocator;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

/**
 * <code>状态消息处理器</code>
 * @author Hardy
 * @date 2016/5/4 10:18
 * @version 1.0
 */
public class StatusHandler extends ChannelInboundHandlerAdapter {

    private boolean canDo;
    private Logger log;
    private DataTool dataTool;

    public StatusHandler(){
        this.canDo = true;
        this.log = Logger.getInstance();
        this.dataTool = new DataTool();
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        while(canDo) {
            ByteBuf buffer = PooledByteBufAllocator.DEFAULT.heapBuffer(10);
//            buffer.writeBytes();
            ctx.channel().writeAndFlush(buffer);
            canDo = false;
        }
    }

}
