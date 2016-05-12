
package com.cmos.ipa.service.video_surveillance.deviceCapability;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a list of compression formats
 *           
 * 
 * <p>CompressionFormats complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="CompressionFormats"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CompressionFormat" type="{http://www.pelco.com/api/DeviceCapability/1}CompressionFormat" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompressionFormats", propOrder = {
    "compressionFormat"
})
public class CompressionFormats {

    @XmlElement(name = "CompressionFormat", required = true)
    @XmlSchemaType(name = "string")
    protected List<CompressionFormat> compressionFormat;

    /**
     * Gets the value of the compressionFormat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compressionFormat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompressionFormat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link com.cmos.ipa.service.video_surveillance.deviceCapability.CompressionFormat }
     * 
     * 
     */
    public List<CompressionFormat> getCompressionFormat() {
        if (compressionFormat == null) {
            compressionFormat = new ArrayList<CompressionFormat>();
        }
        return this.compressionFormat;
    }

}
