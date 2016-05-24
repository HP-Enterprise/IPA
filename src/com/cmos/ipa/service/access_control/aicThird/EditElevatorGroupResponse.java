
package com.cmos.ipa.service.access_control.aicThird;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EditElevatorGroupResult" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "editElevatorGroupResult"
})
@XmlRootElement(name = "EditElevatorGroupResponse")
public class EditElevatorGroupResponse {

    @XmlElement(name = "EditElevatorGroupResult")
    protected int editElevatorGroupResult;

    /**
     * 获取editElevatorGroupResult属性的值。
     * 
     */
    public int getEditElevatorGroupResult() {
        return editElevatorGroupResult;
    }

    /**
     * 设置editElevatorGroupResult属性的值。
     * 
     */
    public void setEditElevatorGroupResult(int value) {
        this.editElevatorGroupResult = value;
    }

}
