
package com.cmos.ipa.service.video_surveillance.positioningControlV1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes the current translational/rotational speed of the device.
 * 
 * <p>Velocity complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="Velocity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="translation" type="{urn:schemas-pelco-com:service:PositioningControl:1}Xyz" minOccurs="0"/&gt;
 *         &lt;element name="rotation" type="{urn:schemas-pelco-com:service:PositioningControl:1}Xyz" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Velocity", propOrder = {
    "translation",
    "rotation"
})
public class Velocity {

    @XmlElementRef(name = "translation", type = JAXBElement.class, required = false)
    protected JAXBElement<Xyz> translation;
    @XmlElementRef(name = "rotation", type = JAXBElement.class, required = false)
    protected JAXBElement<Xyz> rotation;

    /**
     * ��ȡtranslation���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link com.cmos.ipa.service.video_surveillance.positioningControlV1.Xyz }{@code >}
     *     
     */
    public JAXBElement<Xyz> getTranslation() {
        return translation;
    }

    /**
     * ����translation���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link com.cmos.ipa.service.video_surveillance.positioningControlV1.Xyz }{@code >}
     *     
     */
    public void setTranslation(JAXBElement<Xyz> value) {
        this.translation = value;
    }

    /**
     * ��ȡrotation���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link com.cmos.ipa.service.video_surveillance.positioningControlV1.Xyz }{@code >}
     *     
     */
    public JAXBElement<Xyz> getRotation() {
        return rotation;
    }

    /**
     * ����rotation���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link com.cmos.ipa.service.video_surveillance.positioningControlV1.Xyz }{@code >}
     *     
     */
    public void setRotation(JAXBElement<Xyz> value) {
        this.rotation = value;
    }

}
