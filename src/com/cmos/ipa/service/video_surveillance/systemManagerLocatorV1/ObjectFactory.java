
package com.cmos.ipa.service.video_surveillance.systemManagerLocatorV1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.cmos.ipa.service.video_surveillance.systemManagerLocatorV1 package. 
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

    private final static QName _EvHeader_QNAME = new QName("urn:schemas-pelco-com:service:SystemManagerLocator:1", "evHeader");
    private final static QName _GetLocation_QNAME = new QName("urn:schemas-pelco-com:service:SystemManagerLocator:1", "GetLocation");
    private final static QName _GetLocationResponse_QNAME = new QName("urn:schemas-pelco-com:service:SystemManagerLocator:1", "GetLocationResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.cmos.ipa.service.video_surveillance.systemManagerLocatorV1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetLocationHeaderType }
     * 
     */
    public GetLocationHeaderType createGetLocationHeaderType() {
        return new GetLocationHeaderType();
    }

    /**
     * Create an instance of {@link GetLocationType }
     * 
     */
    public GetLocationType createGetLocationType() {
        return new GetLocationType();
    }

    /**
     * Create an instance of {@link GetLocationResponseType }
     * 
     */
    public GetLocationResponseType createGetLocationResponseType() {
        return new GetLocationResponseType();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.systemManagerLocatorV1.KeyType }
     * 
     */
    public KeyType createKeyType() {
        return new KeyType();
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link GetLocationHeaderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:schemas-pelco-com:service:SystemManagerLocator:1", name = "evHeader")
    public JAXBElement<GetLocationHeaderType> createEvHeader(GetLocationHeaderType value) {
        return new JAXBElement<GetLocationHeaderType>(_EvHeader_QNAME, GetLocationHeaderType.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link GetLocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:schemas-pelco-com:service:SystemManagerLocator:1", name = "GetLocation")
    public JAXBElement<GetLocationType> createGetLocation(GetLocationType value) {
        return new JAXBElement<GetLocationType>(_GetLocation_QNAME, GetLocationType.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link GetLocationResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:schemas-pelco-com:service:SystemManagerLocator:1", name = "GetLocationResponse")
    public JAXBElement<GetLocationResponseType> createGetLocationResponse(GetLocationResponseType value) {
        return new JAXBElement<GetLocationResponseType>(_GetLocationResponse_QNAME, GetLocationResponseType.class, null, value);
    }

}
