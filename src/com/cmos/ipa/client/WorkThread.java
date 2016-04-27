package com.cmos.ipa.client;

import com.cmos.ipa.utils.log.Logger;
import com.cmos.ipa.utils.log.LoggerConn;

/**
 * <code>工作线程</code>
 * @author Hardy
 * @date 2016/4/27 20:40
 * @version 1.0
 */
public class WorkThread {

    private boolean canRun = true;

    private Logger log = null;
    private LoggerConn logConnErr = null;

    private Object mutex = new Object();

    private Object lock = new Object();

    private boolean sendWait = false;
    private boolean recvWait = false;

    /**
     * <code>定义WorkThread实例</code>
     */
    static private WorkThread wt;

    /**
     * <code>获取WorkThread实例</code>
     */
    public static WorkThread getInstance() {
        if (wt == null) {
            wt = new WorkThread();
        }
        return wt;
    }

    private WorkThread() {
        log = Logger.getInstance();
        logConnErr = LoggerConn.getInstance();
    }

    /**
     * <code>通知接、发线程暂停工作</code>
     */
    public void stopWork() {
        canRun = false;
    }

    /**
     * <code>通知接、发线程开始工作</code>
     */
    public void startWork() {
        canRun = true;
    }

    /**
     * <code></code>开启各个工作线程
     */
    public void work() {

        /**
         * <code>发送消息线程</code>
         */
        Thread sendThread = new Thread() {
            @Override
            public void run() {

                log.log_info("发送消息线程");
            }
        };
        sendThread.setPriority(Thread.MAX_PRIORITY);
        sendThread.start();

        //错开启动
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            log.log_error("WorkThread->sendThread->", e);
        }

        /**
         * <code>接受消息线程</code>
         */
        Thread receiveThread = new Thread() {
            @Override
            public void run() {

                log.log_info("接受消息线程");
            }
        };
        receiveThread.setPriority(Thread.MIN_PRIORITY);
        receiveThread.start();


        //错开启动
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            log.log_error("WorkThread->receiveThread->",e);
        }

        /**
         * <code>心跳线程</code>
         */
        Thread checkThread = new Thread() {
            @Override
            public void run() {

                log.log_info("心跳线程");
            }
        };
        checkThread.setPriority(Thread.MAX_PRIORITY);
        checkThread.start();

    }
}
