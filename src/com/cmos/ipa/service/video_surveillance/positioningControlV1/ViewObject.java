
package com.cmos.ipa.service.video_surveillance.positioningControlV1;

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
 *         &lt;element name="position" type="{urn:schemas-pelco-com:service:PositioningControl:1}Velocity"/&gt;
 *         &lt;element name="radius" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
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
    "position",
    "radius"
})
@XmlRootElement(name = "ViewObject")
public class ViewObject {

    @XmlElement(required = true)
    protected Velocity position;
    @XmlSchemaType(name = "unsignedInt")
    protected long radius;

    /**
     * ��ȡposition���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.positioningControlV1.Velocity }
     *     
     */
    public Velocity getPosition() {
        return position;
    }

    /**
     * ����position���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link com.cmos.ipa.service.video_surveillance.positioningControlV1.Velocity }
     *     
     */
    public void setPosition(Velocity value) {
        this.position = value;
    }

    /**
     * ��ȡradius���Ե�ֵ��
     * 
     */
    public long getRadius() {
        return radius;
    }

    /**
     * ����radius���Ե�ֵ��
     * 
     */
    public void setRadius(long value) {
        this.radius = value;
    }

}
