
package com.cmos.ipa.service.video_surveillance.alarmArrayConfigurationV1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * The current state of selected alarms within the array.
 * 
 * <p>AlarmStates complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="AlarmStates"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="objId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="offset" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="length" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="changed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="state1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="state2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlarmStates", propOrder = {
    "objId",
    "offset",
    "length",
    "changed",
    "state1",
    "state2",
    "enabled"
})
public class AlarmStates {

    protected Integer objId;
    protected Integer offset;
    protected int length;
    @XmlElementRef(name = "changed", type = JAXBElement.class, required = false)
    protected JAXBElement<String> changed;
    @XmlElement(required = true)
    protected String state1;
    @XmlElement(required = true)
    protected String state2;
    @XmlElement(required = true)
    protected String enabled;

    /**
     * ��ȡobjId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getObjId() {
        return objId;
    }

    /**
     * ����objId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setObjId(Integer value) {
        this.objId = value;
    }

    /**
     * ��ȡoffset���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOffset() {
        return offset;
    }

    /**
     * ����offset���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOffset(Integer value) {
        this.offset = value;
    }

    /**
     * ��ȡlength���Ե�ֵ��
     * 
     */
    public int getLength() {
        return length;
    }

    /**
     * ����length���Ե�ֵ��
     * 
     */
    public void setLength(int value) {
        this.length = value;
    }

    /**
     * ��ȡchanged���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getChanged() {
        return changed;
    }

    /**
     * ����changed���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setChanged(JAXBElement<String> value) {
        this.changed = value;
    }

    /**
     * ��ȡstate1���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState1() {
        return state1;
    }

    /**
     * ����state1���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState1(String value) {
        this.state1 = value;
    }

    /**
     * ��ȡstate2���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState2() {
        return state2;
    }

    /**
     * ����state2���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState2(String value) {
        this.state2 = value;
    }

    /**
     * ��ȡenabled���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnabled() {
        return enabled;
    }

    /**
     * ����enabled���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnabled(String value) {
        this.enabled = value;
    }

}
