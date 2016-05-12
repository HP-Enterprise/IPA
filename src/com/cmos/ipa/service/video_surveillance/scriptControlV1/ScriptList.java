
package com.cmos.ipa.service.video_surveillance.scriptControlV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * 
 *             A list of scripts as well as related statistics regarding
 *             that list. This is typically the result of a query.
 *           
 * 
 * <p>ScriptList complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ScriptList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="scripts" type="{urn:schemas-pelco-com:service:ScriptControl:1}Scripts" minOccurs="0"/&gt;
 *         &lt;element name="queryId" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="timeout" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="nextEntry" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="maxEntries" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="maxPresets" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="maxPatterns" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="totalEntries" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="resultURI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScriptList", propOrder = {
    "scripts",
    "queryId",
    "nextEntry",
    "maxEntries",
    "maxPresets",
    "maxPatterns",
    "totalEntries",
    "resultURI"
})
public class ScriptList {

    protected Scripts scripts;
    protected QueryId queryId;
    protected Integer nextEntry;
    protected Integer maxEntries;
    protected Integer maxPresets;
    protected Integer maxPatterns;
    protected Integer totalEntries;
    protected String resultURI;

    /**
     * ��ȡscripts���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.scriptControlV1.Scripts }
     *     
     */
    public Scripts getScripts() {
        return scripts;
    }

    /**
     * ����scripts���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link com.cmos.ipa.service.video_surveillance.scriptControlV1.Scripts }
     *     
     */
    public void setScripts(Scripts value) {
        this.scripts = value;
    }

    /**
     * ��ȡqueryId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.scriptControlV1.ScriptList.QueryId }
     *     
     */
    public QueryId getQueryId() {
        return queryId;
    }

    /**
     * ����queryId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link com.cmos.ipa.service.video_surveillance.scriptControlV1.ScriptList.QueryId }
     *     
     */
    public void setQueryId(QueryId value) {
        this.queryId = value;
    }

    /**
     * ��ȡnextEntry���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNextEntry() {
        return nextEntry;
    }

    /**
     * ����nextEntry���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNextEntry(Integer value) {
        this.nextEntry = value;
    }

    /**
     * ��ȡmaxEntries���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxEntries() {
        return maxEntries;
    }

    /**
     * ����maxEntries���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxEntries(Integer value) {
        this.maxEntries = value;
    }

    /**
     * ��ȡmaxPresets���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxPresets() {
        return maxPresets;
    }

    /**
     * ����maxPresets���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxPresets(Integer value) {
        this.maxPresets = value;
    }

    /**
     * ��ȡmaxPatterns���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxPatterns() {
        return maxPatterns;
    }

    /**
     * ����maxPatterns���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxPatterns(Integer value) {
        this.maxPatterns = value;
    }

    /**
     * ��ȡtotalEntries���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalEntries() {
        return totalEntries;
    }

    /**
     * ����totalEntries���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalEntries(Integer value) {
        this.totalEntries = value;
    }

    /**
     * ��ȡresultURI���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultURI() {
        return resultURI;
    }

    /**
     * ����resultURI���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultURI(String value) {
        this.resultURI = value;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="timeout" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class QueryId {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "timeout")
        protected Integer timeout;

        /**
         * ��ȡvalue���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * ����value���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * ��ȡtimeout���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getTimeout() {
            return timeout;
        }

        /**
         * ����timeout���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setTimeout(Integer value) {
            this.timeout = value;
        }

    }

}
