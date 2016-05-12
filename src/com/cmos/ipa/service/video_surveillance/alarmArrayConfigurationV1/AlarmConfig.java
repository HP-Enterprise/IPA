
package com.cmos.ipa.service.video_surveillance.alarmArrayConfigurationV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The current configuration state of the alarm input.
 * 
 * <p>AlarmConfig complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡseverity���Ե�ֵ��
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
     * ����severity���Ե�ֵ��
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
     * ��ȡpolarity���Ե�ֵ��
     * 
     */
    public int getPolarity() {
        return polarity;
    }

    /**
     * ����polarity���Ե�ֵ��
     * 
     */
    public void setPolarity(int value) {
        this.polarity = value;
    }

    /**
     * ��ȡenabled���Ե�ֵ��
     * 
     */
    public int getEnabled() {
        return enabled;
    }

    /**
     * ����enabled���Ե�ֵ��
     * 
     */
    public void setEnabled(int value) {
        this.enabled = value;
    }

    /**
     * ��ȡsupervised���Ե�ֵ��
     * 
     */
    public int getSupervised() {
        return supervised;
    }

    /**
     * ����supervised���Ե�ֵ��
     * 
     */
    public void setSupervised(int value) {
        this.supervised = value;
    }

    /**
     * ��ȡdwellTime���Ե�ֵ��
     * 
     */
    public double getDwellTime() {
        return dwellTime;
    }

    /**
     * ����dwellTime���Ե�ֵ��
     * 
     */
    public void setDwellTime(double value) {
        this.dwellTime = value;
    }

    /**
     * ��ȡphysicalInput���Ե�ֵ��
     * 
     */
    public int getPhysicalInput() {
        return physicalInput;
    }

    /**
     * ����physicalInput���Ե�ֵ��
     * 
     */
    public void setPhysicalInput(int value) {
        this.physicalInput = value;
    }

    /**
     * ��ȡcombinedEventEntry���Ե�ֵ��
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
     * ����combinedEventEntry���Ե�ֵ��
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
