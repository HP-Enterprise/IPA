
package com.cmos.ipa.service.video_surveillance.alarmArrayConfigurationV1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 						A list of event entries.
 * 					
 * 
 * <p>EVENT_ENTRIES complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="EVENT_ENTRIES"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="eventEntry" type="{urn:schemas-pelco-com:service:AlarmArrayConfiguration:1}EVENT_ENTRY" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EVENT_ENTRIES", propOrder = {
    "eventEntry"
})
public class EVENTENTRIES {

    @XmlElement(required = true)
    protected List<EVENTENTRY> eventEntry;

    /**
     * Gets the value of the eventEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link com.cmos.ipa.service.video_surveillance.alarmArrayConfigurationV1.EVENTENTRY }
     * 
     * 
     */
    public List<EVENTENTRY> getEventEntry() {
        if (eventEntry == null) {
            eventEntry = new ArrayList<EVENTENTRY>();
        }
        return this.eventEntry;
    }

}
