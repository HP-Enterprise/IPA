
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
 *         &lt;element name="AddElevatorGroupItemResult" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "addElevatorGroupItemResult"
})
@XmlRootElement(name = "AddElevatorGroupItemResponse")
public class AddElevatorGroupItemResponse {

    @XmlElement(name = "AddElevatorGroupItemResult")
    protected int addElevatorGroupItemResult;

    /**
     * ��ȡaddElevatorGroupItemResult���Ե�ֵ��
     * 
     */
    public int getAddElevatorGroupItemResult() {
        return addElevatorGroupItemResult;
    }

    /**
     * ����addElevatorGroupItemResult���Ե�ֵ��
     * 
     */
    public void setAddElevatorGroupItemResult(int value) {
        this.addElevatorGroupItemResult = value;
    }

}
