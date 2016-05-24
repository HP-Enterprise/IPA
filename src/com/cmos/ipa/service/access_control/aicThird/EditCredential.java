
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
     * ��ȡpeopleGuid���Ե�ֵ��
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
     * ����peopleGuid���Ե�ֵ��
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
     * ��ȡguid���Ե�ֵ��
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
     * ����guid���Ե�ֵ��
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
     * ��ȡbeginDatetime���Ե�ֵ��
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
     * ����beginDatetime���Ե�ֵ��
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
     * ��ȡendDatetime���Ե�ֵ��
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
     * ����endDatetime���Ե�ֵ��
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
     * ��ȡwiegand���Ե�ֵ��
     * 
     */
    public int getWiegand() {
        return wiegand;
    }

    /**
     * ����wiegand���Ե�ֵ��
     * 
     */
    public void setWiegand(int value) {
        this.wiegand = value;
    }

    /**
     * ��ȡaccessType���Ե�ֵ��
     * 
     */
    public int getAccessType() {
        return accessType;
    }

    /**
     * ����accessType���Ե�ֵ��
     * 
     */
    public void setAccessType(int value) {
        this.accessType = value;
    }

    /**
     * ��ȡcardCode���Ե�ֵ��
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
     * ����cardCode���Ե�ֵ��
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
     * ��ȡpassWord���Ե�ֵ��
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
     * ����passWord���Ե�ֵ��
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
     * ��ȡaccessGroup1ID���Ե�ֵ��
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
     * ����accessGroup1ID���Ե�ֵ��
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
     * ��ȡaccessGroup2ID���Ե�ֵ��
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
     * ����accessGroup2ID���Ե�ֵ��
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
     * ��ȡaccessGroup3ID���Ե�ֵ��
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
     * ����accessGroup3ID���Ե�ֵ��
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
     * ��ȡaccessGroup4ID���Ե�ֵ��
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
     * ����accessGroup4ID���Ե�ֵ��
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
     * ��ȡaccessGroup5ID���Ե�ֵ��
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
     * ����accessGroup5ID���Ե�ֵ��
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
     * ��ȡaccessGroup6ID���Ե�ֵ��
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
     * ����accessGroup6ID���Ե�ֵ��
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
     * ��ȡaccessGroup7ID���Ե�ֵ��
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
     * ����accessGroup7ID���Ե�ֵ��
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
     * ��ȡaccessGroup8ID���Ե�ֵ��
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
     * ����accessGroup8ID���Ե�ֵ��
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
     * ��ȡpassbackExempt���Ե�ֵ��
     * 
     */
    public int getPassbackExempt() {
        return passbackExempt;
    }

    /**
     * ����passbackExempt���Ե�ֵ��
     * 
     */
    public void setPassbackExempt(int value) {
        this.passbackExempt = value;
    }

    /**
     * ��ȡextendedAccess���Ե�ֵ��
     * 
     */
    public int getExtendedAccess() {
        return extendedAccess;
    }

    /**
     * ����extendedAccess���Ե�ֵ��
     * 
     */
    public void setExtendedAccess(int value) {
        this.extendedAccess = value;
    }

    /**
     * ��ȡpinCmds���Ե�ֵ��
     * 
     */
    public int getPinCmds() {
        return pinCmds;
    }

    /**
     * ����pinCmds���Ե�ֵ��
     * 
     */
    public void setPinCmds(int value) {
        this.pinCmds = value;
    }

    /**
     * ��ȡpinExempt���Ե�ֵ��
     * 
     */
    public int getPinExempt() {
        return pinExempt;
    }

    /**
     * ����pinExempt���Ե�ֵ��
     * 
     */
    public void setPinExempt(int value) {
        this.pinExempt = value;
    }

    /**
     * ��ȡinScheduleElevatorGroup���Ե�ֵ��
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
     * ����inScheduleElevatorGroup���Ե�ֵ��
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
     * ��ȡoutScheduleElevatorGroup���Ե�ֵ��
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
     * ����outScheduleElevatorGroup���Ե�ֵ��
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
