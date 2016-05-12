
package com.cmos.ipa.service.video_surveillance.streamConfigurationV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Preset complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Preset"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="descriptiveName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="valid" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="streamSettings" type="{urn:schemas-pelco-com:service:StreamConfiguration:1}StreamIDSettingsList"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Preset", propOrder = {

})
public class Preset {

    @XmlElement(required = true)
    protected String descriptiveName;
    protected boolean valid;
    @XmlElement(required = true)
    protected StreamIDSettingsList streamSettings;

    /**
     * 获取descriptiveName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptiveName() {
        return descriptiveName;
    }

    /**
     * 设置descriptiveName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptiveName(String value) {
        this.descriptiveName = value;
    }

    /**
     * 获取valid属性的值。
     * 
     */
    public boolean isValid() {
        return valid;
    }

    /**
     * 设置valid属性的值。
     * 
     */
    public void setValid(boolean value) {
        this.valid = value;
    }

    /**
     * 获取streamSettings属性的值。
     * 
     * @return
     *     possible object is
     *     {@link StreamIDSettingsList }
     *     
     */
    public StreamIDSettingsList getStreamSettings() {
        return streamSettings;
    }

    /**
     * 设置streamSettings属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link StreamIDSettingsList }
     *     
     */
    public void setStreamSettings(StreamIDSettingsList value) {
        this.streamSettings = value;
    }

}
