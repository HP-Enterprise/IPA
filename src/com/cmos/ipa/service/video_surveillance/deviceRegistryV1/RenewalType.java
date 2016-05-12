
package com.cmos.ipa.service.video_surveillance.deviceRegistryV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>renewalType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡflags���Ե�ֵ��
     * 
     */
    public int getFlags() {
        return flags;
    }

    /**
     * ����flags���Ե�ֵ��
     * 
     */
    public void setFlags(int value) {
        this.flags = value;
    }

    /**
     * ��ȡudn���Ե�ֵ��
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
     * ����udn���Ե�ֵ��
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
     * ��ȡdevDescUrl���Ե�ֵ��
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
     * ����devDescUrl���Ե�ֵ��
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
     * ��ȡtimeout���Ե�ֵ��
     * 
     */
    public int getTimeout() {
        return timeout;
    }

    /**
     * ����timeout���Ե�ֵ��
     * 
     */
    public void setTimeout(int value) {
        this.timeout = value;
    }

    /**
     * ��ȡsysCfgQuery���Ե�ֵ��
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
     * ����sysCfgQuery���Ե�ֵ��
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
