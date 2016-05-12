
package com.cmos.ipa.service.video_surveillance.streamConfigurationV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This describes a configuration option
 *             (its name) and possible acceptable values for this configuration
 *             option.
 * 
 * <p>SettingOptions complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SettingOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="stringEnumeration" type="{urn:schemas-pelco-com:service:StreamConfiguration:1}StringEnumeration"/&gt;
 *           &lt;element name="freeFormString" type="{urn:schemas-pelco-com:service:StreamConfiguration:1}FreeFormString"/&gt;
 *           &lt;element name="decimalEnumeration" type="{urn:schemas-pelco-com:service:StreamConfiguration:1}DecimalEnumeration"/&gt;
 *           &lt;element name="resolutionEnumeration" type="{urn:schemas-pelco-com:service:StreamConfiguration:1}ResolutionEnumeration"/&gt;
 *           &lt;element name="intRange" type="{urn:schemas-pelco-com:service:StreamConfiguration:1}IntRange"/&gt;
 *           &lt;element name="boolean" type="{urn:schemas-pelco-com:service:StreamConfiguration:1}BooleanOption"/&gt;
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
@XmlType(name = "SettingOptions", propOrder = {
    "name",
    "stringEnumeration",
    "freeFormString",
    "decimalEnumeration",
    "resolutionEnumeration",
    "intRange",
    "_boolean"
})
public class SettingOptions {

    @XmlElement(required = true)
    protected String name;
    protected StringEnumeration stringEnumeration;
    protected FreeFormString freeFormString;
    protected DecimalEnumeration decimalEnumeration;
    protected ResolutionEnumeration resolutionEnumeration;
    protected IntRange intRange;
    @XmlElement(name = "boolean")
    protected BooleanOption _boolean;

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
     * ��ȡstringEnumeration���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link StringEnumeration }
     *     
     */
    public StringEnumeration getStringEnumeration() {
        return stringEnumeration;
    }

    /**
     * ����stringEnumeration���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link StringEnumeration }
     *     
     */
    public void setStringEnumeration(StringEnumeration value) {
        this.stringEnumeration = value;
    }

    /**
     * ��ȡfreeFormString���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.streamConfigurationV1.FreeFormString }
     *     
     */
    public FreeFormString getFreeFormString() {
        return freeFormString;
    }

    /**
     * ����freeFormString���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link com.cmos.ipa.service.video_surveillance.streamConfigurationV1.FreeFormString }
     *     
     */
    public void setFreeFormString(FreeFormString value) {
        this.freeFormString = value;
    }

    /**
     * ��ȡdecimalEnumeration���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DecimalEnumeration }
     *     
     */
    public DecimalEnumeration getDecimalEnumeration() {
        return decimalEnumeration;
    }

    /**
     * ����decimalEnumeration���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DecimalEnumeration }
     *     
     */
    public void setDecimalEnumeration(DecimalEnumeration value) {
        this.decimalEnumeration = value;
    }

    /**
     * ��ȡresolutionEnumeration���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ResolutionEnumeration }
     *     
     */
    public ResolutionEnumeration getResolutionEnumeration() {
        return resolutionEnumeration;
    }

    /**
     * ����resolutionEnumeration���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ResolutionEnumeration }
     *     
     */
    public void setResolutionEnumeration(ResolutionEnumeration value) {
        this.resolutionEnumeration = value;
    }

    /**
     * ��ȡintRange���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.streamConfigurationV1.IntRange }
     *     
     */
    public IntRange getIntRange() {
        return intRange;
    }

    /**
     * ����intRange���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link com.cmos.ipa.service.video_surveillance.streamConfigurationV1.IntRange }
     *     
     */
    public void setIntRange(IntRange value) {
        this.intRange = value;
    }

    /**
     * ��ȡboolean���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.streamConfigurationV1.BooleanOption }
     *     
     */
    public BooleanOption getBoolean() {
        return _boolean;
    }

    /**
     * ����boolean���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link com.cmos.ipa.service.video_surveillance.streamConfigurationV1.BooleanOption }
     *     
     */
    public void setBoolean(BooleanOption value) {
        this._boolean = value;
    }

}
