
package com.cmos.ipa.service.video_surveillance.softwareUpdateV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represent catalog of a module. The catalog contains properties such as platform, os, etc. 
 *             The catalog basically represent what is in a manifest file for a given module.
 *           
 * 
 * <p>ModuleCatalog complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ModuleCatalog"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="modules" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="modelName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="failInterval" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="forceUpdate" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="platform" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="os" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="packageVersion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="resultURL" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModuleCatalog", propOrder = {
    "modules",
    "modelName",
    "failInterval",
    "forceUpdate",
    "platform",
    "os",
    "packageVersion",
    "resultURL"
})
public class ModuleCatalog {

    @XmlElement(required = true)
    protected Object modules;
    @XmlElement(required = true)
    protected String modelName;
    protected int failInterval;
    protected int forceUpdate;
    @XmlElement(required = true)
    protected String platform;
    @XmlElement(required = true)
    protected String os;
    @XmlElement(required = true)
    protected String packageVersion;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String resultURL;

    /**
     * 获取modules属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getModules() {
        return modules;
    }

    /**
     * 设置modules属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setModules(Object value) {
        this.modules = value;
    }

    /**
     * 获取modelName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * 设置modelName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelName(String value) {
        this.modelName = value;
    }

    /**
     * 获取failInterval属性的值。
     * 
     */
    public int getFailInterval() {
        return failInterval;
    }

    /**
     * 设置failInterval属性的值。
     * 
     */
    public void setFailInterval(int value) {
        this.failInterval = value;
    }

    /**
     * 获取forceUpdate属性的值。
     * 
     */
    public int getForceUpdate() {
        return forceUpdate;
    }

    /**
     * 设置forceUpdate属性的值。
     * 
     */
    public void setForceUpdate(int value) {
        this.forceUpdate = value;
    }

    /**
     * 获取platform属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * 设置platform属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlatform(String value) {
        this.platform = value;
    }

    /**
     * 获取os属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOs() {
        return os;
    }

    /**
     * 设置os属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOs(String value) {
        this.os = value;
    }

    /**
     * 获取packageVersion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageVersion() {
        return packageVersion;
    }

    /**
     * 设置packageVersion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageVersion(String value) {
        this.packageVersion = value;
    }

    /**
     * 获取resultURL属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultURL() {
        return resultURL;
    }

    /**
     * 设置resultURL属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultURL(String value) {
        this.resultURL = value;
    }

}
