
package com.cmos.ipa.service.video_surveillance.deviceCapability;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents resources available on the device
 *           
 * 
 * <p>Capability complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="Capability"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AudioIn"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AudioOut"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Alarms"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Relays"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SerialPorts"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PTZCapability" type="{http://www.pelco.com/api/DeviceCapability/1}PTZCapability"/&gt;
 *         &lt;element name="VideoSources"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CompressionFormats" type="{http://www.pelco.com/api/DeviceCapability/1}CompressionFormats"/&gt;
 *         &lt;element name="AvailableStreams" type="{http://www.pelco.com/api/DeviceCapability/1}AvailableStreams"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Capability", propOrder = {
    "audioIn",
    "audioOut",
    "alarms",
    "relays",
    "serialPorts",
    "ptzCapability",
    "videoSources",
    "compressionFormats",
    "availableStreams"
})
public class Capability {

    @XmlElement(name = "AudioIn", required = true)
    protected AudioIn audioIn;
    @XmlElement(name = "AudioOut", required = true)
    protected AudioOut audioOut;
    @XmlElement(name = "Alarms", required = true)
    protected Alarms alarms;
    @XmlElement(name = "Relays", required = true)
    protected Relays relays;
    @XmlElement(name = "SerialPorts", required = true)
    protected SerialPorts serialPorts;
    @XmlElement(name = "PTZCapability", required = true)
    protected PTZCapability ptzCapability;
    @XmlElement(name = "VideoSources", required = true)
    protected VideoSources videoSources;
    @XmlElement(name = "CompressionFormats", required = true)
    protected CompressionFormats compressionFormats;
    @XmlElement(name = "AvailableStreams", required = true)
    protected AvailableStreams availableStreams;

    /**
     * ��ȡaudioIn���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.deviceCapability.Capability.AudioIn }
     *     
     */
    public AudioIn getAudioIn() {
        return audioIn;
    }

    /**
     * ����audioIn���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link com.cmos.ipa.service.video_surveillance.deviceCapability.Capability.AudioIn }
     *     
     */
    public void setAudioIn(AudioIn value) {
        this.audioIn = value;
    }

    /**
     * ��ȡaudioOut���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.deviceCapability.Capability.AudioOut }
     *     
     */
    public AudioOut getAudioOut() {
        return audioOut;
    }

    /**
     * ����audioOut���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link com.cmos.ipa.service.video_surveillance.deviceCapability.Capability.AudioOut }
     *     
     */
    public void setAudioOut(AudioOut value) {
        this.audioOut = value;
    }

    /**
     * ��ȡalarms���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.deviceCapability.Capability.Alarms }
     *     
     */
    public Alarms getAlarms() {
        return alarms;
    }

    /**
     * ����alarms���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link com.cmos.ipa.service.video_surveillance.deviceCapability.Capability.Alarms }
     *     
     */
    public void setAlarms(Alarms value) {
        this.alarms = value;
    }

    /**
     * ��ȡrelays���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.deviceCapability.Capability.Relays }
     *     
     */
    public Relays getRelays() {
        return relays;
    }

    /**
     * ����relays���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link com.cmos.ipa.service.video_surveillance.deviceCapability.Capability.Relays }
     *     
     */
    public void setRelays(Relays value) {
        this.relays = value;
    }

    /**
     * ��ȡserialPorts���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.deviceCapability.Capability.SerialPorts }
     *     
     */
    public SerialPorts getSerialPorts() {
        return serialPorts;
    }

    /**
     * ����serialPorts���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link com.cmos.ipa.service.video_surveillance.deviceCapability.Capability.SerialPorts }
     *     
     */
    public void setSerialPorts(SerialPorts value) {
        this.serialPorts = value;
    }

    /**
     * ��ȡptzCapability���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PTZCapability }
     *     
     */
    public PTZCapability getPTZCapability() {
        return ptzCapability;
    }

    /**
     * ����ptzCapability���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PTZCapability }
     *     
     */
    public void setPTZCapability(PTZCapability value) {
        this.ptzCapability = value;
    }

    /**
     * ��ȡvideoSources���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.deviceCapability.Capability.VideoSources }
     *     
     */
    public VideoSources getVideoSources() {
        return videoSources;
    }

    /**
     * ����videoSources���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link com.cmos.ipa.service.video_surveillance.deviceCapability.Capability.VideoSources }
     *     
     */
    public void setVideoSources(VideoSources value) {
        this.videoSources = value;
    }

    /**
     * ��ȡcompressionFormats���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CompressionFormats }
     *     
     */
    public CompressionFormats getCompressionFormats() {
        return compressionFormats;
    }

    /**
     * ����compressionFormats���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CompressionFormats }
     *     
     */
    public void setCompressionFormats(CompressionFormats value) {
        this.compressionFormats = value;
    }

    /**
     * ��ȡavailableStreams���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AvailableStreams }
     *     
     */
    public AvailableStreams getAvailableStreams() {
        return availableStreams;
    }

    /**
     * ����availableStreams���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AvailableStreams }
     *     
     */
    public void setAvailableStreams(AvailableStreams value) {
        this.availableStreams = value;
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
     *       &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Alarms {

        @XmlAttribute(name = "count")
        protected Integer count;

        /**
         * ��ȡcount���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getCount() {
            return count;
        }

        /**
         * ����count���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setCount(Integer value) {
            this.count = value;
        }

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
     *       &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AudioIn {

        @XmlAttribute(name = "count")
        protected Integer count;

        /**
         * ��ȡcount���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getCount() {
            return count;
        }

        /**
         * ����count���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setCount(Integer value) {
            this.count = value;
        }

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
     *       &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AudioOut {

        @XmlAttribute(name = "count")
        protected Integer count;

        /**
         * ��ȡcount���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getCount() {
            return count;
        }

        /**
         * ����count���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setCount(Integer value) {
            this.count = value;
        }

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
     *       &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Relays {

        @XmlAttribute(name = "count")
        protected Integer count;

        /**
         * ��ȡcount���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getCount() {
            return count;
        }

        /**
         * ����count���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setCount(Integer value) {
            this.count = value;
        }

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
     *       &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SerialPorts {

        @XmlAttribute(name = "count")
        protected Integer count;

        /**
         * ��ȡcount���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getCount() {
            return count;
        }

        /**
         * ����count���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setCount(Integer value) {
            this.count = value;
        }

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
     *       &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class VideoSources {

        @XmlAttribute(name = "count")
        protected Integer count;

        /**
         * ��ȡcount���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getCount() {
            return count;
        }

        /**
         * ����count���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setCount(Integer value) {
            this.count = value;
        }

    }

}
