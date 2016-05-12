
package com.cmos.ipa.service.video_surveillance.streamConfigurationV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ResourceUtilization complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ResourceUtilization"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="resource" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="utilizationPct" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceUtilization", propOrder = {

})
public class ResourceUtilization {

    @XmlElement(required = true)
    protected String resource;
    protected int utilizationPct;

    /**
     * 获取resource属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResource() {
        return resource;
    }

    /**
     * 设置resource属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResource(String value) {
        this.resource = value;
    }

    /**
     * 获取utilizationPct属性的值。
     * 
     */
    public int getUtilizationPct() {
        return utilizationPct;
    }

    /**
     * 设置utilizationPct属性的值。
     * 
     */
    public void setUtilizationPct(int value) {
        this.utilizationPct = value;
    }

}
