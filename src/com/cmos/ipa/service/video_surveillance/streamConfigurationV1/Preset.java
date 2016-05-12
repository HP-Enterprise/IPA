
package com.cmos.ipa.service.video_surveillance.streamConfigurationV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Preset complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡdescriptiveName���Ե�ֵ��
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
     * ����descriptiveName���Ե�ֵ��
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
     * ��ȡvalid���Ե�ֵ��
     * 
     */
    public boolean isValid() {
        return valid;
    }

    /**
     * ����valid���Ե�ֵ��
     * 
     */
    public void setValid(boolean value) {
        this.valid = value;
    }

    /**
     * ��ȡstreamSettings���Ե�ֵ��
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
     * ����streamSettings���Ե�ֵ��
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
