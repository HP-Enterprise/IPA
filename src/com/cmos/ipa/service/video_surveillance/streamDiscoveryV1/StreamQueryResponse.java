
package com.cmos.ipa.service.video_surveillance.streamDiscoveryV1;

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
 *         &lt;element name="connectionList" type="{urn:schemas-pelco-com:service:StreamDiscovery:1}ConnectionList"/&gt;
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
    "connectionList"
})
@XmlRootElement(name = "StreamQueryResponse")
public class StreamQueryResponse {

    @XmlElement(required = true)
    protected ConnectionList connectionList;

    /**
     * ��ȡconnectionList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.streamDiscoveryV1.ConnectionList }
     *     
     */
    public ConnectionList getConnectionList() {
        return connectionList;
    }

    /**
     * ����connectionList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link com.cmos.ipa.service.video_surveillance.streamDiscoveryV1.ConnectionList }
     *     
     */
    public void setConnectionList(ConnectionList value) {
        this.connectionList = value;
    }

}
