
package com.cmos.ipa.service.video_surveillance.deviceRegistryV1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a UPnP State value
 *           
 * 
 * <p>UpnpStates complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="UpnpStates"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="upnpState" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpnpStates", propOrder = {
    "upnpState"
})
public class UpnpStates {

    @XmlElementRef(name = "upnpState", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> upnpState;

    /**
     * ��ȡupnpState���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUpnpState() {
        return upnpState;
    }

    /**
     * ����upnpState���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUpnpState(JAXBElement<Integer> value) {
        this.upnpState = value;
    }

}
