
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
 *         &lt;element name="streamType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "streamType",
    "streamSettingsList"
})
@XmlRootElement(name = "SaveAllSettings")
public class SaveAllSettings {

    @XmlElement(required = true)
    protected String streamType;
    @XmlElement(required = true)
    protected StreamIDSettingsList streamSettingsList;

    /**
     * ��ȡstreamType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreamType() {
        return streamType;
    }

    /**
     * ����streamType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreamType(String value) {
        this.streamType = value;
    }

    /**
     * ��ȡstreamSettingsList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link StreamIDSettingsList }
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
     *     {@link StreamIDSettingsList }
     *     
     */
    public void setStreamSettingsList(StreamIDSettingsList value) {
        this.streamSettingsList = value;
    }

}
