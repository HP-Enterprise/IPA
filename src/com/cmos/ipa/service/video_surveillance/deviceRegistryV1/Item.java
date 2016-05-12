
package com.cmos.ipa.service.video_surveillance.deviceRegistryV1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents device data
 *           
 * 
 * <p>Item complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="Item"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dbId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="udn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="state" type="{urn:schemas-pelco-com:service:DeviceRegistry:1}State" minOccurs="0"/&gt;
 *         &lt;element name="attrs" type="{urn:schemas-pelco-com:service:DeviceRegistry:1}Attrs" minOccurs="0"/&gt;
 *         &lt;element name="svcInfo" type="{urn:schemas-pelco-com:service:DeviceRegistry:1}SvcInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Item", propOrder = {
    "dbId",
    "udn",
    "type",
    "state",
    "attrs",
    "svcInfo"
})
@XmlSeeAlso({
    com.cmos.ipa.service.video_surveillance.deviceRegistryV1.Page.Item.class
})
public class Item {

    @XmlElementRef(name = "dbId", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> dbId;
    @XmlElementRef(name = "udn", type = JAXBElement.class, required = false)
    protected JAXBElement<String> udn;
    @XmlElementRef(name = "type", type = JAXBElement.class, required = false)
    protected JAXBElement<String> type;
    @XmlElementRef(name = "state", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> state;
    @XmlElementRef(name = "attrs", type = JAXBElement.class, required = false)
    protected JAXBElement<Attrs> attrs;
    @XmlElementRef(name = "svcInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<SvcInfo> svcInfo;

    /**
     * ��ȡdbId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDbId() {
        return dbId;
    }

    /**
     * ����dbId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDbId(JAXBElement<Integer> value) {
        this.dbId = value;
    }

    /**
     * ��ȡudn���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUdn() {
        return udn;
    }

    /**
     * ����udn���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUdn(JAXBElement<String> value) {
        this.udn = value;
    }

    /**
     * ��ȡtype���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getType() {
        return type;
    }

    /**
     * ����type���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setType(JAXBElement<String> value) {
        this.type = value;
    }

    /**
     * ��ȡstate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getState() {
        return state;
    }

    /**
     * ����state���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setState(JAXBElement<Integer> value) {
        this.state = value;
    }

    /**
     * ��ȡattrs���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Attrs }{@code >}
     *     
     */
    public JAXBElement<Attrs> getAttrs() {
        return attrs;
    }

    /**
     * ����attrs���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Attrs }{@code >}
     *     
     */
    public void setAttrs(JAXBElement<Attrs> value) {
        this.attrs = value;
    }

    /**
     * ��ȡsvcInfo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link SvcInfo }{@code >}
     *     
     */
    public JAXBElement<SvcInfo> getSvcInfo() {
        return svcInfo;
    }

    /**
     * ����svcInfo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link SvcInfo }{@code >}
     *     
     */
    public void setSvcInfo(JAXBElement<SvcInfo> value) {
        this.svcInfo = value;
    }

}
