
package com.cmos.ipa.service.video_surveillance.lensControlV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="aovMax" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
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
    "aovMax"
})
@XmlRootElement(name = "GetMaxAOVResponse")
public class GetMaxAOVResponse {

    @XmlSchemaType(name = "unsignedInt")
    protected long aovMax;

    /**
     * 获取aovMax属性的值。
     * 
     */
    public long getAovMax() {
        return aovMax;
    }

    /**
     * 设置aovMax属性的值。
     * 
     */
    public void setAovMax(long value) {
        this.aovMax = value;
    }

}
