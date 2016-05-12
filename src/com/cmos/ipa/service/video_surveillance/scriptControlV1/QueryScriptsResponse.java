
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
 *         &lt;element name="scriptList" type="{urn:schemas-pelco-com:service:ScriptControl:1}ScriptList"/&gt;
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
    "scriptList"
})
@XmlRootElement(name = "QueryScriptsResponse")
public class QueryScriptsResponse {

    @XmlElement(required = true)
    protected ScriptList scriptList;

    /**
     * ��ȡscriptList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.scriptControlV1.ScriptList }
     *     
     */
    public ScriptList getScriptList() {
        return scriptList;
    }

    /**
     * ����scriptList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link com.cmos.ipa.service.video_surveillance.scriptControlV1.ScriptList }
     *     
     */
    public void setScriptList(ScriptList value) {
        this.scriptList = value;
    }

}
