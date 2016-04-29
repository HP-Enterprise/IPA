package com.cmos.ipa.pojo;

/**
 * <code>心跳响应实体类</code>
 * @author Hardy
 * @date 2016/4/29 19:40
 * @version 1.0
 */
public class HeartRepBody {

    //心跳状态 0 失败  1成功
    private Byte status;

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}
