
package com.cmos.ipa.service.access_control.aicThird;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccessGroup" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DoorGroup" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Schedules" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ElevatorGroup" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Holiday" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ExtParam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "accessGroup",
    "doorGroup",
    "schedules",
    "elevatorGroup",
    "holiday",
    "extParam"
})
@XmlRootElement(name = "DownLoadConfig")
public class DownLoadConfig {

    @XmlElement(name = "AccessGroup")
    protected int accessGroup;
    @XmlElement(name = "DoorGroup")
    protected int doorGroup;
    @XmlElement(name = "Schedules")
    protected int schedules;
    @XmlElement(name = "ElevatorGroup")
    protected int elevatorGroup;
    @XmlElement(name = "Holiday")
    protected int holiday;
    @XmlElement(name = "ExtParam")
    protected String extParam;

    /**
     * 获取accessGroup属性的值。
     * 
     */
    public int getAccessGroup() {
        return accessGroup;
    }

    /**
     * 设置accessGroup属性的值。
     * 
     */
    public void setAccessGroup(int value) {
        this.accessGroup = value;
    }

    /**
     * 获取doorGroup属性的值。
     * 
     */
    public int getDoorGroup() {
        return doorGroup;
    }

    /**
     * 设置doorGroup属性的值。
     * 
     */
    public void setDoorGroup(int value) {
        this.doorGroup = value;
    }

    /**
     * 获取schedules属性的值。
     * 
     */
    public int getSchedules() {
        return schedules;
    }

    /**
     * 设置schedules属性的值。
     * 
     */
    public void setSchedules(int value) {
        this.schedules = value;
    }

    /**
     * 获取elevatorGroup属性的值。
     * 
     */
    public int getElevatorGroup() {
        return elevatorGroup;
    }

    /**
     * 设置elevatorGroup属性的值。
     * 
     */
    public void setElevatorGroup(int value) {
        this.elevatorGroup = value;
    }

    /**
     * 获取holiday属性的值。
     * 
     */
    public int getHoliday() {
        return holiday;
    }

    /**
     * 设置holiday属性的值。
     * 
     */
    public void setHoliday(int value) {
        this.holiday = value;
    }

    /**
     * 获取extParam属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtParam() {
        return extParam;
    }

    /**
     * 设置extParam属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtParam(String value) {
        this.extParam = value;
    }

}
