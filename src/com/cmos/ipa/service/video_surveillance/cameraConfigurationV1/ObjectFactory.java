
package com.cmos.ipa.service.video_surveillance.cameraConfigurationV1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.cmos.ipa.service.video_surveillance.cameraConfigurationV1 package. 
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

    private final static QName _VideoChannelFormat_QNAME = new QName("", "format");
    private final static QName _VideoPairName_QNAME = new QName("", "name");
    private final static QName _VideoPairPrimary_QNAME = new QName("", "primary");
    private final static QName _VideoPairSecondary_QNAME = new QName("", "secondary");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.cmos.ipa.service.video_surveillance.cameraConfigurationV1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.cameraConfigurationV1.CameraConfig }
     * 
     */
    public CameraConfig createCameraConfig() {
        return new CameraConfig();
    }

    /**
     * Create an instance of {@link GetConfiguration }
     * 
     */
    public GetConfiguration createGetConfiguration() {
        return new GetConfiguration();
    }

    /**
     * Create an instance of {@link GetConfigurationResponse }
     * 
     */
    public GetConfigurationResponse createGetConfigurationResponse() {
        return new GetConfigurationResponse();
    }

    /**
     * Create an instance of {@link SetConfiguration }
     * 
     */
    public SetConfiguration createSetConfiguration() {
        return new SetConfiguration();
    }

    /**
     * Create an instance of {@link SetConfigurationResponse }
     * 
     */
    public SetConfigurationResponse createSetConfigurationResponse() {
        return new SetConfigurationResponse();
    }

    /**
     * Create an instance of {@link ResetConfiguration }
     * 
     */
    public ResetConfiguration createResetConfiguration() {
        return new ResetConfiguration();
    }

    /**
     * Create an instance of {@link ResetConfigurationResponse }
     * 
     */
    public ResetConfigurationResponse createResetConfigurationResponse() {
        return new ResetConfigurationResponse();
    }

    /**
     * Create an instance of {@link ConfigurableInt }
     * 
     */
    public ConfigurableInt createConfigurableInt() {
        return new ConfigurableInt();
    }

    /**
     * Create an instance of {@link MaxUnicastType }
     * 
     */
    public MaxUnicastType createMaxUnicastType() {
        return new MaxUnicastType();
    }

    /**
     * Create an instance of {@link VideoProperties }
     * 
     */
    public VideoProperties createVideoProperties() {
        return new VideoProperties();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.cameraConfigurationV1.MVElement }
     * 
     */
    public MVElement createMVElement() {
        return new MVElement();
    }

    /**
     * Create an instance of {@link Distinguishers }
     * 
     */
    public Distinguishers createDistinguishers() {
        return new Distinguishers();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.cameraConfigurationV1.VideoPair }
     * 
     */
    public VideoPair createVideoPair() {
        return new VideoPair();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.cameraConfigurationV1.VideoChannel }
     * 
     */
    public VideoChannel createVideoChannel() {
        return new VideoChannel();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.cameraConfigurationV1.CameraConfig.VideoQuality }
     * 
     */
    public CameraConfig.VideoQuality createCameraConfigVideoQuality() {
        return new CameraConfig.VideoQuality();
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "format", scope = VideoChannel.class)
    public JAXBElement<String> createVideoChannelFormat(String value) {
        return new JAXBElement<String>(_VideoChannelFormat_QNAME, String.class, VideoChannel.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "name", scope = VideoPair.class)
    public JAXBElement<String> createVideoPairName(String value) {
        return new JAXBElement<String>(_VideoPairName_QNAME, String.class, VideoPair.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link com.cmos.ipa.service.video_surveillance.cameraConfigurationV1.VideoChannel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "primary", scope = VideoPair.class)
    public JAXBElement<VideoChannel> createVideoPairPrimary(VideoChannel value) {
        return new JAXBElement<VideoChannel>(_VideoPairPrimary_QNAME, VideoChannel.class, VideoPair.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link com.cmos.ipa.service.video_surveillance.cameraConfigurationV1.VideoChannel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "secondary", scope = VideoPair.class)
    public JAXBElement<VideoChannel> createVideoPairSecondary(VideoChannel value) {
        return new JAXBElement<VideoChannel>(_VideoPairSecondary_QNAME, VideoChannel.class, VideoPair.class, value);
    }

}
