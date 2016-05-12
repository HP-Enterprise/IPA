
package com.cmos.ipa.service.video_surveillance.userAndRoleV1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.cmos.ipa.service.video_surveillance.userAndRoleV1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _UserName_QNAME = new QName("", "name");
    private final static QName _UserDbId_QNAME = new QName("", "dbId");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.cmos.ipa.service.video_surveillance.userAndRoleV1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.userAndRoleV1.UserLogin }
     * 
     */
    public UserLogin createUserLogin() {
        return new UserLogin();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.userAndRoleV1.User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.userAndRoleV1.Pswd }
     * 
     */
    public Pswd createPswd() {
        return new Pswd();
    }

    /**
     * Create an instance of {@link UserLoginResponse }
     * 
     */
    public UserLoginResponse createUserLoginResponse() {
        return new UserLoginResponse();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.userAndRoleV1.UserLogout }
     * 
     */
    public UserLogout createUserLogout() {
        return new UserLogout();
    }

    /**
     * Create an instance of {@link UserLogoutResponse }
     * 
     */
    public UserLogoutResponse createUserLogoutResponse() {
        return new UserLogoutResponse();
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "name", scope = User.class)
    public JAXBElement<String> createUserName(String value) {
        return new JAXBElement<String>(_UserName_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "dbId", scope = User.class)
    public JAXBElement<Integer> createUserDbId(Integer value) {
        return new JAXBElement<Integer>(_UserDbId_QNAME, Integer.class, User.class, value);
    }

}
