
package com.cmos.ipa.service.video_surveillance.motionDetectionV1;

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
 *         &lt;element name="regionList" type="{urn:schemas-pelco-com:service:MotionDetection:1}MDRegionList"/&gt;
 *         &lt;element name="asyncId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
    "regionList",
    "asyncId"
})
@XmlRootElement(name = "GetMDRegionsResponse")
public class GetMDRegionsResponse {

    @XmlElement(required = true)
    protected MDRegionList regionList;
    protected Integer asyncId;

    /**
     * ��ȡregionList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.motionDetectionV1.MDRegionList }
     *     
     */
    public MDRegionList getRegionList() {
        return regionList;
    }

    /**
     * ����regionList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link com.cmos.ipa.service.video_surveillance.motionDetectionV1.MDRegionList }
     *     
     */
    public void setRegionList(MDRegionList value) {
        this.regionList = value;
    }

    /**
     * ��ȡasyncId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAsyncId() {
        return asyncId;
    }

    /**
     * ����asyncId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAsyncId(Integer value) {
        this.asyncId = value;
    }

}
