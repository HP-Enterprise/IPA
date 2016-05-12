
package com.cmos.ipa.service.video_surveillance.positioningControlV1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * The current translational/rotational velocity limits of the device.
 * 
 * <p>VelocityLimits complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="VelocityLimits"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="translation" type="{urn:schemas-pelco-com:service:PositioningControl:1}Xyzlimits" minOccurs="0"/&gt;
 *         &lt;element name="rotation" type="{urn:schemas-pelco-com:service:PositioningControl:1}Xyzlimits" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VelocityLimits", propOrder = {
    "translation",
    "rotation"
})
public class VelocityLimits {

    @XmlElementRef(name = "translation", type = JAXBElement.class, required = false)
    protected JAXBElement<Xyzlimits> translation;
    @XmlElementRef(name = "rotation", type = JAXBElement.class, required = false)
    protected JAXBElement<Xyzlimits> rotation;

    /**
     * ��ȡtranslation���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link com.cmos.ipa.service.video_surveillance.positioningControlV1.Xyzlimits }{@code >}
     *     
     */
    public JAXBElement<Xyzlimits> getTranslation() {
        return translation;
    }

    /**
     * ����translation���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link com.cmos.ipa.service.video_surveillance.positioningControlV1.Xyzlimits }{@code >}
     *     
     */
    public void setTranslation(JAXBElement<Xyzlimits> value) {
        this.translation = value;
    }

    /**
     * ��ȡrotation���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link com.cmos.ipa.service.video_surveillance.positioningControlV1.Xyzlimits }{@code >}
     *     
     */
    public JAXBElement<Xyzlimits> getRotation() {
        return rotation;
    }

    /**
     * ����rotation���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link com.cmos.ipa.service.video_surveillance.positioningControlV1.Xyzlimits }{@code >}
     *     
     */
    public void setRotation(JAXBElement<Xyzlimits> value) {
        this.rotation = value;
    }

}
