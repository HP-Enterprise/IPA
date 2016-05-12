
package com.cmos.ipa.service.video_surveillance.positioningControlV1;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="SpeedProfile" type="{urn:schemas-pelco-com:service:PositioningControl:1}SpeedProfile" maxOccurs="unbounded"/&gt;
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
    "speedProfile"
})
@XmlRootElement(name = "GetAllSpeedProfilesResponse")
public class GetAllSpeedProfilesResponse {

    @XmlElement(name = "SpeedProfile", required = true)
    protected List<SpeedProfile> speedProfile;

    /**
     * Gets the value of the speedProfile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the speedProfile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpeedProfile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link com.cmos.ipa.service.video_surveillance.positioningControlV1.SpeedProfile }
     * 
     * 
     */
    public List<SpeedProfile> getSpeedProfile() {
        if (speedProfile == null) {
            speedProfile = new ArrayList<SpeedProfile>();
        }
        return this.speedProfile;
    }

}
