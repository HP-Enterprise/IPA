
package com.cmos.ipa.service.access_control.aicThird;

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
 *         &lt;element name="PeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BnCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "peCode",
    "bnCode"
})
@XmlRootElement(name = "QueryEmployeeBalance")
public class QueryEmployeeBalance {

    @XmlElement(name = "PeCode")
    protected String peCode;
    @XmlElement(name = "BnCode")
    protected int bnCode;

    /**
     * ��ȡpeCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeCode() {
        return peCode;
    }

    /**
     * ����peCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeCode(String value) {
        this.peCode = value;
    }

    /**
     * ��ȡbnCode���Ե�ֵ��
     * 
     */
    public int getBnCode() {
        return bnCode;
    }

    /**
     * ����bnCode���Ե�ֵ��
     * 
     */
    public void setBnCode(int value) {
        this.bnCode = value;
    }

}
