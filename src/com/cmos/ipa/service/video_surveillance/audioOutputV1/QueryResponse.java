
package com.cmos.ipa.service.video_surveillance.audioOutputV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="streamCatalog" type="{urn:schemas-pelco-com:service:AudioOutput:1}StreamCatalog"/&gt;
 *         &lt;element name="asyncId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "streamCatalog",
    "asyncId"
})
@XmlRootElement(name = "QueryResponse")
public class QueryResponse {

    @XmlElement(required = true)
    protected StreamCatalog streamCatalog;
    protected Integer asyncId;

    /**
     * ��ȡstreamCatalog���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link StreamCatalog }
     *     
     */
    public StreamCatalog getStreamCatalog() {
        return streamCatalog;
    }

    /**
     * ����streamCatalog���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link StreamCatalog }
     *     
     */
    public void setStreamCatalog(StreamCatalog value) {
        this.streamCatalog = value;
    }

    /**
     * ��ȡasyncId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAsyncId() {
        return asyncId;
    }

    /**
     * ����asyncId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAsyncId(Integer value) {
        this.asyncId = value;
    }

}
