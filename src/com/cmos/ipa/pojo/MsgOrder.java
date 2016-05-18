package com.cmos.ipa.pojo;

import com.cmos.ipa.utils.DataTool;
import com.cmos.ipa.utils.Global;
import com.cmos.ipa.utils.log.Logger;
import io.netty.buffer.ByteBuf;

import java.io.UnsupportedEncodingException;

import static io.netty.buffer.Unpooled.buffer;

/**
 * <code>指令消息</code>
 * @author Hardy
 * @date 2016/5/18 11:12
 * @version 1.0
 */
public class MsgOrder {

    private Header header;//消息头

    //指令类型最大长度为20
    private static int orderTypeSize=20;
    //指令参数最大长度为100
    private static int orderParaSize=100;

    //指令类型
    private String orderType;
    //指令参数
    private String orderPara;
    //返回的指令状态
    private Byte status;

    private Byte checkSum;//将编码后的报文（Message Header + body）进行异或操作，1个字节长度

    private static final int BUFFER_SIZE = 1024;

    private DataTool dataTool;

    private Logger log;

    public MsgOrder(){
        this.header = new Header();
        this.header.setMessageType((byte) 5);
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

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getOrderPara() {
        return orderPara;
    }

    public void setOrderPara(String orderPara) {
        this.orderPara = orderPara;
    }

    public Byte getCheckSum() {
        return checkSum;
    }

    public void setCheckSum(Byte checkSum) {
        this.checkSum = checkSum;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * <code>指令消息解码</code>
     * @param data
     * @return
     */
    public MsgOrder decoded(byte[] data){
        MsgOrder mo = new MsgOrder();
        try {
        ByteBuf bb = buffer(BUFFER_SIZE);
        bb.writeBytes(data);
        header.setStartCode(bb.readShort());
        header.setMessageSize(bb.readShort());
        header.setMessageType(bb.readByte());
        header.setmId(bb.readByte());
        header.setSendingTime(bb.readInt());
        header.setEventId(bb.readInt());
        header.setAgentNum(bb.readByte());
        mo.setHeader(header);
            byte[] orderTypeBytes = new byte[orderTypeSize];
            bb.readBytes(orderTypeBytes);
            String _orderType= new String(orderTypeBytes,"UTF-8").trim();
            mo.setOrderType(_orderType);
        byte[] orderParaBytes = new byte[orderParaSize];
        bb.readBytes(orderParaBytes);
            String _orderPara= new String(orderParaBytes,"UTF-8").trim();
            mo.setOrderPara(_orderPara);
            mo.setCheckSum(bb.readByte());
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return mo;
    }

    /**
     * <code>指令消息编码</code>
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
        bb.writeByte(getStatus());//
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
