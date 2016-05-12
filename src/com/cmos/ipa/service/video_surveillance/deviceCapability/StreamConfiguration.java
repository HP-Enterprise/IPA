
package com.cmos.ipa.service.video_surveillance.deviceCapability;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>StreamConfiguration complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="StreamConfiguration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PrimaryStreamSetting" type="{http://www.pelco.com/api/DeviceCapability/1}StreamSetting"/&gt;
 *         &lt;element name="SecondaryStreamSetting" type="{http://www.pelco.com/api/DeviceCapability/1}StreamSetting" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StreamConfiguration", propOrder = {
    "primaryStreamSetting",
    "secondaryStreamSetting"
})
public class StreamConfiguration {

    @XmlElement(name = "PrimaryStreamSetting", required = true)
    protected StreamSetting primaryStreamSetting;
    @XmlElement(name = "SecondaryStreamSetting")
    protected StreamSetting secondaryStreamSetting;

    /**
     * ��ȡprimaryStreamSetting���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.deviceCapability.StreamSetting }
     *     
     */
    public StreamSetting getPrimaryStreamSetting() {
        return primaryStreamSetting;
    }

    /**
     * ����primaryStreamSetting���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link com.cmos.ipa.service.video_surveillance.deviceCapability.StreamSetting }
     *     
     */
    public void setPrimaryStreamSetting(StreamSetting value) {
        this.primaryStreamSetting = value;
    }

    /**
     * ��ȡsecondaryStreamSetting���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.deviceCapability.StreamSetting }
     *     
     */
    public StreamSetting getSecondaryStreamSetting() {
        return secondaryStreamSetting;
    }

    /**
     * ����secondaryStreamSetting���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link com.cmos.ipa.service.video_surveillance.deviceCapability.StreamSetting }
     *     
     */
    public void setSecondaryStreamSetting(StreamSetting value) {
        this.secondaryStreamSetting = value;
    }

}
