
package com.cmos.ipa.service.video_surveillance.streamConfigurationV1;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * This type is essentially a name-value
 *             pair that can contain different types of values. This is used in
 *             conjunction with SettingOptions.
 * 
 * <p>Setting complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="Setting"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="decimalValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *           &lt;element name="stringValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element name="resolutionValue" type="{urn:schemas-pelco-com:service:StreamConfiguration:1}Resolution"/&gt;
 *           &lt;element name="intValue" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *           &lt;element name="booleanValue" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Setting", propOrder = {
    "name",
    "decimalValue",
    "stringValue",
    "resolutionValue",
    "intValue",
    "booleanValue"
})
public class Setting {

    @XmlElement(required = true)
    protected String name;
    protected BigDecimal decimalValue;
    protected String stringValue;
    protected Resolution resolutionValue;
    @XmlSchemaType(name = "unsignedInt")
    protected Long intValue;
    protected Boolean booleanValue;

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
     * ��ȡdecimalValue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link java.math.BigDecimal }
     *     
     */
    public BigDecimal getDecimalValue() {
        return decimalValue;
    }

    /**
     * ����decimalValue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link java.math.BigDecimal }
     *     
     */
    public void setDecimalValue(BigDecimal value) {
        this.decimalValue = value;
    }

    /**
     * ��ȡstringValue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringValue() {
        return stringValue;
    }

    /**
     * ����stringValue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringValue(String value) {
        this.stringValue = value;
    }

    /**
     * ��ȡresolutionValue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Resolution }
     *     
     */
    public Resolution getResolutionValue() {
        return resolutionValue;
    }

    /**
     * ����resolutionValue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Resolution }
     *     
     */
    public void setResolutionValue(Resolution value) {
        this.resolutionValue = value;
    }

    /**
     * ��ȡintValue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIntValue() {
        return intValue;
    }

    /**
     * ����intValue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIntValue(Long value) {
        this.intValue = value;
    }

    /**
     * ��ȡbooleanValue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBooleanValue() {
        return booleanValue;
    }

    /**
     * ����booleanValue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBooleanValue(Boolean value) {
        this.booleanValue = value;
    }

}
