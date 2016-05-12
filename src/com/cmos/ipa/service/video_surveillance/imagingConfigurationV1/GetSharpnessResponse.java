
package com.cmos.ipa.service.video_surveillance.imagingConfigurationV1;

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
 *         &lt;element name="Sharpness" type="{http://www.pelco.com/api/ImagingConfiguration/1}ModeValuePair"/&gt;
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
    "sharpness"
})
@XmlRootElement(name = "GetSharpnessResponse")
public class GetSharpnessResponse {

    @XmlElement(name = "Sharpness", required = true)
    protected ModeValuePair sharpness;

    /**
     * ��ȡsharpness���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.imagingConfigurationV1.ModeValuePair }
     *     
     */
    public ModeValuePair getSharpness() {
        return sharpness;
    }

    /**
     * ����sharpness���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link com.cmos.ipa.service.video_surveillance.imagingConfigurationV1.ModeValuePair }
     *     
     */
    public void setSharpness(ModeValuePair value) {
        this.sharpness = value;
    }

}
