
package com.cmos.ipa.service.video_surveillance.audioOutputV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="sourceURI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="outputURI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="controlURI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transportURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="streamState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="endTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="clients" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="refreshInterval" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="transportUrlUseSourceAddress" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
    "sessionId",
    "startTime",
    "endTime",
    "clients",
    "refreshInterval",
    "transportUrlUseSourceAddress"
})
public class StreamSession {

    protected String sourceURI;
    protected String outputURI;
    protected String controlURI;
    protected String transportURL;
    protected String streamState;
    protected String sessionId;
    protected String startTime;
    protected String endTime;
    protected Integer clients;
    protected int refreshInterval;
    protected Integer transportUrlUseSourceAddress;

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
     *     {@link Integer }
     *     
     */
    public Integer getClients() {
        return clients;
    }

    /**
     * ����clients���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setClients(Integer value) {
        this.clients = value;
    }

    /**
     * ��ȡrefreshInterval���Ե�ֵ��
     * 
     */
    public int getRefreshInterval() {
        return refreshInterval;
    }

    /**
     * ����refreshInterval���Ե�ֵ��
     * 
     */
    public void setRefreshInterval(int value) {
        this.refreshInterval = value;
    }

    /**
     * ��ȡtransportUrlUseSourceAddress���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTransportUrlUseSourceAddress() {
        return transportUrlUseSourceAddress;
    }

    /**
     * ����transportUrlUseSourceAddress���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTransportUrlUseSourceAddress(Integer value) {
        this.transportUrlUseSourceAddress = value;
    }

}
