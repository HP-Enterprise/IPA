
package com.cmos.ipa.service.video_surveillance.softwareUpdateV1;

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
 *         &lt;element name="moduleCatalog" type="{urn:schemas-pelco-com:service:SoftwareUpdate:1}ModuleCatalog"/&gt;
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
    "moduleCatalog"
})
@XmlRootElement(name = "GetModulesResponse")
public class GetModulesResponse {

    @XmlElement(required = true)
    protected ModuleCatalog moduleCatalog;

    /**
     * ��ȡmoduleCatalog���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.softwareUpdateV1.ModuleCatalog }
     *     
     */
    public ModuleCatalog getModuleCatalog() {
        return moduleCatalog;
    }

    /**
     * ����moduleCatalog���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link com.cmos.ipa.service.video_surveillance.softwareUpdateV1.ModuleCatalog }
     *     
     */
    public void setModuleCatalog(ModuleCatalog value) {
        this.moduleCatalog = value;
    }

}
