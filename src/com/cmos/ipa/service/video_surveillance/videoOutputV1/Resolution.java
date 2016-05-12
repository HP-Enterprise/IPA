
package com.cmos.ipa.service.video_surveillance.videoOutputV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * 
 *             The number of pixels per square inch
 *             
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;div xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tns="urn:schemas-pelco-com:service:VideoOutput:1" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xsd="http://www.w3.org/2001/XMLSchema" class="notice"&gt;Our devices are NTSC centric. 
 *             To cater to PAL settings, simply convert the PAL value to an NTSC value: multiply the PAL value by 30/25.&lt;/div&gt;
 * </pre>
 * 
 * 
 * <p>Resolution complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="Resolution"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;urn:schemas-pelco-com:service:VideoOutput:1&gt;RESOLUTIONS"&gt;
 *       &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" /&gt;
 *       &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Resolution", propOrder = {
    "value"
})
public class Resolution {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "width")
    @XmlSchemaType(name = "unsignedInt")
    protected Long width;
    @XmlAttribute(name = "height")
    @XmlSchemaType(name = "unsignedInt")
    protected Long height;

    /**
     * 
     *             A list of valid image size values. (This is a misnomer)
     *           
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * ����value���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * ��ȡwidth���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWidth() {
        return width;
    }

    /**
     * ����width���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWidth(Long value) {
        this.width = value;
    }

    /**
     * ��ȡheight���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHeight() {
        return height;
    }

    /**
     * ����height���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHeight(Long value) {
        this.height = value;
    }

}
