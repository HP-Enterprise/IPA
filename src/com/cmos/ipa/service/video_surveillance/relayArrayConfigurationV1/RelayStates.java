
package com.cmos.ipa.service.video_surveillance.relayArrayConfigurationV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The current state of relays contained in the array.
 * 
 * <p>RelayStates complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RelayStates"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="offset" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="length" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="changed" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="state1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="state2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelayStates", propOrder = {
    "offset",
    "length",
    "changed",
    "state1",
    "state2",
    "enabled"
})
public class RelayStates {

    @XmlElement(required = true)
    protected String offset;
    protected int length;
    @XmlElement(required = true)
    protected String changed;
    @XmlElement(required = true)
    protected String state1;
    @XmlElement(required = true)
    protected String state2;
    @XmlElement(required = true)
    protected String enabled;

    /**
     * 获取offset属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffset() {
        return offset;
    }

    /**
     * 设置offset属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffset(String value) {
        this.offset = value;
    }

    /**
     * 获取length属性的值。
     * 
     */
    public int getLength() {
        return length;
    }

    /**
     * 设置length属性的值。
     * 
     */
    public void setLength(int value) {
        this.length = value;
    }

    /**
     * 获取changed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChanged() {
        return changed;
    }

    /**
     * 设置changed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChanged(String value) {
        this.changed = value;
    }

    /**
     * 获取state1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState1() {
        return state1;
    }

    /**
     * 设置state1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState1(String value) {
        this.state1 = value;
    }

    /**
     * 获取state2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState2() {
        return state2;
    }

    /**
     * 设置state2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState2(String value) {
        this.state2 = value;
    }

    /**
     * 获取enabled属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnabled() {
        return enabled;
    }

    /**
     * 设置enabled属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnabled(String value) {
        this.enabled = value;
    }

}
