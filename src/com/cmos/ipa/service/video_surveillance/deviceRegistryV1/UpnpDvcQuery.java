
package com.cmos.ipa.service.video_surveillance.deviceRegistryV1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a UPnP query for devices
 *           
 * 
 * <p>UpnpDvcQuery complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="UpnpDvcQuery"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="queryFlags" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="upnpStates" type="{urn:schemas-pelco-com:service:DeviceRegistry:1}UpnpStates" maxOccurs="unbounded"/&gt;
 *         &lt;element name="stateDeltaSeqNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dvcTypeQueryStrs" type="{urn:schemas-pelco-com:service:DeviceRegistry:1}DvcTypeQueryStrs" minOccurs="0"/&gt;
 *         &lt;element name="attrQueryStrs" type="{urn:schemas-pelco-com:service:DeviceRegistry:1}AttrQueryStrs" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpnpDvcQuery", propOrder = {
    "queryFlags",
    "upnpStates",
    "stateDeltaSeqNum",
    "dvcTypeQueryStrs",
    "attrQueryStrs"
})
public class UpnpDvcQuery {

    protected Integer queryFlags;
    @XmlElement(required = true)
    protected List<UpnpStates> upnpStates;
    protected String stateDeltaSeqNum;
    protected DvcTypeQueryStrs dvcTypeQueryStrs;
    protected AttrQueryStrs attrQueryStrs;

    /**
     * ��ȡqueryFlags���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQueryFlags() {
        return queryFlags;
    }

    /**
     * ����queryFlags���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQueryFlags(Integer value) {
        this.queryFlags = value;
    }

    /**
     * Gets the value of the upnpStates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the upnpStates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUpnpStates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link com.cmos.ipa.service.video_surveillance.deviceRegistryV1.UpnpStates }
     * 
     * 
     */
    public List<UpnpStates> getUpnpStates() {
        if (upnpStates == null) {
            upnpStates = new ArrayList<UpnpStates>();
        }
        return this.upnpStates;
    }

    /**
     * ��ȡstateDeltaSeqNum���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateDeltaSeqNum() {
        return stateDeltaSeqNum;
    }

    /**
     * ����stateDeltaSeqNum���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateDeltaSeqNum(String value) {
        this.stateDeltaSeqNum = value;
    }

    /**
     * ��ȡdvcTypeQueryStrs���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DvcTypeQueryStrs }
     *     
     */
    public DvcTypeQueryStrs getDvcTypeQueryStrs() {
        return dvcTypeQueryStrs;
    }

    /**
     * ����dvcTypeQueryStrs���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DvcTypeQueryStrs }
     *     
     */
    public void setDvcTypeQueryStrs(DvcTypeQueryStrs value) {
        this.dvcTypeQueryStrs = value;
    }

    /**
     * ��ȡattrQueryStrs���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AttrQueryStrs }
     *     
     */
    public AttrQueryStrs getAttrQueryStrs() {
        return attrQueryStrs;
    }

    /**
     * ����attrQueryStrs���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AttrQueryStrs }
     *     
     */
    public void setAttrQueryStrs(AttrQueryStrs value) {
        this.attrQueryStrs = value;
    }

}
