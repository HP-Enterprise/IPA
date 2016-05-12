
package com.cmos.ipa.service.video_surveillance.alarmArrayConfigurationV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * If not empty, this field defines the events and event properties to be compared to determine the output of the associated alarm point in the array.
 * 
 * <p>COMBINED_EVENT_ENTRY complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="COMBINED_EVENT_ENTRY"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="opStack" type="{urn:schemas-pelco-com:service:AlarmArrayConfiguration:1}OPSTACK"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COMBINED_EVENT_ENTRY", propOrder = {
    "opStack"
})
public class COMBINEDEVENTENTRY {

    @XmlElement(required = true)
    protected OPSTACK opStack;

    /**
     * ��ȡopStack���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.alarmArrayConfigurationV1.OPSTACK }
     *     
     */
    public OPSTACK getOpStack() {
        return opStack;
    }

    /**
     * ����opStack���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link com.cmos.ipa.service.video_surveillance.alarmArrayConfigurationV1.OPSTACK }
     *     
     */
    public void setOpStack(OPSTACK value) {
        this.opStack = value;
    }

}
