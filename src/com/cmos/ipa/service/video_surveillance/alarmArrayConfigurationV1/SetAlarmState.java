
package com.cmos.ipa.service.video_surveillance.alarmArrayConfigurationV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alarmID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="alarmState" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "alarmID",
    "alarmState"
})
@XmlRootElement(name = "SetAlarmState")
public class SetAlarmState {

    protected int alarmID;
    protected int alarmState;

    /**
     * ��ȡalarmID���Ե�ֵ��
     * 
     */
    public int getAlarmID() {
        return alarmID;
    }

    /**
     * ����alarmID���Ե�ֵ��
     * 
     */
    public void setAlarmID(int value) {
        this.alarmID = value;
    }

    /**
     * ��ȡalarmState���Ե�ֵ��
     * 
     */
    public int getAlarmState() {
        return alarmState;
    }

    /**
     * ����alarmState���Ե�ֵ��
     * 
     */
    public void setAlarmState(int value) {
        this.alarmState = value;
    }

}
