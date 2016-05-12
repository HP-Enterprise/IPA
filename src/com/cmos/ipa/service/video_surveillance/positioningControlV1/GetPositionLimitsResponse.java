
package com.cmos.ipa.service.video_surveillance.positioningControlV1;

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
 *         &lt;element name="positionLimits" type="{urn:schemas-pelco-com:service:PositioningControl:1}AxisLimits"/&gt;
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
    "positionLimits"
})
@XmlRootElement(name = "GetPositionLimitsResponse")
public class GetPositionLimitsResponse {

    @XmlElement(required = true)
    protected AxisLimits positionLimits;

    /**
     * ��ȡpositionLimits���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.positioningControlV1.AxisLimits }
     *     
     */
    public AxisLimits getPositionLimits() {
        return positionLimits;
    }

    /**
     * ����positionLimits���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link com.cmos.ipa.service.video_surveillance.positioningControlV1.AxisLimits }
     *     
     */
    public void setPositionLimits(AxisLimits value) {
        this.positionLimits = value;
    }

}
