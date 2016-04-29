package com.cmos.ipa.pojo;

/**
 * <code>报文告警消息实体类</code>
 * @author Hardy
 * @date 2016/4/29 18:40
 * @version 1.0
 */
public class AlarmBody {

    //告警设备名称
    private Byte alarmDeviceName;
    //告警标题
    private Byte alarmTitle;
    //设备名称
    private Byte alarmContent;
    //告警级别 1 严重 2 重要 3 一般  4通知
    private Byte alarmLevel;

    public Byte getAlarmDeviceName() {
        return alarmDeviceName;
    }

    public void setAlarmDeviceName(Byte alarmDeviceName) {
        this.alarmDeviceName = alarmDeviceName;
    }

    public Byte getAlarmTitle() {
        return alarmTitle;
    }

    public void setAlarmTitle(Byte alarmTitle) {
        this.alarmTitle = alarmTitle;
    }

    public Byte getAlarmContent() {
        return alarmContent;
    }

    public void setAlarmContent(Byte alarmContent) {
        this.alarmContent = alarmContent;
    }

    public Byte getAlarmLevel() {
        return alarmLevel;
    }

    public void setAlarmLevel(Byte alarmLevel) {
        this.alarmLevel = alarmLevel;
    }
}
