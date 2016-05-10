package com.cmos.ipa.pojo;

import com.cmos.ipa.utils.DataTool;
import com.cmos.ipa.utils.DateTimeUtil;
import io.netty.buffer.ByteBuf;

import static io.netty.buffer.Unpooled.buffer;

/**
 * <code>参数下载</code>
 * @author Hardy
 * @date 2016/5/4 18:26
 * @version 1.0
 */
public class MsgParamdownload {
    //消息头
    private Header header;
    //参数下载状态 0 失败  1成功  [响应消息使用]
    private Byte status;
    //采集周期 秒  [响应消息使用]
    private int colletcontab;
    //采集协议  [响应消息使用]
    private Byte collectProtocol;
    //参数下载 默认为4  [请求消息使用]
    private Byte paraDownload;
    //将编码后的报文（Message Header + body）进行异或操作，1个字节长度
    private Byte checkSum;

    public static final int BUFFER_SIZE = 1024;

    public DataTool dataTool = new DataTool();

    public MsgParamdownload() {
        this.header = new Header();
        this.header.setMessageType((byte) 4);
        this.header.setmId((byte) 1);
        this.header.setSendingTime(new DataTool().getCurrentSeconds());
        this.header.setEventId(new DataTool().getCurrentSeconds());
        this.header.setAgentNum((byte) 10001);
        this.setParaDownload((byte) 4);
    }

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

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

    public Byte getParaDownload() {
        return paraDownload;
    }

    public void setParaDownload(Byte paraDownload) {
        this.paraDownload = paraDownload;
    }

    public Byte getCheckSum() {
        return checkSum;
    }

    public void setCheckSum(Byte checkSum) {
        this.checkSum = checkSum;
    }

    /**
     * <code>参数下载消息编码</code>
     *
     * @return
     */
    public byte[] encoded() {
        ByteBuf bb = buffer(BUFFER_SIZE);
        bb.writeShort(this.header.getStartCode());
        bb.markWriterIndex();
        bb.writeShort(0);//预先写入length=0占位
        bb.writeByte(this.header.getMessageType());//
        bb.writeByte(this.header.getmId());
        bb.writeInt(this.header.getSendingTime());//
        bb.writeInt(this.header.getEventId());//
        bb.writeByte(this.header.getAgentNum());//
        bb.writeByte(this.getParaDownload());//
        //回写length段
        int index = bb.writerIndex();
        bb.resetWriterIndex();
        int length = index + 1;//+checksum 通过顺序写index可以计算得到length
        this.header.setMessageSize((short) length);
        bb.writeShort(this.header.getMessageSize());
        bb.writerIndex(index);
        //写完后指针复位
        ByteBuf _copy = bb.copy();
        byte[] tmp = dataTool.getBytesFromByteBuf(_copy);
        this.setCheckSum(dataTool.getCheckSum(tmp));
        bb.writeByte(this.getCheckSum());//
        return dataTool.getBytesFromByteBuf(bb);
    }

    /**
     * <code>参数下载消息解码</code>
     * @return
     */
    public MsgParamdownload decoded(byte[] data) {
        MsgParamdownload mpdl = new MsgParamdownload();
        ByteBuf bb = buffer(BUFFER_SIZE);
        bb.writeBytes(data);
        header.setStartCode(bb.readShort());
        header.setMessageSize(bb.readShort());
        header.setMessageType(bb.readByte());
        header.setmId(bb.readByte());
        header.setSendingTime(bb.readInt());
        header.setEventId(bb.readInt());
        header.setAgentNum(bb.readByte());
        mpdl.setStatus(bb.readByte());
        mpdl.setColletcontab(bb.readInt());
        mpdl.setCollectProtocol(bb.readByte());
        mpdl.setCheckSum(bb.readByte());
        mpdl.setHeader(header);
        return mpdl;
    }


}
