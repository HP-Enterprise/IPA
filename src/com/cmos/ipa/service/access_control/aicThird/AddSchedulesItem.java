
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
 *         &lt;element name="Guid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SchedulesGuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Day" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="IntervalID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Begintime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Endtime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="extParam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "guid",
    "schedulesGuid",
    "day",
    "intervalID",
    "begintime",
    "endtime",
    "extParam"
})
@XmlRootElement(name = "AddSchedulesItem")
public class AddSchedulesItem {

    @XmlElement(name = "Guid")
    protected String guid;
    @XmlElement(name = "SchedulesGuid")
    protected String schedulesGuid;
    @XmlElement(name = "Day")
    protected int day;
    @XmlElement(name = "IntervalID")
    protected int intervalID;
    @XmlElement(name = "Begintime")
    protected String begintime;
    @XmlElement(name = "Endtime")
    protected String endtime;
    protected String extParam;

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
     * ��ȡschedulesGuid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchedulesGuid() {
        return schedulesGuid;
    }

    /**
     * ����schedulesGuid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchedulesGuid(String value) {
        this.schedulesGuid = value;
    }

    /**
     * ��ȡday���Ե�ֵ��
     * 
     */
    public int getDay() {
        return day;
    }

    /**
     * ����day���Ե�ֵ��
     * 
     */
    public void setDay(int value) {
        this.day = value;
    }

    /**
     * ��ȡintervalID���Ե�ֵ��
     * 
     */
    public int getIntervalID() {
        return intervalID;
    }

    /**
     * ����intervalID���Ե�ֵ��
     * 
     */
    public void setIntervalID(int value) {
        this.intervalID = value;
    }

    /**
     * ��ȡbegintime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBegintime() {
        return begintime;
    }

    /**
     * ����begintime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBegintime(String value) {
        this.begintime = value;
    }

    /**
     * ��ȡendtime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndtime() {
        return endtime;
    }

    /**
     * ����endtime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndtime(String value) {
        this.endtime = value;
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
