package com.cmos.ipa.deviceclient;

import com.cmos.ipa.pojo.MsgStatus;
import com.cmos.ipa.protocol.bacnet.LocalDevice;
import com.cmos.ipa.protocol.bacnet.RemoteDevice;
import com.cmos.ipa.protocol.bacnet.RemoteObject;
import com.cmos.ipa.protocol.bacnet.event.DeviceEventListener;
import com.cmos.ipa.protocol.bacnet.exception.BACnetException;
import com.cmos.ipa.protocol.bacnet.obj.BACnetObject;
import com.cmos.ipa.protocol.bacnet.service.confirmed.ReinitializeDeviceRequest;
import com.cmos.ipa.protocol.bacnet.service.unconfirmed.WhoIsRequest;
import com.cmos.ipa.protocol.bacnet.LoopDevice;
import com.cmos.ipa.protocol.bacnet.type.Encodable;
import com.cmos.ipa.protocol.bacnet.type.constructed.*;
import com.cmos.ipa.protocol.bacnet.type.enumerated.*;
import com.cmos.ipa.protocol.bacnet.type.notificationParameters.NotificationParameters;
import com.cmos.ipa.protocol.bacnet.type.primitive.CharacterString;
import com.cmos.ipa.protocol.bacnet.type.primitive.ObjectIdentifier;
import com.cmos.ipa.protocol.bacnet.type.primitive.UnsignedInteger;
import com.cmos.ipa.protocol.bacnet.util.PropertyReferences;
import com.cmos.ipa.protocol.bacnet.util.PropertyValues;
import com.cmos.ipa.service.video_surveillance.deviceCapability.GOPStructure;
import com.cmos.ipa.utils.Global;
import com.cmos.ipa.utils.log.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/** bacnate 协议线程
 * Created by Administrator on 2016/6/8.
 */
public class BacnetClient extends Thread{
    private  LocalDevice localDevice;
    private LoopDevice loopDevice;
    private List<RemoteDevice> remoteDevices = new ArrayList<RemoteDevice>();
    private String deviceHost;
    private int devicePort;
    private int deviceCode;
    private int reConnection;
    private Logger log;
    private static BacnetClient bacnetClient;
    /**
     * 启动1秒后开始任务
     */
    private static long readconfDelay = 1*1 * 1000;

    /**
     * 上一个任务结束后1秒钟继续下一个任务
     */
    private static long readconfperiod = 1 * 1 * 1000;
    private ScheduledExecutorService executor = Executors
            .newSingleThreadScheduledExecutor();

    private BacnetClient(){
        this.deviceHost=Global.DeviceAddr;
        this.devicePort=Global.DevicePort;
        this.deviceCode=Global.AgentNum;
        this.reConnection=Global.RECONNECTION;
        log= Logger.getInstance();

    }
    /**
     *  保证状态数据顺序执行
     */
    public static BacnetClient getBacnetClient() {
        if(bacnetClient==null){
            synchronized(BacnetClient.class){
                if(bacnetClient==null){
                    bacnetClient=new BacnetClient();
                }
            }
        }
        return bacnetClient;
    }

    /**
     * 初始化任务
     */
    public void init(){
        //上一个任务执行完 执行下一个
        executor.scheduleWithFixedDelay(BacnetClient.getBacnetClient(), readconfDelay, readconfperiod, TimeUnit.MILLISECONDS);
    }
    @Override
    public void run(){
        connect();
    }

    /**
     * 与bacnet 服务器连接
     */
    public void connect() {
        log.log_info("try connect to deviceServer @" + deviceHost + ":"+devicePort);
        Global.print("try connect to deviceServer @" + deviceHost + ":" + devicePort);
        try {
            localDevice = new LocalDevice(deviceCode, deviceHost);
            localDevice.setPort(devicePort+1);
            localDevice.getEventHandler().addListener(new BacnetDeviceEventListenerImp(){
                public void iAmReceived(RemoteDevice d) {
                    remoteDevices.add(d);
                    synchronized (BacnetClient.this) {
                        BacnetClient.this.notifyAll();
                    }
                }
            });
            localDevice.initialize();

            try {
                setLoopDevice(new LoopDevice(deviceHost, devicePort));
            }
            catch (RuntimeException e) {
                localDevice.terminate();
                throw e;
            }
            try {
                doDiscover();
                handleData();
            }catch (Exception e){
                Global.print(e.getMessage());
            }
            finally {
                localDevice.terminate();
                log.log_info("Cleanup loopDevice");
                getLoopDevice().doTerminate();
            }

        } catch (Exception e) {
            Global.print(e.getMessage());
            log.log_info(e.getMessage());
            connect();// 发起重连操作
        }
    }
    /**
     * Send a WhoIs request and wait for the first to answer
     *
     * @throws java.lang.Exception
     */
    public void doDiscover() throws Exception {
        // Who is
        log.log_info("Send Broadcast WhoIsRequest() ");
        // Send the broadcast to the correct port of the LoopDevice !!!
        localDevice.sendBroadcast(loopDevice.getPort(), new WhoIsRequest(null, null));

        // wait for notification in iAmReceived() Timeout 2 sec
        synchronized (this) {
            final long start = System.currentTimeMillis();
            this.wait(2000);
            log.log_info(" waited for iAmReceived: " + (System.currentTimeMillis() - start) + " ms");
        }

        // An other way to get to the list of devices
        // return localDevice.getRemoteDevices();
    }

    /**
     * 接受服务端数据放入队列
     * @throws BACnetException
     */
    private void handleData() throws BACnetException {

        MsgStatus ms = new MsgStatus();
        ms.setPackageNum(Byte.MAX_VALUE);
        //设备名称
        String[] deviceName = new String[ms.getPackageNum()];
        //设备参数名称
        String[] devicePara = new String[ms.getPackageNum()];
        //设备状态1
        Integer[]  status1  = new Integer[ms.getPackageNum()];
        for (RemoteDevice d : remoteDevices) {//循环远程设备
            localDevice.getExtendedDeviceInformation(d);
            //读取所有属性的标识
            List<ObjectIdentifier> oids = ((SequenceOf<ObjectIdentifier>) localDevice.sendReadPropertyAllowNull(d, d
                    .getObjectIdentifier(), PropertyIdentifier.objectList)).getValues();

            PropertyReferences refs = new PropertyReferences();
            // add the property references of the "device object" to the list
            refs.add(d.getObjectIdentifier(), PropertyIdentifier.presentValue);

            // and now from all objects under the device object >> ai0, ai1,bi0,bi1...
            for (ObjectIdentifier oid : oids) {
                refs.add(oid, PropertyIdentifier.presentValue); //添加要接收显示的值类型
                refs.add(oid, PropertyIdentifier.objectName);
            }

            log.log_info("Start read properties");
            final long start = System.currentTimeMillis();

            PropertyValues pvs = localDevice.readProperties(d, refs);
            log.log_info(String.format("Properties read done in %d ms", System.currentTimeMillis() - start));

//            sendData(d.getObjectIdentifier(), pvs);//设备名称

            //得到设备名称
            String name=null;
            for (ObjectPropertyReference opr : pvs) {
                if(opr.getObjectIdentifier().equals(d.getObjectIdentifier())){
                    if(opr.getPropertyIdentifier().toString().startsWith("Object")){
                        name = pvs.getNoErrorCheck(opr).toString();
                    }
                }
            }
            int i =0;
            //填充参数和值
            for(ObjectIdentifier oid : oids){ //循环输入类型  iod { Analog Input 0 ,Binary Input 1, Device 0}
                Global.print(String.format("\t%s", oid));
                deviceName[i]=name;
                devicePara[i]= pvs.getNoErrorCheck(oid,PropertyIdentifier.objectName).toString();
//                status1[i]=new Integer(pvs.getNoErrorCheck(oid,PropertyIdentifier.presentValue).toString());
                for (ObjectPropertyReference opr : pvs) { //循环各类型属性 （目前只是过滤2个属性 Object name = temp ， Present value = 2240.5）
                    if (oid.equals(opr.getObjectIdentifier())) {
                        Global.print(String.format("\t\t%s = %s", opr.getPropertyIdentifier().toString(), pvs
                                .getNoErrorCheck(opr)));
                    }
                }
                i++;
            }

        }
        ms.setDeviceName(deviceName);
        ms.setDevicePara(devicePara);
        ms.setStatus1(status1);
        //消息加入队列
        enStatusQueue(ms);
       System.out.println(ms.toString());
        log.log_info("Remote devices done...");
        log.log_info("Remote devices count=" + remoteDevices.size());
    }

   /* private void sendData(ObjectIdentifier oid, PropertyValues pvs) {
        log.log_info(String.format("\t%s", oid));
        for (ObjectPropertyReference opr : pvs) {
            if (oid.equals(opr.getObjectIdentifier())) {

                log.log_info(String.format("\t\t%s = %s", opr.getPropertyIdentifier().toString(), pvs
                        .getNoErrorCheck(opr)));
                MsgStatus ms = new MsgStatus();
//                ms.set(opr.getPropertyIdentifier().toString());

            }

        }
    }*/
    /**
     * <code>状态消息入队列</code>
     * @return
     */
    protected boolean enStatusQueue(MsgStatus ms){
        //判断警告消息队列是否已经满额 满额先进行移除再添加
        boolean result = false;
        if(Global.AlarmQueueIn <= Global.QUEUE_CACHE_NUM){
            result = Global.statusQueue.add(ms);
        }else{
            try {
                //丢弃第一条
                outStatusQueue();
                result = Global.statusQueue.add(ms);
            } catch (InterruptedException e) {
                log.log_error("TCPClientHandler>>channelRead>>InterruptedException>>",e);
            }
        }
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
            Global.AlarmQueueIn -= 1;
        }
        return ms;
    }
/*
    private String getServerInfo() {
        return String.format("DeviceHost=%s DevicePort=%d",
                deviceHost,
                devicePort);
    }*/
    /**
     * @return the loopDevice
     */
    public LoopDevice getLoopDevice() {
        return loopDevice;
    }

    /**
     * @param loopDevice
     *            the loopDevice to set
     */
    public void setLoopDevice(LoopDevice loopDevice) {
        this.loopDevice = loopDevice;
    }

}
