
package com.cmos.ipa.service.video_surveillance.positioningControlV1;

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
 *         &lt;element name="AzimuthZero" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "azimuthZero"
})
@XmlRootElement(name = "GetAzimuthZeroResponse")
public class GetAzimuthZeroResponse {

    @XmlElement(name = "AzimuthZero")
    protected int azimuthZero;

    /**
     * ��ȡazimuthZero���Ե�ֵ��
     * 
     */
    public int getAzimuthZero() {
        return azimuthZero;
    }

    /**
     * ����azimuthZero���Ե�ֵ��
     * 
     */
    public void setAzimuthZero(int value) {
        this.azimuthZero = value;
    }

}
