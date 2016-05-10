package com.cmos.ipa.deviceclient;

import com.cmos.ipa.pojo.MsgAlarm;
import com.cmos.ipa.pojo.MsgStatus;
import com.cmos.ipa.utils.DateTimeUtil;
import com.cmos.ipa.utils.Global;
import com.cmos.ipa.utils.log.Logger;

import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

/**
 * <code>UDPClient</code>
 * @author Hardy
 * @date 2016/5/6 2:38
 * @version 1.0
 */
public class UDPClient{

    //UDP套接字
    protected DatagramSocket ds;
    //设备服务访问地址
    protected String deviceAddr;
    //设备服务访问端口
    protected int devicePort;
    //重置标志位
    protected boolean needReset = true;
    //接受消息线程
    protected Thread receiverT;
    //发送消息线程
    protected Thread senderT;

    private Logger log;

    public static UDPClient uc;

    public UDPClient(){
        this.deviceAddr = Global.DeviceAddr;
        this.devicePort = Global.DevicePort;
        this.log = Logger.getInstance();
    }

    public static UDPClient init(){
        if(uc == null){
            uc = new UDPClient();
        }
        return uc;
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

    /**
     * <code>状态消息入队列</code>
     * @return
     */
    protected boolean enStatusQueue(MsgStatus ms){
        boolean result = Global.statusQueue.add(ms);
        if(result){
            Global.StatusQueueIn += 1;
        }
        return result;
    }

    /**
     * <code>状态消息出队列</code>
     * @return
     */
    protected MsgStatus outStatusQueue() throws InterruptedException {
        MsgStatus ms = Global.statusQueue.poll();
        if (ms != null) {
            Global.StatusQueueIn -= 1;
        }
        return ms;
    }

    /**
     * <code>客户端服务重置</code>
     * @throws Exception
     */
    protected synchronized void reset(){
        if (needReset == false) {
            return;
        }

        if (ds != null) {
            try {
                ds.close();
            } catch (Exception e) {
            }
        }

        try {
            ds = new DatagramSocket();
            ds.connect(new InetSocketAddress(deviceAddr, devicePort));
            needReset = false;
        } catch (SocketException e) {

        }

    }

    /**
     * 客户端服务启动
     *
     * @throws Exception
     */
    public synchronized void start(){
        //重置并建立连接
        reset();

        //启动发送消息线程[-->设备服务端]
        Thread senderT = new Thread() {
            @Override
            public void run() {

            }
            };
        senderT.setPriority(Thread.MAX_PRIORITY);
        senderT.start();


        //启动接受消息线程[设备服务端-->]
        Thread receiverT = new Thread() {
            @Override
            public void run() {

                while(true){
                    //接收到告警消息
                    MsgAlarm ma = new MsgAlarm();
                    ma.setAlarmDeviceName("测试设备");
                    ma.setAlarmTitle("测试告警");
                    ma.setAlarmContent("告警,告警,告警");
                    ma.setAlarmLevel((byte)1);
                    //判断警告消息队列是否已经满额 满额先进行移除再添加
                    if(Global.AlarmQueueIn <= Global.QUEUE_CACHE_NUM){
                        enAlarmQueue(ma);
                    }else{
                        try {
                            outAlarmQueue();
                            enAlarmQueue(ma);
                        } catch (InterruptedException e) {
                            log.log_error("UDPClient>>work>>InterruptedException>>",e);
                        }
                    }



                    //接收到状态消息
                    MsgStatus mstatus = new MsgStatus();
                    String[] deviceName = {"设备1"};
                    String[] deviceLocate = {"1栋2号楼"};
                    String[] devicePara = {"参数1"};
                    Integer[]  status1 = {1};
                    Integer[]  status2 = {2};
                    Integer[]  status3 = {3};
                    Integer[]  status4 = {4};
                    Integer[]  status5 = {5};

                    mstatus.setPackageNum((byte) 1);
                    mstatus.setDeviceName(deviceName);
                    mstatus.setDeviceLocate(deviceLocate);
                    mstatus.setDevicePara(devicePara);
                    mstatus.setStatus1(status1);
                    mstatus.setStatus2(status2);
                    mstatus.setStatus3(status3);
                    mstatus.setStatus4(status4);
                    mstatus.setStatus5(status5);

                    //判断警告消息队列是否已经满额 满额先进行移除再添加
                    if(Global.StatusQueueIn <= Global.QUEUE_CACHE_NUM){
                        enStatusQueue(mstatus);
                    }else{
                        try {
                            outStatusQueue();
                            enStatusQueue(mstatus);
                        } catch (InterruptedException e) {
                            log.log_error("UDPClient>>work>>InterruptedException>>",e);
                        }
                    }

                    Global.print(Global.COLLETCONTAB+"");
                    try {
                        Thread.sleep(Global.COLLETCONTAB * 10);
                    } catch (InterruptedException e) {
                        log.log_error("UDPClient>>work>>Thread>>InterruptedException>>", e);
                    }

                    Global.print(DateTimeUtil.getCurDateTime());
                }

            }
        };
        receiverT.setPriority(Thread.MAX_PRIORITY);
        receiverT.start();

    }

    /**
     * 客户端服务停止
     */
    public void stop() throws Exception {
        if (ds != null) {
            try {
                ds.close();
            } catch (Exception e) {
            }
            ds = null;
        }
        if (receiverT != null) {
            try {
                receiverT.interrupt();
            } catch (Exception e) {
            }
        }

        if (senderT != null) {
            try {
                senderT.interrupt();
            } catch (Exception e) {
            }
        }
    }

}
