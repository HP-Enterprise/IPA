
package com.cmos.ipa.service.video_surveillance.cameraConfigurationV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Shows whether or not a device is configurable.
 * 
 * <p>ConfigurableInt complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ConfigurableInt"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;int"&gt;
 *       &lt;attribute name="configurable" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigurableInt", propOrder = {
    "value"
})
public class ConfigurableInt {

    @XmlValue
    protected int value;
    @XmlAttribute(name = "configurable")
    protected Integer configurable;

    /**
     * 获取value属性的值。
     * 
     */
    public int getValue() {
        return value;
    }

    /**
     * 设置value属性的值。
     * 
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * 获取configurable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConfigurable() {
        return configurable;
    }

    /**
     * 设置configurable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConfigurable(Integer value) {
        this.configurable = value;
    }

}
