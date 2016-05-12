
package com.cmos.ipa.service.video_surveillance.userAndRoleV1;

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
 *         &lt;element name="user" type="{urn:schemas-pelco-com:service:UserAndRole:1}User"/&gt;
 *         &lt;element name="pswd" type="{urn:schemas-pelco-com:service:UserAndRole:1}Pswd"/&gt;
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
    "user",
    "pswd"
})
@XmlRootElement(name = "UserLogin")
public class UserLogin {

    @XmlElement(required = true)
    protected User user;
    @XmlElement(required = true)
    protected Pswd pswd;

    /**
     * ��ȡuser���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.userAndRoleV1.User }
     *     
     */
    public User getUser() {
        return user;
    }

    /**
     * ����user���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link com.cmos.ipa.service.video_surveillance.userAndRoleV1.User }
     *     
     */
    public void setUser(User value) {
        this.user = value;
    }

    /**
     * ��ȡpswd���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.userAndRoleV1.Pswd }
     *     
     */
    public Pswd getPswd() {
        return pswd;
    }

    /**
     * ����pswd���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link com.cmos.ipa.service.video_surveillance.userAndRoleV1.Pswd }
     *     
     */
    public void setPswd(Pswd value) {
        this.pswd = value;
    }

}
