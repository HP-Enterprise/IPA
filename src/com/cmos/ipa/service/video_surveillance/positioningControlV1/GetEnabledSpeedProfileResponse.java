
package com.cmos.ipa.service.video_surveillance.positioningControlV1;

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
 *         &lt;element name="EnabledSpeedProfile" type="{urn:schemas-pelco-com:service:PositioningControl:1}SpeedProfile"/&gt;
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
    "enabledSpeedProfile"
})
@XmlRootElement(name = "GetEnabledSpeedProfileResponse")
public class GetEnabledSpeedProfileResponse {

    @XmlElement(name = "EnabledSpeedProfile", required = true)
    protected SpeedProfile enabledSpeedProfile;

    /**
     * ��ȡenabledSpeedProfile���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.positioningControlV1.SpeedProfile }
     *     
     */
    public SpeedProfile getEnabledSpeedProfile() {
        return enabledSpeedProfile;
    }

    /**
     * ����enabledSpeedProfile���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link com.cmos.ipa.service.video_surveillance.positioningControlV1.SpeedProfile }
     *     
     */
    public void setEnabledSpeedProfile(SpeedProfile value) {
        this.enabledSpeedProfile = value;
    }

}
