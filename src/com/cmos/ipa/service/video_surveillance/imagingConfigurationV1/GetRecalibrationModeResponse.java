
package com.cmos.ipa.service.video_surveillance.imagingConfigurationV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="RecalibrationMode" type="{http://www.pelco.com/api/ImagingConfiguration/1}RecalibrationMode"/&gt;
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
    "recalibrationMode"
})
@XmlRootElement(name = "GetRecalibrationModeResponse")
public class GetRecalibrationModeResponse {

    @XmlElement(name = "RecalibrationMode", required = true)
    @XmlSchemaType(name = "string")
    protected RecalibrationMode recalibrationMode;

    /**
     * ��ȡrecalibrationMode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.imagingConfigurationV1.RecalibrationMode }
     *     
     */
    public RecalibrationMode getRecalibrationMode() {
        return recalibrationMode;
    }

    /**
     * ����recalibrationMode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link com.cmos.ipa.service.video_surveillance.imagingConfigurationV1.RecalibrationMode }
     *     
     */
    public void setRecalibrationMode(RecalibrationMode value) {
        this.recalibrationMode = value;
    }

}
