
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
 *         &lt;element name="nearFar" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
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
    "nearFar"
})
@XmlRootElement(name = "Focus")
public class Focus {

    @XmlSchemaType(name = "unsignedInt")
    protected long nearFar;

    /**
     * ��ȡnearFar���Ե�ֵ��
     * 
     */
    public long getNearFar() {
        return nearFar;
    }

    /**
     * ����nearFar���Ե�ֵ��
     * 
     */
    public void setNearFar(long value) {
        this.nearFar = value;
    }

}
