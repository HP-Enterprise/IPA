package com.cmos.ipa.client;

import com.cmos.ipa.pojo.MsgStatus;
import com.cmos.ipa.utils.DataTool;
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
            ByteBuf buffer = PooledByteBufAllocator.DEFAULT.heapBuffer(10);

            String[] deviceName = {"设备1"};
            String[] deviceLocate = {"1栋2号楼"};
            Integer[]  status1 = {1};
            Integer[]  status2 = {2};
            Integer[]  status3 = {3};
            Integer[]  status4 = {4};
            Integer[]  status5 = {5};

            mstatus.setPackageNum((byte) 1);
            mstatus.setDeviceName(deviceName);
            mstatus.setDeviceLocate(deviceLocate);
            mstatus.setStatus1(status1);
            mstatus.setStatus2(status2);
            mstatus.setStatus3(status3);
            mstatus.setStatus4(status4);
            mstatus.setStatus5(status5);

            buffer.writeBytes(mstatus.encoded());
            ctx.channel().writeAndFlush(buffer);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
