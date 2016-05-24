
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
 *         &lt;element name="EditHolidayItemResult" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "editHolidayItemResult"
})
@XmlRootElement(name = "EditHolidayItemResponse")
public class EditHolidayItemResponse {

    @XmlElement(name = "EditHolidayItemResult")
    protected int editHolidayItemResult;

    /**
     * 获取editHolidayItemResult属性的值。
     * 
     */
    public int getEditHolidayItemResult() {
        return editHolidayItemResult;
    }

    /**
     * 设置editHolidayItemResult属性的值。
     * 
     */
    public void setEditHolidayItemResult(int value) {
        this.editHolidayItemResult = value;
    }

}
