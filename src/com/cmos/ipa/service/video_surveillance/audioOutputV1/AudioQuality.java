
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
 * <p>AudioQuality complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取framerate属性的值。
     * 
     */
    public int getFramerate() {
        return framerate;
    }

    /**
     * 设置framerate属性的值。
     * 
     */
    public void setFramerate(int value) {
        this.framerate = value;
    }

    /**
     * 获取bitrate属性的值。
     * 
     */
    public int getBitrate() {
        return bitrate;
    }

    /**
     * 设置bitrate属性的值。
     * 
     */
    public void setBitrate(int value) {
        this.bitrate = value;
    }

    /**
     * 获取format属性的值。
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
     * 设置format属性的值。
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
     * 获取samplesize属性的值。
     * 
     */
    public int getSamplesize() {
        return samplesize;
    }

    /**
     * 设置samplesize属性的值。
     * 
     */
    public void setSamplesize(int value) {
        this.samplesize = value;
    }

    /**
     * 获取samplerate属性的值。
     * 
     */
    public int getSamplerate() {
        return samplerate;
    }

    /**
     * 设置samplerate属性的值。
     * 
     */
    public void setSamplerate(int value) {
        this.samplerate = value;
    }

    /**
     * 获取volume属性的值。
     * 
     */
    public int getVolume() {
        return volume;
    }

    /**
     * 设置volume属性的值。
     * 
     */
    public void setVolume(int value) {
        this.volume = value;
    }

}
