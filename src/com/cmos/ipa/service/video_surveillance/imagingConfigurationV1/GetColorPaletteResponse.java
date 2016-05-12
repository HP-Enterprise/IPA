
package com.cmos.ipa.service.video_surveillance.imagingConfigurationV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="ColorPalette" type="{http://www.pelco.com/api/ImagingConfiguration/1}ColorPalette"/&gt;
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
    "colorPalette"
})
@XmlRootElement(name = "GetColorPaletteResponse")
public class GetColorPaletteResponse {

    @XmlElement(name = "ColorPalette", required = true)
    @XmlSchemaType(name = "string")
    protected ColorPalette colorPalette;

    /**
     * ��ȡcolorPalette���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.imagingConfigurationV1.ColorPalette }
     *     
     */
    public ColorPalette getColorPalette() {
        return colorPalette;
    }

    /**
     * ����colorPalette���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link com.cmos.ipa.service.video_surveillance.imagingConfigurationV1.ColorPalette }
     *     
     */
    public void setColorPalette(ColorPalette value) {
        this.colorPalette = value;
    }

}
