
package com.cmos.ipa.service.video_surveillance.lensControlV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="magnification" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
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
    "magnification"
})
@XmlRootElement(name = "SetMag")
public class SetMag {

    @XmlSchemaType(name = "unsignedInt")
    protected long magnification;

    /**
     * ��ȡmagnification���Ե�ֵ��
     * 
     */
    public long getMagnification() {
        return magnification;
    }

    /**
     * ����magnification���Ե�ֵ��
     * 
     */
    public void setMagnification(long value) {
        this.magnification = value;
    }

}
