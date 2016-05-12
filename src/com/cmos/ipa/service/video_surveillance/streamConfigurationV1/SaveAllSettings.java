
package com.cmos.ipa.service.video_surveillance.streamConfigurationV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取streamType属性的值。
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
     * 设置streamType属性的值。
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
     * 获取streamSettingsList属性的值。
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
     * 设置streamSettingsList属性的值。
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
