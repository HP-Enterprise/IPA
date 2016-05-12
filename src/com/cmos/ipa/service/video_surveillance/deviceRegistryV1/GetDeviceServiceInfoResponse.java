
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
 *         &lt;element name="page" type="{urn:schemas-pelco-com:service:DeviceRegistry:1}ServiceInfoPage"/&gt;
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
    "page"
})
@XmlRootElement(name = "GetDeviceServiceInfoResponse")
public class GetDeviceServiceInfoResponse {

    @XmlElement(required = true)
    protected ServiceInfoPage page;

    /**
     * ��ȡpage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.deviceRegistryV1.ServiceInfoPage }
     *     
     */
    public ServiceInfoPage getPage() {
        return page;
    }

    /**
     * ����page���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link com.cmos.ipa.service.video_surveillance.deviceRegistryV1.ServiceInfoPage }
     *     
     */
    public void setPage(ServiceInfoPage value) {
        this.page = value;
    }

}
