
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
 *         &lt;element name="AddPeopleResult" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "addPeopleResult"
})
@XmlRootElement(name = "AddPeopleResponse")
public class AddPeopleResponse {

    @XmlElement(name = "AddPeopleResult")
    protected int addPeopleResult;

    /**
     * ��ȡaddPeopleResult���Ե�ֵ��
     * 
     */
    public int getAddPeopleResult() {
        return addPeopleResult;
    }

    /**
     * ����addPeopleResult���Ե�ֵ��
     * 
     */
    public void setAddPeopleResult(int value) {
        this.addPeopleResult = value;
    }

}
