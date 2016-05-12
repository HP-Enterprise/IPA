
package com.cmos.ipa.service.video_surveillance.deviceRegistryV1;

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
 *         &lt;element name="stateDeltaSeqNum" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="page" type="{urn:schemas-pelco-com:service:DeviceRegistry:1}Page"/&gt;
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
    "stateDeltaSeqNum",
    "page"
})
@XmlRootElement(name = "GetDevicesResponse")
public class GetDevicesResponse {

    @XmlElement(required = true)
    protected String stateDeltaSeqNum;
    @XmlElement(required = true)
    protected Page page;

    /**
     * ��ȡstateDeltaSeqNum���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateDeltaSeqNum() {
        return stateDeltaSeqNum;
    }

    /**
     * ����stateDeltaSeqNum���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateDeltaSeqNum(String value) {
        this.stateDeltaSeqNum = value;
    }

    /**
     * ��ȡpage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.deviceRegistryV1.Page }
     *     
     */
    public Page getPage() {
        return page;
    }

    /**
     * ����page���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link com.cmos.ipa.service.video_surveillance.deviceRegistryV1.Page }
     *     
     */
    public void setPage(Page value) {
        this.page = value;
    }

}
