
package com.cmos.ipa.service.video_surveillance.videoOutputV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents paging data
 *           
 * 
 * <p>PageHeader complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="PageHeader"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="queryId" type="{urn:schemas-pelco-com:service:VideoOutput:1}QueryId" minOccurs="0"/&gt;
 *         &lt;element name="nextEntry" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="totalEntries" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="maxEntries" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="resultURI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="truncated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PageHeader", propOrder = {
    "queryId",
    "nextEntry",
    "totalEntries",
    "maxEntries",
    "resultURI",
    "truncated"
})
public class PageHeader {

    protected QueryId queryId;
    @XmlSchemaType(name = "unsignedInt")
    protected Long nextEntry;
    @XmlSchemaType(name = "unsignedInt")
    protected Long totalEntries;
    @XmlSchemaType(name = "unsignedInt")
    protected Long maxEntries;
    protected String resultURI;
    protected Boolean truncated;

    /**
     * ��ȡqueryId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.videoOutputV1.QueryId }
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
     *     {@link com.cmos.ipa.service.video_surveillance.videoOutputV1.QueryId }
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
     *     {@link Long }
     *     
     */
    public Long getNextEntry() {
        return nextEntry;
    }

    /**
     * ����nextEntry���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNextEntry(Long value) {
        this.nextEntry = value;
    }

    /**
     * ��ȡtotalEntries���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalEntries() {
        return totalEntries;
    }

    /**
     * ����totalEntries���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalEntries(Long value) {
        this.totalEntries = value;
    }

    /**
     * ��ȡmaxEntries���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxEntries() {
        return maxEntries;
    }

    /**
     * ����maxEntries���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxEntries(Long value) {
        this.maxEntries = value;
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
     * ��ȡtruncated���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTruncated() {
        return truncated;
    }

    /**
     * ����truncated���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTruncated(Boolean value) {
        this.truncated = value;
    }

}
