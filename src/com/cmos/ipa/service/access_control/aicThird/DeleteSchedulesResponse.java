
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
 *         &lt;element name="DeleteSchedulesResult" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "deleteSchedulesResult"
})
@XmlRootElement(name = "DeleteSchedulesResponse")
public class DeleteSchedulesResponse {

    @XmlElement(name = "DeleteSchedulesResult")
    protected int deleteSchedulesResult;

    /**
     * 获取deleteSchedulesResult属性的值。
     * 
     */
    public int getDeleteSchedulesResult() {
        return deleteSchedulesResult;
    }

    /**
     * 设置deleteSchedulesResult属性的值。
     * 
     */
    public void setDeleteSchedulesResult(int value) {
        this.deleteSchedulesResult = value;
    }

}
