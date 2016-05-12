
package com.cmos.ipa.service.video_surveillance.videoOutputV1;

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
 *         &lt;element name="streamParameters" type="{urn:schemas-pelco-com:service:VideoOutput:1}StreamParameters"/&gt;
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
    "streamParameters",
    "asyncId"
})
@XmlRootElement(name = "Connect")
public class Connect {

    @XmlElement(required = true)
    protected StreamParameters streamParameters;
    protected Integer asyncId;

    /**
     * ��ȡstreamParameters���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link StreamParameters }
     *     
     */
    public StreamParameters getStreamParameters() {
        return streamParameters;
    }

    /**
     * ����streamParameters���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link StreamParameters }
     *     
     */
    public void setStreamParameters(StreamParameters value) {
        this.streamParameters = value;
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
