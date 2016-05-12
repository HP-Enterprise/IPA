
package com.cmos.ipa.service.video_surveillance.motionDetectionV1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;p xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tns="urn:schemas-pelco-com:service:MotionDetection:1" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Describes a motion detection region within a frame. A motion detection region is essentially a grid of 16x16 macro blocks.&lt;/p&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;div xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tns="urn:schemas-pelco-com:service:MotionDetection:1" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xsd="http://www.w3.org/2001/XMLSchema" class="notice"&gt;
 * 							In current Pelco IP-based devices with multiple regions that overlap the same areas, higher indexed regions will force lower indexed regions to cancel enabled blocks that are part of the overlapping area. This does not occur in Pelco legacy products.
 * 						&lt;/div&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;p xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tns="urn:schemas-pelco-com:service:MotionDetection:1" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
 * 							Each MotionDetection supported device can have a fixed maximum number of motion detection regions configured. Depending on requirements, each of these regions can have:
 * 							&lt;ul&gt;&lt;li&gt;a custom size: a variable number of rows and columns of 16 x 16 macro blocks&lt;/li&gt;&lt;li&gt;their own level of motion sensitivity. Regions do not merely trigger for any motion detected as this could lead to false positives. The amount of motion detected must exceed the user configured motion sensitivity&lt;/li&gt;&lt;li&gt;their own 'threshold' level, which measures the number of cell blocks within a region that have changed&lt;/li&gt;&lt;/ul&gt;&lt;/p&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;p xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tns="urn:schemas-pelco-com:service:MotionDetection:1" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
 * 							Current Pelco IP-based devices (Sarix, Spectra HD, and so on) will accept a region whose bounds are smaller than the total grid size, with a bitmask relative to the region's size. However it will interlay convert the newly created region to encompass the entire grid, as well as its bitmask. Legacy products on the other hand will always have sizes relative to the region size.
 * 						&lt;/p&gt;
 * </pre>
 * 
 * 
 * <p>Region complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Region"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="coordinate" type="{urn:schemas-pelco-com:service:MotionDetection:1}coordinate" maxOccurs="unbounded"/&gt;
 *         &lt;element name="sensitivity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="threshold" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="mask" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "Region", propOrder = {
    "name",
    "coordinate",
    "sensitivity",
    "threshold",
    "mask",
    "alarmEnabled"
})
public class Region {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected List<Coordinate> coordinate;
    protected int sensitivity;
    protected int threshold;
    @XmlElement(required = true)
    protected String mask;
    protected int alarmEnabled;

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the coordinate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coordinate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoordinate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Coordinate }
     * 
     * 
     */
    public List<Coordinate> getCoordinate() {
        if (coordinate == null) {
            coordinate = new ArrayList<Coordinate>();
        }
        return this.coordinate;
    }

    /**
     * 获取sensitivity属性的值。
     * 
     */
    public int getSensitivity() {
        return sensitivity;
    }

    /**
     * 设置sensitivity属性的值。
     * 
     */
    public void setSensitivity(int value) {
        this.sensitivity = value;
    }

    /**
     * 获取threshold属性的值。
     * 
     */
    public int getThreshold() {
        return threshold;
    }

    /**
     * 设置threshold属性的值。
     * 
     */
    public void setThreshold(int value) {
        this.threshold = value;
    }

    /**
     * 获取mask属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMask() {
        return mask;
    }

    /**
     * 设置mask属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMask(String value) {
        this.mask = value;
    }

    /**
     * 获取alarmEnabled属性的值。
     * 
     */
    public int getAlarmEnabled() {
        return alarmEnabled;
    }

    /**
     * 设置alarmEnabled属性的值。
     * 
     */
    public void setAlarmEnabled(int value) {
        this.alarmEnabled = value;
    }

}
