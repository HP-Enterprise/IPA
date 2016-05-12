
package com.cmos.ipa.service.video_surveillance.monitorConfigurationV1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 						This represents a monitor's current configuration.
 * 					
 * 
 * <p>MonitorConfig complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="MonitorConfig"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="displayType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="borderColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="activeBorderColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="textColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="textBackgroundColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="alertTextColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="alertTextBackgroundColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="alertTextBlinkFrequency" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="timeDisplayMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="zoomIndicator" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="statusIndicator" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="audioEnable" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="layouts" type="{urn:schemas-pelco-com:service:MonitorConfiguration:1}Layouts" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonitorConfig", propOrder = {
    "displayType",
    "borderColor",
    "activeBorderColor",
    "textColor",
    "textBackgroundColor",
    "alertTextColor",
    "alertTextBackgroundColor",
    "alertTextBlinkFrequency",
    "timeDisplayMode",
    "zoomIndicator",
    "statusIndicator",
    "audioEnable",
    "layouts"
})
public class MonitorConfig {

    @XmlElementRef(name = "displayType", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> displayType;
    @XmlElementRef(name = "borderColor", type = JAXBElement.class, required = false)
    protected JAXBElement<String> borderColor;
    @XmlElementRef(name = "activeBorderColor", type = JAXBElement.class, required = false)
    protected JAXBElement<String> activeBorderColor;
    @XmlElementRef(name = "textColor", type = JAXBElement.class, required = false)
    protected JAXBElement<String> textColor;
    @XmlElementRef(name = "textBackgroundColor", type = JAXBElement.class, required = false)
    protected JAXBElement<String> textBackgroundColor;
    @XmlElementRef(name = "alertTextColor", type = JAXBElement.class, required = false)
    protected JAXBElement<String> alertTextColor;
    @XmlElementRef(name = "alertTextBackgroundColor", type = JAXBElement.class, required = false)
    protected JAXBElement<String> alertTextBackgroundColor;
    @XmlElementRef(name = "alertTextBlinkFrequency", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> alertTextBlinkFrequency;
    @XmlElementRef(name = "timeDisplayMode", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> timeDisplayMode;
    @XmlElementRef(name = "zoomIndicator", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> zoomIndicator;
    @XmlElementRef(name = "statusIndicator", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> statusIndicator;
    @XmlElementRef(name = "audioEnable", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> audioEnable;
    @XmlElementRef(name = "layouts", type = JAXBElement.class, required = false)
    protected JAXBElement<Layouts> layouts;

    /**
     * ��ȡdisplayType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDisplayType() {
        return displayType;
    }

    /**
     * ����displayType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDisplayType(JAXBElement<Integer> value) {
        this.displayType = value;
    }

    /**
     * ��ȡborderColor���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBorderColor() {
        return borderColor;
    }

    /**
     * ����borderColor���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBorderColor(JAXBElement<String> value) {
        this.borderColor = value;
    }

    /**
     * ��ȡactiveBorderColor���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getActiveBorderColor() {
        return activeBorderColor;
    }

    /**
     * ����activeBorderColor���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setActiveBorderColor(JAXBElement<String> value) {
        this.activeBorderColor = value;
    }

    /**
     * ��ȡtextColor���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTextColor() {
        return textColor;
    }

    /**
     * ����textColor���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTextColor(JAXBElement<String> value) {
        this.textColor = value;
    }

    /**
     * ��ȡtextBackgroundColor���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTextBackgroundColor() {
        return textBackgroundColor;
    }

    /**
     * ����textBackgroundColor���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTextBackgroundColor(JAXBElement<String> value) {
        this.textBackgroundColor = value;
    }

    /**
     * ��ȡalertTextColor���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAlertTextColor() {
        return alertTextColor;
    }

    /**
     * ����alertTextColor���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAlertTextColor(JAXBElement<String> value) {
        this.alertTextColor = value;
    }

    /**
     * ��ȡalertTextBackgroundColor���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAlertTextBackgroundColor() {
        return alertTextBackgroundColor;
    }

    /**
     * ����alertTextBackgroundColor���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAlertTextBackgroundColor(JAXBElement<String> value) {
        this.alertTextBackgroundColor = value;
    }

    /**
     * ��ȡalertTextBlinkFrequency���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAlertTextBlinkFrequency() {
        return alertTextBlinkFrequency;
    }

    /**
     * ����alertTextBlinkFrequency���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAlertTextBlinkFrequency(JAXBElement<Integer> value) {
        this.alertTextBlinkFrequency = value;
    }

    /**
     * ��ȡtimeDisplayMode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTimeDisplayMode() {
        return timeDisplayMode;
    }

    /**
     * ����timeDisplayMode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTimeDisplayMode(JAXBElement<Integer> value) {
        this.timeDisplayMode = value;
    }

    /**
     * ��ȡzoomIndicator���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getZoomIndicator() {
        return zoomIndicator;
    }

    /**
     * ����zoomIndicator���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setZoomIndicator(JAXBElement<Integer> value) {
        this.zoomIndicator = value;
    }

    /**
     * ��ȡstatusIndicator���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getStatusIndicator() {
        return statusIndicator;
    }

    /**
     * ����statusIndicator���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setStatusIndicator(JAXBElement<Integer> value) {
        this.statusIndicator = value;
    }

    /**
     * ��ȡaudioEnable���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAudioEnable() {
        return audioEnable;
    }

    /**
     * ����audioEnable���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAudioEnable(JAXBElement<Integer> value) {
        this.audioEnable = value;
    }

    /**
     * ��ȡlayouts���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link com.cmos.ipa.service.video_surveillance.monitorConfigurationV1.Layouts }{@code >}
     *     
     */
    public JAXBElement<Layouts> getLayouts() {
        return layouts;
    }

    /**
     * ����layouts���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link com.cmos.ipa.service.video_surveillance.monitorConfigurationV1.Layouts }{@code >}
     *     
     */
    public void setLayouts(JAXBElement<Layouts> value) {
        this.layouts = value;
    }

}
