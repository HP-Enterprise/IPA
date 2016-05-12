
package com.cmos.ipa.service.video_surveillance.alarmArrayConfigurationV1;

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
 *         &lt;element name="alarmStates" type="{urn:schemas-pelco-com:service:AlarmArrayConfiguration:1}AlarmStates"/&gt;
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
    "alarmStates"
})
@XmlRootElement(name = "GetAlarmStatesResponse")
public class GetAlarmStatesResponse {

    @XmlElement(required = true)
    protected AlarmStates alarmStates;

    /**
     * ��ȡalarmStates���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.alarmArrayConfigurationV1.AlarmStates }
     *     
     */
    public AlarmStates getAlarmStates() {
        return alarmStates;
    }

    /**
     * ����alarmStates���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link com.cmos.ipa.service.video_surveillance.alarmArrayConfigurationV1.AlarmStates }
     *     
     */
    public void setAlarmStates(AlarmStates value) {
        this.alarmStates = value;
    }

}
