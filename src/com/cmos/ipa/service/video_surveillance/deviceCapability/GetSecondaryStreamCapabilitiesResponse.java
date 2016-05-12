
package com.cmos.ipa.service.video_surveillance.deviceCapability;

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
 *         &lt;element name="StreamSetting" type="{http://www.pelco.com/api/DeviceCapability/1}StreamSetting"/&gt;
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
    "streamSetting"
})
@XmlRootElement(name = "GetSecondaryStreamCapabilitiesResponse")
public class GetSecondaryStreamCapabilitiesResponse {

    @XmlElement(name = "StreamSetting", required = true)
    protected StreamSetting streamSetting;

    /**
     * ��ȡstreamSetting���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.deviceCapability.StreamSetting }
     *     
     */
    public StreamSetting getStreamSetting() {
        return streamSetting;
    }

    /**
     * ����streamSetting���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link com.cmos.ipa.service.video_surveillance.deviceCapability.StreamSetting }
     *     
     */
    public void setStreamSetting(StreamSetting value) {
        this.streamSetting = value;
    }

}
