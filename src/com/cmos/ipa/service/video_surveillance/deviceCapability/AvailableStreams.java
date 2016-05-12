
package com.cmos.ipa.service.video_surveillance.deviceCapability;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a list of available streams for a given stream type
 *           
 * 
 * <p>AvailableStreams complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="AvailableStreams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AvailableStream" type="{http://www.pelco.com/api/DeviceCapability/1}AvailableStream" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvailableStreams", propOrder = {
    "availableStream"
})
public class AvailableStreams {

    @XmlElement(name = "AvailableStream")
    protected List<AvailableStream> availableStream;

    /**
     * Gets the value of the availableStream property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availableStream property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailableStream().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link com.cmos.ipa.service.video_surveillance.deviceCapability.AvailableStream }
     * 
     * 
     */
    public List<AvailableStream> getAvailableStream() {
        if (availableStream == null) {
            availableStream = new ArrayList<AvailableStream>();
        }
        return this.availableStream;
    }

}
