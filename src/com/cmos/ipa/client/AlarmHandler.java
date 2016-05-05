package com.cmos.ipa.client;


import com.cmos.ipa.pojo.MsgAlarm;
import com.cmos.ipa.utils.DataTool;
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

        System.out.println("警告任务开启了。。。。");
        while(true) {
            ByteBuf buffer = PooledByteBufAllocator.DEFAULT.heapBuffer(10);
            ma.setAlarmDeviceName("测试设备");
            ma.setAlarmTitle("测试告警");
            ma.setAlarmContent("告警,告警,告警");
            ma.setAlarmLevel((byte)1);


            buffer.writeBytes(ma.encoded());
            ctx.channel().writeAndFlush(buffer);

            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
