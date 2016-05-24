
package com.cmos.ipa.service.access_control.aicThird;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BnCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "peCode",
    "bnCode"
})
@XmlRootElement(name = "QueryEmployeeBalance")
public class QueryEmployeeBalance {

    @XmlElement(name = "PeCode")
    protected String peCode;
    @XmlElement(name = "BnCode")
    protected int bnCode;

    /**
     * 获取peCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeCode() {
        return peCode;
    }

    /**
     * 设置peCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeCode(String value) {
        this.peCode = value;
    }

    /**
     * 获取bnCode属性的值。
     * 
     */
    public int getBnCode() {
        return bnCode;
    }

    /**
     * 设置bnCode属性的值。
     * 
     */
    public void setBnCode(int value) {
        this.bnCode = value;
    }

}
