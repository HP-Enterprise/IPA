
package com.cmos.ipa.service.video_surveillance.streamConfigurationV1;

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
 *         &lt;element name="streamCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "streamCount"
})
@XmlRootElement(name = "GetStreamCountResponse")
public class GetStreamCountResponse {

    protected int streamCount;

    /**
     * ��ȡstreamCount���Ե�ֵ��
     * 
     */
    public int getStreamCount() {
        return streamCount;
    }

    /**
     * ����streamCount���Ե�ֵ��
     * 
     */
    public void setStreamCount(int value) {
        this.streamCount = value;
    }

}
