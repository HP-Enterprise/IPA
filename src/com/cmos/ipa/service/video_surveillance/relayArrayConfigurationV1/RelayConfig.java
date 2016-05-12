
package com.cmos.ipa.service.video_surveillance.relayArrayConfigurationV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The current configuration state of the relay output. 
 * 
 * <p>RelayConfig complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡpolarity���Ե�ֵ��
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
     * ����polarity���Ե�ֵ��
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
     * ��ȡenabled���Ե�ֵ��
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
     * ����enabled���Ե�ֵ��
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
     * ��ȡmode���Ե�ֵ��
     * 
     */
    public int getMode() {
        return mode;
    }

    /**
     * ����mode���Ե�ֵ��
     * 
     */
    public void setMode(int value) {
        this.mode = value;
    }

    /**
     * ��ȡperiod���Ե�ֵ��
     * 
     */
    public int getPeriod() {
        return period;
    }

    /**
     * ����period���Ե�ֵ��
     * 
     */
    public void setPeriod(int value) {
        this.period = value;
    }

    /**
     * ��ȡdutyCycle���Ե�ֵ��
     * 
     */
    public int getDutyCycle() {
        return dutyCycle;
    }

    /**
     * ����dutyCycle���Ե�ֵ��
     * 
     */
    public void setDutyCycle(int value) {
        this.dutyCycle = value;
    }

    /**
     * ��ȡpulses���Ե�ֵ��
     * 
     */
    public int getPulses() {
        return pulses;
    }

    /**
     * ����pulses���Ե�ֵ��
     * 
     */
    public void setPulses(int value) {
        this.pulses = value;
    }

    /**
     * ��ȡphysicalOutput���Ե�ֵ��
     * 
     */
    public int getPhysicalOutput() {
        return physicalOutput;
    }

    /**
     * ����physicalOutput���Ե�ֵ��
     * 
     */
    public void setPhysicalOutput(int value) {
        this.physicalOutput = value;
    }

}
