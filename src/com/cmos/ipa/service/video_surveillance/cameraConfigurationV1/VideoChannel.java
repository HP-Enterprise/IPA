
package com.cmos.ipa.service.video_surveillance.cameraConfigurationV1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Represents the properties of a video channel.
 * 
 * <p>VideoChannel complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="VideoChannel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="framerate" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="bitrate" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="format" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="videosize" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="tvformat" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="pruneStoredVideo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="gop" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoChannel", propOrder = {
    "framerate",
    "bitrate",
    "format",
    "videosize",
    "tvformat",
    "pruneStoredVideo",
    "gop"
})
public class VideoChannel {

    protected double framerate;
    protected int bitrate;
    @XmlElementRef(name = "format", type = JAXBElement.class, required = false)
    protected JAXBElement<String> format;
    protected int videosize;
    protected int tvformat;
    protected Integer pruneStoredVideo;
    @XmlSchemaType(name = "unsignedInt")
    protected long gop;

    /**
     * ��ȡframerate���Ե�ֵ��
     * 
     */
    public double getFramerate() {
        return framerate;
    }

    /**
     * ����framerate���Ե�ֵ��
     * 
     */
    public void setFramerate(double value) {
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
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFormat() {
        return format;
    }

    /**
     * ����format���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFormat(JAXBElement<String> value) {
        this.format = value;
    }

    /**
     * ��ȡvideosize���Ե�ֵ��
     * 
     */
    public int getVideosize() {
        return videosize;
    }

    /**
     * ����videosize���Ե�ֵ��
     * 
     */
    public void setVideosize(int value) {
        this.videosize = value;
    }

    /**
     * ��ȡtvformat���Ե�ֵ��
     * 
     */
    public int getTvformat() {
        return tvformat;
    }

    /**
     * ����tvformat���Ե�ֵ��
     * 
     */
    public void setTvformat(int value) {
        this.tvformat = value;
    }

    /**
     * ��ȡpruneStoredVideo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPruneStoredVideo() {
        return pruneStoredVideo;
    }

    /**
     * ����pruneStoredVideo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPruneStoredVideo(Integer value) {
        this.pruneStoredVideo = value;
    }

    /**
     * ��ȡgop���Ե�ֵ��
     * 
     */
    public long getGop() {
        return gop;
    }

    /**
     * ����gop���Ե�ֵ��
     * 
     */
    public void setGop(long value) {
        this.gop = value;
    }

}
