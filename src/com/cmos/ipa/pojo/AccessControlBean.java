package com.cmos.ipa.pojo;

import com.cmos.ipa.utils.PropertyUtil;
import io.netty.buffer.ByteBuf;

import static io.netty.buffer.Unpooled.buffer;

/**
 * <code>门禁系统实体类</code>
 * @author Hardy
 * @date 2016/4/29 15:40
 * @version 1.0
 */
public class AccessControlBean {
    //报文起始符
    private String startCode;
    //包长度
    private int packageLength;
    //门禁控制器IP
    private String controllerIp;
    //门禁控制器面板接口位置 0~31
    private String interfaceAddr;
    //门禁控制器面板方向 0为左，1为右
    private String panelDirection;
    //任务码
    private String taskCode;
    //事件码
    private String eventCode;
    //消息类型ID
    private String msgTypeId;
    //IOlinker事件的消息编号 具体内容来源配置
    private String iolinkerNum;
    //IOlinker事件的消息描述
    private String description;
    //事件发生时间
    private String eventTime;
    //控制器名称
    private String controllerName;
    //接口面板名称
    private String panelName;
    //读卡器名称
    private String cardReaderName;
    //事件名称
    private String eventName;
    //IO事件描述
    private String IODescription;
    //卡号
    private String cardNum;
    //人员工号
    private String jobNum;
    //人员姓名
    private String staffName;

    public static final int BUFFER_SIZE = 1024;

    public String getStartCode() {
        return startCode;
    }

    public void setStartCode(String startCode) {
        this.startCode = startCode;
    }

    public int getPackageLength() {
        return packageLength;
    }

    public void setPackageLength(int packageLength) {
        this.packageLength = packageLength;
    }

    public String getControllerIp() {
        return controllerIp;
    }

    public void setControllerIp(String controllerIp) {
        this.controllerIp = controllerIp;
    }

    public String getInterfaceAddr() {
        return interfaceAddr;
    }

    public void setInterfaceAddr(String interfaceAddr) {
        this.interfaceAddr = interfaceAddr;
    }

    public String getPanelDirection() {
        return panelDirection;
    }

    public void setPanelDirection(String panelDirection) {
        this.panelDirection = panelDirection;
    }

    public String getTaskCode() {
        return taskCode;
    }

    public void setTaskCode(String taskCode) {
        this.taskCode = taskCode;
    }

    public String getEventCode() {
        return eventCode;
    }

    public void setEventCode(String eventCode) {
        this.eventCode = eventCode;
    }

    public String getMsgTypeId() {
        return msgTypeId;
    }

    public void setMsgTypeId(String msgTypeId) {
        this.msgTypeId = msgTypeId;
    }

    public String getIolinkerNum() {
        return iolinkerNum;
    }

    public void setIolinkerNum(String iolinkerNum) {
        this.iolinkerNum = iolinkerNum;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEventTime() {
        return eventTime;
    }

    public void setEventTime(String eventTime) {
        this.eventTime = eventTime;
    }

    public String getControllerName() {
        return controllerName;
    }

    public void setControllerName(String controllerName) {
        this.controllerName = controllerName;
    }

    public String getPanelName() {
        return panelName;
    }

    public void setPanelName(String panelName) {
        this.panelName = panelName;
    }

    public String getCardReaderName() {
        return cardReaderName;
    }

    public void setCardReaderName(String cardReaderName) {
        this.cardReaderName = cardReaderName;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getIODescription() {
        return IODescription;
    }

    public void setIODescription(String IODescription) {
        this.IODescription = IODescription;
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public String getJobNum() {
        return jobNum;
    }

    public void setJobNum(String jobNum) {
        this.jobNum = jobNum;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    /**
     * <code>门禁消息解码</code>
     * @param data
     * @return
     */
    public AccessControlBean decoded(byte[] data){
        AccessControlBean acb = new AccessControlBean();
        ByteBuf bb = buffer(BUFFER_SIZE);
        bb.writeBytes(data);
        acb.setStartCode(String.valueOf(bb.readByte()));
        acb.setPackageLength(Integer.valueOf(bb.readByte()));
        acb.setControllerIp(String.valueOf(bb.readByte()));
        acb.setInterfaceAddr(String.valueOf(bb.readByte()));
        acb.setPanelDirection(String.valueOf(bb.readByte()));
        acb.setTaskCode(String.valueOf(bb.readByte()));
        acb.setEventCode(String.valueOf(bb.readByte()));
        acb.setMsgTypeId(String.valueOf(bb.readByte()));
        String iolinkerNum = String.valueOf(bb.readByte());
        acb.setIolinkerNum(iolinkerNum);
        acb.setDescription(PropertyUtil.getProperty(iolinkerNum));
        acb.setEventTime(String.valueOf(bb.readByte()));
        acb.setControllerName(String.valueOf(bb.readByte()));
        acb.setPanelName(String.valueOf(bb.readByte()));
        acb.setCardReaderName(String.valueOf(bb.readByte()));
        acb.setEventName(String.valueOf(bb.readByte()));
        acb.setIODescription(String.valueOf(bb.readByte()));
        acb.setCardNum(String.valueOf(bb.readByte()));
        acb.setJobNum(String.valueOf(bb.readByte()));
        acb.setStaffName(String.valueOf(bb.readByte()));
        return acb;
    }

    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append("门禁控制器IP:").append(this.getControllerIp()).append(";");
        sb.append("接口面板地址:").append(this.getInterfaceAddr()).append(";");
        sb.append("接口面板的左右:").append(this.getPanelDirection()).append(";");
        sb.append("IOlinkerNum:").append(this.getIolinkerNum()).append(";");
        sb.append("事件描述:").append(this.getDescription()).append(";");
        sb.append("事件发生时间:").append(this.getEventTime()).append(";");
        sb.append("控制器名称:").append(this.getControllerName()).append(";");
        sb.append("接口面板名称:").append(this.getPanelName()).append(";");
        sb.append("读卡器名称:").append(this.getCardReaderName()).append(";");
        sb.append("事件名称:").append(this.getEventName()).append(";");
        sb.append("IO消息描述:").append(this.getIODescription()).append(";");
        sb.append("卡号:").append(this.getCardNum()).append(";");
        sb.append("工号:").append(this.getJobNum()).append(";");
        sb.append("人员姓名:").append(this.getStaffName()).append(";");
        return sb.toString();
    }
}
