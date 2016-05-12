
package com.cmos.ipa.service.video_surveillance.deviceCapability;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents how many streams are available for a given stream type
 *           
 * 
 * <p>AvailableStream complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="AvailableStream"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StreamType" type="{http://www.pelco.com/api/DeviceCapability/1}StreamType"/&gt;
 *         &lt;element name="TotalAvailable" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="InUse" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvailableStream", propOrder = {
    "streamType",
    "totalAvailable",
    "inUse"
})
public class AvailableStream {

    @XmlElement(name = "StreamType", required = true)
    @XmlSchemaType(name = "string")
    protected StreamType streamType;
    @XmlElement(name = "TotalAvailable")
    protected int totalAvailable;
    @XmlElement(name = "InUse")
    protected int inUse;

    /**
     * ��ȡstreamType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.deviceCapability.StreamType }
     *     
     */
    public StreamType getStreamType() {
        return streamType;
    }

    /**
     * ����streamType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link com.cmos.ipa.service.video_surveillance.deviceCapability.StreamType }
     *     
     */
    public void setStreamType(StreamType value) {
        this.streamType = value;
    }

    /**
     * ��ȡtotalAvailable���Ե�ֵ��
     * 
     */
    public int getTotalAvailable() {
        return totalAvailable;
    }

    /**
     * ����totalAvailable���Ե�ֵ��
     * 
     */
    public void setTotalAvailable(int value) {
        this.totalAvailable = value;
    }

    /**
     * ��ȡinUse���Ե�ֵ��
     * 
     */
    public int getInUse() {
        return inUse;
    }

    /**
     * ����inUse���Ե�ֵ��
     * 
     */
    public void setInUse(int value) {
        this.inUse = value;
    }

}
