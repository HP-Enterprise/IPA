
package com.cmos.ipa.service.video_surveillance.streamConfigurationV1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>StreamIDSettingsList complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="StreamIDSettingsList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="streamIDSettings" type="{urn:schemas-pelco-com:service:StreamConfiguration:1}StreamIDSettings" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StreamIDSettingsList", propOrder = {
    "streamIDSettings"
})
public class StreamIDSettingsList {

    protected List<StreamIDSettings> streamIDSettings;

    /**
     * Gets the value of the streamIDSettings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the streamIDSettings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStreamIDSettings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link com.cmos.ipa.service.video_surveillance.streamConfigurationV1.StreamIDSettings }
     * 
     * 
     */
    public List<StreamIDSettings> getStreamIDSettings() {
        if (streamIDSettings == null) {
            streamIDSettings = new ArrayList<StreamIDSettings>();
        }
        return this.streamIDSettings;
    }

}
