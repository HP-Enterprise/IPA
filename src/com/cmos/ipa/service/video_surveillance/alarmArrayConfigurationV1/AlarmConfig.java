
package com.cmos.ipa.service.video_surveillance.alarmArrayConfigurationV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The current configuration state of the alarm input.
 * 
 * <p>AlarmConfig complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AlarmConfig"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="severity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="polarity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="supervised" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="dwellTime" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="physicalInput" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="combinedEventEntry" type="{urn:schemas-pelco-com:service:AlarmArrayConfiguration:1}COMBINED_EVENT_ENTRY" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlarmConfig", propOrder = {
    "severity",
    "polarity",
    "enabled",
    "supervised",
    "dwellTime",
    "physicalInput",
    "combinedEventEntry"
})
public class AlarmConfig {

    protected Integer severity;
    protected int polarity;
    protected int enabled;
    protected int supervised;
    protected double dwellTime;
    protected int physicalInput;
    protected COMBINEDEVENTENTRY combinedEventEntry;

    /**
     * 获取severity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSeverity() {
        return severity;
    }

    /**
     * 设置severity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSeverity(Integer value) {
        this.severity = value;
    }

    /**
     * 获取polarity属性的值。
     * 
     */
    public int getPolarity() {
        return polarity;
    }

    /**
     * 设置polarity属性的值。
     * 
     */
    public void setPolarity(int value) {
        this.polarity = value;
    }

    /**
     * 获取enabled属性的值。
     * 
     */
    public int getEnabled() {
        return enabled;
    }

    /**
     * 设置enabled属性的值。
     * 
     */
    public void setEnabled(int value) {
        this.enabled = value;
    }

    /**
     * 获取supervised属性的值。
     * 
     */
    public int getSupervised() {
        return supervised;
    }

    /**
     * 设置supervised属性的值。
     * 
     */
    public void setSupervised(int value) {
        this.supervised = value;
    }

    /**
     * 获取dwellTime属性的值。
     * 
     */
    public double getDwellTime() {
        return dwellTime;
    }

    /**
     * 设置dwellTime属性的值。
     * 
     */
    public void setDwellTime(double value) {
        this.dwellTime = value;
    }

    /**
     * 获取physicalInput属性的值。
     * 
     */
    public int getPhysicalInput() {
        return physicalInput;
    }

    /**
     * 设置physicalInput属性的值。
     * 
     */
    public void setPhysicalInput(int value) {
        this.physicalInput = value;
    }

    /**
     * 获取combinedEventEntry属性的值。
     * 
     * @return
     *     possible object is
     *     {@link COMBINEDEVENTENTRY }
     *     
     */
    public COMBINEDEVENTENTRY getCombinedEventEntry() {
        return combinedEventEntry;
    }

    /**
     * 设置combinedEventEntry属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link COMBINEDEVENTENTRY }
     *     
     */
    public void setCombinedEventEntry(COMBINEDEVENTENTRY value) {
        this.combinedEventEntry = value;
    }

}
