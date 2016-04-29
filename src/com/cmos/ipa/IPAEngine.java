package com.cmos.ipa;

import com.cmos.ipa.client.NettyClient;
import com.cmos.ipa.client.WorkThread;
import com.cmos.ipa.utils.Global;
import com.cmos.ipa.utils.PropertyUtil;
import com.cmos.ipa.utils.log.Logger;
import com.cmos.ipa.utils.log.LoggerConn;

/**
 * <code>Agent app启动类</code>
 * @author Hardy
 * @date 2016/4/27 17:30
 * @version 1.0
 */
public class IPAEngine {

    public static void main(String[] args) {
        //版本号
        String VERSION = "1.0";
        Global.print("Agent Engine Version : " + VERSION);
        Global.print("Agent Engine Initialize Begin!");

        //初始化网关地址，端口
        Global.GWHostAddr = PropertyUtil.getProperty("GWHostAddr");
        Global.GWHostPort = PropertyUtil.getPropertyInt("GWHostPort");

        //初始化线程配置
        Global.RECEIVE_GW_MSG_INTERVAL = PropertyUtil.getPropertyInt("ReceiveGwMsgInterval");
        Global.RECEIVE_TIMEOUT = PropertyUtil.getPropertyInt("ReceiveTimeout");
        Global.MAX_AVAILABLE_SOCKETS = PropertyUtil.getPropertyInt("MaxAvailableSockets");

        //初始化日志配置
        Global.LOG_LEVEL = PropertyUtil.getPropertyInt("LogLevel");
        Global.LOG_MAXSIZE = PropertyUtil.getPropertyInt("LogMaxSize");

        Global.print("Agent Engine Load Config OK...");

        //开启日志报告
        Logger log = Logger.getInstance();
        log.turnOn();

        //加载工作线程
        NettyClient.init().run();

    }

}
