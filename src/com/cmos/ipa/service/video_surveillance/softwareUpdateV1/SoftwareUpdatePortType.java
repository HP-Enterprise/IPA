package com.cmos.ipa.service.video_surveillance.softwareUpdateV1;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.6
 * 2016-05-12T18:18:40.473+08:00
 * Generated source version: 3.1.6
 * 
 */
@WebService(targetNamespace = "urn:schemas-pelco-com:service:SoftwareUpdate:1", name = "SoftwareUpdatePortType")
@XmlSeeAlso({ObjectFactory.class})
public interface SoftwareUpdatePortType {

    /**
     * Returns the model name, version, and so forth, of the device.
     *       
     */
    @WebMethod(operationName = "GetModules", action = "urn:schemas-pelco-com:service:SoftwareUpdate:1#GetModules")
    @RequestWrapper(localName = "GetModules", targetNamespace = "urn:schemas-pelco-com:service:SoftwareUpdate:1", className = "com.cmos.ipa.service.video_surveillance.softwareUpdateV1.GetModules")
    @ResponseWrapper(localName = "GetModulesResponse", targetNamespace = "urn:schemas-pelco-com:service:SoftwareUpdate:1", className = "com.cmos.ipa.service.video_surveillance.softwareUpdateV1.GetModulesResponse")
    @WebResult(name = "moduleCatalog", targetNamespace = "")
    public ModuleCatalog getModules();
}
