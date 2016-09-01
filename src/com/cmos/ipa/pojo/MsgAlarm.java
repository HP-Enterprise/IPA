package com.cmos.ipa.pojo;

import com.cmos.ipa.utils.DataTool;
import com.cmos.ipa.utils.DateTimeUtil;
import com.cmos.ipa.utils.Global;
import com.cmos.ipa.utils.log.Logger;
import io.netty.buffer.ByteBuf;

import java.io.UnsupportedEncodingException;

import static io.netty.buffer.Unpooled.buffer;

/**
 * <code>告警消息</code>
 * @author Hardy
 * @date 2016/5/4 21:40
 * @version 1.0
 */
public class MsgAlarm {

    private Header header;//消息头

    //告警设备名称长度 10
    private static int alarmDeviceNameSize=20;
    //告警设备编号长度 20
    private static int alarmDeviceCodeSize=20;
    //告警设备位置长度 20
    private static int alarmDeviceLocateSize=20;
    //告警标题 50
    private static int alarmTitleSize=50;
    //设备名称 100
    private static int alarmContentSize=100;
    //告警设备名称 10/4
    private String alarmDeviceName;
    //告警设备编号 20
    private String alarmDeviceCode;//20/4
    //告警设备位置 20
    private String alarmDeviceLocate;//20/4
    //告警标题 50/4
    private String alarmTitle;
    //设备内容 100/4
    private String alarmContent;
    //告警级别 1 严重 2 重要 3 一般  4通知
    private Byte alarmLevel;

    private Byte checkSum;//将编码后的报文（Message Header + body）进行异或操作，1个字节长度

    private static final int BUFFER_SIZE = 1024;

    private DataTool dataTool;

    private Logger log;


    public MsgAlarm(){
        this.header = new Header();
        this.header.setMessageType((byte) 2);
        this.header.setmId((byte) 1);
        this.header.setSendingTime(new DataTool().getCurrentSeconds());
        this.header.setEventId(new DataTool().getCurrentSeconds());
        this.header.setAgentNum((byte) Global.AgentNum);
        this.header.setParkCode(Global.ParkCode);
        this.dataTool = new DataTool();
        this.log = Logger.getInstance();
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

    public String getAlarmDeviceCode() {
        return alarmDeviceCode;
    }

    public void setAlarmDeviceCode(String alarmDeviceCode) {
        this.alarmDeviceCode = alarmDeviceCode;
    }

    public String getAlarmDeviceLocate() {
        return alarmDeviceLocate;
    }

    public void setAlarmDeviceLocate(String alarmDeviceLocate) {
        this.alarmDeviceLocate = alarmDeviceLocate;
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
        try {
     			bb.writeBytes(dataTool.getLengthBytesString(this.header.getParkCode(),this.header.getParkCodeSize()).getBytes("utf-8"));
     		} catch (UnsupportedEncodingException e1) {
     			e1.printStackTrace();
     		}
        try {
            bb.writeBytes(dataTool.getLengthBytesString(this.getAlarmDeviceName(), alarmDeviceNameSize).getBytes("utf-8"));
            bb.writeBytes(dataTool.getLengthBytesString(this.getAlarmDeviceCode(), alarmDeviceCodeSize).getBytes("UTF-8"));
            bb.writeBytes(dataTool.getLengthBytesString(this.getAlarmDeviceLocate(), alarmDeviceLocateSize).getBytes("UTF-8"));
            bb.writeBytes(dataTool.getLengthBytesString(this.getAlarmTitle(), alarmTitleSize).getBytes("utf-8"));
            bb.writeBytes(dataTool.getLengthBytesString(this.getAlarmContent(), alarmContentSize).getBytes("utf-8"));
        } catch (UnsupportedEncodingException e) {
            log.log_error("MsgAlarm>>encoded>>UnsupportedEncodingException>>",e);
        }
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
