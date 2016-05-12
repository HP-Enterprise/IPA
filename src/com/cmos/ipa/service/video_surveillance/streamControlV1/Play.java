
package com.cmos.ipa.service.video_surveillance.streamControlV1;

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
     * ��ȡsessionId���Ե�ֵ��
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
     * ����sessionId���Ե�ֵ��
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
     * ��ȡspeed���Ե�ֵ��
     * 
     */
    public float getSpeed() {
        return speed;
    }

    /**
     * ����speed���Ե�ֵ��
     * 
     */
    public void setSpeed(float value) {
        this.speed = value;
    }

    /**
     * ��ȡmaxBytes���Ե�ֵ��
     * 
     */
    public int getMaxBytes() {
        return maxBytes;
    }

    /**
     * ����maxBytes���Ե�ֵ��
     * 
     */
    public void setMaxBytes(int value) {
        this.maxBytes = value;
    }

    /**
     * ��ȡactionVersion���Ե�ֵ��
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
     * ����actionVersion���Ե�ֵ��
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
     * ��ȡasyncId���Ե�ֵ��
     * 
     */
    public int getAsyncId() {
        return asyncId;
    }

    /**
     * ����asyncId���Ե�ֵ��
     * 
     */
    public void setAsyncId(int value) {
        this.asyncId = value;
    }

}
