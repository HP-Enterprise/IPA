
package com.cmos.ipa.service.video_surveillance.audioInputRtspV1;

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
 *         &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "enabled"
})
@XmlRootElement(name = "SetEnabled")
public class SetEnabled {

    protected boolean enabled;

    /**
     * ��ȡenabled���Ե�ֵ��
     * 
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * ����enabled���Ե�ֵ��
     * 
     */
    public void setEnabled(boolean value) {
        this.enabled = value;
    }

}
