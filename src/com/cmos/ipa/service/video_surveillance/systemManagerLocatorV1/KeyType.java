
package com.cmos.ipa.service.video_surveillance.systemManagerLocatorV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>KeyType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="KeyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nbuff" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ebuff" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeyType", propOrder = {
    "nbuff",
    "ebuff"
})
public class KeyType {

    @XmlElement(required = true)
    protected String nbuff;
    @XmlElement(required = true)
    protected String ebuff;

    /**
     * ��ȡnbuff���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbuff() {
        return nbuff;
    }

    /**
     * ����nbuff���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNbuff(String value) {
        this.nbuff = value;
    }

    /**
     * ��ȡebuff���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEbuff() {
        return ebuff;
    }

    /**
     * ����ebuff���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEbuff(String value) {
        this.ebuff = value;
    }

}
