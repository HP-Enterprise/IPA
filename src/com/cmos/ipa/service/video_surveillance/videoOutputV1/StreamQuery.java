
package com.cmos.ipa.service.video_surveillance.videoOutputV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents the search criteria for querying video streams.
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
 *         &lt;element name="pageHeader" type="{urn:schemas-pelco-com:service:VideoOutput:1}PageHeader" minOccurs="0"/&gt;
 *         &lt;element name="sourceURI" type="{urn:schemas-pelco-com:service:VideoOutput:1}SelectableString" minOccurs="0"/&gt;
 *         &lt;element name="outputURI" type="{urn:schemas-pelco-com:service:VideoOutput:1}SelectableString" minOccurs="0"/&gt;
 *         &lt;element name="eventURI" type="{urn:schemas-pelco-com:service:VideoOutput:1}SelectableString" minOccurs="0"/&gt;
 *         &lt;element name="eventURN" type="{urn:schemas-pelco-com:service:VideoOutput:1}SelectableString" minOccurs="0"/&gt;
 *         &lt;element name="serviceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="formats" type="{urn:schemas-pelco-com:service:VideoOutput:1}FormatList" minOccurs="0"/&gt;
 *         &lt;element name="resolutions" type="{urn:schemas-pelco-com:service:VideoOutput:1}ResolutionList" minOccurs="0"/&gt;
 *         &lt;element name="framerate" type="{urn:schemas-pelco-com:service:VideoOutput:1}SelectableRange" minOccurs="0"/&gt;
 *         &lt;element name="bitrate" type="{urn:schemas-pelco-com:service:VideoOutput:1}SelectableRange" minOccurs="0"/&gt;
 *         &lt;element name="startTime" type="{urn:schemas-pelco-com:service:VideoOutput:1}SelectableString" minOccurs="0"/&gt;
 *         &lt;element name="endTime" type="{urn:schemas-pelco-com:service:VideoOutput:1}SelectableString" minOccurs="0"/&gt;
 *         &lt;element name="deletionPriority" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:schemas-pelco-com:service:VideoOutput:1}QueryGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StreamQuery", propOrder = {
    "pageHeader",
    "sourceURI",
    "outputURI",
    "eventURI",
    "eventURN",
    "serviceId",
    "formats",
    "resolutions",
    "framerate",
    "bitrate",
    "startTime",
    "endTime",
    "deletionPriority"
})
public class StreamQuery {

    protected PageHeader pageHeader;
    protected SelectableString sourceURI;
    protected SelectableString outputURI;
    protected SelectableString eventURI;
    protected SelectableString eventURN;
    protected String serviceId;
    protected FormatList formats;
    protected ResolutionList resolutions;
    protected SelectableRange framerate;
    protected SelectableRange bitrate;
    protected SelectableString startTime;
    protected SelectableString endTime;
    protected Integer deletionPriority;
    @XmlAttribute(name = "select")
    protected Boolean select;

    /**
     * ��ȡpageHeader���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.videoOutputV1.PageHeader }
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
     *     {@link com.cmos.ipa.service.video_surveillance.videoOutputV1.PageHeader }
     *     
     */
    public void setPageHeader(PageHeader value) {
        this.pageHeader = value;
    }

    /**
     * ��ȡsourceURI���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SelectableString }
     *     
     */
    public SelectableString getSourceURI() {
        return sourceURI;
    }

    /**
     * ����sourceURI���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SelectableString }
     *     
     */
    public void setSourceURI(SelectableString value) {
        this.sourceURI = value;
    }

    /**
     * ��ȡoutputURI���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SelectableString }
     *     
     */
    public SelectableString getOutputURI() {
        return outputURI;
    }

    /**
     * ����outputURI���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SelectableString }
     *     
     */
    public void setOutputURI(SelectableString value) {
        this.outputURI = value;
    }

    /**
     * ��ȡeventURI���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SelectableString }
     *     
     */
    public SelectableString getEventURI() {
        return eventURI;
    }

    /**
     * ����eventURI���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SelectableString }
     *     
     */
    public void setEventURI(SelectableString value) {
        this.eventURI = value;
    }

    /**
     * ��ȡeventURN���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SelectableString }
     *     
     */
    public SelectableString getEventURN() {
        return eventURN;
    }

    /**
     * ����eventURN���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SelectableString }
     *     
     */
    public void setEventURN(SelectableString value) {
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
     *     {@link com.cmos.ipa.service.video_surveillance.videoOutputV1.FormatList }
     *     
     */
    public FormatList getFormats() {
        return formats;
    }

    /**
     * ����formats���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link com.cmos.ipa.service.video_surveillance.videoOutputV1.FormatList }
     *     
     */
    public void setFormats(FormatList value) {
        this.formats = value;
    }

    /**
     * ��ȡresolutions���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ResolutionList }
     *     
     */
    public ResolutionList getResolutions() {
        return resolutions;
    }

    /**
     * ����resolutions���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ResolutionList }
     *     
     */
    public void setResolutions(ResolutionList value) {
        this.resolutions = value;
    }

    /**
     * ��ȡframerate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SelectableRange }
     *     
     */
    public SelectableRange getFramerate() {
        return framerate;
    }

    /**
     * ����framerate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SelectableRange }
     *     
     */
    public void setFramerate(SelectableRange value) {
        this.framerate = value;
    }

    /**
     * ��ȡbitrate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SelectableRange }
     *     
     */
    public SelectableRange getBitrate() {
        return bitrate;
    }

    /**
     * ����bitrate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SelectableRange }
     *     
     */
    public void setBitrate(SelectableRange value) {
        this.bitrate = value;
    }

    /**
     * ��ȡstartTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SelectableString }
     *     
     */
    public SelectableString getStartTime() {
        return startTime;
    }

    /**
     * ����startTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SelectableString }
     *     
     */
    public void setStartTime(SelectableString value) {
        this.startTime = value;
    }

    /**
     * ��ȡendTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SelectableString }
     *     
     */
    public SelectableString getEndTime() {
        return endTime;
    }

    /**
     * ����endTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SelectableString }
     *     
     */
    public void setEndTime(SelectableString value) {
        this.endTime = value;
    }

    /**
     * ��ȡdeletionPriority���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDeletionPriority() {
        return deletionPriority;
    }

    /**
     * ����deletionPriority���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDeletionPriority(Integer value) {
        this.deletionPriority = value;
    }

    /**
     * ��ȡselect���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSelect() {
        return select;
    }

    /**
     * ����select���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSelect(Boolean value) {
        this.select = value;
    }

}
