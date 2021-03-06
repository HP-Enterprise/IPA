package com.cmos.ipa.service.video_surveillance.streamDiscoveryV1;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This API provides a simple way to find the streams on a camera. Querying this API will return the url that can be used to connect to the stream. Connecting to each stream is left to the protocol for each stream type (e.g. RTSP). This service is only valid for the Sarix product line.
 *
 * This class was generated by Apache CXF 3.1.6
 * 2016-05-12T18:18:48.798+08:00
 * Generated source version: 3.1.6
 * 
 */
@WebServiceClient(name = "StreamDiscovery", 
                  wsdlLocation = "file:wsdl/StreamDiscoveryV1.wsdl",
                  targetNamespace = "urn:schemas-pelco-com:service:StreamDiscovery:1") 
public class StreamDiscovery extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("urn:schemas-pelco-com:service:StreamDiscovery:1", "StreamDiscovery");
    public final static QName StreamDiscovery = new QName("urn:schemas-pelco-com:service:StreamDiscovery:1", "StreamDiscovery");
    static {
        URL url = null;
        try {
            url = new URL("file:wsdl/StreamDiscoveryV1.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(StreamDiscovery.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:a/StreamDiscoveryV1.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public StreamDiscovery(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public StreamDiscovery(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public StreamDiscovery() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public StreamDiscovery(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public StreamDiscovery(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public StreamDiscovery(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns StreamDiscoveryPortType
     */
    @WebEndpoint(name = "StreamDiscovery")
    public StreamDiscoveryPortType getStreamDiscovery() {
        return super.getPort(StreamDiscovery, StreamDiscoveryPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns StreamDiscoveryPortType
     */
    @WebEndpoint(name = "StreamDiscovery")
    public StreamDiscoveryPortType getStreamDiscovery(WebServiceFeature... features) {
        return super.getPort(StreamDiscovery, StreamDiscoveryPortType.class, features);
    }

}
