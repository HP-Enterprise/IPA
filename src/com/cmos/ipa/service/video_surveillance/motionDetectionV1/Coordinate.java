
package com.cmos.ipa.service.video_surveillance.motionDetectionV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Indicates one part of a Region's area. This corresponds to a 16x16 macro block in the frame.
 * 
 * <p>coordinate complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="coordinate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="row" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="column" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="position" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "coordinate", propOrder = {
    "row",
    "column"
})
public class Coordinate {

    protected int row;
    protected int column;
    @XmlAttribute(name = "position", required = true)
    protected String position;

    /**
     * 获取row属性的值。
     * 
     */
    public int getRow() {
        return row;
    }

    /**
     * 设置row属性的值。
     * 
     */
    public void setRow(int value) {
        this.row = value;
    }

    /**
     * 获取column属性的值。
     * 
     */
    public int getColumn() {
        return column;
    }

    /**
     * 设置column属性的值。
     * 
     */
    public void setColumn(int value) {
        this.column = value;
    }

    /**
     * 获取position属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosition() {
        return position;
    }

    /**
     * 设置position属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosition(String value) {
        this.position = value;
    }

}
