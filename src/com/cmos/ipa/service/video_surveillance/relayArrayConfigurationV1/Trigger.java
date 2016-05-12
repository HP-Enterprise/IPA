
package com.cmos.ipa.service.video_surveillance.relayArrayConfigurationV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * An event in response to which the relay should be triggered.
 * 
 * <p>Trigger complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Trigger"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="eventURI" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="propertySet" type="{urn:schemas-pelco-com:service:RelayArrayConfiguration:1}PropertySet"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Trigger", propOrder = {
    "eventURI",
    "propertySet"
})
public class Trigger {

    @XmlElement(required = true)
    protected String eventURI;
    @XmlElement(required = true)
    protected PropertySet propertySet;

    /**
     * 获取eventURI属性的值。
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
     * 设置eventURI属性的值。
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
     * 获取propertySet属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PropertySet }
     *     
     */
    public PropertySet getPropertySet() {
        return propertySet;
    }

    /**
     * 设置propertySet属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PropertySet }
     *     
     */
    public void setPropertySet(PropertySet value) {
        this.propertySet = value;
    }

}
