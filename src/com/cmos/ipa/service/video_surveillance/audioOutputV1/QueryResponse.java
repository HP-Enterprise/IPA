
package com.cmos.ipa.service.video_surveillance.audioOutputV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取streamCatalog属性的值。
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
     * 设置streamCatalog属性的值。
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
     * 获取asyncId属性的值。
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
     * 设置asyncId属性的值。
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
