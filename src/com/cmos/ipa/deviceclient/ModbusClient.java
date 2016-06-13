package com.cmos.ipa.deviceclient;

import com.cmos.ipa.pojo.MsgAlarm;
import com.cmos.ipa.pojo.MsgStatus;
import com.cmos.ipa.protocol.modbus.ModbusFactory;
import com.cmos.ipa.protocol.modbus.ModbusLocator;
import com.cmos.ipa.protocol.modbus.ModbusMaster;
import com.cmos.ipa.protocol.modbus.code.DataType;
import com.cmos.ipa.protocol.modbus.code.RegisterRange;
import com.cmos.ipa.protocol.modbus.exception.ErrorResponseException;
import com.cmos.ipa.protocol.modbus.exception.ModbusInitException;
import com.cmos.ipa.protocol.modbus.exception.ModbusTransportException;
import com.cmos.ipa.protocol.modbus.ip.IpParameters;
import com.cmos.ipa.utils.DataPropertyUtil;
import com.cmos.ipa.utils.Global;
import com.cmos.ipa.utils.log.Logger;

/**
 * <code>ModbusClient</code>
 * @author Hardy
 * @date 2016/6/8 4:21
 * @version 1.0
 */
public class ModbusClient{

    //接受消息线程
    protected Thread receiverT;
    //发送消息线程
    protected Thread senderT;

    private Logger log;

    private ModbusMaster master;

    //重置标志位
    protected boolean needReset = true;

    public static ModbusClient mc;

    public ModbusClient(){
        this.log = Logger.getInstance();
    }

    public static ModbusClient init(){
        if(mc == null) {
            synchronized (ModbusClient.class) {
                if (mc == null) {
                    mc = new ModbusClient();
                }
            }
        }
        return mc;
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
     * <code>建立与设备的连接</code>
     * @return
     */
     public ModbusMaster conn(){
         IpParameters params = new IpParameters();
         params.setHost(Global.DeviceAddr);
         params.setPort(Global.DevicePort);
         master = new ModbusFactory().createTcpMaster(params, false);
         return master;
     }


    /**
     * 客户端线程启动
     *
     * @throws Exception
     */
    public void start(){

        master = conn();
        try {
            master.init();
        } catch (ModbusInitException e) {
            e.printStackTrace();
        }

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
                    MsgStatus mstatus = new MsgStatus();
                    String[] deviceName = {"能耗设备"};
                    String[] deviceLocate = {"1栋2号楼"};
                    String[] devicePara = {};
                    Integer[]  status1 = {};
                    Integer[]  status2 = {};
                    Integer[]  status3 = {};
                    Integer[]  status4 = {};
                    Integer[]  status5 = {};

                    mstatus.setPackageNum((byte) 1);
                    mstatus.setDeviceName(deviceName);
                    mstatus.setDeviceLocate(deviceLocate);


                    for(int i=0;i<1000;i++){
                        if(master.testSlaveNode(i)){
                            try {
                            //根据不同的点位得到不同的值
                            ModbusLocator loc = new ModbusLocator(1, RegisterRange.HOLDING_REGISTER, i, DataType.TWO_BYTE_INT_UNSIGNED);
                                devicePara[i]=DataPropertyUtil.getProperty(String.valueOf(i));
                                // Get the point value
                                status1[i] = (Integer)master.getValue(loc);

                            } catch (ModbusTransportException e) {
                                e.printStackTrace();
                            } catch (ErrorResponseException e) {
                                e.printStackTrace();
                            }
                        }
                    }

                    mstatus.setDevicePara(devicePara);
                    mstatus.setStatus1(status1);
                    mstatus.setStatus2(status2);
                    mstatus.setStatus3(status3);
                    mstatus.setStatus4(status4);
                    mstatus.setStatus5(status5);

                    try {
                        Thread.sleep(Global.COLLETCONTAB);
                    } catch (InterruptedException e) {
                        log.log_error("ModbusClient>>start>>Thread>>InterruptedException>>", e);
                    }
                }
            }
        };
        receiverT.setPriority(Thread.MAX_PRIORITY);
        receiverT.start();

    }
}
