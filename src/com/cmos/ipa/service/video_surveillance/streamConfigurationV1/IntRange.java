
package com.cmos.ipa.service.video_surveillance.streamConfigurationV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A range of integer
 *             values.
 * 
 * <p>IntRange complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="IntRange"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="minValue" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="maxValue" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="default" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntRange", propOrder = {
    "minValue",
    "maxValue",
    "_default"
})
public class IntRange {

    protected int minValue;
    protected int maxValue;
    @XmlElement(name = "default")
    protected Integer _default;

    /**
     * 获取minValue属性的值。
     * 
     */
    public int getMinValue() {
        return minValue;
    }

    /**
     * 设置minValue属性的值。
     * 
     */
    public void setMinValue(int value) {
        this.minValue = value;
    }

    /**
     * 获取maxValue属性的值。
     * 
     */
    public int getMaxValue() {
        return maxValue;
    }

    /**
     * 设置maxValue属性的值。
     * 
     */
    public void setMaxValue(int value) {
        this.maxValue = value;
    }

    /**
     * 获取default属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDefault() {
        return _default;
    }

    /**
     * 设置default属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDefault(Integer value) {
        this._default = value;
    }

}
