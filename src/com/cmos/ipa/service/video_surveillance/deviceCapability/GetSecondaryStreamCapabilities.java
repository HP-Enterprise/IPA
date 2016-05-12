
package com.cmos.ipa.service.video_surveillance.deviceCapability;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="CompressionFormat" type="{http://www.pelco.com/api/DeviceCapability/1}CompressionFormat" minOccurs="0"/&gt;
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
    "compressionFormat"
})
@XmlRootElement(name = "GetSecondaryStreamCapabilities")
public class GetSecondaryStreamCapabilities {

    @XmlElement(name = "CompressionFormat")
    @XmlSchemaType(name = "string")
    protected CompressionFormat compressionFormat;

    /**
     * ��ȡcompressionFormat���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.deviceCapability.CompressionFormat }
     *     
     */
    public CompressionFormat getCompressionFormat() {
        return compressionFormat;
    }

    /**
     * ����compressionFormat���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link com.cmos.ipa.service.video_surveillance.deviceCapability.CompressionFormat }
     *     
     */
    public void setCompressionFormat(CompressionFormat value) {
        this.compressionFormat = value;
    }

}
