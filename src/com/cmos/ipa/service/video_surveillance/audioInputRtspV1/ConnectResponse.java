
package com.cmos.ipa.service.video_surveillance.audioInputRtspV1;

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
     * 获取streamId属性的值。
     * 
     */
    public int getStreamId() {
        return streamId;
    }

    /**
     * 设置streamId属性的值。
     * 
     */
    public void setStreamId(int value) {
        this.streamId = value;
    }

    /**
     * 获取streamStatus属性的值。
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
     * 设置streamStatus属性的值。
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
