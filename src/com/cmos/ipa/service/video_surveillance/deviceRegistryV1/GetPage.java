
package com.cmos.ipa.service.video_surveillance.deviceRegistryV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pageReq" type="{urn:schemas-pelco-com:service:DeviceRegistry:1}PageReq"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pageReq"
})
@XmlRootElement(name = "GetPage")
public class GetPage {

    @XmlElement(required = true)
    protected PageReq pageReq;

    /**
     * ��ȡpageReq���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PageReq }
     *     
     */
    public PageReq getPageReq() {
        return pageReq;
    }

    /**
     * ����pageReq���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PageReq }
     *     
     */
    public void setPageReq(PageReq value) {
        this.pageReq = value;
    }

}
