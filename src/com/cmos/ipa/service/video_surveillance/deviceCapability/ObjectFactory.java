
package com.cmos.ipa.service.video_surveillance.deviceCapability;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.cmos.ipa.service.video_surveillance.deviceCapability package. 
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

    private final static QName _ProfileAlreadyExistFault_QNAME = new QName("urn:schemas-pelco-com:fault", "ProfileAlreadyExistFault");
    private final static QName _ProfileDoesNotExistFault_QNAME = new QName("urn:schemas-pelco-com:fault", "ProfileDoesNotExistFault");
    private final static QName _InvalidArgumentFault_QNAME = new QName("urn:schemas-pelco-com:fault", "InvalidArgumentFault");
    private final static QName _ActionNotSupportedFault_QNAME = new QName("urn:schemas-pelco-com:fault", "ActionNotSupportedFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.cmos.ipa.service.video_surveillance.deviceCapability
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StreamSetting }
     * 
     */
    public StreamSetting createStreamSetting() {
        return new StreamSetting();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.deviceCapability.Capability }
     * 
     */
    public Capability createCapability() {
        return new Capability();
    }

    /**
     * Create an instance of {@link ProfileAlreadyExistFaultType }
     * 
     */
    public ProfileAlreadyExistFaultType createProfileAlreadyExistFaultType() {
        return new ProfileAlreadyExistFaultType();
    }

    /**
     * Create an instance of {@link ProfileDoesNotExistFaultType }
     * 
     */
    public ProfileDoesNotExistFaultType createProfileDoesNotExistFaultType() {
        return new ProfileDoesNotExistFaultType();
    }

    /**
     * Create an instance of {@link InvalidArgumentFaultType }
     * 
     */
    public InvalidArgumentFaultType createInvalidArgumentFaultType() {
        return new InvalidArgumentFaultType();
    }

    /**
     * Create an instance of {@link ActionNotSupportedFaultType }
     * 
     */
    public ActionNotSupportedFaultType createActionNotSupportedFaultType() {
        return new ActionNotSupportedFaultType();
    }

    /**
     * Create an instance of {@link GetDeviceCapability }
     * 
     */
    public GetDeviceCapability createGetDeviceCapability() {
        return new GetDeviceCapability();
    }

    /**
     * Create an instance of {@link GetDeviceCapabilityResponse }
     * 
     */
    public GetDeviceCapabilityResponse createGetDeviceCapabilityResponse() {
        return new GetDeviceCapabilityResponse();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.deviceCapability.GetServices }
     * 
     */
    public GetServices createGetServices() {
        return new GetServices();
    }

    /**
     * Create an instance of {@link GetServicesResponse }
     * 
     */
    public GetServicesResponse createGetServicesResponse() {
        return new GetServicesResponse();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.deviceCapability.Services }
     * 
     */
    public Services createServices() {
        return new Services();
    }

    /**
     * Create an instance of {@link GetPrimaryStreamCapabilities }
     * 
     */
    public GetPrimaryStreamCapabilities createGetPrimaryStreamCapabilities() {
        return new GetPrimaryStreamCapabilities();
    }

    /**
     * Create an instance of {@link GetPrimaryStreamCapabilitiesResponse }
     * 
     */
    public GetPrimaryStreamCapabilitiesResponse createGetPrimaryStreamCapabilitiesResponse() {
        return new GetPrimaryStreamCapabilitiesResponse();
    }

    /**
     * Create an instance of {@link StreamConfiguration }
     * 
     */
    public StreamConfiguration createStreamConfiguration() {
        return new StreamConfiguration();
    }

    /**
     * Create an instance of {@link GetSecondaryStreamCapabilities }
     * 
     */
    public GetSecondaryStreamCapabilities createGetSecondaryStreamCapabilities() {
        return new GetSecondaryStreamCapabilities();
    }

    /**
     * Create an instance of {@link GetSecondaryStreamCapabilitiesResponse }
     * 
     */
    public GetSecondaryStreamCapabilitiesResponse createGetSecondaryStreamCapabilitiesResponse() {
        return new GetSecondaryStreamCapabilitiesResponse();
    }

    /**
     * Create an instance of {@link GetStreamConfigurations }
     * 
     */
    public GetStreamConfigurations createGetStreamConfigurations() {
        return new GetStreamConfigurations();
    }

    /**
     * Create an instance of {@link GetStreamConfigurationsResponse }
     * 
     */
    public GetStreamConfigurationsResponse createGetStreamConfigurationsResponse() {
        return new GetStreamConfigurationsResponse();
    }

    /**
     * Create an instance of {@link GetRecommendedStreamConfiguration }
     * 
     */
    public GetRecommendedStreamConfiguration createGetRecommendedStreamConfiguration() {
        return new GetRecommendedStreamConfiguration();
    }

    /**
     * Create an instance of {@link ServiceNamespaces }
     * 
     */
    public ServiceNamespaces createServiceNamespaces() {
        return new ServiceNamespaces();
    }

    /**
     * Create an instance of {@link GetRecommendedStreamConfigurationResponse }
     * 
     */
    public GetRecommendedStreamConfigurationResponse createGetRecommendedStreamConfigurationResponse() {
        return new GetRecommendedStreamConfigurationResponse();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.deviceCapability.Service }
     * 
     */
    public Service createService() {
        return new Service();
    }

    /**
     * Create an instance of {@link CompressionFormats }
     * 
     */
    public CompressionFormats createCompressionFormats() {
        return new CompressionFormats();
    }

    /**
     * Create an instance of {@link AvailableStream }
     * 
     */
    public AvailableStream createAvailableStream() {
        return new AvailableStream();
    }

    /**
     * Create an instance of {@link AvailableStreams }
     * 
     */
    public AvailableStreams createAvailableStreams() {
        return new AvailableStreams();
    }

    /**
     * Create an instance of {@link PTZCapability }
     * 
     */
    public PTZCapability createPTZCapability() {
        return new PTZCapability();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.deviceCapability.Resolution }
     * 
     */
    public Resolution createResolution() {
        return new Resolution();
    }

    /**
     * Create an instance of {@link EnabledElement }
     * 
     */
    public EnabledElement createEnabledElement() {
        return new EnabledElement();
    }

    /**
     * Create an instance of {@link StreamSetting.EnduraSigning }
     * 
     */
    public StreamSetting.EnduraSigning createStreamSettingEnduraSigning() {
        return new StreamSetting.EnduraSigning();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.deviceCapability.Capability.AudioIn }
     * 
     */
    public Capability.AudioIn createCapabilityAudioIn() {
        return new Capability.AudioIn();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.deviceCapability.Capability.AudioOut }
     * 
     */
    public Capability.AudioOut createCapabilityAudioOut() {
        return new Capability.AudioOut();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.deviceCapability.Capability.Alarms }
     * 
     */
    public Capability.Alarms createCapabilityAlarms() {
        return new Capability.Alarms();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.deviceCapability.Capability.Relays }
     * 
     */
    public Capability.Relays createCapabilityRelays() {
        return new Capability.Relays();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.deviceCapability.Capability.SerialPorts }
     * 
     */
    public Capability.SerialPorts createCapabilitySerialPorts() {
        return new Capability.SerialPorts();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.deviceCapability.Capability.VideoSources }
     * 
     */
    public Capability.VideoSources createCapabilityVideoSources() {
        return new Capability.VideoSources();
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link ProfileAlreadyExistFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:schemas-pelco-com:fault", name = "ProfileAlreadyExistFault")
    public JAXBElement<ProfileAlreadyExistFaultType> createProfileAlreadyExistFault(ProfileAlreadyExistFaultType value) {
        return new JAXBElement<ProfileAlreadyExistFaultType>(_ProfileAlreadyExistFault_QNAME, ProfileAlreadyExistFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link ProfileDoesNotExistFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:schemas-pelco-com:fault", name = "ProfileDoesNotExistFault")
    public JAXBElement<ProfileDoesNotExistFaultType> createProfileDoesNotExistFault(ProfileDoesNotExistFaultType value) {
        return new JAXBElement<ProfileDoesNotExistFaultType>(_ProfileDoesNotExistFault_QNAME, ProfileDoesNotExistFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link InvalidArgumentFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:schemas-pelco-com:fault", name = "InvalidArgumentFault")
    public JAXBElement<InvalidArgumentFaultType> createInvalidArgumentFault(InvalidArgumentFaultType value) {
        return new JAXBElement<InvalidArgumentFaultType>(_InvalidArgumentFault_QNAME, InvalidArgumentFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link ActionNotSupportedFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:schemas-pelco-com:fault", name = "ActionNotSupportedFault")
    public JAXBElement<ActionNotSupportedFaultType> createActionNotSupportedFault(ActionNotSupportedFaultType value) {
        return new JAXBElement<ActionNotSupportedFaultType>(_ActionNotSupportedFault_QNAME, ActionNotSupportedFaultType.class, null, value);
    }

}
