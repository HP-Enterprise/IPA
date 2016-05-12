
package com.cmos.ipa.service.video_surveillance.audioInputV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 						This contains criteria used for filtering audio stream
 * 						query results.
 * 
 * 						Some important points regarding the form of the search
 * 						criteria (StreamQuery data element):
 * 						
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ul xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tns="urn:schemas-pelco-com:service:AudioInput:1" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;li&gt;
 * 								The search criteria only need contain those
 * 								elements needed to filter the returned catalog,
 * 								or used to specify which elements should be
 * 								included in the response.
 * 							&lt;/li&gt;&lt;li&gt;
 * 								Those elements that should be included in the
 * 								response should contain a "select" attribute.
 * 								If a "select" attribute is associated with the
 * 								rootcstreamQuery element, all sub-elements
 * 								will be returned.
 * 							&lt;/li&gt;&lt;li&gt;
 * 								Those elements whose existence is required
 * 								should contain a required attribute. As with the
 * 								select attribute, if a "required" attribute is
 * 								associated with the root streamQuery element,
 * 								then all sub-elements are required.
 * 							&lt;/li&gt;&lt;/ul&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;div xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tns="urn:schemas-pelco-com:service:AudioInput:1" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xsd="http://www.w3.org/2001/XMLSchema" class="notice"&gt;
 * 							A direct transformation exists between the search
 * 							criteria and an SQL statement of the form
 * 							SELECT [syseng:Fields] FROM [syseng:Table] WHERE
 * 							[syseng:Conditions] where [syseng:Fields] includes
 * 							those elements with an associated "select" attribute
 * 							(or is considered to be * if the streamQuery
 * 							element has a "select" attribute), [syseng:Table] is
 * 							empty, and [syseng:Conditions] is the logical and of
 * 							the included search criteria.
 * 						&lt;/div&gt;
 * </pre>
 * 
 * 
 * <p>StreamQuery complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="StreamQuery"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sourceURI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sourceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="outputUDN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="outputId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="eventUDN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="eventId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="eventURN" type="{urn:schemas-pelco-com:service:AudioInput:1}EVENT-URN" minOccurs="0"/&gt;
 *         &lt;element name="serviceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="formats" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="selected" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="minBitrate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="maxBitrate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="endTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pageHeader" type="{urn:schemas-pelco-com:service:AudioInput:1}PageHeader" minOccurs="0"/&gt;
 *         &lt;element name="deletionPriority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StreamQuery", propOrder = {
    "sourceURI",
    "sourceId",
    "outputUDN",
    "outputId",
    "eventUDN",
    "eventId",
    "eventURN",
    "serviceId",
    "formats",
    "selected",
    "minBitrate",
    "maxBitrate",
    "startTime",
    "endTime",
    "pageHeader",
    "deletionPriority"
})
public class StreamQuery {

    protected String sourceURI;
    protected String sourceId;
    protected String outputUDN;
    protected String outputId;
    protected String eventUDN;
    protected String eventId;
    @XmlSchemaType(name = "string")
    protected EVENTURN eventURN;
    protected String serviceId;
    protected String formats;
    protected String selected;
    protected Integer minBitrate;
    protected Integer maxBitrate;
    protected String startTime;
    protected String endTime;
    protected PageHeader pageHeader;
    protected String deletionPriority;

    /**
     * ��ȡsourceURI���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceURI() {
        return sourceURI;
    }

    /**
     * ����sourceURI���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceURI(String value) {
        this.sourceURI = value;
    }

    /**
     * ��ȡsourceId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceId() {
        return sourceId;
    }

    /**
     * ����sourceId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceId(String value) {
        this.sourceId = value;
    }

    /**
     * ��ȡoutputUDN���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputUDN() {
        return outputUDN;
    }

    /**
     * ����outputUDN���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputUDN(String value) {
        this.outputUDN = value;
    }

    /**
     * ��ȡoutputId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputId() {
        return outputId;
    }

    /**
     * ����outputId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputId(String value) {
        this.outputId = value;
    }

    /**
     * ��ȡeventUDN���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventUDN() {
        return eventUDN;
    }

    /**
     * ����eventUDN���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventUDN(String value) {
        this.eventUDN = value;
    }

    /**
     * ��ȡeventId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventId() {
        return eventId;
    }

    /**
     * ����eventId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventId(String value) {
        this.eventId = value;
    }

    /**
     * ��ȡeventURN���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.audioInputV1.EVENTURN }
     *     
     */
    public EVENTURN getEventURN() {
        return eventURN;
    }

    /**
     * ����eventURN���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link com.cmos.ipa.service.video_surveillance.audioInputV1.EVENTURN }
     *     
     */
    public void setEventURN(EVENTURN value) {
        this.eventURN = value;
    }

    /**
     * ��ȡserviceId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceId() {
        return serviceId;
    }

    /**
     * ����serviceId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceId(String value) {
        this.serviceId = value;
    }

    /**
     * ��ȡformats���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormats() {
        return formats;
    }

    /**
     * ����formats���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormats(String value) {
        this.formats = value;
    }

    /**
     * ��ȡselected���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelected() {
        return selected;
    }

    /**
     * ����selected���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelected(String value) {
        this.selected = value;
    }

    /**
     * ��ȡminBitrate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinBitrate() {
        return minBitrate;
    }

    /**
     * ����minBitrate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinBitrate(Integer value) {
        this.minBitrate = value;
    }

    /**
     * ��ȡmaxBitrate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxBitrate() {
        return maxBitrate;
    }

    /**
     * ����maxBitrate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxBitrate(Integer value) {
        this.maxBitrate = value;
    }

    /**
     * ��ȡstartTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * ����startTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTime(String value) {
        this.startTime = value;
    }

    /**
     * ��ȡendTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * ����endTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTime(String value) {
        this.endTime = value;
    }

    /**
     * ��ȡpageHeader���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.audioInputV1.PageHeader }
     *     
     */
    public PageHeader getPageHeader() {
        return pageHeader;
    }

    /**
     * ����pageHeader���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link com.cmos.ipa.service.video_surveillance.audioInputV1.PageHeader }
     *     
     */
    public void setPageHeader(PageHeader value) {
        this.pageHeader = value;
    }

    /**
     * ��ȡdeletionPriority���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeletionPriority() {
        return deletionPriority;
    }

    /**
     * ����deletionPriority���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeletionPriority(String value) {
        this.deletionPriority = value;
    }

}
