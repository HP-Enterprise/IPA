
package com.cmos.ipa.service.video_surveillance.pelcoConfigurationV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 						A port supporting the SSDP protocol, along with
 * 						accompanying bit flags identifying the port usage.
 * 					
 * 
 * <p>SSDP complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SSDP"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;urn:schemas-pelco-com:service:PelcoConfiguration:1&gt;Port"&gt;
 *       &lt;attribute name="ttl" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SSDP")
public class SSDP
    extends Port
{

    @XmlAttribute(name = "ttl")
    protected Integer ttl;

    /**
     * ��ȡttl���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTtl() {
        return ttl;
    }

    /**
     * ����ttl���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTtl(Integer value) {
        this.ttl = value;
    }

}
