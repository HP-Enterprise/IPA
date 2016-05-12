
package com.cmos.ipa.service.video_surveillance.audioInputV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 					Settings for connecting to a stream.
 * 					
 * 
 * <p>StreamParameters complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="StreamParameters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="preAlarmDurationInManualRecord" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="streamSession" type="{urn:schemas-pelco-com:service:AudioInput:1}StreamSession"/&gt;
 *         &lt;element name="samplerate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StreamParameters", propOrder = {
    "displayName",
    "preAlarmDurationInManualRecord",
    "streamSession",
    "samplerate"
})
public class StreamParameters {

    protected String displayName;
    protected int preAlarmDurationInManualRecord;
    @XmlElement(required = true)
    protected StreamSession streamSession;
    protected String samplerate;

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
     * ��ȡpreAlarmDurationInManualRecord���Ե�ֵ��
     * 
     */
    public int getPreAlarmDurationInManualRecord() {
        return preAlarmDurationInManualRecord;
    }

    /**
     * ����preAlarmDurationInManualRecord���Ե�ֵ��
     * 
     */
    public void setPreAlarmDurationInManualRecord(int value) {
        this.preAlarmDurationInManualRecord = value;
    }

    /**
     * ��ȡstreamSession���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.audioInputV1.StreamSession }
     *     
     */
    public StreamSession getStreamSession() {
        return streamSession;
    }

    /**
     * ����streamSession���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link com.cmos.ipa.service.video_surveillance.audioInputV1.StreamSession }
     *     
     */
    public void setStreamSession(StreamSession value) {
        this.streamSession = value;
    }

    /**
     * ��ȡsamplerate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSamplerate() {
        return samplerate;
    }

    /**
     * ����samplerate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSamplerate(String value) {
        this.samplerate = value;
    }

}
