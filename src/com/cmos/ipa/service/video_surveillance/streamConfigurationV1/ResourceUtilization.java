
package com.cmos.ipa.service.video_surveillance.streamConfigurationV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ResourceUtilization complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ResourceUtilization"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="resource" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="utilizationPct" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceUtilization", propOrder = {

})
public class ResourceUtilization {

    @XmlElement(required = true)
    protected String resource;
    protected int utilizationPct;

    /**
     * ��ȡresource���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResource() {
        return resource;
    }

    /**
     * ����resource���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResource(String value) {
        this.resource = value;
    }

    /**
     * ��ȡutilizationPct���Ե�ֵ��
     * 
     */
    public int getUtilizationPct() {
        return utilizationPct;
    }

    /**
     * ����utilizationPct���Ե�ֵ��
     * 
     */
    public void setUtilizationPct(int value) {
        this.utilizationPct = value;
    }

}
