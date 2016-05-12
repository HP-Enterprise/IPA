
package com.cmos.ipa.service.video_surveillance.streamConfigurationV1;

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
 *         &lt;element name="streamSettingsList" type="{urn:schemas-pelco-com:service:StreamConfiguration:1}StreamIDSettingsList"/&gt;
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
    "streamSettingsList"
})
@XmlRootElement(name = "GetAllSettingsResponse")
public class GetAllSettingsResponse {

    @XmlElement(required = true)
    protected StreamIDSettingsList streamSettingsList;

    /**
     * ��ȡstreamSettingsList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.streamConfigurationV1.StreamIDSettingsList }
     *     
     */
    public StreamIDSettingsList getStreamSettingsList() {
        return streamSettingsList;
    }

    /**
     * ����streamSettingsList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link com.cmos.ipa.service.video_surveillance.streamConfigurationV1.StreamIDSettingsList }
     *     
     */
    public void setStreamSettingsList(StreamIDSettingsList value) {
        this.streamSettingsList = value;
    }

}
