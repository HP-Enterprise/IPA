package com.cmos.ipa.service.video_surveillance.scriptControlV1;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This service allows clients to control scripts, presets, and patterns.
 * 		
 *
 * This class was generated by Apache CXF 3.1.6
 * 2016-05-12T18:18:37.934+08:00
 * Generated source version: 3.1.6
 * 
 */
@WebServiceClient(name = "ScriptControl", 
                  wsdlLocation = "file:wsdl/ScriptControlV1.wsdl",
                  targetNamespace = "urn:schemas-pelco-com:service:ScriptControl:1") 
public class ScriptControl extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("urn:schemas-pelco-com:service:ScriptControl:1", "ScriptControl");
    public final static QName ScriptControl = new QName("urn:schemas-pelco-com:service:ScriptControl:1", "ScriptControl");
    static {
        URL url = null;
        try {
            url = new URL("file:wsdl/ScriptControlV1.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ScriptControl.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:a/ScriptControlV1.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ScriptControl(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ScriptControl(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ScriptControl() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public ScriptControl(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public ScriptControl(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public ScriptControl(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns ScriptControlPortType
     */
    @WebEndpoint(name = "ScriptControl")
    public ScriptControlPortType getScriptControl() {
        return super.getPort(ScriptControl, ScriptControlPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ScriptControlPortType
     */
    @WebEndpoint(name = "ScriptControl")
    public ScriptControlPortType getScriptControl(WebServiceFeature... features) {
        return super.getPort(ScriptControl, ScriptControlPortType.class, features);
    }

}
