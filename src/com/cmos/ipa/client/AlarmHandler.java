package com.cmos.ipa.client;


import com.cmos.ipa.pojo.MsgAlarm;
import com.cmos.ipa.utils.DataTool;
import com.cmos.ipa.utils.Global;
import com.cmos.ipa.utils.log.Logger;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.PooledByteBufAllocator;
import io.netty.channel.ChannelHandlerContext;

/**
 * <code>警告消息处理器</code>
 * @author Hardy
 * @date 2016/5/4 4:18
 * @version 1.0
 */
public class AlarmHandler extends Thread {
    private boolean canDo;
    private Logger log;
    private DataTool dataTool;
    private MsgAlarm ma;
    private ChannelHandlerContext ctx;

    public AlarmHandler(ChannelHandlerContext ctx){
        this.canDo = true;
        this.log = Logger.getInstance();
        this.dataTool = new DataTool();
        this.ma = new MsgAlarm();
        this.ctx = ctx;
    }

    @Override
    public void run() {

        while(Global.ThreadFlag) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
            	e.printStackTrace();
            	Thread.currentThread().interrupt();
            }

            MsgAlarm msgAlarm;
            if(!Global.alarmQueue.isEmpty()){
                try {
                    msgAlarm = Global.alarmQueue.take();
                    Global.print(msgAlarm.toString());
                    ByteBuf buffer=dataTool.getByteBuf(dataTool.bytes2hex(msgAlarm.encoded()));
                    ctx.channel().writeAndFlush(buffer);
                } catch (InterruptedException e) {
                    log.log_error("AlarmHandler>>run>>InterruptedException",e);
                    Global.ThreadFlag = false;
                    Thread.currentThread().interrupt();
//                    continue;
                }
            }
        }
    }
}
