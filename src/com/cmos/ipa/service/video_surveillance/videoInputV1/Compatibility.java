
package com.cmos.ipa.service.video_surveillance.videoInputV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Compatibility complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="Compatibility"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="resolution" type="{urn:schemas-pelco-com:service:VideoInput:1}Resolution"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Compatibility", propOrder = {
    "resolution"
})
public class Compatibility {

    @XmlElement(required = true)
    protected Resolution resolution;

    /**
     * ��ȡresolution���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.videoInputV1.Resolution }
     *     
     */
    public Resolution getResolution() {
        return resolution;
    }

    /**
     * ����resolution���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link com.cmos.ipa.service.video_surveillance.videoInputV1.Resolution }
     *     
     */
    public void setResolution(Resolution value) {
        this.resolution = value;
    }

}
