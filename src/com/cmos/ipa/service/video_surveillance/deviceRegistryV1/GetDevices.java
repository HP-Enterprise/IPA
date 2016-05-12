
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
 *         &lt;element name="upnpDvcQuery" type="{urn:schemas-pelco-com:service:DeviceRegistry:1}UpnpDvcQuery"/&gt;
 *         &lt;element name="pageReq" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "upnpDvcQuery",
    "pageReq"
})
@XmlRootElement(name = "GetDevices")
public class GetDevices {

    @XmlElement(required = true)
    protected UpnpDvcQuery upnpDvcQuery;
    @XmlElement(required = true)
    protected String pageReq;

    /**
     * ��ȡupnpDvcQuery���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link UpnpDvcQuery }
     *     
     */
    public UpnpDvcQuery getUpnpDvcQuery() {
        return upnpDvcQuery;
    }

    /**
     * ����upnpDvcQuery���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link UpnpDvcQuery }
     *     
     */
    public void setUpnpDvcQuery(UpnpDvcQuery value) {
        this.upnpDvcQuery = value;
    }

    /**
     * ��ȡpageReq���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageReq() {
        return pageReq;
    }

    /**
     * ����pageReq���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageReq(String value) {
        this.pageReq = value;
    }

}
