package com.cmos.ipa.client;

import com.cmos.ipa.pojo.MsgStatus;
import com.cmos.ipa.utils.DataTool;
import com.cmos.ipa.utils.Global;
import com.cmos.ipa.utils.log.Logger;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.PooledByteBufAllocator;
import io.netty.channel.ChannelHandlerContext;

/**
 * <code>状态消息处理器</code>
 * @author Hardy
 * @date 2016/5/4 10:18
 * @version 1.0
 */
public class StatusHandler extends Thread {

    private boolean canDo;
    private Logger log;
    private DataTool dataTool;
    private MsgStatus mstatus;
    private ChannelHandlerContext ctx;

    public StatusHandler(ChannelHandlerContext ctx){
        this.canDo = true;
        this.log = Logger.getInstance();
        this.dataTool = new DataTool();
        this.mstatus = new MsgStatus();
        this.ctx = ctx;
    }

    @Override
    public void run() {

        System.out.println("状态任务开启了。。。。");
        while(true) {
            MsgStatus ms = new MsgStatus();

            if(!Global.statusQueue.isEmpty()){
                try {
                    ms = Global.statusQueue.take();
                    ByteBuf buffer=dataTool.getByteBuf(dataTool.bytes2hex(ms.encoded()));
                    ctx.channel().writeAndFlush(buffer);
                } catch (InterruptedException e) {
                    log.log_error("AlarmHandler>>run>>InterruptedException",e);
                    continue;
                }
            }
        }
    }

}
