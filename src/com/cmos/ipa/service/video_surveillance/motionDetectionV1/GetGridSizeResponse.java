
package com.cmos.ipa.service.video_surveillance.motionDetectionV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="rows" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="columns" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="asyncId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
    "rows",
    "columns",
    "asyncId"
})
@XmlRootElement(name = "GetGridSizeResponse")
public class GetGridSizeResponse {

    protected int rows;
    protected int columns;
    protected Integer asyncId;

    /**
     * 获取rows属性的值。
     * 
     */
    public int getRows() {
        return rows;
    }

    /**
     * 设置rows属性的值。
     * 
     */
    public void setRows(int value) {
        this.rows = value;
    }

    /**
     * 获取columns属性的值。
     * 
     */
    public int getColumns() {
        return columns;
    }

    /**
     * 设置columns属性的值。
     * 
     */
    public void setColumns(int value) {
        this.columns = value;
    }

    /**
     * 获取asyncId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAsyncId() {
        return asyncId;
    }

    /**
     * 设置asyncId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAsyncId(Integer value) {
        this.asyncId = value;
    }

}
