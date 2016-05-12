
package com.cmos.ipa.service.video_surveillance.cameraConfigurationV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * This represents a camera's configuration data.
 * 
 * <p>CameraConfig complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="CameraConfig"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="videoproperties" type="{urn:schemas-pelco-com:service:CameraConfiguration:1}VideoProperties" minOccurs="0"/&gt;
 *         &lt;element name="videoQuality" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="local" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="coaxMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="controlMode" type="{urn:schemas-pelco-com:service:CameraConfiguration:1}ConfigurableInt" minOccurs="0"/&gt;
 *         &lt;element name="cameraAddress" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="cameraType" type="{urn:schemas-pelco-com:service:CameraConfiguration:1}ConfigurableInt" minOccurs="0"/&gt;
 *         &lt;element name="distinguishers" type="{urn:schemas-pelco-com:service:CameraConfiguration:1}Distinguishers" minOccurs="0"/&gt;
 *         &lt;element name="motionDetectionEnable" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="motionAlarmDwellSecs" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="audioEnable" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="termination" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="audioHardwareInput" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ttl" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="packetsize" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="videopair" type="{urn:schemas-pelco-com:service:CameraConfiguration:1}VideoPair" minOccurs="0"/&gt;
 *         &lt;element name="localQuality" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="maxUnicast" type="{urn:schemas-pelco-com:service:CameraConfiguration:1}maxUnicastType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CameraConfig", propOrder = {
    "videoproperties",
    "videoQuality",
    "coaxMode",
    "controlMode",
    "cameraAddress",
    "cameraType",
    "distinguishers",
    "motionDetectionEnable",
    "motionAlarmDwellSecs",
    "audioEnable",
    "termination",
    "audioHardwareInput",
    "ttl",
    "packetsize",
    "videopair",
    "localQuality",
    "maxUnicast"
})
public class CameraConfig {

    protected VideoProperties videoproperties;
    protected VideoQuality videoQuality;
    protected Integer coaxMode;
    protected ConfigurableInt controlMode;
    protected int cameraAddress;
    protected ConfigurableInt cameraType;
    protected Distinguishers distinguishers;
    protected int motionDetectionEnable;
    protected Integer motionAlarmDwellSecs;
    protected int audioEnable;
    protected int termination;
    protected Integer audioHardwareInput;
    protected int ttl;
    protected int packetsize;
    protected VideoPair videopair;
    protected int localQuality;
    protected MaxUnicastType maxUnicast;

    /**
     * ��ȡvideoproperties���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link VideoProperties }
     *     
     */
    public VideoProperties getVideoproperties() {
        return videoproperties;
    }

    /**
     * ����videoproperties���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link VideoProperties }
     *     
     */
    public void setVideoproperties(VideoProperties value) {
        this.videoproperties = value;
    }

    /**
     * ��ȡvideoQuality���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.cameraConfigurationV1.CameraConfig.VideoQuality }
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
     *     {@link com.cmos.ipa.service.video_surveillance.cameraConfigurationV1.CameraConfig.VideoQuality }
     *     
     */
    public void setVideoQuality(VideoQuality value) {
        this.videoQuality = value;
    }

    /**
     * ��ȡcoaxMode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCoaxMode() {
        return coaxMode;
    }

    /**
     * ����coaxMode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCoaxMode(Integer value) {
        this.coaxMode = value;
    }

    /**
     * ��ȡcontrolMode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ConfigurableInt }
     *     
     */
    public ConfigurableInt getControlMode() {
        return controlMode;
    }

    /**
     * ����controlMode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigurableInt }
     *     
     */
    public void setControlMode(ConfigurableInt value) {
        this.controlMode = value;
    }

    /**
     * ��ȡcameraAddress���Ե�ֵ��
     * 
     */
    public int getCameraAddress() {
        return cameraAddress;
    }

    /**
     * ����cameraAddress���Ե�ֵ��
     * 
     */
    public void setCameraAddress(int value) {
        this.cameraAddress = value;
    }

    /**
     * ��ȡcameraType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ConfigurableInt }
     *     
     */
    public ConfigurableInt getCameraType() {
        return cameraType;
    }

    /**
     * ����cameraType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigurableInt }
     *     
     */
    public void setCameraType(ConfigurableInt value) {
        this.cameraType = value;
    }

    /**
     * ��ȡdistinguishers���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Distinguishers }
     *     
     */
    public Distinguishers getDistinguishers() {
        return distinguishers;
    }

    /**
     * ����distinguishers���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Distinguishers }
     *     
     */
    public void setDistinguishers(Distinguishers value) {
        this.distinguishers = value;
    }

    /**
     * ��ȡmotionDetectionEnable���Ե�ֵ��
     * 
     */
    public int getMotionDetectionEnable() {
        return motionDetectionEnable;
    }

    /**
     * ����motionDetectionEnable���Ե�ֵ��
     * 
     */
    public void setMotionDetectionEnable(int value) {
        this.motionDetectionEnable = value;
    }

    /**
     * ��ȡmotionAlarmDwellSecs���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMotionAlarmDwellSecs() {
        return motionAlarmDwellSecs;
    }

    /**
     * ����motionAlarmDwellSecs���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMotionAlarmDwellSecs(Integer value) {
        this.motionAlarmDwellSecs = value;
    }

    /**
     * ��ȡaudioEnable���Ե�ֵ��
     * 
     */
    public int getAudioEnable() {
        return audioEnable;
    }

    /**
     * ����audioEnable���Ե�ֵ��
     * 
     */
    public void setAudioEnable(int value) {
        this.audioEnable = value;
    }

    /**
     * ��ȡtermination���Ե�ֵ��
     * 
     */
    public int getTermination() {
        return termination;
    }

    /**
     * ����termination���Ե�ֵ��
     * 
     */
    public void setTermination(int value) {
        this.termination = value;
    }

    /**
     * ��ȡaudioHardwareInput���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAudioHardwareInput() {
        return audioHardwareInput;
    }

    /**
     * ����audioHardwareInput���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAudioHardwareInput(Integer value) {
        this.audioHardwareInput = value;
    }

    /**
     * ��ȡttl���Ե�ֵ��
     * 
     */
    public int getTtl() {
        return ttl;
    }

    /**
     * ����ttl���Ե�ֵ��
     * 
     */
    public void setTtl(int value) {
        this.ttl = value;
    }

    /**
     * ��ȡpacketsize���Ե�ֵ��
     * 
     */
    public int getPacketsize() {
        return packetsize;
    }

    /**
     * ����packetsize���Ե�ֵ��
     * 
     */
    public void setPacketsize(int value) {
        this.packetsize = value;
    }

    /**
     * ��ȡvideopair���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.cameraConfigurationV1.VideoPair }
     *     
     */
    public VideoPair getVideopair() {
        return videopair;
    }

    /**
     * ����videopair���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link com.cmos.ipa.service.video_surveillance.cameraConfigurationV1.VideoPair }
     *     
     */
    public void setVideopair(VideoPair value) {
        this.videopair = value;
    }

    /**
     * ��ȡlocalQuality���Ե�ֵ��
     * 
     */
    public int getLocalQuality() {
        return localQuality;
    }

    /**
     * ����localQuality���Ե�ֵ��
     * 
     */
    public void setLocalQuality(int value) {
        this.localQuality = value;
    }

    /**
     * ��ȡmaxUnicast���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link MaxUnicastType }
     *     
     */
    public MaxUnicastType getMaxUnicast() {
        return maxUnicast;
    }

    /**
     * ����maxUnicast���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link MaxUnicastType }
     *     
     */
    public void setMaxUnicast(MaxUnicastType value) {
        this.maxUnicast = value;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="local" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class VideoQuality {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "local")
        protected Integer local;

        /**
         * ��ȡvalue���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * ����value���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * ��ȡlocal���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getLocal() {
            return local;
        }

        /**
         * ����local���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setLocal(Integer value) {
            this.local = value;
        }

    }

}
