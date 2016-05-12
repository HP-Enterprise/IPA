
package com.cmos.ipa.service.video_surveillance.videoInputV1;

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
 *         &lt;element name="streamParameters" type="{urn:schemas-pelco-com:service:VideoInput:1}StreamParameters"/&gt;
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
    "streamParameters"
})
@XmlRootElement(name = "GetSessionParametersResponse")
public class GetSessionParametersResponse {

    @XmlElement(required = true)
    protected StreamParameters streamParameters;

    /**
     * ��ȡstreamParameters���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.videoInputV1.StreamParameters }
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
     *     {@link com.cmos.ipa.service.video_surveillance.videoInputV1.StreamParameters }
     *     
     */
    public void setStreamParameters(StreamParameters value) {
        this.streamParameters = value;
    }

}
