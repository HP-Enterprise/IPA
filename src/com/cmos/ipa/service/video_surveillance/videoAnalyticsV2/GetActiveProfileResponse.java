
package com.cmos.ipa.service.video_surveillance.videoAnalyticsV2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="profileId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "profileId"
})
@XmlRootElement(name = "GetActiveProfileResponse")
public class GetActiveProfileResponse {

    protected int profileId;

    /**
     * ��ȡprofileId���Ե�ֵ��
     * 
     */
    public int getProfileId() {
        return profileId;
    }

    /**
     * ����profileId���Ե�ֵ��
     * 
     */
    public void setProfileId(int value) {
        this.profileId = value;
    }

}
