
package com.cmos.ipa.service.video_surveillance.motionDetectionV1;

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
 *         &lt;element name="mdConfig" type="{urn:schemas-pelco-com:service:MotionDetection:1}MDConfig"/&gt;
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
    "mdConfig"
})
@XmlRootElement(name = "GetMDConfigurationResponse")
public class GetMDConfigurationResponse {

    @XmlElement(required = true)
    protected MDConfig mdConfig;

    /**
     * ��ȡmdConfig���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.motionDetectionV1.MDConfig }
     *     
     */
    public MDConfig getMdConfig() {
        return mdConfig;
    }

    /**
     * ����mdConfig���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link com.cmos.ipa.service.video_surveillance.motionDetectionV1.MDConfig }
     *     
     */
    public void setMdConfig(MDConfig value) {
        this.mdConfig = value;
    }

}
