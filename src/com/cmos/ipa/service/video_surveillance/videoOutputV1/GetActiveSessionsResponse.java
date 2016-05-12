
package com.cmos.ipa.service.video_surveillance.videoOutputV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取activeSessions属性的值。
     * 
     */
    public int getActiveSessions() {
        return activeSessions;
    }

    /**
     * 设置activeSessions属性的值。
     * 
     */
    public void setActiveSessions(int value) {
        this.activeSessions = value;
    }

    /**
     * 获取maxSessions属性的值。
     * 
     */
    public int getMaxSessions() {
        return maxSessions;
    }

    /**
     * 设置maxSessions属性的值。
     * 
     */
    public void setMaxSessions(int value) {
        this.maxSessions = value;
    }

}
