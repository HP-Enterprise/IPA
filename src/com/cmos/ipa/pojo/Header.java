package com.cmos.ipa.pojo;

/**
 * <code>报文头信息实体类</code>
 * @author Hardy
 * @date 2016/4/29 15:40
 * @version 1.0
 */
public class Header {

    //报文起始字符
    private Short startCode=9252;
    //报文消息长度
    private Short messageSize;
    //报文消息状态    1：状态消息 2：告警消息 3：心跳 4：参数下发
    private Byte messageType;
    //报文发送时间    使用从 1970-01 00:00到现在的秒数来表示
    private Integer sendingTime;
    //代理服务器编号
    private Byte agentNum;

    public Short getStartCode() {
        return startCode;
    }

    public void setStartCode(Short startCode) {
        this.startCode = startCode;
    }

    public Short getMessageSize() {
        return messageSize;
    }

    public void setMessageSize(Short messageSize) {
        this.messageSize = messageSize;
    }

    public Byte getMessageType() {
        return messageType;
    }

    public void setMessageType(Byte messageType) {
        this.messageType = messageType;
    }

    public Integer getSendingTime() {
        return sendingTime;
    }

    public void setSendingTime(Integer sendingTime) {
        this.sendingTime = sendingTime;
    }

    public Byte getAgentNum() {
        return agentNum;
    }

    public void setAgentNum(Byte agentNum) {
        this.agentNum = agentNum;
    }
}
