
package com.cmos.ipa.service.video_surveillance.cameraConfigurationV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This set of values is used to identify camera types to newer GUIs.
 * 
 * <p>Distinguishers complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Distinguishers"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="viewobject" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="dome" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ptz" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="fixed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Distinguishers", propOrder = {
    "viewobject",
    "dome",
    "ptz",
    "fixed"
})
public class Distinguishers {

    protected Integer viewobject;
    protected Integer dome;
    protected Integer ptz;
    protected Integer fixed;

    /**
     * 获取viewobject属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getViewobject() {
        return viewobject;
    }

    /**
     * 设置viewobject属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setViewobject(Integer value) {
        this.viewobject = value;
    }

    /**
     * 获取dome属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDome() {
        return dome;
    }

    /**
     * 设置dome属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDome(Integer value) {
        this.dome = value;
    }

    /**
     * 获取ptz属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPtz() {
        return ptz;
    }

    /**
     * 设置ptz属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPtz(Integer value) {
        this.ptz = value;
    }

    /**
     * 获取fixed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFixed() {
        return fixed;
    }

    /**
     * 设置fixed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFixed(Integer value) {
        this.fixed = value;
    }

}
