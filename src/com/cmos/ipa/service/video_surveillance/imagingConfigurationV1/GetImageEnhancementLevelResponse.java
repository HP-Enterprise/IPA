
package com.cmos.ipa.service.video_surveillance.imagingConfigurationV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
     * ��ȡimageEnhancementLevel���Ե�ֵ��
     * 
     */
    public int getImageEnhancementLevel() {
        return imageEnhancementLevel;
    }

    /**
     * ����imageEnhancementLevel���Ե�ֵ��
     * 
     */
    public void setImageEnhancementLevel(int value) {
        this.imageEnhancementLevel = value;
    }

}
