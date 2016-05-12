
package com.cmos.ipa.service.video_surveillance.imagingConfigurationV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


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
 *         &lt;element name="CalibrationInterval" type="{http://www.pelco.com/api/ImagingConfiguration/1}CalibrationInterval"/&gt;
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
    "calibrationInterval"
})
@XmlRootElement(name = "SetCalibrationInterval")
public class SetCalibrationInterval {

    @XmlElement(name = "CalibrationInterval", required = true)
    protected Duration calibrationInterval;

    /**
     * ��ȡcalibrationInterval���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.datatype.Duration }
     *     
     */
    public Duration getCalibrationInterval() {
        return calibrationInterval;
    }

    /**
     * ����calibrationInterval���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.datatype.Duration }
     *     
     */
    public void setCalibrationInterval(Duration value) {
        this.calibrationInterval = value;
    }

}
