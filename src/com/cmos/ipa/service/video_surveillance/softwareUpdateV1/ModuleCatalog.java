
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
 * <p>ModuleCatalog complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡmodules���Ե�ֵ��
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
     * ����modules���Ե�ֵ��
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
     * ��ȡmodelName���Ե�ֵ��
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
     * ����modelName���Ե�ֵ��
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
     * ��ȡfailInterval���Ե�ֵ��
     * 
     */
    public int getFailInterval() {
        return failInterval;
    }

    /**
     * ����failInterval���Ե�ֵ��
     * 
     */
    public void setFailInterval(int value) {
        this.failInterval = value;
    }

    /**
     * ��ȡforceUpdate���Ե�ֵ��
     * 
     */
    public int getForceUpdate() {
        return forceUpdate;
    }

    /**
     * ����forceUpdate���Ե�ֵ��
     * 
     */
    public void setForceUpdate(int value) {
        this.forceUpdate = value;
    }

    /**
     * ��ȡplatform���Ե�ֵ��
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
     * ����platform���Ե�ֵ��
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
     * ��ȡos���Ե�ֵ��
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
     * ����os���Ե�ֵ��
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
     * ��ȡpackageVersion���Ե�ֵ��
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
     * ����packageVersion���Ե�ֵ��
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
     * ��ȡresultURL���Ե�ֵ��
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
     * ����resultURL���Ե�ֵ��
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
