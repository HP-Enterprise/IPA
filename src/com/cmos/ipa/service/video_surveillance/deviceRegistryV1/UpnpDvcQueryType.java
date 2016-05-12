
package com.cmos.ipa.service.video_surveillance.deviceRegistryV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>upnpDvcQueryType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="upnpDvcQueryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="upnpStates" type="{urn:schemas-pelco-com:service:DeviceRegistry:1}upnpStatesType"/&gt;
 *         &lt;element name="attrQueryStrs" type="{urn:schemas-pelco-com:service:DeviceRegistry:1}QueryStrsType"/&gt;
 *         &lt;element name="dvcTypeQueryStrs" type="{urn:schemas-pelco-com:service:DeviceRegistry:1}QueryStrsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "upnpDvcQueryType", propOrder = {
    "upnpStates",
    "attrQueryStrs",
    "dvcTypeQueryStrs"
})
public class UpnpDvcQueryType {

    @XmlElement(required = true)
    protected UpnpStatesType upnpStates;
    @XmlElement(required = true)
    protected QueryStrsType attrQueryStrs;
    @XmlElement(required = true)
    protected QueryStrsType dvcTypeQueryStrs;

    /**
     * ��ȡupnpStates���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.deviceRegistryV1.UpnpStatesType }
     *     
     */
    public UpnpStatesType getUpnpStates() {
        return upnpStates;
    }

    /**
     * ����upnpStates���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link com.cmos.ipa.service.video_surveillance.deviceRegistryV1.UpnpStatesType }
     *     
     */
    public void setUpnpStates(UpnpStatesType value) {
        this.upnpStates = value;
    }

    /**
     * ��ȡattrQueryStrs���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.deviceRegistryV1.QueryStrsType }
     *     
     */
    public QueryStrsType getAttrQueryStrs() {
        return attrQueryStrs;
    }

    /**
     * ����attrQueryStrs���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link com.cmos.ipa.service.video_surveillance.deviceRegistryV1.QueryStrsType }
     *     
     */
    public void setAttrQueryStrs(QueryStrsType value) {
        this.attrQueryStrs = value;
    }

    /**
     * ��ȡdvcTypeQueryStrs���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.deviceRegistryV1.QueryStrsType }
     *     
     */
    public QueryStrsType getDvcTypeQueryStrs() {
        return dvcTypeQueryStrs;
    }

    /**
     * ����dvcTypeQueryStrs���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link com.cmos.ipa.service.video_surveillance.deviceRegistryV1.QueryStrsType }
     *     
     */
    public void setDvcTypeQueryStrs(QueryStrsType value) {
        this.dvcTypeQueryStrs = value;
    }

}
