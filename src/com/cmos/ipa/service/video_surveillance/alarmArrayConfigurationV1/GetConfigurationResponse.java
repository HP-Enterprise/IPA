
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
 *         &lt;element name="alarmConfig" type="{urn:schemas-pelco-com:service:AlarmArrayConfiguration:1}AlarmConfig"/&gt;
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
    "alarmConfig"
})
@XmlRootElement(name = "GetConfigurationResponse")
public class GetConfigurationResponse {

    @XmlElement(required = true)
    protected AlarmConfig alarmConfig;

    /**
     * ��ȡalarmConfig���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.alarmArrayConfigurationV1.AlarmConfig }
     *     
     */
    public AlarmConfig getAlarmConfig() {
        return alarmConfig;
    }

    /**
     * ����alarmConfig���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link com.cmos.ipa.service.video_surveillance.alarmArrayConfigurationV1.AlarmConfig }
     *     
     */
    public void setAlarmConfig(AlarmConfig value) {
        this.alarmConfig = value;
    }

}
