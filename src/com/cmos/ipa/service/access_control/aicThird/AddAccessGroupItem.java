
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
 *         &lt;element name="AccessGroupGuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DoorGroupGuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SchedulesGuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "accessGroupGuid",
    "doorGroupGuid",
    "schedulesGuid",
    "extParam"
})
@XmlRootElement(name = "AddAccessGroupItem")
public class AddAccessGroupItem {

    @XmlElement(name = "Guid")
    protected String guid;
    @XmlElement(name = "AccessGroupGuid")
    protected String accessGroupGuid;
    @XmlElement(name = "DoorGroupGuid")
    protected String doorGroupGuid;
    @XmlElement(name = "SchedulesGuid")
    protected String schedulesGuid;
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
     * ��ȡaccessGroupGuid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessGroupGuid() {
        return accessGroupGuid;
    }

    /**
     * ����accessGroupGuid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessGroupGuid(String value) {
        this.accessGroupGuid = value;
    }

    /**
     * ��ȡdoorGroupGuid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoorGroupGuid() {
        return doorGroupGuid;
    }

    /**
     * ����doorGroupGuid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoorGroupGuid(String value) {
        this.doorGroupGuid = value;
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
