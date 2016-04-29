package com.cmos.ipa.pojo;

import java.util.List;

/**
 * <code>报文状态消息实体类</code>
 * @author Hardy
 * @date 2016/4/29 18:40
 * @version 1.0
 */
public class StatusBodys {

    //报文个数 最大 255
    private Short packageNum;
    //所有设备状态消息集合
    private List<StatusBody> sbList = null;

    public Short getPackageNum() {
        return packageNum;
    }

    public void setPackageNum(Short packageNum) {
        this.packageNum = packageNum;
    }

    public List<StatusBody> getSbList() {
        return sbList;
    }

    public void setSbList(List<StatusBody> sbList) {
        this.sbList = sbList;
    }
}
