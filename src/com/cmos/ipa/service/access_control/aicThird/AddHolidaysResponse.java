
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
 *         &lt;element name="AddHolidaysResult" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "addHolidaysResult"
})
@XmlRootElement(name = "AddHolidaysResponse")
public class AddHolidaysResponse {

    @XmlElement(name = "AddHolidaysResult")
    protected int addHolidaysResult;

    /**
     * 获取addHolidaysResult属性的值。
     * 
     */
    public int getAddHolidaysResult() {
        return addHolidaysResult;
    }

    /**
     * 设置addHolidaysResult属性的值。
     * 
     */
    public void setAddHolidaysResult(int value) {
        this.addHolidaysResult = value;
    }

}
