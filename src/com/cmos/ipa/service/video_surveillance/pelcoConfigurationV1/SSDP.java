
package com.cmos.ipa.service.video_surveillance.pelcoConfigurationV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 						A port supporting the SSDP protocol, along with
 * 						accompanying bit flags identifying the port usage.
 * 					
 * 
 * <p>SSDP complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SSDP"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;urn:schemas-pelco-com:service:PelcoConfiguration:1&gt;Port"&gt;
 *       &lt;attribute name="ttl" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SSDP")
public class SSDP
    extends Port
{

    @XmlAttribute(name = "ttl")
    protected Integer ttl;

    /**
     * 获取ttl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTtl() {
        return ttl;
    }

    /**
     * 设置ttl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTtl(Integer value) {
        this.ttl = value;
    }

}
