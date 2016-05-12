
package com.cmos.ipa.service.video_surveillance.videoOutputV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A range of valid integer values.
 *           
 * 
 * <p>SelectableRange complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SelectableRange"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="minimum" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="maximum" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:schemas-pelco-com:service:VideoOutput:1}QueryGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectableRange", propOrder = {
    "minimum",
    "maximum"
})
public class SelectableRange {

    protected int minimum;
    protected int maximum;
    @XmlAttribute(name = "select")
    protected Boolean select;

    /**
     * 获取minimum属性的值。
     * 
     */
    public int getMinimum() {
        return minimum;
    }

    /**
     * 设置minimum属性的值。
     * 
     */
    public void setMinimum(int value) {
        this.minimum = value;
    }

    /**
     * 获取maximum属性的值。
     * 
     */
    public int getMaximum() {
        return maximum;
    }

    /**
     * 设置maximum属性的值。
     * 
     */
    public void setMaximum(int value) {
        this.maximum = value;
    }

    /**
     * 获取select属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSelect() {
        return select;
    }

    /**
     * 设置select属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSelect(Boolean value) {
        this.select = value;
    }

}
