
package com.cmos.ipa.service.video_surveillance.audioInputRtspV1;

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
 *         &lt;element name="streamId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="streamStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "streamId",
    "streamStatus"
})
@XmlRootElement(name = "ConnectResponse")
public class ConnectResponse {

    protected int streamId;
    @XmlElement(required = true)
    protected String streamStatus;

    /**
     * ��ȡstreamId���Ե�ֵ��
     * 
     */
    public int getStreamId() {
        return streamId;
    }

    /**
     * ����streamId���Ե�ֵ��
     * 
     */
    public void setStreamId(int value) {
        this.streamId = value;
    }

    /**
     * ��ȡstreamStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreamStatus() {
        return streamStatus;
    }

    /**
     * ����streamStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreamStatus(String value) {
        this.streamStatus = value;
    }

}
