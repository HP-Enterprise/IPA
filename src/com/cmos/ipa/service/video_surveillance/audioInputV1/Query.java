
package com.cmos.ipa.service.video_surveillance.audioInputV1;

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
 *         &lt;element name="streamQuery" type="{urn:schemas-pelco-com:service:AudioInput:1}StreamQuery"/&gt;
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
    "streamQuery",
    "asyncId"
})
@XmlRootElement(name = "Query")
public class Query {

    @XmlElement(required = true)
    protected StreamQuery streamQuery;
    protected Integer asyncId;

    /**
     * ��ȡstreamQuery���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link StreamQuery }
     *     
     */
    public StreamQuery getStreamQuery() {
        return streamQuery;
    }

    /**
     * ����streamQuery���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link StreamQuery }
     *     
     */
    public void setStreamQuery(StreamQuery value) {
        this.streamQuery = value;
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
