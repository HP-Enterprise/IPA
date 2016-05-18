package com.cmos.ipa.utils;

import com.cmos.ipa.pojo.MsgAlarm;
import com.cmos.ipa.pojo.MsgStatus;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicLong;

/**
 * <code>全局常量定义类</code>
 * @author Hardy
 * @date 2016/4/27 19:40
 * @version 1.0
 */
public class Global {

    /**
     * <code>GW地址</code>
     */
    public static String GWHostAddr;
    /**
     * <code>GW端口</code>
     */
    public static int GWHostPort;

    /**
     * <code>设备地址</code>
     */
    public static String DeviceAddr;
    /**
     * <code>设备端口</code>
     */
    public static int DevicePort;
    /**
     * <code>设备编号</code>
     */
    public static int AgentNum;
    /**
     * <code>与GW断开重连时间间隔，秒</code>
     */
    public static int RECONNECTION;
    /**
     * <code>从GW读取接收消息间隔,毫秒</code>
     */
    public static int RECEIVE_GW_MSG_INTERVAL;
    /**
     * <code>与GW心跳时间,毫秒</code>
     */
    public static int HEART_TIME;
    /**
     * <code>读取消息超时时间,毫秒</code>
     */
    public static int RECEIVE_TIMEOUT;
    /**
     * <code>最大socket数量</code>
     */
    public static int MAX_AVAILABLE_SOCKETS;

    /**
     * <code>日志级别</code>
     */
    public static int LOG_LEVEL;

    /**
     * <code>单个日志最大容量，单位MB</code>
     */
    public static int LOG_MAXSIZE;

    /**
     * <code>从设备进行数据采集的周期，毫秒,默认10秒</code>
     */
    public static int COLLETCONTAB = 1000;

    /**
     * <code>从设备进行数据采集的协议</code>
     */
    public static int COLLECTPROTOCOL;

    /**
     * <code>告警消息，消息队列</code>
     */
    public static LinkedBlockingQueue<MsgAlarm> alarmQueue =  new LinkedBlockingQueue<MsgAlarm>();

    /**
     * <code>状态消息，消息队列</code>
     */
    public static  LinkedBlockingQueue<MsgStatus> statusQueue =  new LinkedBlockingQueue<MsgStatus>();

    /**
     * <code>消息队列能缓存的最大数量</code>
     */
    public static int QUEUE_CACHE_NUM;

    /**
     * <code>告警消息入队列计数器</code>
     */
    public static int AlarmQueueIn;
    /**
     * <code>状态消息入队列计数器</code>
     */
    public static int StatusQueueIn;
    /**
     * <code>#设备类型 1 门禁 2 楼宇 3 视频监控</code>
     */
    public static int DeviceType;
    /**
     * <code>线程状态开关</code>
     */
    public static boolean ThreadFlag = false;
    /**
     * <code>线程开关</code>
     */
    public static boolean ThreadStart = true;

    /**
     * <code>全局打印方法</code>
     * @param message
     * @author Hardy
     * @date  2016/4/27 19:49
     */
    public static void print(String message) {
        System.out.println("[" + DateTimeUtil.getCurDateTime() + "] " + message);
    }
}
