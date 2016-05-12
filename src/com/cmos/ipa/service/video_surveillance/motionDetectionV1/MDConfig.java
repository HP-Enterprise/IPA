
package com.cmos.ipa.service.video_surveillance.motionDetectionV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;p xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tns="urn:schemas-pelco-com:service:MotionDetection:1" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Current configuration state of motion detection.&lt;/p&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;div xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tns="urn:schemas-pelco-com:service:MotionDetection:1" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xsd="http://www.w3.org/2001/XMLSchema" class="notice"&gt;The number of rows and columns of 16x16 pixel cell blocks is dependent on the maximum image size, which is currently at 1920x1080. Therefore you can have a maximum of 68x120 16x16 cell blocks. (68*120 = 8160 bits in bitmask. 8160/8 = 1020 bytes in bitmask.)&lt;/div&gt;
 * </pre>
 * 
 * 
 * <p>MDConfig complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="MDConfig"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rows" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="columns" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="maxSensitivity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="maxRegions" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="alarmEnabled" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MDConfig", propOrder = {
    "rows",
    "columns",
    "maxSensitivity",
    "maxRegions",
    "alarmEnabled"
})
public class MDConfig {

    protected int rows;
    protected int columns;
    protected int maxSensitivity;
    protected int maxRegions;
    protected int alarmEnabled;

    /**
     * ��ȡrows���Ե�ֵ��
     * 
     */
    public int getRows() {
        return rows;
    }

    /**
     * ����rows���Ե�ֵ��
     * 
     */
    public void setRows(int value) {
        this.rows = value;
    }

    /**
     * ��ȡcolumns���Ե�ֵ��
     * 
     */
    public int getColumns() {
        return columns;
    }

    /**
     * ����columns���Ե�ֵ��
     * 
     */
    public void setColumns(int value) {
        this.columns = value;
    }

    /**
     * ��ȡmaxSensitivity���Ե�ֵ��
     * 
     */
    public int getMaxSensitivity() {
        return maxSensitivity;
    }

    /**
     * ����maxSensitivity���Ե�ֵ��
     * 
     */
    public void setMaxSensitivity(int value) {
        this.maxSensitivity = value;
    }

    /**
     * ��ȡmaxRegions���Ե�ֵ��
     * 
     */
    public int getMaxRegions() {
        return maxRegions;
    }

    /**
     * ����maxRegions���Ե�ֵ��
     * 
     */
    public void setMaxRegions(int value) {
        this.maxRegions = value;
    }

    /**
     * ��ȡalarmEnabled���Ե�ֵ��
     * 
     */
    public int getAlarmEnabled() {
        return alarmEnabled;
    }

    /**
     * ����alarmEnabled���Ե�ֵ��
     * 
     */
    public void setAlarmEnabled(int value) {
        this.alarmEnabled = value;
    }

}
