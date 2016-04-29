package com.cmos.ipa.pojo;

import com.cmos.ipa.utils.DataTool;
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
    private Byte mId;
    private Integer eventId;
    private HeartReqBody heartReqBody;//消息体
    private Byte checkSum;//将编码后的报文（Message Header + body）进行异或操作，1个字节长度

    public static final int BUFFER_SIZE = 1024;

    public DataTool dataTool = new DataTool();

    public MsgHeart() {
        this.header.setMessageType((byte) 3);
        this.setmId((byte)1);
    }

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public Byte getmId() {
        return mId;
    }

    public void setmId(Byte mId) {
        this.mId = mId;
    }

    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    public HeartReqBody getHeartReqBody() {
        return heartReqBody;
    }

    public void setHeartReqBody(HeartReqBody heartReqBody) {
        this.heartReqBody = heartReqBody;
    }

    public Byte getCheckSum() {
        return checkSum;
    }

    public void setCheckSum(Byte checkSum) {
        this.checkSum = checkSum;
    }

    public void decoded(byte[] data){
        ByteBuf bb = buffer(BUFFER_SIZE);
        bb.writeBytes(data);
        this.header.setStartCode(bb.readShort());
        this.header.setMessageSize(bb.readShort());
        this.header.setMessageType(bb.readByte());
        this.setmId(bb.readByte());
        this.header.setSendingTime(bb.readInt());
        this.setEventId(bb.readInt());
        this.header.setAgentNum(bb.readByte());
        this.heartReqBody.setHeartBeat(bb.readByte());
        this.setCheckSum(bb.readByte());
    }


    public byte[] encoded(){
        ByteBuf bb = buffer(BUFFER_SIZE);
        bb.writeShort(this.header.getStartCode());
        bb.markWriterIndex();
        bb.writeShort(0);//预先写入length=0占位
        bb.writeByte(this.header.getMessageType());//
        bb.writeByte(this.getmId());
        bb.writeInt(this.header.getSendingTime());//
        bb.writeInt(this.getEventId());//
        bb.writeByte(this.header.getAgentNum());//
        bb.writeByte(this.heartReqBody.getHeartBeat());//
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
        sb.append("        Mid:").append(this.getmId()).append("\n");
        sb.append("SendingTime:").append(this.header.getSendingTime()).append("\n");
        sb.append("    EventId:").append(this.getEventId()).append("\n");
        sb.append("   AgentNum:").append(this.header.getAgentNum()).append("\n");
        sb.append("  HeartBeat:").append(this.heartReqBody.getHeartBeat()).append("\n");
        sb.append("   CheckSum:").append(this.getCheckSum()).append("\n");
        sb.append("------------"+this.getClass().toString()+"------------").append("\n");
        return sb.toString();
    }
}
