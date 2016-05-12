
package com.cmos.ipa.service.video_surveillance.audioInputRtspV1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.cmos.ipa.service.video_surveillance.audioInputRtspV1 package. 
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

    private final static QName _SetChannelParametersResponse_QNAME = new QName("urn:schemas-pelco-com:service:AudioInputRtsp:1", "SetChannelParametersResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.cmos.ipa.service.video_surveillance.audioInputRtspV1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.audioInputRtspV1.SetEnabled }
     * 
     */
    public SetEnabled createSetEnabled() {
        return new SetEnabled();
    }

    /**
     * Create an instance of {@link SetEnabledResponse }
     * 
     */
    public SetEnabledResponse createSetEnabledResponse() {
        return new SetEnabledResponse();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.audioInputRtspV1.GetEnabled }
     * 
     */
    public GetEnabled createGetEnabled() {
        return new GetEnabled();
    }

    /**
     * Create an instance of {@link GetEnabledResponse }
     * 
     */
    public GetEnabledResponse createGetEnabledResponse() {
        return new GetEnabledResponse();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.audioInputRtspV1.Query }
     * 
     */
    public Query createQuery() {
        return new Query();
    }

    /**
     * Create an instance of {@link QueryResponse }
     * 
     */
    public QueryResponse createQueryResponse() {
        return new QueryResponse();
    }

    /**
     * Create an instance of {@link ChannelInfoList }
     * 
     */
    public ChannelInfoList createChannelInfoList() {
        return new ChannelInfoList();
    }

    /**
     * Create an instance of {@link SetChannelParameters }
     * 
     */
    public SetChannelParameters createSetChannelParameters() {
        return new SetChannelParameters();
    }

    /**
     * Create an instance of {@link AudioOutSettings }
     * 
     */
    public AudioOutSettings createAudioOutSettings() {
        return new AudioOutSettings();
    }

    /**
     * Create an instance of {@link GetChannelParameters }
     * 
     */
    public GetChannelParameters createGetChannelParameters() {
        return new GetChannelParameters();
    }

    /**
     * Create an instance of {@link GetChannelParametersResponse }
     * 
     */
    public GetChannelParametersResponse createGetChannelParametersResponse() {
        return new GetChannelParametersResponse();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.audioInputRtspV1.Connect }
     * 
     */
    public Connect createConnect() {
        return new Connect();
    }

    /**
     * Create an instance of {@link ConnectResponse }
     * 
     */
    public ConnectResponse createConnectResponse() {
        return new ConnectResponse();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.audioInputRtspV1.KeepAlive }
     * 
     */
    public KeepAlive createKeepAlive() {
        return new KeepAlive();
    }

    /**
     * Create an instance of {@link KeepAliveResponse }
     * 
     */
    public KeepAliveResponse createKeepAliveResponse() {
        return new KeepAliveResponse();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.audioInputRtspV1.Disconnect }
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
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.audioInputRtspV1.ChannelInfo }
     * 
     */
    public ChannelInfo createChannelInfo() {
        return new ChannelInfo();
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:schemas-pelco-com:service:AudioInputRtsp:1", name = "SetChannelParametersResponse")
    public JAXBElement<Object> createSetChannelParametersResponse(Object value) {
        return new JAXBElement<Object>(_SetChannelParametersResponse_QNAME, Object.class, null, value);
    }

}
