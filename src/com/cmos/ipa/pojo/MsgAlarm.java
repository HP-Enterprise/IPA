package com.cmos.ipa.pojo;

import com.cmos.ipa.utils.DataTool;
import com.cmos.ipa.utils.DateTimeUtil;
import io.netty.buffer.ByteBuf;

import static io.netty.buffer.Unpooled.buffer;

/**
 * <code>告警消息</code>
 * @author Hardy
 * @date 2016/5/4 21:40
 * @version 1.0
 */
public class MsgAlarm {

    private Header header;//消息头

    //告警设备名称长度 100
    private static int alarmDeviceNameSize=100;
    //告警标题 200
    private static int alarmTitleSize=200;
    //设备名称 500
    private static int alarmContentSize=500;
    //告警设备名称 100/4
    private String alarmDeviceName;
    //告警标题 200/4
    private String alarmTitle;
    //设备名称 500/4
    private String alarmContent;
    //告警级别 1 严重 2 重要 3 一般  4通知
    private Byte alarmLevel;

    private Byte checkSum;//将编码后的报文（Message Header + body）进行异或操作，1个字节长度

    public static final int BUFFER_SIZE = 1024;

    public DataTool dataTool;

    public MsgAlarm(){
        this.header = new Header();
        this.header.setMessageType((byte) 2);
        this.header.setmId((byte) 1);
        this.header.setSendingTime((int)(DateTimeUtil.getTimeDifference()));
        this.header.setEventId((int)(DateTimeUtil.getTimeDifference()));
        this.header.setAgentNum((byte) 10001);
        this.dataTool = new DataTool();
    }

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public String getAlarmDeviceName() {
        return alarmDeviceName;
    }

    public void setAlarmDeviceName(String alarmDeviceName) {
        this.alarmDeviceName = alarmDeviceName;
    }

    public String getAlarmTitle() {
        return alarmTitle;
    }

    public void setAlarmTitle(String alarmTitle) {
        this.alarmTitle = alarmTitle;
    }

    public String getAlarmContent() {
        return alarmContent;
    }

    public void setAlarmContent(String alarmContent) {
        this.alarmContent = alarmContent;
    }

    public Byte getAlarmLevel() {
        return alarmLevel;
    }

    public void setAlarmLevel(Byte alarmLevel) {
        this.alarmLevel = alarmLevel;
    }

    public Byte getCheckSum() {
        return checkSum;
    }

    public void setCheckSum(Byte checkSum) {
        this.checkSum = checkSum;
    }

    /**
     * <code>告警消息编码</code>
     * @return
     */
    public byte[] encoded(){
        ByteBuf bb = buffer(BUFFER_SIZE);
        bb.writeShort(this.header.getStartCode());
        bb.markWriterIndex();
        bb.writeShort(0);//预先写入length=0占位
        bb.writeByte(this.header.getMessageType());
        bb.writeByte(this.header.getmId());
        bb.writeInt(this.header.getSendingTime());
        bb.writeInt(this.header.getEventId());
        bb.writeByte(this.header.getAgentNum());

        bb.writeBytes(dataTool.getLengthBytesString(this.getAlarmDeviceName(), alarmDeviceNameSize).getBytes());
        bb.writeBytes(dataTool.getLengthBytesString(this.getAlarmTitle(), alarmTitleSize).getBytes());
        bb.writeBytes(dataTool.getLengthBytesString(this.getAlarmContent(), alarmContentSize).getBytes());

        bb.writeByte(alarmLevel);
        //回写length段
        int index=bb.writerIndex();
        bb.resetWriterIndex();
        int length=index+1;//+checksum 通过顺序写index可以计算得到length
        this.header.setMessageSize((short) length);
        bb.writeShort(this.header.getMessageSize());
        bb.writerIndex(index);
        //写完后指针复位
        ByteBuf _copy=bb.copy();
        byte[] tmp=dataTool.getBytesFromByteBuf(_copy);
        this.setCheckSum(dataTool.getCheckSum(tmp));
        bb.writeByte(this.getCheckSum());//
        return dataTool.getBytesFromByteBuf(bb);
    }
}
