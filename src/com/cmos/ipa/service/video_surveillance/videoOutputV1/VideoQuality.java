
package com.cmos.ipa.service.video_surveillance.videoOutputV1;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             The current transmission state of the stream. See the StreamControl service specification for possible values for streamState.
 *             
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;div xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tns="urn:schemas-pelco-com:service:VideoOutput:1" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xsd="http://www.w3.org/2001/XMLSchema" class="warning"&gt;
 *               Some configuration value settings (framerate, gop, resolution) in VideoQuality WILL BE IN NTSC VALUES, regardless of whether you decide to use PAL. (To convert PAL values to NTSC values simply multiply a PAL value by 30/25.) 
 *               These values will be automatically converted by the device to PAL values if you set the 'tvformat' value to PAL. 
 *               However, even if you set the tvformat attrbute to PAL, this change will not be apparent even with re-querying the current VideoQuality settings
 * 
 *               The only known exception is the IP Spectra series of cameras. If an IP Spectra is set to PAL format, it will return its values in PAL format when queried using the VideoOutput service.
 *             &lt;/div&gt;
 * </pre>
 * 
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
 *         &lt;element name="framerate" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="bitrate" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="format" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="videosize" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *         &lt;element name="tvformat" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *         &lt;element name="customResHeight" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="customResWidth" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
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
@XmlType(name = "VideoQuality", propOrder = {
    "framerate",
    "bitrate",
    "format",
    "videosize",
    "tvformat",
    "customResHeight",
    "customResWidth",
    "gop"
})
public class VideoQuality {

    @XmlElement(required = true)
    protected BigDecimal framerate;
    protected int bitrate;
    protected String format;
    @XmlSchemaType(name = "unsignedInt")
    protected long videosize;
    @XmlSchemaType(name = "unsignedInt")
    protected long tvformat;
    @XmlSchemaType(name = "unsignedInt")
    protected Long customResHeight;
    @XmlSchemaType(name = "unsignedInt")
    protected Long customResWidth;
    @XmlSchemaType(name = "unsignedInt")
    protected long gop;

    /**
     * ��ȡframerate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link java.math.BigDecimal }
     *     
     */
    public BigDecimal getFramerate() {
        return framerate;
    }

    /**
     * ����framerate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link java.math.BigDecimal }
     *     
     */
    public void setFramerate(BigDecimal value) {
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
     * ��ȡcustomResHeight���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustomResHeight() {
        return customResHeight;
    }

    /**
     * ����customResHeight���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustomResHeight(Long value) {
        this.customResHeight = value;
    }

    /**
     * ��ȡcustomResWidth���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustomResWidth() {
        return customResWidth;
    }

    /**
     * ����customResWidth���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustomResWidth(Long value) {
        this.customResWidth = value;
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
