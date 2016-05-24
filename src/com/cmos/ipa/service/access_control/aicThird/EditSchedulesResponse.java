
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
 *         &lt;element name="EditSchedulesResult" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "editSchedulesResult"
})
@XmlRootElement(name = "EditSchedulesResponse")
public class EditSchedulesResponse {

    @XmlElement(name = "EditSchedulesResult")
    protected int editSchedulesResult;

    /**
     * 获取editSchedulesResult属性的值。
     * 
     */
    public int getEditSchedulesResult() {
        return editSchedulesResult;
    }

    /**
     * 设置editSchedulesResult属性的值。
     * 
     */
    public void setEditSchedulesResult(int value) {
        this.editSchedulesResult = value;
    }

}
