
package com.cmos.ipa.service.video_surveillance.deviceCapability;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents configuration of a stream
 *           
 * 
 * <p>StreamSetting complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="StreamSetting"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Bitrate" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="FrameRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="GOP" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="GOPStructure" type="{http://www.pelco.com/api/DeviceCapability/1}GOPStructure" minOccurs="0"/&gt;
 *         &lt;element name="DSCP" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CompressionFormat" type="{http://www.pelco.com/api/DeviceCapability/1}CompressionFormat"/&gt;
 *         &lt;element name="Resolution" type="{http://www.pelco.com/api/DeviceCapability/1}Resolution"/&gt;
 *         &lt;element name="EnduraSigning"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AdvancedSharpening" type="{http://www.pelco.com/api/DeviceCapability/1}EnabledElement" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StreamSetting", propOrder = {
    "bitrate",
    "frameRate",
    "gop",
    "gopStructure",
    "dscp",
    "compressionFormat",
    "resolution",
    "enduraSigning",
    "advancedSharpening"
})
public class StreamSetting {

    @XmlElement(name = "Bitrate")
    protected int bitrate;
    @XmlElement(name = "FrameRate", required = true)
    protected BigDecimal frameRate;
    @XmlElement(name = "GOP")
    protected int gop;
    @XmlElement(name = "GOPStructure")
    @XmlSchemaType(name = "string")
    protected GOPStructure gopStructure;
    @XmlElement(name = "DSCP")
    protected Integer dscp;
    @XmlElement(name = "CompressionFormat", required = true)
    @XmlSchemaType(name = "string")
    protected CompressionFormat compressionFormat;
    @XmlElement(name = "Resolution", required = true)
    protected Resolution resolution;
    @XmlElement(name = "EnduraSigning", required = true)
    protected EnduraSigning enduraSigning;
    @XmlElement(name = "AdvancedSharpening")
    protected EnabledElement advancedSharpening;

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
     * ��ȡframeRate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link java.math.BigDecimal }
     *     
     */
    public BigDecimal getFrameRate() {
        return frameRate;
    }

    /**
     * ����frameRate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link java.math.BigDecimal }
     *     
     */
    public void setFrameRate(BigDecimal value) {
        this.frameRate = value;
    }

    /**
     * ��ȡgop���Ե�ֵ��
     * 
     */
    public int getGOP() {
        return gop;
    }

    /**
     * ����gop���Ե�ֵ��
     * 
     */
    public void setGOP(int value) {
        this.gop = value;
    }

    /**
     * ��ȡgopStructure���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.deviceCapability.GOPStructure }
     *     
     */
    public GOPStructure getGOPStructure() {
        return gopStructure;
    }

    /**
     * ����gopStructure���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link com.cmos.ipa.service.video_surveillance.deviceCapability.GOPStructure }
     *     
     */
    public void setGOPStructure(GOPStructure value) {
        this.gopStructure = value;
    }

    /**
     * ��ȡdscp���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDSCP() {
        return dscp;
    }

    /**
     * ����dscp���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDSCP(Integer value) {
        this.dscp = value;
    }

    /**
     * ��ȡcompressionFormat���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CompressionFormat }
     *     
     */
    public CompressionFormat getCompressionFormat() {
        return compressionFormat;
    }

    /**
     * ����compressionFormat���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CompressionFormat }
     *     
     */
    public void setCompressionFormat(CompressionFormat value) {
        this.compressionFormat = value;
    }

    /**
     * ��ȡresolution���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.deviceCapability.Resolution }
     *     
     */
    public Resolution getResolution() {
        return resolution;
    }

    /**
     * ����resolution���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link com.cmos.ipa.service.video_surveillance.deviceCapability.Resolution }
     *     
     */
    public void setResolution(Resolution value) {
        this.resolution = value;
    }

    /**
     * ��ȡenduraSigning���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.deviceCapability.StreamSetting.EnduraSigning }
     *     
     */
    public EnduraSigning getEnduraSigning() {
        return enduraSigning;
    }

    /**
     * ����enduraSigning���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link com.cmos.ipa.service.video_surveillance.deviceCapability.StreamSetting.EnduraSigning }
     *     
     */
    public void setEnduraSigning(EnduraSigning value) {
        this.enduraSigning = value;
    }

    /**
     * ��ȡadvancedSharpening���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link EnabledElement }
     *     
     */
    public EnabledElement getAdvancedSharpening() {
        return advancedSharpening;
    }

    /**
     * ����advancedSharpening���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link EnabledElement }
     *     
     */
    public void setAdvancedSharpening(EnabledElement value) {
        this.advancedSharpening = value;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class EnduraSigning {

        @XmlAttribute(name = "enabled")
        protected Boolean enabled;

        /**
         * ��ȡenabled���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isEnabled() {
            return enabled;
        }

        /**
         * ����enabled���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setEnabled(Boolean value) {
            this.enabled = value;
        }

    }

}
