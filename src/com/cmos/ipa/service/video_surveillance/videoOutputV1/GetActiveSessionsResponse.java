
package com.cmos.ipa.service.video_surveillance.videoOutputV1;

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
 *         &lt;element name="activeSessions" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="maxSessions" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "activeSessions",
    "maxSessions"
})
@XmlRootElement(name = "GetActiveSessionsResponse")
public class GetActiveSessionsResponse {

    protected int activeSessions;
    protected int maxSessions;

    /**
     * ��ȡactiveSessions���Ե�ֵ��
     * 
     */
    public int getActiveSessions() {
        return activeSessions;
    }

    /**
     * ����activeSessions���Ե�ֵ��
     * 
     */
    public void setActiveSessions(int value) {
        this.activeSessions = value;
    }

    /**
     * ��ȡmaxSessions���Ե�ֵ��
     * 
     */
    public int getMaxSessions() {
        return maxSessions;
    }

    /**
     * ����maxSessions���Ե�ֵ��
     * 
     */
    public void setMaxSessions(int value) {
        this.maxSessions = value;
    }

}
