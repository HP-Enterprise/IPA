
package com.cmos.ipa.service.video_surveillance.monitorConfigurationV1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 						The current configuration state of a channel associated 
 * 						with the monitor. By channel, we are referring to 
 * 						essential video feeds associated with exactly one video 
 * 						stream. 
 * 					
 * 
 * <p>ChannelConfig complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ChannelConfig"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="channelId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nameStamping" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="timeStamping" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="motionDetection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="alertTextLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nameFontSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="dateTimeFontSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="alertFontSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="outputURI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sourceURI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="recordingStatusLocation" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="metadataTextLocation" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="showAnalyticsOverlay" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChannelConfig", propOrder = {
    "channelId",
    "nameStamping",
    "timeStamping",
    "motionDetection",
    "alertTextLocation",
    "nameFontSize",
    "dateTimeFontSize",
    "alertFontSize",
    "outputURI",
    "sourceURI",
    "recordingStatusLocation",
    "metadataTextLocation",
    "showAnalyticsOverlay"
})
public class ChannelConfig {

    protected int channelId;
    @XmlElementRef(name = "nameStamping", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> nameStamping;
    @XmlElementRef(name = "timeStamping", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> timeStamping;
    @XmlElementRef(name = "motionDetection", type = JAXBElement.class, required = false)
    protected JAXBElement<String> motionDetection;
    @XmlElementRef(name = "alertTextLocation", type = JAXBElement.class, required = false)
    protected JAXBElement<String> alertTextLocation;
    @XmlElementRef(name = "nameFontSize", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> nameFontSize;
    @XmlElementRef(name = "dateTimeFontSize", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> dateTimeFontSize;
    @XmlElementRef(name = "alertFontSize", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> alertFontSize;
    @XmlElementRef(name = "outputURI", type = JAXBElement.class, required = false)
    protected JAXBElement<String> outputURI;
    @XmlElementRef(name = "sourceURI", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sourceURI;
    @XmlElementRef(name = "recordingStatusLocation", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> recordingStatusLocation;
    @XmlElementRef(name = "metadataTextLocation", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> metadataTextLocation;
    @XmlElementRef(name = "showAnalyticsOverlay", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> showAnalyticsOverlay;

    /**
     * ��ȡchannelId���Ե�ֵ��
     * 
     */
    public int getChannelId() {
        return channelId;
    }

    /**
     * ����channelId���Ե�ֵ��
     * 
     */
    public void setChannelId(int value) {
        this.channelId = value;
    }

    /**
     * ��ȡnameStamping���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNameStamping() {
        return nameStamping;
    }

    /**
     * ����nameStamping���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNameStamping(JAXBElement<Integer> value) {
        this.nameStamping = value;
    }

    /**
     * ��ȡtimeStamping���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTimeStamping() {
        return timeStamping;
    }

    /**
     * ����timeStamping���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTimeStamping(JAXBElement<Integer> value) {
        this.timeStamping = value;
    }

    /**
     * ��ȡmotionDetection���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMotionDetection() {
        return motionDetection;
    }

    /**
     * ����motionDetection���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMotionDetection(JAXBElement<String> value) {
        this.motionDetection = value;
    }

    /**
     * ��ȡalertTextLocation���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAlertTextLocation() {
        return alertTextLocation;
    }

    /**
     * ����alertTextLocation���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAlertTextLocation(JAXBElement<String> value) {
        this.alertTextLocation = value;
    }

    /**
     * ��ȡnameFontSize���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNameFontSize() {
        return nameFontSize;
    }

    /**
     * ����nameFontSize���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNameFontSize(JAXBElement<Integer> value) {
        this.nameFontSize = value;
    }

    /**
     * ��ȡdateTimeFontSize���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDateTimeFontSize() {
        return dateTimeFontSize;
    }

    /**
     * ����dateTimeFontSize���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDateTimeFontSize(JAXBElement<Integer> value) {
        this.dateTimeFontSize = value;
    }

    /**
     * ��ȡalertFontSize���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAlertFontSize() {
        return alertFontSize;
    }

    /**
     * ����alertFontSize���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAlertFontSize(JAXBElement<Integer> value) {
        this.alertFontSize = value;
    }

    /**
     * ��ȡoutputURI���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOutputURI() {
        return outputURI;
    }

    /**
     * ����outputURI���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOutputURI(JAXBElement<String> value) {
        this.outputURI = value;
    }

    /**
     * ��ȡsourceURI���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSourceURI() {
        return sourceURI;
    }

    /**
     * ����sourceURI���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSourceURI(JAXBElement<String> value) {
        this.sourceURI = value;
    }

    /**
     * ��ȡrecordingStatusLocation���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRecordingStatusLocation() {
        return recordingStatusLocation;
    }

    /**
     * ����recordingStatusLocation���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRecordingStatusLocation(JAXBElement<Integer> value) {
        this.recordingStatusLocation = value;
    }

    /**
     * ��ȡmetadataTextLocation���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMetadataTextLocation() {
        return metadataTextLocation;
    }

    /**
     * ����metadataTextLocation���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMetadataTextLocation(JAXBElement<Integer> value) {
        this.metadataTextLocation = value;
    }

    /**
     * ��ȡshowAnalyticsOverlay���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getShowAnalyticsOverlay() {
        return showAnalyticsOverlay;
    }

    /**
     * ����showAnalyticsOverlay���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setShowAnalyticsOverlay(JAXBElement<Integer> value) {
        this.showAnalyticsOverlay = value;
    }

}
