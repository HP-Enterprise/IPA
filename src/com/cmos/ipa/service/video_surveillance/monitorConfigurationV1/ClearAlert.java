
package com.cmos.ipa.service.video_surveillance.monitorConfigurationV1;

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
 *         &lt;element name="channelId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "channelId"
})
@XmlRootElement(name = "ClearAlert")
public class ClearAlert {

    protected int channelId;

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

}
