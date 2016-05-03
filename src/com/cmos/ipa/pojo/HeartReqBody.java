package com.cmos.ipa.pojo;

/**
 * <code>心跳请求实体类</code>
 * @author Hardy
 * @date 2016/4/29 19:40
 * @version 1.0
 */
public class HeartReqBody {

    //心跳标识 默认为3
    private Byte heartBeat = 3;

    public Byte getHeartBeat() {
        return heartBeat;
    }

    public void setHeartBeat(Byte heartBeat) {
        this.heartBeat = heartBeat;
    }
}
