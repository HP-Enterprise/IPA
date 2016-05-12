
package com.cmos.ipa.service.video_surveillance.audioInputV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>StreamSession complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="StreamSession"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sourceURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="outputURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="controlURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="transportURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="streamState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="iFrameOnly" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="secsPerIFrame" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="endTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="clients" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="refreshInterval" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StreamSession", propOrder = {
    "sourceURI",
    "outputURI",
    "controlURI",
    "transportURL",
    "streamState",
    "displayName",
    "sessionId",
    "iFrameOnly",
    "secsPerIFrame",
    "startTime",
    "endTime",
    "clients",
    "refreshInterval"
})
public class StreamSession {

    @XmlSchemaType(name = "anyURI")
    protected String sourceURI;
    @XmlSchemaType(name = "anyURI")
    protected String outputURI;
    @XmlSchemaType(name = "anyURI")
    protected String controlURI;
    @XmlSchemaType(name = "anyURI")
    protected String transportURL;
    protected String streamState;
    protected String displayName;
    protected String sessionId;
    protected int iFrameOnly;
    protected Integer secsPerIFrame;
    protected String startTime;
    protected String endTime;
    @XmlSchemaType(name = "unsignedInt")
    protected Long clients;
    @XmlSchemaType(name = "unsignedInt")
    protected long refreshInterval;

    /**
     * ��ȡsourceURI���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceURI() {
        return sourceURI;
    }

    /**
     * ����sourceURI���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceURI(String value) {
        this.sourceURI = value;
    }

    /**
     * ��ȡoutputURI���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputURI() {
        return outputURI;
    }

    /**
     * ����outputURI���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputURI(String value) {
        this.outputURI = value;
    }

    /**
     * ��ȡcontrolURI���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlURI() {
        return controlURI;
    }

    /**
     * ����controlURI���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlURI(String value) {
        this.controlURI = value;
    }

    /**
     * ��ȡtransportURL���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportURL() {
        return transportURL;
    }

    /**
     * ����transportURL���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportURL(String value) {
        this.transportURL = value;
    }

    /**
     * ��ȡstreamState���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreamState() {
        return streamState;
    }

    /**
     * ����streamState���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreamState(String value) {
        this.streamState = value;
    }

    /**
     * ��ȡdisplayName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * ����displayName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * ��ȡsessionId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * ����sessionId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * ��ȡiFrameOnly���Ե�ֵ��
     * 
     */
    public int getIFrameOnly() {
        return iFrameOnly;
    }

    /**
     * ����iFrameOnly���Ե�ֵ��
     * 
     */
    public void setIFrameOnly(int value) {
        this.iFrameOnly = value;
    }

    /**
     * ��ȡsecsPerIFrame���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSecsPerIFrame() {
        return secsPerIFrame;
    }

    /**
     * ����secsPerIFrame���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSecsPerIFrame(Integer value) {
        this.secsPerIFrame = value;
    }

    /**
     * ��ȡstartTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * ����startTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTime(String value) {
        this.startTime = value;
    }

    /**
     * ��ȡendTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * ����endTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTime(String value) {
        this.endTime = value;
    }

    /**
     * ��ȡclients���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getClients() {
        return clients;
    }

    /**
     * ����clients���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setClients(Long value) {
        this.clients = value;
    }

    /**
     * ��ȡrefreshInterval���Ե�ֵ��
     * 
     */
    public long getRefreshInterval() {
        return refreshInterval;
    }

    /**
     * ����refreshInterval���Ե�ֵ��
     * 
     */
    public void setRefreshInterval(long value) {
        this.refreshInterval = value;
    }

}
