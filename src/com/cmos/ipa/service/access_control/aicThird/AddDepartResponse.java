
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
 *         &lt;element name="AddDepartResult" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "addDepartResult"
})
@XmlRootElement(name = "AddDepartResponse")
public class AddDepartResponse {

    @XmlElement(name = "AddDepartResult")
    protected int addDepartResult;

    /**
     * ��ȡaddDepartResult���Ե�ֵ��
     * 
     */
    public int getAddDepartResult() {
        return addDepartResult;
    }

    /**
     * ����addDepartResult���Ե�ֵ��
     * 
     */
    public void setAddDepartResult(int value) {
        this.addDepartResult = value;
    }

}
