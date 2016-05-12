
package com.cmos.ipa.service.video_surveillance.relayArrayConfigurationV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The current configuration state of the relay output. 
 * 
 * <p>RelayConfig complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RelayConfig"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="polarity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="mode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="period" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="dutyCycle" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="pulses" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="physicalOutput" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelayConfig", propOrder = {
    "polarity",
    "enabled",
    "mode",
    "period",
    "dutyCycle",
    "pulses",
    "physicalOutput"
})
public class RelayConfig {

    protected Integer polarity;
    protected Integer enabled;
    protected int mode;
    protected int period;
    protected int dutyCycle;
    protected int pulses;
    protected int physicalOutput;

    /**
     * 获取polarity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPolarity() {
        return polarity;
    }

    /**
     * 设置polarity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPolarity(Integer value) {
        this.polarity = value;
    }

    /**
     * 获取enabled属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEnabled() {
        return enabled;
    }

    /**
     * 设置enabled属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEnabled(Integer value) {
        this.enabled = value;
    }

    /**
     * 获取mode属性的值。
     * 
     */
    public int getMode() {
        return mode;
    }

    /**
     * 设置mode属性的值。
     * 
     */
    public void setMode(int value) {
        this.mode = value;
    }

    /**
     * 获取period属性的值。
     * 
     */
    public int getPeriod() {
        return period;
    }

    /**
     * 设置period属性的值。
     * 
     */
    public void setPeriod(int value) {
        this.period = value;
    }

    /**
     * 获取dutyCycle属性的值。
     * 
     */
    public int getDutyCycle() {
        return dutyCycle;
    }

    /**
     * 设置dutyCycle属性的值。
     * 
     */
    public void setDutyCycle(int value) {
        this.dutyCycle = value;
    }

    /**
     * 获取pulses属性的值。
     * 
     */
    public int getPulses() {
        return pulses;
    }

    /**
     * 设置pulses属性的值。
     * 
     */
    public void setPulses(int value) {
        this.pulses = value;
    }

    /**
     * 获取physicalOutput属性的值。
     * 
     */
    public int getPhysicalOutput() {
        return physicalOutput;
    }

    /**
     * 设置physicalOutput属性的值。
     * 
     */
    public void setPhysicalOutput(int value) {
        this.physicalOutput = value;
    }

}
