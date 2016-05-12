
package com.cmos.ipa.service.video_surveillance.deviceCapability;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents the built in PTZ capability supported by the device
 *           
 * 
 * <p>PTZCapability complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PTZCapability"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IsPanTiltSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsZoomSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PTZCapability", propOrder = {
    "isPanTiltSupported",
    "isZoomSupported"
})
public class PTZCapability {

    @XmlElement(name = "IsPanTiltSupported")
    protected boolean isPanTiltSupported;
    @XmlElement(name = "IsZoomSupported")
    protected boolean isZoomSupported;

    /**
     * 获取isPanTiltSupported属性的值。
     * 
     */
    public boolean isIsPanTiltSupported() {
        return isPanTiltSupported;
    }

    /**
     * 设置isPanTiltSupported属性的值。
     * 
     */
    public void setIsPanTiltSupported(boolean value) {
        this.isPanTiltSupported = value;
    }

    /**
     * 获取isZoomSupported属性的值。
     * 
     */
    public boolean isIsZoomSupported() {
        return isZoomSupported;
    }

    /**
     * 设置isZoomSupported属性的值。
     * 
     */
    public void setIsZoomSupported(boolean value) {
        this.isZoomSupported = value;
    }

}
