
package com.cmos.ipa.service.access_control.aicThird;

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
 *         &lt;element name="AddSchedulesResult" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "addSchedulesResult"
})
@XmlRootElement(name = "AddSchedulesResponse")
public class AddSchedulesResponse {

    @XmlElement(name = "AddSchedulesResult")
    protected int addSchedulesResult;

    /**
     * ��ȡaddSchedulesResult���Ե�ֵ��
     * 
     */
    public int getAddSchedulesResult() {
        return addSchedulesResult;
    }

    /**
     * ����addSchedulesResult���Ե�ֵ��
     * 
     */
    public void setAddSchedulesResult(int value) {
        this.addSchedulesResult = value;
    }

}
