
package com.cmos.ipa.service.video_surveillance.alarmArrayConfigurationV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * An operation stack for the combinedEventEntry. It determines the order in which to process the contained elements. An argument consists of either another operator or an eventEntry.
 * 
 * <p>OPSTACK complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡoperator���Ե�ֵ��
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
     * ����operator���Ե�ֵ��
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
     * ��ȡeventEntries���Ե�ֵ��
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
     * ����eventEntries���Ե�ֵ��
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
