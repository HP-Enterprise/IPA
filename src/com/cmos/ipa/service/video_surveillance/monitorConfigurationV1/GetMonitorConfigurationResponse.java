
package com.cmos.ipa.service.video_surveillance.monitorConfigurationV1;

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
 *         &lt;element name="monitorConfig" type="{urn:schemas-pelco-com:service:MonitorConfiguration:1}MonitorConfig"/&gt;
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
    "monitorConfig"
})
@XmlRootElement(name = "GetMonitorConfigurationResponse")
public class GetMonitorConfigurationResponse {

    @XmlElement(required = true)
    protected MonitorConfig monitorConfig;

    /**
     * ��ȡmonitorConfig���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.monitorConfigurationV1.MonitorConfig }
     *     
     */
    public MonitorConfig getMonitorConfig() {
        return monitorConfig;
    }

    /**
     * ����monitorConfig���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link com.cmos.ipa.service.video_surveillance.monitorConfigurationV1.MonitorConfig }
     *     
     */
    public void setMonitorConfig(MonitorConfig value) {
        this.monitorConfig = value;
    }

}
