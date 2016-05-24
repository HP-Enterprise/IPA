
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
 *         &lt;element name="AddAccessGroupItemResult" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "addAccessGroupItemResult"
})
@XmlRootElement(name = "AddAccessGroupItemResponse")
public class AddAccessGroupItemResponse {

    @XmlElement(name = "AddAccessGroupItemResult")
    protected int addAccessGroupItemResult;

    /**
     * 获取addAccessGroupItemResult属性的值。
     * 
     */
    public int getAddAccessGroupItemResult() {
        return addAccessGroupItemResult;
    }

    /**
     * 设置addAccessGroupItemResult属性的值。
     * 
     */
    public void setAddAccessGroupItemResult(int value) {
        this.addAccessGroupItemResult = value;
    }

}
