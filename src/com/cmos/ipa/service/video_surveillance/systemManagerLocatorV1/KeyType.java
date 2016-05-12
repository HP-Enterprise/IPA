
package com.cmos.ipa.service.video_surveillance.systemManagerLocatorV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>KeyType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="KeyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nbuff" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ebuff" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeyType", propOrder = {
    "nbuff",
    "ebuff"
})
public class KeyType {

    @XmlElement(required = true)
    protected String nbuff;
    @XmlElement(required = true)
    protected String ebuff;

    /**
     * 获取nbuff属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbuff() {
        return nbuff;
    }

    /**
     * 设置nbuff属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNbuff(String value) {
        this.nbuff = value;
    }

    /**
     * 获取ebuff属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEbuff() {
        return ebuff;
    }

    /**
     * 设置ebuff属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEbuff(String value) {
        this.ebuff = value;
    }

}
