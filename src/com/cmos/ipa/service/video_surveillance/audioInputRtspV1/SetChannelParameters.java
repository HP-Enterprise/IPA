
package com.cmos.ipa.service.video_surveillance.audioInputRtspV1;

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
 *         &lt;element name="channelId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="audioOutSettings" type="{urn:schemas-pelco-com:service:AudioInputRtsp:1}AudioOutSettings"/&gt;
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
    "channelId",
    "audioOutSettings"
})
@XmlRootElement(name = "SetChannelParameters")
public class SetChannelParameters {

    protected int channelId;
    @XmlElement(required = true)
    protected AudioOutSettings audioOutSettings;

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
     * ��ȡaudioOutSettings���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.audioInputRtspV1.AudioOutSettings }
     *     
     */
    public AudioOutSettings getAudioOutSettings() {
        return audioOutSettings;
    }

    /**
     * ����audioOutSettings���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link com.cmos.ipa.service.video_surveillance.audioInputRtspV1.AudioOutSettings }
     *     
     */
    public void setAudioOutSettings(AudioOutSettings value) {
        this.audioOutSettings = value;
    }

}
