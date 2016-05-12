
package com.cmos.ipa.service.video_surveillance.cameraConfigurationV1;

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
 *         &lt;element name="cameraConfig" type="{urn:schemas-pelco-com:service:CameraConfiguration:1}CameraConfig"/&gt;
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
    "cameraConfig"
})
@XmlRootElement(name = "SetConfiguration")
public class SetConfiguration {

    @XmlElement(required = true)
    protected CameraConfig cameraConfig;

    /**
     * ��ȡcameraConfig���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.cameraConfigurationV1.CameraConfig }
     *     
     */
    public CameraConfig getCameraConfig() {
        return cameraConfig;
    }

    /**
     * ����cameraConfig���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link com.cmos.ipa.service.video_surveillance.cameraConfigurationV1.CameraConfig }
     *     
     */
    public void setCameraConfig(CameraConfig value) {
        this.cameraConfig = value;
    }

}
