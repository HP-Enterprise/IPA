
package com.cmos.ipa.service.video_surveillance.videoInputV1;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * The current transmission state of the stream.
 * 
 * <p>VideoQuality complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="VideoQuality"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="framerate" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="bitrate" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="format" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="videosize" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *         &lt;element name="tvformat" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *         &lt;element name="gop" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoQuality", propOrder = {
    "framerate",
    "bitrate",
    "format",
    "videosize",
    "tvformat",
    "gop"
})
public class VideoQuality {

    protected double framerate;
    protected int bitrate;
    protected String format;
    @XmlSchemaType(name = "unsignedInt")
    protected long videosize;
    @XmlSchemaType(name = "unsignedInt")
    protected long tvformat;
    @XmlElement(required = true)
    protected BigDecimal gop;

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
     * ��ȡvideosize���Ե�ֵ��
     * 
     */
    public long getVideosize() {
        return videosize;
    }

    /**
     * ����videosize���Ե�ֵ��
     * 
     */
    public void setVideosize(long value) {
        this.videosize = value;
    }

    /**
     * ��ȡtvformat���Ե�ֵ��
     * 
     */
    public long getTvformat() {
        return tvformat;
    }

    /**
     * ����tvformat���Ե�ֵ��
     * 
     */
    public void setTvformat(long value) {
        this.tvformat = value;
    }

    /**
     * ��ȡgop���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link java.math.BigDecimal }
     *     
     */
    public BigDecimal getGop() {
        return gop;
    }

    /**
     * ����gop���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link java.math.BigDecimal }
     *     
     */
    public void setGop(BigDecimal value) {
        this.gop = value;
    }

}
