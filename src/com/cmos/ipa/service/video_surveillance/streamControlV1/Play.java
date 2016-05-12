
package com.cmos.ipa.service.video_surveillance.streamControlV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="speed" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="maxBytes" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="actionVersion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="asyncId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "sessionId",
    "speed",
    "maxBytes",
    "actionVersion",
    "asyncId"
})
@XmlRootElement(name = "Play")
public class Play {

    @XmlElement(required = true)
    protected String sessionId;
    protected float speed;
    protected int maxBytes;
    @XmlElement(required = true)
    protected String actionVersion;
    protected int asyncId;

    /**
     * 获取sessionId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * 设置sessionId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * 获取speed属性的值。
     * 
     */
    public float getSpeed() {
        return speed;
    }

    /**
     * 设置speed属性的值。
     * 
     */
    public void setSpeed(float value) {
        this.speed = value;
    }

    /**
     * 获取maxBytes属性的值。
     * 
     */
    public int getMaxBytes() {
        return maxBytes;
    }

    /**
     * 设置maxBytes属性的值。
     * 
     */
    public void setMaxBytes(int value) {
        this.maxBytes = value;
    }

    /**
     * 获取actionVersion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionVersion() {
        return actionVersion;
    }

    /**
     * 设置actionVersion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionVersion(String value) {
        this.actionVersion = value;
    }

    /**
     * 获取asyncId属性的值。
     * 
     */
    public int getAsyncId() {
        return asyncId;
    }

    /**
     * 设置asyncId属性的值。
     * 
     */
    public void setAsyncId(int value) {
        this.asyncId = value;
    }

}
