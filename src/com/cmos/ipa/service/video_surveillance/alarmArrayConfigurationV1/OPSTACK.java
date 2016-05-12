
package com.cmos.ipa.service.video_surveillance.alarmArrayConfigurationV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * An operation stack for the combinedEventEntry. It determines the order in which to process the contained elements. An argument consists of either another operator or an eventEntry.
 * 
 * <p>OPSTACK complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="OPSTACK"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="operator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="event_entries" type="{urn:schemas-pelco-com:service:AlarmArrayConfiguration:1}EVENT_ENTRIES"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OPSTACK", propOrder = {
    "operator",
    "eventEntries"
})
public class OPSTACK {

    @XmlElement(required = true)
    protected String operator;
    @XmlElement(name = "event_entries", required = true)
    protected EVENTENTRIES eventEntries;

    /**
     * 获取operator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperator() {
        return operator;
    }

    /**
     * 设置operator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperator(String value) {
        this.operator = value;
    }

    /**
     * 获取eventEntries属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EVENTENTRIES }
     *     
     */
    public EVENTENTRIES getEventEntries() {
        return eventEntries;
    }

    /**
     * 设置eventEntries属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EVENTENTRIES }
     *     
     */
    public void setEventEntries(EVENTENTRIES value) {
        this.eventEntries = value;
    }

}
