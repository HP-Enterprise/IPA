
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
 *         &lt;element name="StreamConfiguration" type="{http://www.pelco.com/api/DeviceCapability/1}StreamConfiguration"/&gt;
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
    "streamConfiguration"
})
@XmlRootElement(name = "GetStreamConfigurationsResponse")
public class GetStreamConfigurationsResponse {

    @XmlElement(name = "StreamConfiguration", required = true)
    protected StreamConfiguration streamConfiguration;

    /**
     * ��ȡstreamConfiguration���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.deviceCapability.StreamConfiguration }
     *     
     */
    public StreamConfiguration getStreamConfiguration() {
        return streamConfiguration;
    }

    /**
     * ����streamConfiguration���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link com.cmos.ipa.service.video_surveillance.deviceCapability.StreamConfiguration }
     *     
     */
    public void setStreamConfiguration(StreamConfiguration value) {
        this.streamConfiguration = value;
    }

}
