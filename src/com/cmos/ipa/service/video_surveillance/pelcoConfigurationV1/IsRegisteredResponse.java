
package com.cmos.ipa.service.video_surveillance.pelcoConfigurationV1;

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
 *         &lt;element name="isRegistered" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "isRegistered"
})
@XmlRootElement(name = "IsRegisteredResponse")
public class IsRegisteredResponse {

    protected int isRegistered;

    /**
     * ��ȡisRegistered���Ե�ֵ��
     * 
     */
    public int getIsRegistered() {
        return isRegistered;
    }

    /**
     * ����isRegistered���Ե�ֵ��
     * 
     */
    public void setIsRegistered(int value) {
        this.isRegistered = value;
    }

}
