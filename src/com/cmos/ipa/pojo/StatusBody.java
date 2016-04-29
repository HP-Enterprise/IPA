package com.cmos.ipa.pojo;

/**
 * <code>单个设备报文状态消息实体类</code>
 * @author Hardy
 * @date 2016/4/29 18:40
 * @version 1.0
 */
public class StatusBody {

    //设备名称
    private Byte devicename;
    //设备位置
    private Byte devicelocate;
    //设备状态1
    private int  Status1;
    //设备状态2
    private int  Status2;
    //设备状态3
    private int  Status3;
    //设备状态4
    private int  Status4;
    //设备状态5
    private int  Status5;

    public Byte getDevicename() {
        return devicename;
    }

    public void setDevicename(Byte devicename) {
        this.devicename = devicename;
    }

    public Byte getDevicelocate() {
        return devicelocate;
    }

    public void setDevicelocate(Byte devicelocate) {
        this.devicelocate = devicelocate;
    }

    public int getStatus1() {
        return Status1;
    }

    public void setStatus1(int status1) {
        Status1 = status1;
    }

    public int getStatus2() {
        return Status2;
    }

    public void setStatus2(int status2) {
        Status2 = status2;
    }

    public int getStatus3() {
        return Status3;
    }

    public void setStatus3(int status3) {
        Status3 = status3;
    }

    public int getStatus4() {
        return Status4;
    }

    public void setStatus4(int status4) {
        Status4 = status4;
    }

    public int getStatus5() {
        return Status5;
    }

    public void setStatus5(int status5) {
        Status5 = status5;
    }
}
