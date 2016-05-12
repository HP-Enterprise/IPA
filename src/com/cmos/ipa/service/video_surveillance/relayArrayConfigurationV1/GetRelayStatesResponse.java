
package com.cmos.ipa.service.video_surveillance.relayArrayConfigurationV1;

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
 *         &lt;element name="relayStates" type="{urn:schemas-pelco-com:service:RelayArrayConfiguration:1}RelayStates"/&gt;
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
    "relayStates"
})
@XmlRootElement(name = "GetRelayStatesResponse")
public class GetRelayStatesResponse {

    @XmlElement(required = true)
    protected RelayStates relayStates;

    /**
     * ��ȡrelayStates���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.relayArrayConfigurationV1.RelayStates }
     *     
     */
    public RelayStates getRelayStates() {
        return relayStates;
    }

    /**
     * ����relayStates���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link com.cmos.ipa.service.video_surveillance.relayArrayConfigurationV1.RelayStates }
     *     
     */
    public void setRelayStates(RelayStates value) {
        this.relayStates = value;
    }

}
