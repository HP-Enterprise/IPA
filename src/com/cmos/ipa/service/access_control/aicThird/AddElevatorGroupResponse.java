
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
 *         &lt;element name="AddElevatorGroupResult" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "addElevatorGroupResult"
})
@XmlRootElement(name = "AddElevatorGroupResponse")
public class AddElevatorGroupResponse {

    @XmlElement(name = "AddElevatorGroupResult")
    protected int addElevatorGroupResult;

    /**
     * ��ȡaddElevatorGroupResult���Ե�ֵ��
     * 
     */
    public int getAddElevatorGroupResult() {
        return addElevatorGroupResult;
    }

    /**
     * ����addElevatorGroupResult���Ե�ֵ��
     * 
     */
    public void setAddElevatorGroupResult(int value) {
        this.addElevatorGroupResult = value;
    }

}