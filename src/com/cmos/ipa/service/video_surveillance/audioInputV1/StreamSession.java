
package com.cmos.ipa.service.video_surveillance.audioInputV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>StreamSession complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取sourceURI属性的值。
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
     * 设置sourceURI属性的值。
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
     * 获取outputURI属性的值。
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
     * 设置outputURI属性的值。
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
     * 获取controlURI属性的值。
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
     * 设置controlURI属性的值。
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
     * 获取transportURL属性的值。
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
     * 设置transportURL属性的值。
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
     * 获取streamState属性的值。
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
     * 设置streamState属性的值。
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
     * 获取displayName属性的值。
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
     * 设置displayName属性的值。
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
     * 获取sessionId属性的值。
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
     * 设置sessionId属性的值。
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
     * 获取iFrameOnly属性的值。
     * 
     */
    public int getIFrameOnly() {
        return iFrameOnly;
    }

    /**
     * 设置iFrameOnly属性的值。
     * 
     */
    public void setIFrameOnly(int value) {
        this.iFrameOnly = value;
    }

    /**
     * 获取secsPerIFrame属性的值。
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
     * 设置secsPerIFrame属性的值。
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
     * 获取startTime属性的值。
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
     * 设置startTime属性的值。
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
     * 获取endTime属性的值。
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
     * 设置endTime属性的值。
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
     * 获取clients属性的值。
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
     * 设置clients属性的值。
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
     * 获取refreshInterval属性的值。
     * 
     */
    public long getRefreshInterval() {
        return refreshInterval;
    }

    /**
     * 设置refreshInterval属性的值。
     * 
     */
    public void setRefreshInterval(long value) {
        this.refreshInterval = value;
    }

}
