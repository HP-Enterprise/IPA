
package com.cmos.ipa.service.video_surveillance.scriptControlV1;

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
 *         &lt;element name="scriptQuery" type="{urn:schemas-pelco-com:service:ScriptControl:1}ScriptQuery"/&gt;
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
    "scriptQuery"
})
@XmlRootElement(name = "QueryScripts")
public class QueryScripts {

    @XmlElement(required = true)
    protected ScriptQuery scriptQuery;

    /**
     * ��ȡscriptQuery���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.scriptControlV1.ScriptQuery }
     *     
     */
    public ScriptQuery getScriptQuery() {
        return scriptQuery;
    }

    /**
     * ����scriptQuery���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link com.cmos.ipa.service.video_surveillance.scriptControlV1.ScriptQuery }
     *     
     */
    public void setScriptQuery(ScriptQuery value) {
        this.scriptQuery = value;
    }

}
