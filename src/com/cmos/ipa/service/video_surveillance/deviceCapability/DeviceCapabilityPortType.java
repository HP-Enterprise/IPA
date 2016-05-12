package com.cmos.ipa.service.video_surveillance.deviceCapability;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.6
 * 2016-05-12T18:18:09.651+08:00
 * Generated source version: 3.1.6
 * 
 */
@WebService(targetNamespace = "http://www.pelco.com/api/DeviceCapability/1", name = "DeviceCapabilityPortType")
@XmlSeeAlso({ObjectFactory.class})
public interface DeviceCapabilityPortType {

    @WebMethod(operationName = "GetPrimaryStreamCapabilities", action = "http://www.pelco.com/api/DeviceCapability/1/GetPrimaryStreamCapabilities")
    @RequestWrapper(localName = "GetPrimaryStreamCapabilities", targetNamespace = "http://www.pelco.com/api/DeviceCapability/1", className = "com.cmos.ipa.service.video_surveillance.deviceCapability.GetPrimaryStreamCapabilities")
    @ResponseWrapper(localName = "GetPrimaryStreamCapabilitiesResponse", targetNamespace = "http://www.pelco.com/api/DeviceCapability/1", className = "com.cmos.ipa.service.video_surveillance.deviceCapability.GetPrimaryStreamCapabilitiesResponse")
    @WebResult(name = "StreamConfiguration", targetNamespace = "")
    public StreamConfiguration getPrimaryStreamCapabilities(
            @WebParam(name = "CompressionFormat", targetNamespace = "")
            CompressionFormat compressionFormat
    ) throws InvalidArgumentFault, ActionNotSupportedFault;

    @WebMethod(operationName = "GetSecondaryStreamCapabilities", action = "http://www.pelco.com/api/DeviceCapability/1/GetSecondaryStreamCapabilities")
    @RequestWrapper(localName = "GetSecondaryStreamCapabilities", targetNamespace = "http://www.pelco.com/api/DeviceCapability/1", className = "com.cmos.ipa.service.video_surveillance.deviceCapability.GetSecondaryStreamCapabilities")
    @ResponseWrapper(localName = "GetSecondaryStreamCapabilitiesResponse", targetNamespace = "http://www.pelco.com/api/DeviceCapability/1", className = "com.cmos.ipa.service.video_surveillance.deviceCapability.GetSecondaryStreamCapabilitiesResponse")
    @WebResult(name = "StreamSetting", targetNamespace = "")
    public StreamSetting getSecondaryStreamCapabilities(
            @WebParam(name = "CompressionFormat", targetNamespace = "")
            CompressionFormat compressionFormat
    ) throws InvalidArgumentFault, ActionNotSupportedFault;

    @WebMethod(operationName = "GetDeviceCapability", action = "http://www.pelco.com/api/DeviceCapability/1/GetDeviceCapability")
    @RequestWrapper(localName = "GetDeviceCapability", targetNamespace = "http://www.pelco.com/api/DeviceCapability/1", className = "com.cmos.ipa.service.video_surveillance.deviceCapability.GetDeviceCapability")
    @ResponseWrapper(localName = "GetDeviceCapabilityResponse", targetNamespace = "http://www.pelco.com/api/DeviceCapability/1", className = "com.cmos.ipa.service.video_surveillance.deviceCapability.GetDeviceCapabilityResponse")
    @WebResult(name = "Capability", targetNamespace = "")
    public Capability getDeviceCapability() throws ActionNotSupportedFault;

    @WebMethod(operationName = "GetStreamConfigurations", action = "http://www.pelco.com/api/DeviceCapability/1/GetStreamConfigurations")
    @RequestWrapper(localName = "GetStreamConfigurations", targetNamespace = "http://www.pelco.com/api/DeviceCapability/1", className = "com.cmos.ipa.service.video_surveillance.deviceCapability.GetStreamConfigurations")
    @ResponseWrapper(localName = "GetStreamConfigurationsResponse", targetNamespace = "http://www.pelco.com/api/DeviceCapability/1", className = "com.cmos.ipa.service.video_surveillance.deviceCapability.GetStreamConfigurationsResponse")
    @WebResult(name = "StreamConfiguration", targetNamespace = "")
    public StreamConfiguration getStreamConfigurations() throws ActionNotSupportedFault;

    @WebMethod(operationName = "GetServices", action = "http://www.pelco.com/api/DeviceCapability/1/GetServices")
    @RequestWrapper(localName = "GetServices", targetNamespace = "http://www.pelco.com/api/DeviceCapability/1", className = "com.cmos.ipa.service.video_surveillance.deviceCapability.GetServices")
    @ResponseWrapper(localName = "GetServicesResponse", targetNamespace = "http://www.pelco.com/api/DeviceCapability/1", className = "com.cmos.ipa.service.video_surveillance.deviceCapability.GetServicesResponse")
    @WebResult(name = "Services", targetNamespace = "")
    public Services getServices() throws ActionNotSupportedFault;

    @WebMethod(operationName = "GetRecommendedStreamConfiguration", action = "http://www.pelco.com/api/DeviceCapability/1/GetRecommendedStreamConfiguration")
    @RequestWrapper(localName = "GetRecommendedStreamConfiguration", targetNamespace = "http://www.pelco.com/api/DeviceCapability/1", className = "com.cmos.ipa.service.video_surveillance.deviceCapability.GetRecommendedStreamConfiguration")
    @ResponseWrapper(localName = "GetRecommendedStreamConfigurationResponse", targetNamespace = "http://www.pelco.com/api/DeviceCapability/1", className = "com.cmos.ipa.service.video_surveillance.deviceCapability.GetRecommendedStreamConfigurationResponse")
    @WebResult(name = "StreamConfiguration", targetNamespace = "")
    public StreamConfiguration getRecommendedStreamConfiguration(
            @WebParam(name = "ServiceNamespaces", targetNamespace = "")
            ServiceNamespaces serviceNamespaces
    ) throws InvalidArgumentFault, ActionNotSupportedFault;
}