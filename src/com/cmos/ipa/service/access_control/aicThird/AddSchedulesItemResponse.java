
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
 *         &lt;element name="AddSchedulesItemResult" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "addSchedulesItemResult"
})
@XmlRootElement(name = "AddSchedulesItemResponse")
public class AddSchedulesItemResponse {

    @XmlElement(name = "AddSchedulesItemResult")
    protected int addSchedulesItemResult;

    /**
     * 获取addSchedulesItemResult属性的值。
     * 
     */
    public int getAddSchedulesItemResult() {
        return addSchedulesItemResult;
    }

    /**
     * 设置addSchedulesItemResult属性的值。
     * 
     */
    public void setAddSchedulesItemResult(int value) {
        this.addSchedulesItemResult = value;
    }

}
