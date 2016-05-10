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
        acb.setIolinkerNum(PropertyUtil.getProperty(String.valueOf(bb.readByte())));
        return acb;
    }

    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append("门禁控制器IP:").append(this.getControllerIp()).append(";");
        sb.append("接口面板地址:").append(this.getInterfaceAddr()).append(";");
        sb.append("接口面板的左右:").append(this.getPanelDirection()).append(";");
        sb.append("IOlinker事件内容:").append(this.getIolinkerNum()).append(";");
        return sb.toString();
    }
}
