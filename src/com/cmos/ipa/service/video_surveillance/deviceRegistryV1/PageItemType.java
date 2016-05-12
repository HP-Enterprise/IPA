
package com.cmos.ipa.service.video_surveillance.deviceRegistryV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>pageItemType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="pageItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="udn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="attrs" type="{urn:schemas-pelco-com:service:DeviceRegistry:1}itemListType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pageItemType", propOrder = {
    "udn",
    "attrs"
})
public class PageItemType {

    @XmlElement(required = true)
    protected String udn;
    @XmlElement(required = true)
    protected ItemListType attrs;

    /**
     * ��ȡudn���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUdn() {
        return udn;
    }

    /**
     * ����udn���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUdn(String value) {
        this.udn = value;
    }

    /**
     * ��ȡattrs���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.deviceRegistryV1.ItemListType }
     *     
     */
    public ItemListType getAttrs() {
        return attrs;
    }

    /**
     * ����attrs���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link com.cmos.ipa.service.video_surveillance.deviceRegistryV1.ItemListType }
     *     
     */
    public void setAttrs(ItemListType value) {
        this.attrs = value;
    }

}
