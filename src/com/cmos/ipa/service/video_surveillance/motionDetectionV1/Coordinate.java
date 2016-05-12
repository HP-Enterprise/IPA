
package com.cmos.ipa.service.video_surveillance.motionDetectionV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Indicates one part of a Region's area. This corresponds to a 16x16 macro block in the frame.
 * 
 * <p>coordinate complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡrow���Ե�ֵ��
     * 
     */
    public int getRow() {
        return row;
    }

    /**
     * ����row���Ե�ֵ��
     * 
     */
    public void setRow(int value) {
        this.row = value;
    }

    /**
     * ��ȡcolumn���Ե�ֵ��
     * 
     */
    public int getColumn() {
        return column;
    }

    /**
     * ����column���Ե�ֵ��
     * 
     */
    public void setColumn(int value) {
        this.column = value;
    }

    /**
     * ��ȡposition���Ե�ֵ��
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
     * ����position���Ե�ֵ��
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
