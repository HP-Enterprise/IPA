
package com.cmos.ipa.service.video_surveillance.positioningControlV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The speed profiles allow the user to select the amount of voltage the motors in the pan/tilt receive, therefore, allowing the user to increase or decrease the motor torque, thereby, increasing or decreasing the speed of the unit. This is useful in situations such as high winds.
 * 
 * <p>SpeedProfile complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SpeedProfile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.pelco.com/api/Pelco/1}Name"/&gt;
 *         &lt;element name="VelocityLimits" type="{urn:schemas-pelco-com:service:PositioningControl:1}VelocityLimits"/&gt;
 *         &lt;element name="AccelerationLimits" type="{urn:schemas-pelco-com:service:PositioningControl:1}AccelerationLimits"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" use="required" type="{http://www.pelco.com/api/Pelco/1}Guid" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpeedProfile", propOrder = {
    "name",
    "velocityLimits",
    "accelerationLimits"
})
public class SpeedProfile {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "VelocityLimits", required = true)
    protected VelocityLimits velocityLimits;
    @XmlElement(name = "AccelerationLimits", required = true)
    protected AccelerationLimits accelerationLimits;
    @XmlAttribute(name = "id", required = true)
    protected String id;

    /**
     * ��ȡname���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * ����name���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * ��ȡvelocityLimits���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link VelocityLimits }
     *     
     */
    public VelocityLimits getVelocityLimits() {
        return velocityLimits;
    }

    /**
     * ����velocityLimits���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link VelocityLimits }
     *     
     */
    public void setVelocityLimits(VelocityLimits value) {
        this.velocityLimits = value;
    }

    /**
     * ��ȡaccelerationLimits���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AccelerationLimits }
     *     
     */
    public AccelerationLimits getAccelerationLimits() {
        return accelerationLimits;
    }

    /**
     * ����accelerationLimits���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AccelerationLimits }
     *     
     */
    public void setAccelerationLimits(AccelerationLimits value) {
        this.accelerationLimits = value;
    }

    /**
     * ��ȡid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * ����id���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
