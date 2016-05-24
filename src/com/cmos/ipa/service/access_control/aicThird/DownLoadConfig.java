
package com.cmos.ipa.service.access_control.aicThird;

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
     * ��ȡaccessGroup���Ե�ֵ��
     * 
     */
    public int getAccessGroup() {
        return accessGroup;
    }

    /**
     * ����accessGroup���Ե�ֵ��
     * 
     */
    public void setAccessGroup(int value) {
        this.accessGroup = value;
    }

    /**
     * ��ȡdoorGroup���Ե�ֵ��
     * 
     */
    public int getDoorGroup() {
        return doorGroup;
    }

    /**
     * ����doorGroup���Ե�ֵ��
     * 
     */
    public void setDoorGroup(int value) {
        this.doorGroup = value;
    }

    /**
     * ��ȡschedules���Ե�ֵ��
     * 
     */
    public int getSchedules() {
        return schedules;
    }

    /**
     * ����schedules���Ե�ֵ��
     * 
     */
    public void setSchedules(int value) {
        this.schedules = value;
    }

    /**
     * ��ȡelevatorGroup���Ե�ֵ��
     * 
     */
    public int getElevatorGroup() {
        return elevatorGroup;
    }

    /**
     * ����elevatorGroup���Ե�ֵ��
     * 
     */
    public void setElevatorGroup(int value) {
        this.elevatorGroup = value;
    }

    /**
     * ��ȡholiday���Ե�ֵ��
     * 
     */
    public int getHoliday() {
        return holiday;
    }

    /**
     * ����holiday���Ե�ֵ��
     * 
     */
    public void setHoliday(int value) {
        this.holiday = value;
    }

    /**
     * ��ȡextParam���Ե�ֵ��
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
     * ����extParam���Ե�ֵ��
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
