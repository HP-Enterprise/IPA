
package com.cmos.ipa.service.video_surveillance.videoInputV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents parameters needed for connecting to a video stream
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
 *         &lt;element name="preAlarmDurationInManualRecord" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="streamSession" type="{urn:schemas-pelco-com:service:VideoInput:1}StreamSession" minOccurs="0"/&gt;
 *         &lt;element name="compatability" type="{urn:schemas-pelco-com:service:VideoInput:1}Compatibility" minOccurs="0"/&gt;
 *         &lt;element name="videoQuality" type="{urn:schemas-pelco-com:service:VideoInput:1}VideoQuality" minOccurs="0"/&gt;
 *         &lt;element name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "preAlarmDurationInManualRecord",
    "streamSession",
    "compatability",
    "videoQuality",
    "displayName"
})
public class StreamParameters {

    protected int preAlarmDurationInManualRecord;
    protected StreamSession streamSession;
    protected Compatibility compatability;
    protected VideoQuality videoQuality;
    protected String displayName;

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
     *     {@link com.cmos.ipa.service.video_surveillance.videoInputV1.StreamSession }
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
     *     {@link com.cmos.ipa.service.video_surveillance.videoInputV1.StreamSession }
     *     
     */
    public void setStreamSession(StreamSession value) {
        this.streamSession = value;
    }

    /**
     * ��ȡcompatability���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.videoInputV1.Compatibility }
     *     
     */
    public Compatibility getCompatability() {
        return compatability;
    }

    /**
     * ����compatability���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link com.cmos.ipa.service.video_surveillance.videoInputV1.Compatibility }
     *     
     */
    public void setCompatability(Compatibility value) {
        this.compatability = value;
    }

    /**
     * ��ȡvideoQuality���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.videoInputV1.VideoQuality }
     *     
     */
    public VideoQuality getVideoQuality() {
        return videoQuality;
    }

    /**
     * ����videoQuality���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link com.cmos.ipa.service.video_surveillance.videoInputV1.VideoQuality }
     *     
     */
    public void setVideoQuality(VideoQuality value) {
        this.videoQuality = value;
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

}
