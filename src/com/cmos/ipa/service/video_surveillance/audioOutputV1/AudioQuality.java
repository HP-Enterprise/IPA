
package com.cmos.ipa.service.video_surveillance.audioOutputV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 						This represents audio quality settings.
 * 					
 * 
 * <p>AudioQuality complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="AudioQuality"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="framerate" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="bitrate" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="format" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="samplesize" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="samplerate" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="volume" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AudioQuality", propOrder = {
    "framerate",
    "bitrate",
    "format",
    "samplesize",
    "samplerate",
    "volume"
})
public class AudioQuality {

    protected int framerate;
    protected int bitrate;
    @XmlElement(required = true)
    protected String format;
    protected int samplesize;
    protected int samplerate;
    protected int volume;

    /**
     * ��ȡframerate���Ե�ֵ��
     * 
     */
    public int getFramerate() {
        return framerate;
    }

    /**
     * ����framerate���Ե�ֵ��
     * 
     */
    public void setFramerate(int value) {
        this.framerate = value;
    }

    /**
     * ��ȡbitrate���Ե�ֵ��
     * 
     */
    public int getBitrate() {
        return bitrate;
    }

    /**
     * ����bitrate���Ե�ֵ��
     * 
     */
    public void setBitrate(int value) {
        this.bitrate = value;
    }

    /**
     * ��ȡformat���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormat() {
        return format;
    }

    /**
     * ����format���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormat(String value) {
        this.format = value;
    }

    /**
     * ��ȡsamplesize���Ե�ֵ��
     * 
     */
    public int getSamplesize() {
        return samplesize;
    }

    /**
     * ����samplesize���Ե�ֵ��
     * 
     */
    public void setSamplesize(int value) {
        this.samplesize = value;
    }

    /**
     * ��ȡsamplerate���Ե�ֵ��
     * 
     */
    public int getSamplerate() {
        return samplerate;
    }

    /**
     * ����samplerate���Ե�ֵ��
     * 
     */
    public void setSamplerate(int value) {
        this.samplerate = value;
    }

    /**
     * ��ȡvolume���Ե�ֵ��
     * 
     */
    public int getVolume() {
        return volume;
    }

    /**
     * ����volume���Ե�ֵ��
     * 
     */
    public void setVolume(int value) {
        this.volume = value;
    }

}
