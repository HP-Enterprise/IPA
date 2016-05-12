
package com.cmos.ipa.service.video_surveillance.videoAnalyticsV2;

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
 *         &lt;element name="profileList" type="{urn:schemas-pelco-com:service:VideoAnalytics:2}ProfileList"/&gt;
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
    "profileList"
})
@XmlRootElement(name = "GetProfileListResponse")
public class GetProfileListResponse {

    @XmlElement(required = true)
    protected ProfileList profileList;

    /**
     * ��ȡprofileList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.videoAnalyticsV2.ProfileList }
     *     
     */
    public ProfileList getProfileList() {
        return profileList;
    }

    /**
     * ����profileList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link com.cmos.ipa.service.video_surveillance.videoAnalyticsV2.ProfileList }
     *     
     */
    public void setProfileList(ProfileList value) {
        this.profileList = value;
    }

}
