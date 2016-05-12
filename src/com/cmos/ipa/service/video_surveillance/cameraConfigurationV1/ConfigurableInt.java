
package com.cmos.ipa.service.video_surveillance.cameraConfigurationV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Shows whether or not a device is configurable.
 * 
 * <p>ConfigurableInt complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡvalue���Ե�ֵ��
     * 
     */
    public int getValue() {
        return value;
    }

    /**
     * ����value���Ե�ֵ��
     * 
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * ��ȡconfigurable���Ե�ֵ��
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
     * ����configurable���Ե�ֵ��
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
