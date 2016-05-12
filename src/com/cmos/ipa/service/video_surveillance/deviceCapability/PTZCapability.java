
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
 * <p>PTZCapability complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡisPanTiltSupported���Ե�ֵ��
     * 
     */
    public boolean isIsPanTiltSupported() {
        return isPanTiltSupported;
    }

    /**
     * ����isPanTiltSupported���Ե�ֵ��
     * 
     */
    public void setIsPanTiltSupported(boolean value) {
        this.isPanTiltSupported = value;
    }

    /**
     * ��ȡisZoomSupported���Ե�ֵ��
     * 
     */
    public boolean isIsZoomSupported() {
        return isZoomSupported;
    }

    /**
     * ����isZoomSupported���Ե�ֵ��
     * 
     */
    public void setIsZoomSupported(boolean value) {
        this.isZoomSupported = value;
    }

}
