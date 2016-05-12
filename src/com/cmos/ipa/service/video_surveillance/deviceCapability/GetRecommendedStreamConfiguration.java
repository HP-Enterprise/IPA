
package com.cmos.ipa.service.video_surveillance.deviceCapability;

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
 *         &lt;element name="ServiceNamespaces" type="{http://www.pelco.com/api/DeviceCapability/1}ServiceNamespaces"/&gt;
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
    "serviceNamespaces"
})
@XmlRootElement(name = "GetRecommendedStreamConfiguration")
public class GetRecommendedStreamConfiguration {

    @XmlElement(name = "ServiceNamespaces", required = true)
    protected ServiceNamespaces serviceNamespaces;

    /**
     * ��ȡserviceNamespaces���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.deviceCapability.ServiceNamespaces }
     *     
     */
    public ServiceNamespaces getServiceNamespaces() {
        return serviceNamespaces;
    }

    /**
     * ����serviceNamespaces���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link com.cmos.ipa.service.video_surveillance.deviceCapability.ServiceNamespaces }
     *     
     */
    public void setServiceNamespaces(ServiceNamespaces value) {
        this.serviceNamespaces = value;
    }

}
