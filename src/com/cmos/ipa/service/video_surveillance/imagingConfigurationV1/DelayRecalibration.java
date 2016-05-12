
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
 *         &lt;element name="CalibrationDelay" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
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
    "calibrationDelay"
})
@XmlRootElement(name = "DelayRecalibration")
public class DelayRecalibration {

    @XmlElement(name = "CalibrationDelay")
    protected Duration calibrationDelay;

    /**
     * ��ȡcalibrationDelay���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.datatype.Duration }
     *     
     */
    public Duration getCalibrationDelay() {
        return calibrationDelay;
    }

    /**
     * ����calibrationDelay���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.datatype.Duration }
     *     
     */
    public void setCalibrationDelay(Duration value) {
        this.calibrationDelay = value;
    }

}
