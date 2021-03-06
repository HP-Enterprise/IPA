
package com.cmos.ipa.service.video_surveillance.deviceRegistryV1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a page of results filled with service data
 *           
 * 
 * <p>ServiceInfoPage complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ServiceInfoPage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pageResp" type="{urn:schemas-pelco-com:service:DeviceRegistry:1}PageResp" minOccurs="0"/&gt;
 *         &lt;element name="item" type="{urn:schemas-pelco-com:service:DeviceRegistry:1}ServiceInfoItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceInfoPage", propOrder = {
    "pageResp",
    "item"
})
public class ServiceInfoPage {

    @XmlElementRef(name = "pageResp", type = JAXBElement.class, required = false)
    protected JAXBElement<PageResp> pageResp;
    @XmlElement(nillable = true)
    protected List<ServiceInfoItem> item;

    /**
     * ��ȡpageResp���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link com.cmos.ipa.service.video_surveillance.deviceRegistryV1.PageResp }{@code >}
     *     
     */
    public JAXBElement<PageResp> getPageResp() {
        return pageResp;
    }

    /**
     * ����pageResp���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link com.cmos.ipa.service.video_surveillance.deviceRegistryV1.PageResp }{@code >}
     *     
     */
    public void setPageResp(JAXBElement<PageResp> value) {
        this.pageResp = value;
    }

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link com.cmos.ipa.service.video_surveillance.deviceRegistryV1.ServiceInfoItem }
     * 
     * 
     */
    public List<ServiceInfoItem> getItem() {
        if (item == null) {
            item = new ArrayList<ServiceInfoItem>();
        }
        return this.item;
    }

}
