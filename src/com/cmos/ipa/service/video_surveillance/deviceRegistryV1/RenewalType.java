
package com.cmos.ipa.service.video_surveillance.deviceRegistryV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>renewalType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="renewalType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="flags" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="udn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="devDescUrl" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="timeout" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="sysCfgQuery" type="{urn:schemas-pelco-com:service:DeviceRegistry:1}QueryStrsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "renewalType", propOrder = {
    "flags",
    "udn",
    "devDescUrl",
    "timeout",
    "sysCfgQuery"
})
public class RenewalType {

    protected int flags;
    @XmlElement(required = true)
    protected String udn;
    @XmlElement(required = true)
    protected String devDescUrl;
    protected int timeout;
    @XmlElement(required = true)
    protected QueryStrsType sysCfgQuery;

    /**
     * 获取flags属性的值。
     * 
     */
    public int getFlags() {
        return flags;
    }

    /**
     * 设置flags属性的值。
     * 
     */
    public void setFlags(int value) {
        this.flags = value;
    }

    /**
     * 获取udn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUdn() {
        return udn;
    }

    /**
     * 设置udn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUdn(String value) {
        this.udn = value;
    }

    /**
     * 获取devDescUrl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevDescUrl() {
        return devDescUrl;
    }

    /**
     * 设置devDescUrl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevDescUrl(String value) {
        this.devDescUrl = value;
    }

    /**
     * 获取timeout属性的值。
     * 
     */
    public int getTimeout() {
        return timeout;
    }

    /**
     * 设置timeout属性的值。
     * 
     */
    public void setTimeout(int value) {
        this.timeout = value;
    }

    /**
     * 获取sysCfgQuery属性的值。
     * 
     * @return
     *     possible object is
     *     {@link QueryStrsType }
     *     
     */
    public QueryStrsType getSysCfgQuery() {
        return sysCfgQuery;
    }

    /**
     * 设置sysCfgQuery属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link QueryStrsType }
     *     
     */
    public void setSysCfgQuery(QueryStrsType value) {
        this.sysCfgQuery = value;
    }

}
