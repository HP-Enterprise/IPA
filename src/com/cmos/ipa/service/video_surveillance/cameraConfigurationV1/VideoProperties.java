
package com.cmos.ipa.service.video_surveillance.cameraConfigurationV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This contains properties of the camera's generated video for the currently active camera mode (e.g., normal vs. low-light, etc.).
 * 
 * <p>VideoProperties complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="VideoProperties"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="brightness" type="{urn:schemas-pelco-com:service:CameraConfiguration:1}MVElement" minOccurs="0"/&gt;
 *         &lt;element name="contrast" type="{urn:schemas-pelco-com:service:CameraConfiguration:1}MVElement" minOccurs="0"/&gt;
 *         &lt;element name="hue" type="{urn:schemas-pelco-com:service:CameraConfiguration:1}MVElement" minOccurs="0"/&gt;
 *         &lt;element name="saturation" type="{urn:schemas-pelco-com:service:CameraConfiguration:1}MVElement" minOccurs="0"/&gt;
 *         &lt;element name="filterLevel" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoProperties", propOrder = {
    "brightness",
    "contrast",
    "hue",
    "saturation",
    "filterLevel"
})
public class VideoProperties {

    protected MVElement brightness;
    protected MVElement contrast;
    protected MVElement hue;
    protected MVElement saturation;
    protected int filterLevel;

    /**
     * ��ȡbrightness���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.cameraConfigurationV1.MVElement }
     *     
     */
    public MVElement getBrightness() {
        return brightness;
    }

    /**
     * ����brightness���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link com.cmos.ipa.service.video_surveillance.cameraConfigurationV1.MVElement }
     *     
     */
    public void setBrightness(MVElement value) {
        this.brightness = value;
    }

    /**
     * ��ȡcontrast���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.cameraConfigurationV1.MVElement }
     *     
     */
    public MVElement getContrast() {
        return contrast;
    }

    /**
     * ����contrast���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link com.cmos.ipa.service.video_surveillance.cameraConfigurationV1.MVElement }
     *     
     */
    public void setContrast(MVElement value) {
        this.contrast = value;
    }

    /**
     * ��ȡhue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.cameraConfigurationV1.MVElement }
     *     
     */
    public MVElement getHue() {
        return hue;
    }

    /**
     * ����hue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link com.cmos.ipa.service.video_surveillance.cameraConfigurationV1.MVElement }
     *     
     */
    public void setHue(MVElement value) {
        this.hue = value;
    }

    /**
     * ��ȡsaturation���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.cameraConfigurationV1.MVElement }
     *     
     */
    public MVElement getSaturation() {
        return saturation;
    }

    /**
     * ����saturation���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link com.cmos.ipa.service.video_surveillance.cameraConfigurationV1.MVElement }
     *     
     */
    public void setSaturation(MVElement value) {
        this.saturation = value;
    }

    /**
     * ��ȡfilterLevel���Ե�ֵ��
     * 
     */
    public int getFilterLevel() {
        return filterLevel;
    }

    /**
     * ����filterLevel���Ե�ֵ��
     * 
     */
    public void setFilterLevel(int value) {
        this.filterLevel = value;
    }

}
