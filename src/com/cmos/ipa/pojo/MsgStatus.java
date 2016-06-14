package com.cmos.ipa.pojo;

import com.cmos.ipa.utils.DataTool;
import com.cmos.ipa.utils.DateTimeUtil;
import com.cmos.ipa.utils.Global;
import com.cmos.ipa.utils.log.Logger;
import io.netty.buffer.ByteBuf;

import java.io.UnsupportedEncodingException;

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
    private static int deviceNameSize=10;
    //设备位置最大长度为200
    private static int deviceLocateSize=20;
    //设备参数名称最大长度为100
    private static int deviceParaSize=20;
    //设备参数状态（值）固定长度10 用空格填充
    private static int statusSize=10;

    //报文个数 最大 255
    private Byte packageNum;
    //设备名称
    private String[] deviceName;
    //设备位置
    private String[] deviceLocate;
    //设备参数名称
    private String[] devicePara;
    //设备状态1
    private String[]  status1;
    //设备状态2
    private String[]  status2;
    //设备状态3
    private String[]  status3;
    //设备状态4
    private String[]  status4;
    //设备状态5
    private String[]  status5;

    private Byte checkSum;//将编码后的报文（Message Header + body）进行异或操作，1个字节长度

    private static final int BUFFER_SIZE = 1024;

    private DataTool dataTool;

    private Logger log;

    public MsgStatus(){
        this.header = new Header();
        this.header.setMessageType((byte) 1);
        this.header.setmId((byte) 1);
        this.header.setSendingTime(new DataTool().getCurrentSeconds());
        this.header.setEventId(new DataTool().getCurrentSeconds());
        this.header.setAgentNum((byte) Global.AgentNum);
        this.dataTool = new DataTool();
        this.log = Logger.getInstance();
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

    public String[] getStatus1() {
        return status1;
    }

    public void setStatus1(String[] status1) {
        this.status1 = status1;
    }

    public String[] getStatus2() {
        return status2;
    }

    public void setStatus2(String[] status2) {
        this.status2 = status2;
    }

    public String[] getStatus3() {
        return status3;
    }

    public void setStatus3(String[] status3) {
        this.status3 = status3;
    }

    public String[] getStatus4() {
        return status4;
    }

    public void setStatus4(String[] status4) {
        this.status4 = status4;
    }

    public String[] getStatus5() {
        return status5;
    }

    public void setStatus5(String[] status5) {
        this.status5 = status5;
    }

    public Byte getCheckSum() {
        return checkSum;
    }

    public void setCheckSum(Byte checkSum) {
        this.checkSum = checkSum;
    }

    public String[] getDevicePara() {
        return devicePara;
    }

    public void setDevicePara(String[] devicePara) {
        this.devicePara = devicePara;
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
            try {
                bb.writeBytes(dataTool.getLengthBytesString(deviceName[i], deviceNameSize).getBytes("utf-8"));
                bb.writeBytes(dataTool.getLengthBytesString(deviceLocate[i], deviceLocateSize).getBytes("utf-8"));
                bb.writeBytes(dataTool.getLengthBytesString(devicePara[i], deviceParaSize).getBytes("utf-8"));
                bb.writeBytes(dataTool.getLengthBytesString(status1[i],statusSize).getBytes("utf-8"));
                bb.writeBytes(dataTool.getLengthBytesString(status2[i],statusSize).getBytes("utf-8"));
                bb.writeBytes(dataTool.getLengthBytesString(status3[i],statusSize).getBytes("utf-8"));
                bb.writeBytes(dataTool.getLengthBytesString(status4[i],statusSize).getBytes("utf-8"));
                bb.writeBytes(dataTool.getLengthBytesString(status5[i],statusSize).getBytes("utf-8"));
            } catch (UnsupportedEncodingException e) {
                log.log_error("MsgStatus>>encoded>>UnsupportedEncodingException>>",e);
                continue;
            }

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
