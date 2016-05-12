
package com.cmos.ipa.service.video_surveillance.streamConfigurationV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>StreamConfigurationInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="StreamConfigurationInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="stream" type="{urn:schemas-pelco-com:service:StreamConfiguration:1}StreamID"/&gt;
 *         &lt;element name="result" type="{urn:schemas-pelco-com:service:StreamConfiguration:1}QueryResult"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StreamConfigurationInfo", propOrder = {
    "stream",
    "result"
})
public class StreamConfigurationInfo {

    @XmlElement(required = true)
    protected StreamID stream;
    @XmlElement(required = true)
    protected QueryResult result;

    /**
     * ��ȡstream���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.streamConfigurationV1.StreamID }
     *     
     */
    public StreamID getStream() {
        return stream;
    }

    /**
     * ����stream���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link com.cmos.ipa.service.video_surveillance.streamConfigurationV1.StreamID }
     *     
     */
    public void setStream(StreamID value) {
        this.stream = value;
    }

    /**
     * ��ȡresult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.streamConfigurationV1.QueryResult }
     *     
     */
    public QueryResult getResult() {
        return result;
    }

    /**
     * ����result���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link com.cmos.ipa.service.video_surveillance.streamConfigurationV1.QueryResult }
     *     
     */
    public void setResult(QueryResult value) {
        this.result = value;
    }

}
