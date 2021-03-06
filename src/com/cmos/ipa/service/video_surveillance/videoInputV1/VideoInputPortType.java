package com.cmos.ipa.service.video_surveillance.videoInputV1;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.6
 * 2016-05-12T18:18:59.747+08:00
 * Generated source version: 3.1.6
 * 
 */
@WebService(targetNamespace = "urn:schemas-pelco-com:service:VideoInput:1", name = "VideoInputPortType")
@XmlSeeAlso({ObjectFactory.class})
public interface VideoInputPortType {

    /**
     * Returns a list of sessionIds for currently active sessions associated with the service instance.
     */
    @WebMethod(operationName = "GetActiveSessionIds", action = "urn:schemas-pelco-com:service:VideoInput:1#GetActiveSessionIds")
    @RequestWrapper(localName = "GetActiveSessionIds", targetNamespace = "urn:schemas-pelco-com:service:VideoInput:1", className = "com.cmos.ipa.service.video_surveillance.videoInputV1.GetActiveSessionIds")
    @ResponseWrapper(localName = "GetActiveSessionIdsResponse", targetNamespace = "urn:schemas-pelco-com:service:VideoInput:1", className = "com.cmos.ipa.service.video_surveillance.videoInputV1.GetActiveSessionIdsResponse")
    @WebResult(name = "sessionIds", targetNamespace = "")
    public SessionList getActiveSessionIds();

    /**
     * Terminates the streaming session indicated by sessionId.
     */
    @WebMethod(operationName = "Disconnect", action = "urn:schemas-pelco-com:service:VideoInput:1#Disconnect")
    @RequestWrapper(localName = "Disconnect", targetNamespace = "urn:schemas-pelco-com:service:VideoInput:1", className = "com.cmos.ipa.service.video_surveillance.videoInputV1.Disconnect")
    @ResponseWrapper(localName = "DisconnectResponse", targetNamespace = "urn:schemas-pelco-com:service:VideoInput:1", className = "com.cmos.ipa.service.video_surveillance.videoInputV1.DisconnectResponse")
    public void disconnect(
            @WebParam(name = "sessionId", targetNamespace = "")
            String sessionId
    );

    /**
     * Returns the number of active sessions currently managed by the service instance as well as the maximum number of simultaneous sessions supported by the service instance.
     */
    @WebMethod(operationName = "GetActiveSessions", action = "urn:schemas-pelco-com:service:VideoInput:1#GetActiveSessions")
    @RequestWrapper(localName = "GetActiveSessions", targetNamespace = "urn:schemas-pelco-com:service:VideoInput:1", className = "com.cmos.ipa.service.video_surveillance.videoInputV1.GetActiveSessions")
    @ResponseWrapper(localName = "GetActiveSessionsResponse", targetNamespace = "urn:schemas-pelco-com:service:VideoInput:1", className = "com.cmos.ipa.service.video_surveillance.videoInputV1.GetActiveSessionsResponse")
    public void getActiveSessions(
            @WebParam(mode = WebParam.Mode.OUT, name = "activeSessions", targetNamespace = "")
            javax.xml.ws.Holder<Integer> activeSessions,
            @WebParam(mode = WebParam.Mode.OUT, name = "maxSessions", targetNamespace = "")
            javax.xml.ws.Holder<Integer> maxSessions
    );

    /**
     * Returns the parameters associated with the session indicated by sessionId.
     */
    @WebMethod(operationName = "GetSessionParameters", action = "urn:schemas-pelco-com:service:VideoInput:1#GetSessionParameters")
    @RequestWrapper(localName = "GetSessionParameters", targetNamespace = "urn:schemas-pelco-com:service:VideoInput:1", className = "com.cmos.ipa.service.video_surveillance.videoInputV1.GetSessionParameters")
    @ResponseWrapper(localName = "GetSessionParametersResponse", targetNamespace = "urn:schemas-pelco-com:service:VideoInput:1", className = "com.cmos.ipa.service.video_surveillance.videoInputV1.GetSessionParametersResponse")
    @WebResult(name = "streamParameters", targetNamespace = "")
    public StreamParameters getSessionParameters(
            @WebParam(name = "sessionId", targetNamespace = "")
            String sessionId
    );

    /**
     * Initiates a streaming session with the VideoOuput service indicated by outputURI containing the video data indicated by streamParameters. 
     */
    @WebMethod(operationName = "Connect", action = "urn:schemas-pelco-com:service:VideoInput:1#Connect")
    @RequestWrapper(localName = "Connect", targetNamespace = "urn:schemas-pelco-com:service:VideoInput:1", className = "com.cmos.ipa.service.video_surveillance.videoInputV1.Connect")
    @ResponseWrapper(localName = "ConnectResponse", targetNamespace = "urn:schemas-pelco-com:service:VideoInput:1", className = "com.cmos.ipa.service.video_surveillance.videoInputV1.ConnectResponse")
    public void connect(
            @WebParam(mode = WebParam.Mode.INOUT, name = "streamParameters", targetNamespace = "")
            javax.xml.ws.Holder<StreamParameters> streamParameters
    );
}
