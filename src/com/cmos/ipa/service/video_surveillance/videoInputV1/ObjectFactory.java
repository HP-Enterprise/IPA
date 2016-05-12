
package com.cmos.ipa.service.video_surveillance.videoInputV1;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.cmos.ipa.service.video_surveillance.videoInputV1 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.cmos.ipa.service.video_surveillance.videoInputV1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.videoInputV1.Connect }
     * 
     */
    public Connect createConnect() {
        return new Connect();
    }

    /**
     * Create an instance of {@link StreamParameters }
     * 
     */
    public StreamParameters createStreamParameters() {
        return new StreamParameters();
    }

    /**
     * Create an instance of {@link ConnectResponse }
     * 
     */
    public ConnectResponse createConnectResponse() {
        return new ConnectResponse();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.videoInputV1.Disconnect }
     * 
     */
    public Disconnect createDisconnect() {
        return new Disconnect();
    }

    /**
     * Create an instance of {@link DisconnectResponse }
     * 
     */
    public DisconnectResponse createDisconnectResponse() {
        return new DisconnectResponse();
    }

    /**
     * Create an instance of {@link GetActiveSessions }
     * 
     */
    public GetActiveSessions createGetActiveSessions() {
        return new GetActiveSessions();
    }

    /**
     * Create an instance of {@link GetActiveSessionsResponse }
     * 
     */
    public GetActiveSessionsResponse createGetActiveSessionsResponse() {
        return new GetActiveSessionsResponse();
    }

    /**
     * Create an instance of {@link GetActiveSessionIds }
     * 
     */
    public GetActiveSessionIds createGetActiveSessionIds() {
        return new GetActiveSessionIds();
    }

    /**
     * Create an instance of {@link GetActiveSessionIdsResponse }
     * 
     */
    public GetActiveSessionIdsResponse createGetActiveSessionIdsResponse() {
        return new GetActiveSessionIdsResponse();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.videoInputV1.SessionList }
     * 
     */
    public SessionList createSessionList() {
        return new SessionList();
    }

    /**
     * Create an instance of {@link GetSessionParameters }
     * 
     */
    public GetSessionParameters createGetSessionParameters() {
        return new GetSessionParameters();
    }

    /**
     * Create an instance of {@link GetSessionParametersResponse }
     * 
     */
    public GetSessionParametersResponse createGetSessionParametersResponse() {
        return new GetSessionParametersResponse();
    }

    /**
     * Create an instance of {@link StreamSession }
     * 
     */
    public StreamSession createStreamSession() {
        return new StreamSession();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.videoInputV1.Resolution }
     * 
     */
    public Resolution createResolution() {
        return new Resolution();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.videoInputV1.Compatibility }
     * 
     */
    public Compatibility createCompatibility() {
        return new Compatibility();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.videoInputV1.VideoQuality }
     * 
     */
    public VideoQuality createVideoQuality() {
        return new VideoQuality();
    }

}
