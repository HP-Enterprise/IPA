
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
 *         &lt;element name="AddDoorGroupResult" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "addDoorGroupResult"
})
@XmlRootElement(name = "AddDoorGroupResponse")
public class AddDoorGroupResponse {

    @XmlElement(name = "AddDoorGroupResult")
    protected int addDoorGroupResult;

    /**
     * ��ȡaddDoorGroupResult���Ե�ֵ��
     * 
     */
    public int getAddDoorGroupResult() {
        return addDoorGroupResult;
    }

    /**
     * ����addDoorGroupResult���Ե�ֵ��
     * 
     */
    public void setAddDoorGroupResult(int value) {
        this.addDoorGroupResult = value;
    }

}
