package com.cmos.ipa.pojo;

import com.cmos.ipa.utils.DataTool;
import com.cmos.ipa.utils.DateTimeUtil;
import io.netty.buffer.ByteBuf;

import static io.netty.buffer.Unpooled.buffer;

/**
 * <code>状态消息</code>
 * @author Hardy
 * @date 2016/5/4 21:12
 * @version 1.0
 */
public class MsgStatus {

    private Header header;//消息头

    //设备名称最大长度为100
    private static int deviceNameSize=100;
    //设备位置最大长度为200
    private static int deviceLocateSize=200;

    //报文个数 最大 255
    private Byte packageNum;
    //设备名称
    private String[] deviceName;
    //设备位置
    private String[] deviceLocate;
    //设备状态1
    private Integer[]  status1;
    //设备状态2
    private Integer[]  status2;
    //设备状态3
    private Integer[]  status3;
    //设备状态4
    private Integer[]  status4;
    //设备状态5
    private Integer[]  status5;

    private Byte checkSum;//将编码后的报文（Message Header + body）进行异或操作，1个字节长度

    public static final int BUFFER_SIZE = 1024;

    public DataTool dataTool;

    public MsgStatus(){
        this.header = new Header();
        this.header.setMessageType((byte) 1);
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

    public Byte getPackageNum() {
        return packageNum;
    }

    public void setPackageNum(Byte packageNum) {
        this.packageNum = packageNum;
    }

    public String[] getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String[] deviceName) {
        this.deviceName = deviceName;
    }

    public String[] getDeviceLocate() {
        return deviceLocate;
    }

    public void setDeviceLocate(String[] deviceLocate) {
        this.deviceLocate = deviceLocate;
    }

    public Integer[] getStatus1() {
        return status1;
    }

    public void setStatus1(Integer[] status1) {
        this.status1 = status1;
    }

    public Integer[] getStatus2() {
        return status2;
    }

    public void setStatus2(Integer[] status2) {
        this.status2 = status2;
    }

    public Integer[] getStatus3() {
        return status3;
    }

    public void setStatus3(Integer[] status3) {
        this.status3 = status3;
    }

    public Integer[] getStatus4() {
        return status4;
    }

    public void setStatus4(Integer[] status4) {
        this.status4 = status4;
    }

    public Integer[] getStatus5() {
        return status5;
    }

    public void setStatus5(Integer[] status5) {
        this.status5 = status5;
    }

    public Byte getCheckSum() {
        return checkSum;
    }

    public void setCheckSum(Byte checkSum) {
        this.checkSum = checkSum;
    }

    /**
     * <code>状态消息编码</code>
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
        bb.writeByte(this.getPackageNum());
        for (int i = 0; i <this.getPackageNum() ; i++) {
            bb.writeBytes(dataTool.getLengthBytesString(deviceName[i], deviceNameSize).getBytes());
            bb.writeBytes(dataTool.getLengthBytesString(deviceLocate[i], deviceLocateSize).getBytes());
            bb.writeInt(status1[i]);
            bb.writeInt(status2[i]);
            bb.writeInt(status3[i]);
            bb.writeInt(status4[i]);
            bb.writeInt(status5[i]);
        }
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
        bb.writeByte(this.getCheckSum());
        return dataTool.getBytesFromByteBuf(bb);
    }

}
