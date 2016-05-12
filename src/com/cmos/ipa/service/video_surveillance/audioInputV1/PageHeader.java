
package com.cmos.ipa.service.video_surveillance.audioInputV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 						Contains information used for paging through a result
 * 						set with more than one page of results.
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
 *         &lt;element name="queryId" type="{urn:schemas-pelco-com:service:AudioInput:1}QueryId" minOccurs="0"/&gt;
 *         &lt;element name="nextEntry" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="totalEntries" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="maxEntries" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
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
@XmlType(name = "PageHeader", propOrder = {
    "queryId",
    "nextEntry",
    "totalEntries",
    "maxEntries",
    "resultURI"
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

    /**
     * ��ȡqueryId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.audioInputV1.QueryId }
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
     *     {@link com.cmos.ipa.service.video_surveillance.audioInputV1.QueryId }
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

}
