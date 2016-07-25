package com.cmos.ipa.deviceclient;


import java.io.UnsupportedEncodingException;

import com.cmos.ipa.pojo.AccessControlBean;
import com.cmos.ipa.pojo.MsgAlarm;
import com.cmos.ipa.utils.*;
import com.cmos.ipa.utils.log.Logger;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.concurrent.ScheduledFuture;


/**
 * <code>TCP Client Handler</code>
 * @author Hardy
 * @date 2016/4/30 3:19
 * @version 1.0
 */
public class TCPClientHandler extends ChannelInboundHandlerAdapter {

    private boolean canDo;
    private boolean flag;
    private Logger log;
    private DataTool dataTool;
    private volatile ScheduledFuture<?> heartBeat;

    public TCPClientHandler() {
        this.canDo = true;
        this.flag = true;
        this.log = Logger.getInstance();
        this.dataTool = new DataTool();
    }

    /**
     * <code>告警消息入队列</code>
     * @return
     */
    protected boolean enAlarmQueue(MsgAlarm ma){
        boolean result = Global.alarmQueue.add(ma);
        if(result){
            Global.AlarmQueueIn += 1;
        }
        return result;
    }

    /**
     * <code>告警消息出队列</code>
     * @return
     */
    protected MsgAlarm outAlarmQueue() throws InterruptedException {
        MsgAlarm ma = Global.alarmQueue.poll();
        if (ma != null) {
            Global.AlarmQueueIn -= 1;
        }
        return ma;
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {

    }


    @Override
    public synchronized void channelRead(ChannelHandlerContext ctx, Object msg) {
        ByteBuf m = (ByteBuf) msg;
        byte[] receiveData = dataTool.getBytesFromByteBuf(m);
        switch (Global.DeviceType) {
                case 0x01:
                    log.log_info("门禁 response >>" + dataTool.bytes2hex(receiveData));
                    String[] dataInfo = null;
                    int num = 0;
                    AccessControlBean acb = new AccessControlBean();
                    MsgAlarm ma = new MsgAlarm();
					String info="";
					try {
						info = new String(receiveData,"GBK");
					} catch (UnsupportedEncodingException e1) {
						e1.printStackTrace();
					}//ByteUtil.decode(dataTool.bytes2hex(receiveData));
                    log.log_info("门禁 response info>>" + info);
                    dataInfo = info.split(";");
                    if(dataInfo.length > 0) {
                        acb.setStartCode(dataInfo[num++]);
                        acb.setPackageLength(dataInfo[num++]);
                        acb.setControllerIp(dataInfo[num++]);
                        acb.setInterfaceAddr(dataInfo[num++]);
                        acb.setPanelDirection(dataInfo[num++]);
                        acb.setTaskCode(dataInfo[num++]);
                        acb.setEventCode(dataInfo[num++]);
                        acb.setMsgTypeId(dataInfo[num++]);
                        String iolinkerNum = dataInfo[num++];
                        acb.setIolinkerNum(iolinkerNum);
                        acb.setDescription(DataPropertyUtil.getProperty(iolinkerNum));
                        acb.setEventTime(dataInfo[num++]);
                        acb.setControllerName(dataInfo[num++]);
                        acb.setPanelName(dataInfo[num++]);
                        acb.setCardReaderName(dataInfo[num++]);
                        acb.setEventName(dataInfo[num++]);
                        acb.setIODescription(dataInfo[num++]);
                        acb.setCardNum(dataInfo[num++]);
                        acb.setJobNum(dataInfo[num++]);
                        acb.setStaffName(dataInfo[num++]);
                        if(acb.getIolinkerNum() != null && !acb.getIolinkerNum().trim().equals("")){

                            ma.setAlarmDeviceName(acb.getControllerName());
                            ma.setAlarmDeviceCode(DataPropertyUtil.getProperty(acb.getControllerIp() + "#" + acb.getInterfaceAddr() + "#" + acb.getPanelDirection()));
                            ma.setAlarmDeviceLocate(acb.getPanelName() + "," + acb.getCardReaderName());
                            ma.setAlarmTitle("门禁报警");
                            ma.setAlarmContent(2 + "#" +acb.getEventTime()+"#"+ acb.getIODescription());
                            ma.setAlarmLevel((byte) 2);
                        }else{
                            ma.setAlarmDeviceName(acb.getControllerName());
                            ma.setAlarmDeviceCode(DataPropertyUtil.getProperty(acb.getControllerIp()+"#"+acb.getInterfaceAddr()+"#"+acb.getPanelDirection()));
                            ma.setAlarmDeviceLocate(acb.getPanelName()+","+acb.getCardReaderName());
                            ma.setAlarmTitle("门禁通行");
                            ma.setAlarmContent(acb.getEventTime()+";"
                                                +acb.getControllerName()+";"
                                                +acb.getPanelName()+";"
                                                +acb.getEventName()+";"
                                                +acb.getCardNum()+";"
                                                +acb.getJobNum()+";"
                                                +acb.getStaffName());
                            ma.setAlarmLevel((byte)4);
                        }
                    }

                    //判断警告消息队列是否已经满额 满额先进行移除再添加
                    if(Global.AlarmQueueIn <= Global.QUEUE_CACHE_NUM){
                        enAlarmQueue(ma);
                    }else{
                        try {
                            //丢弃第一条
                            outAlarmQueue();
                            enAlarmQueue(ma);
                        } catch (InterruptedException e) {
                            log.log_error("TCPClientHandler>>channelRead>>InterruptedException>>",e);
                        }
                    }

                    break;
                case 0x02:
                    log.log_info("楼宇 response >>" + dataTool.bytes2hex(receiveData));

                    break;
                case 0x03:
                    log.log_info("视频监控 response >>" + dataTool.bytes2hex(receiveData));

                    break;
                default:
                    log.log_info(">>unknown response >>" + dataTool.bytes2hex(receiveData));
                    break;

            }
    }

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
