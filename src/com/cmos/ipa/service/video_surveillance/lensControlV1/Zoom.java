
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
 *         &lt;element name="inOut" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
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
    "inOut"
})
@XmlRootElement(name = "Zoom")
public class Zoom {

    @XmlSchemaType(name = "unsignedInt")
    protected long inOut;

    /**
     * ��ȡinOut���Ե�ֵ��
     * 
     */
    public long getInOut() {
        return inOut;
    }

    /**
     * ����inOut���Ե�ֵ��
     * 
     */
    public void setInOut(long value) {
        this.inOut = value;
    }

}
