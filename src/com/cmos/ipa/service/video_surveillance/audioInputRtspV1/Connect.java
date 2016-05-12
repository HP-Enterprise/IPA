
package com.cmos.ipa.service.video_surveillance.audioInputRtspV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="sourceURI" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *         &lt;element name="channelId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="sessionTimeoutSeconds" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "sourceURI",
    "channelId",
    "sessionTimeoutSeconds"
})
@XmlRootElement(name = "Connect")
public class Connect {

    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String sourceURI;
    protected int channelId;
    protected int sessionTimeoutSeconds;

    /**
     * ��ȡsourceURI���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceURI() {
        return sourceURI;
    }

    /**
     * ����sourceURI���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceURI(String value) {
        this.sourceURI = value;
    }

    /**
     * ��ȡchannelId���Ե�ֵ��
     * 
     */
    public int getChannelId() {
        return channelId;
    }

    /**
     * ����channelId���Ե�ֵ��
     * 
     */
    public void setChannelId(int value) {
        this.channelId = value;
    }

    /**
     * ��ȡsessionTimeoutSeconds���Ե�ֵ��
     * 
     */
    public int getSessionTimeoutSeconds() {
        return sessionTimeoutSeconds;
    }

    /**
     * ����sessionTimeoutSeconds���Ե�ֵ��
     * 
     */
    public void setSessionTimeoutSeconds(int value) {
        this.sessionTimeoutSeconds = value;
    }

}
