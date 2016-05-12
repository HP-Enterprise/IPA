
package com.cmos.ipa.service.video_surveillance.videoInputV1;

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
 *         &lt;element name="sessionIds" type="{urn:schemas-pelco-com:service:VideoInput:1}SessionList"/&gt;
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
    "sessionIds"
})
@XmlRootElement(name = "GetActiveSessionIdsResponse")
public class GetActiveSessionIdsResponse {

    @XmlElement(required = true)
    protected SessionList sessionIds;

    /**
     * ��ȡsessionIds���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.videoInputV1.SessionList }
     *     
     */
    public SessionList getSessionIds() {
        return sessionIds;
    }

    /**
     * ����sessionIds���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link com.cmos.ipa.service.video_surveillance.videoInputV1.SessionList }
     *     
     */
    public void setSessionIds(SessionList value) {
        this.sessionIds = value;
    }

}
