
package com.cmos.ipa.service.video_surveillance.streamDiscoveryV1;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.cmos.ipa.service.video_surveillance.streamDiscoveryV1 package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.cmos.ipa.service.video_surveillance.streamDiscoveryV1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.streamDiscoveryV1.StreamQuery }
     * 
     */
    public StreamQuery createStreamQuery() {
        return new StreamQuery();
    }

    /**
     * Create an instance of {@link StreamQueryResponse }
     * 
     */
    public StreamQueryResponse createStreamQueryResponse() {
        return new StreamQueryResponse();
    }

    /**
     * Create an instance of {@link ConnectionList }
     * 
     */
    public ConnectionList createConnectionList() {
        return new ConnectionList();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.streamDiscoveryV1.StreamID }
     * 
     */
    public StreamID createStreamID() {
        return new StreamID();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.streamDiscoveryV1.ConnectionURL }
     * 
     */
    public ConnectionURL createConnectionURL() {
        return new ConnectionURL();
    }

}
