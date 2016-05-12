
package com.cmos.ipa.service.video_surveillance.cameraConfigurationV1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * Represents the user defined video quality settings of both the primary and secondary video streams.
 * 
 * <p>VideoPair complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="VideoPair"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="primary" type="{urn:schemas-pelco-com:service:CameraConfiguration:1}VideoChannel" minOccurs="0"/&gt;
 *         &lt;element name="secondary" type="{urn:schemas-pelco-com:service:CameraConfiguration:1}VideoChannel" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoPair", propOrder = {
    "name",
    "primary",
    "secondary"
})
public class VideoPair {

    @XmlElementRef(name = "name", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "primary", type = JAXBElement.class, required = false)
    protected JAXBElement<VideoChannel> primary;
    @XmlElementRef(name = "secondary", type = JAXBElement.class, required = false)
    protected JAXBElement<VideoChannel> secondary;

    /**
     * ��ȡname���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * ����name���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = value;
    }

    /**
     * ��ȡprimary���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link VideoChannel }{@code >}
     *     
     */
    public JAXBElement<VideoChannel> getPrimary() {
        return primary;
    }

    /**
     * ����primary���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link VideoChannel }{@code >}
     *     
     */
    public void setPrimary(JAXBElement<VideoChannel> value) {
        this.primary = value;
    }

    /**
     * ��ȡsecondary���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link VideoChannel }{@code >}
     *     
     */
    public JAXBElement<VideoChannel> getSecondary() {
        return secondary;
    }

    /**
     * ����secondary���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link VideoChannel }{@code >}
     *     
     */
    public void setSecondary(JAXBElement<VideoChannel> value) {
        this.secondary = value;
    }

}
