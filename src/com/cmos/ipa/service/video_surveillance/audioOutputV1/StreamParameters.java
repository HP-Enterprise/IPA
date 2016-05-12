
package com.cmos.ipa.service.video_surveillance.audioOutputV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
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
 *         &lt;element name="eventType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="preAlarmDurationInManualRecord" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="streamSession" type="{urn:schemas-pelco-com:service:AudioOutput:1}StreamSession"/&gt;
 *         &lt;element name="audioQuality" type="{urn:schemas-pelco-com:service:AudioOutput:1}AudioQuality"/&gt;
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
    "eventType",
    "preAlarmDurationInManualRecord",
    "streamSession",
    "audioQuality"
})
public class StreamParameters {

    protected String displayName;
    protected String eventType;
    protected int preAlarmDurationInManualRecord;
    @XmlElement(required = true)
    protected StreamSession streamSession;
    @XmlElement(required = true)
    protected AudioQuality audioQuality;

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
     * ��ȡeventType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * ����eventType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventType(String value) {
        this.eventType = value;
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
     *     {@link com.cmos.ipa.service.video_surveillance.audioOutputV1.StreamSession }
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
     *     {@link com.cmos.ipa.service.video_surveillance.audioOutputV1.StreamSession }
     *     
     */
    public void setStreamSession(StreamSession value) {
        this.streamSession = value;
    }

    /**
     * ��ȡaudioQuality���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.audioOutputV1.AudioQuality }
     *     
     */
    public AudioQuality getAudioQuality() {
        return audioQuality;
    }

    /**
     * ����audioQuality���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link com.cmos.ipa.service.video_surveillance.audioOutputV1.AudioQuality }
     *     
     */
    public void setAudioQuality(AudioQuality value) {
        this.audioQuality = value;
    }

}
