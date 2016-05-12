
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
 *         &lt;element name="channelConfig" type="{urn:schemas-pelco-com:service:MonitorConfiguration:1}ChannelConfig"/&gt;
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
    "channelConfig"
})
@XmlRootElement(name = "SetChannelConfiguration")
public class SetChannelConfiguration {

    @XmlElement(required = true)
    protected ChannelConfig channelConfig;

    /**
     * ��ȡchannelConfig���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.monitorConfigurationV1.ChannelConfig }
     *     
     */
    public ChannelConfig getChannelConfig() {
        return channelConfig;
    }

    /**
     * ����channelConfig���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link com.cmos.ipa.service.video_surveillance.monitorConfigurationV1.ChannelConfig }
     *     
     */
    public void setChannelConfig(ChannelConfig value) {
        this.channelConfig = value;
    }

}
