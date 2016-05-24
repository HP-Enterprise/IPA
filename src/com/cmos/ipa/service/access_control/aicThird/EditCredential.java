
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
 *         &lt;element name="PeopleGuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Guid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BeginDatetime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EndDatetime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Wiegand" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="AccessType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CardCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PassWord" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AccessGroup1ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AccessGroup2ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AccessGroup3ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AccessGroup4ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AccessGroup5ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AccessGroup6ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AccessGroup7ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AccessGroup8ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PassbackExempt" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ExtendedAccess" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PinCmds" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PinExempt" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="InScheduleElevatorGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OutScheduleElevatorGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "peopleGuid",
    "guid",
    "beginDatetime",
    "endDatetime",
    "wiegand",
    "accessType",
    "cardCode",
    "passWord",
    "accessGroup1ID",
    "accessGroup2ID",
    "accessGroup3ID",
    "accessGroup4ID",
    "accessGroup5ID",
    "accessGroup6ID",
    "accessGroup7ID",
    "accessGroup8ID",
    "passbackExempt",
    "extendedAccess",
    "pinCmds",
    "pinExempt",
    "inScheduleElevatorGroup",
    "outScheduleElevatorGroup",
    "extParam"
})
@XmlRootElement(name = "EditCredential")
public class EditCredential {

    @XmlElement(name = "PeopleGuid")
    protected String peopleGuid;
    @XmlElement(name = "Guid")
    protected String guid;
    @XmlElement(name = "BeginDatetime")
    protected String beginDatetime;
    @XmlElement(name = "EndDatetime")
    protected String endDatetime;
    @XmlElement(name = "Wiegand")
    protected int wiegand;
    @XmlElement(name = "AccessType")
    protected int accessType;
    @XmlElement(name = "CardCode")
    protected String cardCode;
    @XmlElement(name = "PassWord")
    protected String passWord;
    @XmlElement(name = "AccessGroup1ID")
    protected String accessGroup1ID;
    @XmlElement(name = "AccessGroup2ID")
    protected String accessGroup2ID;
    @XmlElement(name = "AccessGroup3ID")
    protected String accessGroup3ID;
    @XmlElement(name = "AccessGroup4ID")
    protected String accessGroup4ID;
    @XmlElement(name = "AccessGroup5ID")
    protected String accessGroup5ID;
    @XmlElement(name = "AccessGroup6ID")
    protected String accessGroup6ID;
    @XmlElement(name = "AccessGroup7ID")
    protected String accessGroup7ID;
    @XmlElement(name = "AccessGroup8ID")
    protected String accessGroup8ID;
    @XmlElement(name = "PassbackExempt")
    protected int passbackExempt;
    @XmlElement(name = "ExtendedAccess")
    protected int extendedAccess;
    @XmlElement(name = "PinCmds")
    protected int pinCmds;
    @XmlElement(name = "PinExempt")
    protected int pinExempt;
    @XmlElement(name = "InScheduleElevatorGroup")
    protected String inScheduleElevatorGroup;
    @XmlElement(name = "OutScheduleElevatorGroup")
    protected String outScheduleElevatorGroup;
    @XmlElement(name = "ExtParam")
    protected String extParam;

    /**
     * 获取peopleGuid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeopleGuid() {
        return peopleGuid;
    }

    /**
     * 设置peopleGuid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeopleGuid(String value) {
        this.peopleGuid = value;
    }

    /**
     * 获取guid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuid() {
        return guid;
    }

    /**
     * 设置guid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuid(String value) {
        this.guid = value;
    }

    /**
     * 获取beginDatetime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeginDatetime() {
        return beginDatetime;
    }

    /**
     * 设置beginDatetime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeginDatetime(String value) {
        this.beginDatetime = value;
    }

    /**
     * 获取endDatetime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDatetime() {
        return endDatetime;
    }

    /**
     * 设置endDatetime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDatetime(String value) {
        this.endDatetime = value;
    }

    /**
     * 获取wiegand属性的值。
     * 
     */
    public int getWiegand() {
        return wiegand;
    }

    /**
     * 设置wiegand属性的值。
     * 
     */
    public void setWiegand(int value) {
        this.wiegand = value;
    }

    /**
     * 获取accessType属性的值。
     * 
     */
    public int getAccessType() {
        return accessType;
    }

    /**
     * 设置accessType属性的值。
     * 
     */
    public void setAccessType(int value) {
        this.accessType = value;
    }

    /**
     * 获取cardCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardCode() {
        return cardCode;
    }

    /**
     * 设置cardCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardCode(String value) {
        this.cardCode = value;
    }

    /**
     * 获取passWord属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassWord() {
        return passWord;
    }

    /**
     * 设置passWord属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassWord(String value) {
        this.passWord = value;
    }

    /**
     * 获取accessGroup1ID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessGroup1ID() {
        return accessGroup1ID;
    }

    /**
     * 设置accessGroup1ID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessGroup1ID(String value) {
        this.accessGroup1ID = value;
    }

    /**
     * 获取accessGroup2ID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessGroup2ID() {
        return accessGroup2ID;
    }

    /**
     * 设置accessGroup2ID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessGroup2ID(String value) {
        this.accessGroup2ID = value;
    }

    /**
     * 获取accessGroup3ID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessGroup3ID() {
        return accessGroup3ID;
    }

    /**
     * 设置accessGroup3ID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessGroup3ID(String value) {
        this.accessGroup3ID = value;
    }

    /**
     * 获取accessGroup4ID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessGroup4ID() {
        return accessGroup4ID;
    }

    /**
     * 设置accessGroup4ID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessGroup4ID(String value) {
        this.accessGroup4ID = value;
    }

    /**
     * 获取accessGroup5ID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessGroup5ID() {
        return accessGroup5ID;
    }

    /**
     * 设置accessGroup5ID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessGroup5ID(String value) {
        this.accessGroup5ID = value;
    }

    /**
     * 获取accessGroup6ID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessGroup6ID() {
        return accessGroup6ID;
    }

    /**
     * 设置accessGroup6ID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessGroup6ID(String value) {
        this.accessGroup6ID = value;
    }

    /**
     * 获取accessGroup7ID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessGroup7ID() {
        return accessGroup7ID;
    }

    /**
     * 设置accessGroup7ID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessGroup7ID(String value) {
        this.accessGroup7ID = value;
    }

    /**
     * 获取accessGroup8ID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessGroup8ID() {
        return accessGroup8ID;
    }

    /**
     * 设置accessGroup8ID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessGroup8ID(String value) {
        this.accessGroup8ID = value;
    }

    /**
     * 获取passbackExempt属性的值。
     * 
     */
    public int getPassbackExempt() {
        return passbackExempt;
    }

    /**
     * 设置passbackExempt属性的值。
     * 
     */
    public void setPassbackExempt(int value) {
        this.passbackExempt = value;
    }

    /**
     * 获取extendedAccess属性的值。
     * 
     */
    public int getExtendedAccess() {
        return extendedAccess;
    }

    /**
     * 设置extendedAccess属性的值。
     * 
     */
    public void setExtendedAccess(int value) {
        this.extendedAccess = value;
    }

    /**
     * 获取pinCmds属性的值。
     * 
     */
    public int getPinCmds() {
        return pinCmds;
    }

    /**
     * 设置pinCmds属性的值。
     * 
     */
    public void setPinCmds(int value) {
        this.pinCmds = value;
    }

    /**
     * 获取pinExempt属性的值。
     * 
     */
    public int getPinExempt() {
        return pinExempt;
    }

    /**
     * 设置pinExempt属性的值。
     * 
     */
    public void setPinExempt(int value) {
        this.pinExempt = value;
    }

    /**
     * 获取inScheduleElevatorGroup属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInScheduleElevatorGroup() {
        return inScheduleElevatorGroup;
    }

    /**
     * 设置inScheduleElevatorGroup属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInScheduleElevatorGroup(String value) {
        this.inScheduleElevatorGroup = value;
    }

    /**
     * 获取outScheduleElevatorGroup属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutScheduleElevatorGroup() {
        return outScheduleElevatorGroup;
    }

    /**
     * 设置outScheduleElevatorGroup属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutScheduleElevatorGroup(String value) {
        this.outScheduleElevatorGroup = value;
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
