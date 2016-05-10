package com.cmos.ipa.pojo;

import com.cmos.ipa.utils.ByteUtil;
import com.cmos.ipa.utils.DataTool;
import com.cmos.ipa.utils.DateTimeUtil;
import io.netty.buffer.ByteBuf;
import static io.netty.buffer.Unpooled.buffer;

/**
 * <code>心跳报文</code>
 * @author Hardy
 * @date 2016/4/29 15:40
 * @version 1.0
 */
public class MsgHeart {


    private Header header;//消息头
    //心跳状态 0 失败  1成功
    private Byte status;
    //心跳标识 默认为3
    private Byte heartBeat;

    private Byte checkSum;//将编码后的报文（Message Header + body）进行异或操作，1个字节长度

    public static final int BUFFER_SIZE = 1024;

    public DataTool dataTool = new DataTool();

    public MsgHeart() {
        this.header = new Header();
        this.header.setMessageType((byte) 3);
        this.header.setmId((byte) 1);
        this.header.setSendingTime(new DataTool().getCurrentSeconds());
        this.header.setEventId(new DataTool().getCurrentSeconds());
        this.header.setAgentNum((byte) 10001);
        this.heartBeat = (byte)3;
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

    public Byte getHeartBeat() {
        return heartBeat;
    }

    public void setHeartBeat(Byte heartBeat) {
        this.heartBeat = heartBeat;
    }

    public Byte getCheckSum() {
        return checkSum;
    }

    public void setCheckSum(Byte checkSum) {
        this.checkSum = checkSum;
    }

    /**
     * <code>心跳消息解码</code>
     * @param data
     * @return
     */
    public MsgHeart decoded(byte[] data){
        MsgHeart mh = new MsgHeart();
        ByteBuf bb = buffer(BUFFER_SIZE);
        bb.writeBytes(data);
        header.setStartCode(bb.readShort());
        header.setMessageSize(bb.readShort());
        header.setMessageType(bb.readByte());
        header.setmId(bb.readByte());
        header.setSendingTime(bb.readInt());
        header.setEventId(bb.readInt());
        header.setAgentNum(bb.readByte());
        mh.setHeader(header);
        mh.setStatus(bb.readByte());
        mh.setCheckSum(bb.readByte());
        return mh;
    }


    /**
     * <code>心跳消息编码</code>
     * @return
     */
    public byte[] encoded(){
        ByteBuf bb = buffer(BUFFER_SIZE);
        bb.writeShort(this.header.getStartCode());
        bb.markWriterIndex();
        bb.writeShort(0);//预先写入length=0占位
        bb.writeByte(this.header.getMessageType());//
        bb.writeByte(this.header.getmId());
        bb.writeInt(this.header.getSendingTime());//
        bb.writeInt(this.header.getEventId());//
        bb.writeByte(this.header.getAgentNum());//
        bb.writeByte(getHeartBeat());//
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

    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append("------------"+this.getClass().toString()+"------------").append("\n");
        sb.append("  StartCode:").append(this.header.getStartCode()).append("\n");
        sb.append("MessageSize:").append(this.header.getMessageSize()).append("\n");
        sb.append("MessageType:").append(this.header.getMessageType()).append("\n");
        sb.append("        Mid:").append(this.header.getmId()).append("\n");
        sb.append("SendingTime:").append(this.header.getSendingTime()).append("\n");
        sb.append("    EventId:").append(this.header.getEventId()).append("\n");
        sb.append("   AgentNum:").append(this.header.getAgentNum()).append("\n");
        sb.append("  HeartBeat:").append(getHeartBeat()).append("\n");
        sb.append("   CheckSum:").append(this.getCheckSum()).append("\n");
        sb.append("------------"+this.getClass().toString()+"------------").append("\n");
        return sb.toString();
    }
}
