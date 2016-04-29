package com.cmos.ipa.pojo;

/**
 * <code>参数下载响应实体类</code>
 * @author Hardy
 * @date 2016/4/29 19:40
 * @version 1.0
 */
public class ParamdownloadRepBody {

    //参数下载状态 0 失败  1成功
    private Byte status;
    //采集周期 秒
    private int  colletcontab;
    //采集协议
    private Byte collectProtocol;

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public int getColletcontab() {
        return colletcontab;
    }

    public void setColletcontab(int colletcontab) {
        this.colletcontab = colletcontab;
    }

    public Byte getCollectProtocol() {
        return collectProtocol;
    }

    public void setCollectProtocol(Byte collectProtocol) {
        this.collectProtocol = collectProtocol;
    }
}
