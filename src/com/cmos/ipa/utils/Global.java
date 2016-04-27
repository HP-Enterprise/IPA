package com.cmos.ipa.utils;

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
     * <code>与GW断开重连时间间隔，秒</code>
     */
    public static int RECONNECTION;
    /**
     * <code>从GW读取接收消息间隔,毫秒</code>
     */
    public static int RECEIVE_GW_MSG_INTERVAL;
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
     * <code>全局打印方法</code>
     * @param message
     * @author Hardy
     * @date  2016/4/27 19:49
     */
    public static void print(String message) {
        System.out.println("[" + DateTimeUtil.getCurDateTime() + "] " + message);
    }
}
