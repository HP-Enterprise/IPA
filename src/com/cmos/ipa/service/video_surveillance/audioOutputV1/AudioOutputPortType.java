package com.cmos.ipa.service.video_surveillance.audioOutputV1;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.6
 * 2016-05-12T18:18:03.710+08:00
 * Generated source version: 3.1.6
 * 
 */
@WebService(targetNamespace = "urn:schemas-pelco-com:service:AudioOutput:1", name = "AudioOutputPortType")
@XmlSeeAlso({ObjectFactory.class})
public interface AudioOutputPortType {

    /**
     * Terminates the streaming session indicated by sessionId. 
     * 			
     */
    @WebMethod(operationName = "Disconnect", action = "urn:schemas-pelco-com:service:AudioOutput:1#Disconnect")
    @RequestWrapper(localName = "Disconnect", targetNamespace = "urn:schemas-pelco-com:service:AudioOutput:1", className = "com.cmos.ipa.service.video_surveillance.audioOutputV1.Disconnect")
    @ResponseWrapper(localName = "DisconnectResponse", targetNamespace = "urn:schemas-pelco-com:service:AudioOutput:1", className = "com.cmos.ipa.service.video_surveillance.audioOutputV1.DisconnectResponse")
    public void disconnect(
            @WebParam(name = "sessionId", targetNamespace = "")
            String sessionId,
            @WebParam(mode = WebParam.Mode.INOUT, name = "asyncId", targetNamespace = "")
            javax.xml.ws.Holder<Integer> asyncId
    );

    /**
     * Initiates a streaming session with the 
     * 				urn:schemas-pelco-com:service:AudioOuput service indicated by 
     * 				outputURI containing the audio data indicated by streamParameters. 
     * 				The returned streamParameters will include URI of the 
     * 				urn:schemas-pelco-com:service:StreamControl service that should 
     * 				be used to control the session, the sessionId to be used when 
     * 				addressing the urn:schemas-pelco-com:service:StreamControl 
     * 				service, the URL to which the audio data will be streamed, the 
     * 				transport state of the stream, and the number of clients 
     * 				currently attached to this session.
     * 			
     */
    @WebMethod(operationName = "Connect", action = "urn:schemas-pelco-com:service:AudioOutput:1#Connect")
    @RequestWrapper(localName = "Connect", targetNamespace = "urn:schemas-pelco-com:service:AudioOutput:1", className = "com.cmos.ipa.service.video_surveillance.audioOutputV1.Connect")
    @ResponseWrapper(localName = "ConnectResponse", targetNamespace = "urn:schemas-pelco-com:service:AudioOutput:1", className = "com.cmos.ipa.service.video_surveillance.audioOutputV1.ConnectResponse")
    public void connect(
            @WebParam(mode = WebParam.Mode.INOUT, name = "streamParameters", targetNamespace = "")
            javax.xml.ws.Holder<StreamParameters> streamParameters,
            @WebParam(mode = WebParam.Mode.INOUT, name = "asyncId", targetNamespace = "")
            javax.xml.ws.Holder<Integer> asyncId
    );

    /**
     * Returns a catalog listing of audio data managed by the service 
     * 				instance that is available for streaming and matches the search 
     * 				criteria specified by streamQuery. 
     * 			
     */
    @WebMethod(operationName = "Query", action = "urn:schemas-pelco-com:service:AudioOutput:1#Query")
    @RequestWrapper(localName = "Query", targetNamespace = "urn:schemas-pelco-com:service:AudioOutput:1", className = "com.cmos.ipa.service.video_surveillance.audioOutputV1.Query")
    @ResponseWrapper(localName = "QueryResponse", targetNamespace = "urn:schemas-pelco-com:service:AudioOutput:1", className = "com.cmos.ipa.service.video_surveillance.audioOutputV1.QueryResponse")
    public void query(
            @WebParam(name = "streamQuery", targetNamespace = "")
            StreamQuery streamQuery,
            @WebParam(mode = WebParam.Mode.INOUT, name = "asyncId", targetNamespace = "")
            javax.xml.ws.Holder<Integer> asyncId,
            @WebParam(mode = WebParam.Mode.OUT, name = "streamCatalog", targetNamespace = "")
            javax.xml.ws.Holder<StreamCatalog> streamCatalog
    );

    /**
     * Returns a list of sessionIds for currently active sessions 
     * 				associated with the service instance.
     * 			
     */
    @WebMethod(operationName = "GetActiveSessionIds", action = "urn:schemas-pelco-com:service:AudioOutput:1#GetActiveSessionIds")
    @RequestWrapper(localName = "GetActiveSessionIds", targetNamespace = "urn:schemas-pelco-com:service:AudioOutput:1", className = "com.cmos.ipa.service.video_surveillance.audioOutputV1.GetActiveSessionIds")
    @ResponseWrapper(localName = "GetActiveSessionIdsResponse", targetNamespace = "urn:schemas-pelco-com:service:AudioOutput:1", className = "com.cmos.ipa.service.video_surveillance.audioOutputV1.GetActiveSessionIdsResponse")
    @WebResult(name = "sessionIds", targetNamespace = "")
    public Sessions getActiveSessionIds();

    /**
     * Returns the number of active sessions currently managed by the 
     * 				service instance as well as the maximum number of simultaneous 
     * 				sessions supported by the service instance.
     * 			
     */
    @WebMethod(operationName = "GetActiveSessions", action = "urn:schemas-pelco-com:service:AudioOutput:1#GetActiveSessions")
    @RequestWrapper(localName = "GetActiveSessions", targetNamespace = "urn:schemas-pelco-com:service:AudioOutput:1", className = "com.cmos.ipa.service.video_surveillance.audioOutputV1.GetActiveSessions")
    @ResponseWrapper(localName = "GetActiveSessionsResponse", targetNamespace = "urn:schemas-pelco-com:service:AudioOutput:1", className = "com.cmos.ipa.service.video_surveillance.audioOutputV1.GetActiveSessionsResponse")
    public void getActiveSessions(
            @WebParam(mode = WebParam.Mode.OUT, name = "activeSessions", targetNamespace = "")
            javax.xml.ws.Holder<Integer> activeSessions,
            @WebParam(mode = WebParam.Mode.OUT, name = "maxSessions", targetNamespace = "")
            javax.xml.ws.Holder<Integer> maxSessions
    );

    @WebMethod(operationName = "RefreshSession", action = "urn:schemas-pelco-com:service:AudioOutput:1#RefreshSession")
    @RequestWrapper(localName = "RefreshSession", targetNamespace = "urn:schemas-pelco-com:service:AudioOutput:1", className = "com.cmos.ipa.service.video_surveillance.audioOutputV1.RefreshSession")
    @ResponseWrapper(localName = "RefreshSessionResponse", targetNamespace = "urn:schemas-pelco-com:service:AudioOutput:1", className = "com.cmos.ipa.service.video_surveillance.audioOutputV1.RefreshSessionResponse")
    public void refreshSession(
            @WebParam(name = "sessionId", targetNamespace = "")
            String sessionId,
            @WebParam(name = "refreshInterval", targetNamespace = "")
            int refreshInterval
    );
}