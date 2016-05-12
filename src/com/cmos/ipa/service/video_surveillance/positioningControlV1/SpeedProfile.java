
package com.cmos.ipa.service.video_surveillance.positioningControlV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The speed profiles allow the user to select the amount of voltage the motors in the pan/tilt receive, therefore, allowing the user to increase or decrease the motor torque, thereby, increasing or decreasing the speed of the unit. This is useful in situations such as high winds.
 * 
 * <p>SpeedProfile complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取name属性的值。
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
     * 设置name属性的值。
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
     * 获取velocityLimits属性的值。
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
     * 设置velocityLimits属性的值。
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
     * 获取accelerationLimits属性的值。
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
     * 设置accelerationLimits属性的值。
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
     * 获取id属性的值。
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
     * 设置id属性的值。
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
