
package com.cmos.ipa.service.video_surveillance.streamDiscoveryV1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A list of ConnectionURL data elements.
 * 
 * <p>ConnectionList complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ConnectionList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="connectionURL" type="{urn:schemas-pelco-com:service:StreamDiscovery:1}ConnectionURL" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectionList", propOrder = {
    "connectionURL"
})
public class ConnectionList {

    protected List<ConnectionURL> connectionURL;

    /**
     * Gets the value of the connectionURL property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectionURL property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectionURL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link com.cmos.ipa.service.video_surveillance.streamDiscoveryV1.ConnectionURL }
     * 
     * 
     */
    public List<ConnectionURL> getConnectionURL() {
        if (connectionURL == null) {
            connectionURL = new ArrayList<ConnectionURL>();
        }
        return this.connectionURL;
    }

}
