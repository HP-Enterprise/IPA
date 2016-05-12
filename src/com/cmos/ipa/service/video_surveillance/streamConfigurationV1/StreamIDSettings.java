
package com.cmos.ipa.service.video_surveillance.streamConfigurationV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>StreamIDSettings complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="StreamIDSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="stream" type="{urn:schemas-pelco-com:service:StreamConfiguration:1}StreamID"/&gt;
 *         &lt;element name="settings" type="{urn:schemas-pelco-com:service:StreamConfiguration:1}StreamSettings"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StreamIDSettings", propOrder = {
    "stream",
    "settings"
})
public class StreamIDSettings {

    @XmlElement(required = true)
    protected StreamID stream;
    @XmlElement(required = true)
    protected StreamSettings settings;

    /**
     * ��ȡstream���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.streamConfigurationV1.StreamID }
     *     
     */
    public StreamID getStream() {
        return stream;
    }

    /**
     * ����stream���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link com.cmos.ipa.service.video_surveillance.streamConfigurationV1.StreamID }
     *     
     */
    public void setStream(StreamID value) {
        this.stream = value;
    }

    /**
     * ��ȡsettings���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.streamConfigurationV1.StreamSettings }
     *     
     */
    public StreamSettings getSettings() {
        return settings;
    }

    /**
     * ����settings���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link com.cmos.ipa.service.video_surveillance.streamConfigurationV1.StreamSettings }
     *     
     */
    public void setSettings(StreamSettings value) {
        this.settings = value;
    }

}
