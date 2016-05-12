
package com.cmos.ipa.service.video_surveillance.imagingConfigurationV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Sharpness" type="{http://www.pelco.com/api/ImagingConfiguration/1}ModeValuePair"/&gt;
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
    "sharpness"
})
@XmlRootElement(name = "SetSharpness")
public class SetSharpness {

    @XmlElement(name = "Sharpness", required = true)
    protected ModeValuePair sharpness;

    /**
     * 获取sharpness属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ModeValuePair }
     *     
     */
    public ModeValuePair getSharpness() {
        return sharpness;
    }

    /**
     * 设置sharpness属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ModeValuePair }
     *     
     */
    public void setSharpness(ModeValuePair value) {
        this.sharpness = value;
    }

}
