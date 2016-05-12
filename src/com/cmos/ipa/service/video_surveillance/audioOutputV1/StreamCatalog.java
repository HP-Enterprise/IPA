
package com.cmos.ipa.service.video_surveillance.audioOutputV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 						This contains a list of stream related data as well as 
 * 						paging result information.
 * 					
 * 
 * <p>StreamCatalog complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="StreamCatalog"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pageHeader" type="{urn:schemas-pelco-com:service:AudioOutput:1}PageHeader" minOccurs="0"/&gt;
 *         &lt;element name="entries" type="{urn:schemas-pelco-com:service:AudioOutput:1}Entries" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StreamCatalog", propOrder = {
    "pageHeader",
    "entries"
})
public class StreamCatalog {

    protected PageHeader pageHeader;
    protected Entries entries;

    /**
     * ��ȡpageHeader���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.audioOutputV1.PageHeader }
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
     *     {@link com.cmos.ipa.service.video_surveillance.audioOutputV1.PageHeader }
     *     
     */
    public void setPageHeader(PageHeader value) {
        this.pageHeader = value;
    }

    /**
     * ��ȡentries���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.audioOutputV1.Entries }
     *     
     */
    public Entries getEntries() {
        return entries;
    }

    /**
     * ����entries���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link com.cmos.ipa.service.video_surveillance.audioOutputV1.Entries }
     *     
     */
    public void setEntries(Entries value) {
        this.entries = value;
    }

}
