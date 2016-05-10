package com.cmos.ipa.server;

/**
 * <code>UDPClient</code>
 * @author Hardy
 * @date 2016/5/9 2:36
 * @version 1.0
 */
public class UDPserver {

    //UDP单例
    private static UDPserver udPserver;

    public UDPserver(){
    }

    public static UDPserver getInstance(){
        if(udPserver == null){
            synchronized (UDPserver.class){
                if(udPserver == null){
                    udPserver = new UDPserver();
                }
            }
        }
        return udPserver;
    }
}
