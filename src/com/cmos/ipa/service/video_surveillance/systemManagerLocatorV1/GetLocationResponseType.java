
package com.cmos.ipa.service.video_surveillance.systemManagerLocatorV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetLocationResponseType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="GetLocationResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="port" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="key" type="{urn:schemas-pelco-com:service:SystemManagerLocator:1}KeyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetLocationResponseType", propOrder = {
    "address",
    "port",
    "key"
})
public class GetLocationResponseType {

    @XmlElement(required = true)
    protected String address;
    protected int port;
    @XmlElement(required = true)
    protected KeyType key;

    /**
     * ��ȡaddress���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * ����address���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * ��ȡport���Ե�ֵ��
     * 
     */
    public int getPort() {
        return port;
    }

    /**
     * ����port���Ե�ֵ��
     * 
     */
    public void setPort(int value) {
        this.port = value;
    }

    /**
     * ��ȡkey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.systemManagerLocatorV1.KeyType }
     *     
     */
    public KeyType getKey() {
        return key;
    }

    /**
     * ����key���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link com.cmos.ipa.service.video_surveillance.systemManagerLocatorV1.KeyType }
     *     
     */
    public void setKey(KeyType value) {
        this.key = value;
    }

}
