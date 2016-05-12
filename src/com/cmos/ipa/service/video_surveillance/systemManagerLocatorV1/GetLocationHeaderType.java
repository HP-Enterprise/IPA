
package com.cmos.ipa.service.video_surveillance.systemManagerLocatorV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetLocationHeaderType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetLocationHeaderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="userID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="UCN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetLocationHeaderType", propOrder = {
    "userID",
    "ucn"
})
public class GetLocationHeaderType {

    protected int userID;
    @XmlElement(name = "UCN", required = true)
    protected String ucn;

    /**
     * 获取userID属性的值。
     * 
     */
    public int getUserID() {
        return userID;
    }

    /**
     * 设置userID属性的值。
     * 
     */
    public void setUserID(int value) {
        this.userID = value;
    }

    /**
     * 获取ucn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUCN() {
        return ucn;
    }

    /**
     * 设置ucn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUCN(String value) {
        this.ucn = value;
    }

}
