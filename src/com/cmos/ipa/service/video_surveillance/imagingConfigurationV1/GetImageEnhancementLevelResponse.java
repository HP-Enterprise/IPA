
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
 *         &lt;element name="ImageEnhancementLevel" type="{http://www.pelco.com/api/ImagingConfiguration/1}ImageEnhancementLevel"/&gt;
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
    "imageEnhancementLevel"
})
@XmlRootElement(name = "GetImageEnhancementLevelResponse")
public class GetImageEnhancementLevelResponse {

    @XmlElement(name = "ImageEnhancementLevel")
    protected int imageEnhancementLevel;

    /**
     * 获取imageEnhancementLevel属性的值。
     * 
     */
    public int getImageEnhancementLevel() {
        return imageEnhancementLevel;
    }

    /**
     * 设置imageEnhancementLevel属性的值。
     * 
     */
    public void setImageEnhancementLevel(int value) {
        this.imageEnhancementLevel = value;
    }

}
