
package com.cmos.ipa.service.video_surveillance.alarmArrayConfigurationV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 						Defines an event to perform an operation upon.
 * 					
 * 
 * <p>EVENT_ENTRY complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="EVENT_ENTRY"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="uid" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="eventURI" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="eventType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="serviceType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="propertySet" type="{urn:schemas-pelco-com:service:AlarmArrayConfiguration:1}PROPERTY_SET"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EVENT_ENTRY", propOrder = {
    "uid",
    "eventURI",
    "eventType",
    "serviceType",
    "propertySet"
})
public class EVENTENTRY {

    @XmlElement(required = true)
    protected String uid;
    @XmlElement(required = true)
    protected String eventURI;
    @XmlElement(required = true)
    protected String eventType;
    @XmlElement(required = true)
    protected String serviceType;
    @XmlElement(required = true)
    protected PROPERTYSET propertySet;

    /**
     * ��ȡuid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUid() {
        return uid;
    }

    /**
     * ����uid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUid(String value) {
        this.uid = value;
    }

    /**
     * ��ȡeventURI���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventURI() {
        return eventURI;
    }

    /**
     * ����eventURI���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventURI(String value) {
        this.eventURI = value;
    }

    /**
     * ��ȡeventType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * ����eventType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventType(String value) {
        this.eventType = value;
    }

    /**
     * ��ȡserviceType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * ����serviceType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceType(String value) {
        this.serviceType = value;
    }

    /**
     * ��ȡpropertySet���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PROPERTYSET }
     *     
     */
    public PROPERTYSET getPropertySet() {
        return propertySet;
    }

    /**
     * ����propertySet���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PROPERTYSET }
     *     
     */
    public void setPropertySet(PROPERTYSET value) {
        this.propertySet = value;
    }

}
