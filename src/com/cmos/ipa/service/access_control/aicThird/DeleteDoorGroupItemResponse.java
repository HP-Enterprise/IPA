
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
 *         &lt;element name="DeleteDoorGroupItemResult" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "deleteDoorGroupItemResult"
})
@XmlRootElement(name = "DeleteDoorGroupItemResponse")
public class DeleteDoorGroupItemResponse {

    @XmlElement(name = "DeleteDoorGroupItemResult")
    protected int deleteDoorGroupItemResult;

    /**
     * ��ȡdeleteDoorGroupItemResult���Ե�ֵ��
     * 
     */
    public int getDeleteDoorGroupItemResult() {
        return deleteDoorGroupItemResult;
    }

    /**
     * ����deleteDoorGroupItemResult���Ե�ֵ��
     * 
     */
    public void setDeleteDoorGroupItemResult(int value) {
        this.deleteDoorGroupItemResult = value;
    }

}
