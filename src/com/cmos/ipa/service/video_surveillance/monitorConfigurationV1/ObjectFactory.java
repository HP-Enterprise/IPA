
package com.cmos.ipa.service.video_surveillance.monitorConfigurationV1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.cmos.ipa.service.video_surveillance.monitorConfigurationV1 package. 
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

    private final static QName _GetChannelConfigurationChannelConfig_QNAME = new QName("", "channelConfig");
    private final static QName _ChannelConfigNameStamping_QNAME = new QName("", "nameStamping");
    private final static QName _ChannelConfigTimeStamping_QNAME = new QName("", "timeStamping");
    private final static QName _ChannelConfigMotionDetection_QNAME = new QName("", "motionDetection");
    private final static QName _ChannelConfigAlertTextLocation_QNAME = new QName("", "alertTextLocation");
    private final static QName _ChannelConfigNameFontSize_QNAME = new QName("", "nameFontSize");
    private final static QName _ChannelConfigDateTimeFontSize_QNAME = new QName("", "dateTimeFontSize");
    private final static QName _ChannelConfigAlertFontSize_QNAME = new QName("", "alertFontSize");
    private final static QName _ChannelConfigOutputURI_QNAME = new QName("", "outputURI");
    private final static QName _ChannelConfigSourceURI_QNAME = new QName("", "sourceURI");
    private final static QName _ChannelConfigRecordingStatusLocation_QNAME = new QName("", "recordingStatusLocation");
    private final static QName _ChannelConfigMetadataTextLocation_QNAME = new QName("", "metadataTextLocation");
    private final static QName _ChannelConfigShowAnalyticsOverlay_QNAME = new QName("", "showAnalyticsOverlay");
    private final static QName _MonitorConfigDisplayType_QNAME = new QName("", "displayType");
    private final static QName _MonitorConfigBorderColor_QNAME = new QName("", "borderColor");
    private final static QName _MonitorConfigActiveBorderColor_QNAME = new QName("", "activeBorderColor");
    private final static QName _MonitorConfigTextColor_QNAME = new QName("", "textColor");
    private final static QName _MonitorConfigTextBackgroundColor_QNAME = new QName("", "textBackgroundColor");
    private final static QName _MonitorConfigAlertTextColor_QNAME = new QName("", "alertTextColor");
    private final static QName _MonitorConfigAlertTextBackgroundColor_QNAME = new QName("", "alertTextBackgroundColor");
    private final static QName _MonitorConfigAlertTextBlinkFrequency_QNAME = new QName("", "alertTextBlinkFrequency");
    private final static QName _MonitorConfigTimeDisplayMode_QNAME = new QName("", "timeDisplayMode");
    private final static QName _MonitorConfigZoomIndicator_QNAME = new QName("", "zoomIndicator");
    private final static QName _MonitorConfigStatusIndicator_QNAME = new QName("", "statusIndicator");
    private final static QName _MonitorConfigAudioEnable_QNAME = new QName("", "audioEnable");
    private final static QName _MonitorConfigLayouts_QNAME = new QName("", "layouts");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.cmos.ipa.service.video_surveillance.monitorConfigurationV1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetMonitorConfiguration }
     * 
     */
    public GetMonitorConfiguration createGetMonitorConfiguration() {
        return new GetMonitorConfiguration();
    }

    /**
     * Create an instance of {@link GetMonitorConfigurationResponse }
     * 
     */
    public GetMonitorConfigurationResponse createGetMonitorConfigurationResponse() {
        return new GetMonitorConfigurationResponse();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.monitorConfigurationV1.MonitorConfig }
     * 
     */
    public MonitorConfig createMonitorConfig() {
        return new MonitorConfig();
    }

    /**
     * Create an instance of {@link SetMonitorConfiguration }
     * 
     */
    public SetMonitorConfiguration createSetMonitorConfiguration() {
        return new SetMonitorConfiguration();
    }

    /**
     * Create an instance of {@link SetMonitorConfigurationResponse }
     * 
     */
    public SetMonitorConfigurationResponse createSetMonitorConfigurationResponse() {
        return new SetMonitorConfigurationResponse();
    }

    /**
     * Create an instance of {@link GetChannelConfiguration }
     * 
     */
    public GetChannelConfiguration createGetChannelConfiguration() {
        return new GetChannelConfiguration();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.monitorConfigurationV1.ChannelConfig }
     * 
     */
    public ChannelConfig createChannelConfig() {
        return new ChannelConfig();
    }

    /**
     * Create an instance of {@link GetChannelConfigurationResponse }
     * 
     */
    public GetChannelConfigurationResponse createGetChannelConfigurationResponse() {
        return new GetChannelConfigurationResponse();
    }

    /**
     * Create an instance of {@link SetChannelConfiguration }
     * 
     */
    public SetChannelConfiguration createSetChannelConfiguration() {
        return new SetChannelConfiguration();
    }

    /**
     * Create an instance of {@link SetChannelConfigurationResponse }
     * 
     */
    public SetChannelConfigurationResponse createSetChannelConfigurationResponse() {
        return new SetChannelConfigurationResponse();
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
     * Create an instance of {@link GetActiveChannel }
     * 
     */
    public GetActiveChannel createGetActiveChannel() {
        return new GetActiveChannel();
    }

    /**
     * Create an instance of {@link GetActiveChannelResponse }
     * 
     */
    public GetActiveChannelResponse createGetActiveChannelResponse() {
        return new GetActiveChannelResponse();
    }

    /**
     * Create an instance of {@link SetActiveChannel }
     * 
     */
    public SetActiveChannel createSetActiveChannel() {
        return new SetActiveChannel();
    }

    /**
     * Create an instance of {@link SetActiveChannelResponse }
     * 
     */
    public SetActiveChannelResponse createSetActiveChannelResponse() {
        return new SetActiveChannelResponse();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.monitorConfigurationV1.GetLayout }
     * 
     */
    public GetLayout createGetLayout() {
        return new GetLayout();
    }

    /**
     * Create an instance of {@link GetLayoutResponse }
     * 
     */
    public GetLayoutResponse createGetLayoutResponse() {
        return new GetLayoutResponse();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.monitorConfigurationV1.SetLayout }
     * 
     */
    public SetLayout createSetLayout() {
        return new SetLayout();
    }

    /**
     * Create an instance of {@link SetLayoutResponse }
     * 
     */
    public SetLayoutResponse createSetLayoutResponse() {
        return new SetLayoutResponse();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.monitorConfigurationV1.GetVolume }
     * 
     */
    public GetVolume createGetVolume() {
        return new GetVolume();
    }

    /**
     * Create an instance of {@link GetVolumeResponse }
     * 
     */
    public GetVolumeResponse createGetVolumeResponse() {
        return new GetVolumeResponse();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.monitorConfigurationV1.SetVolume }
     * 
     */
    public SetVolume createSetVolume() {
        return new SetVolume();
    }

    /**
     * Create an instance of {@link SetVolumeResponse }
     * 
     */
    public SetVolumeResponse createSetVolumeResponse() {
        return new SetVolumeResponse();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.monitorConfigurationV1.ClearAlert }
     * 
     */
    public ClearAlert createClearAlert() {
        return new ClearAlert();
    }

    /**
     * Create an instance of {@link ClearAlertResponse }
     * 
     */
    public ClearAlertResponse createClearAlertResponse() {
        return new ClearAlertResponse();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.monitorConfigurationV1.Identify }
     * 
     */
    public Identify createIdentify() {
        return new Identify();
    }

    /**
     * Create an instance of {@link IdentifyResponse }
     * 
     */
    public IdentifyResponse createIdentifyResponse() {
        return new IdentifyResponse();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.monitorConfigurationV1.Layouts }
     * 
     */
    public Layouts createLayouts() {
        return new Layouts();
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link com.cmos.ipa.service.video_surveillance.monitorConfigurationV1.ChannelConfig }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "channelConfig", scope = GetChannelConfiguration.class)
    public JAXBElement<ChannelConfig> createGetChannelConfigurationChannelConfig(ChannelConfig value) {
        return new JAXBElement<ChannelConfig>(_GetChannelConfigurationChannelConfig_QNAME, ChannelConfig.class, GetChannelConfiguration.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "nameStamping", scope = ChannelConfig.class)
    public JAXBElement<Integer> createChannelConfigNameStamping(Integer value) {
        return new JAXBElement<Integer>(_ChannelConfigNameStamping_QNAME, Integer.class, ChannelConfig.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "timeStamping", scope = ChannelConfig.class)
    public JAXBElement<Integer> createChannelConfigTimeStamping(Integer value) {
        return new JAXBElement<Integer>(_ChannelConfigTimeStamping_QNAME, Integer.class, ChannelConfig.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "motionDetection", scope = ChannelConfig.class)
    public JAXBElement<String> createChannelConfigMotionDetection(String value) {
        return new JAXBElement<String>(_ChannelConfigMotionDetection_QNAME, String.class, ChannelConfig.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "alertTextLocation", scope = ChannelConfig.class)
    public JAXBElement<String> createChannelConfigAlertTextLocation(String value) {
        return new JAXBElement<String>(_ChannelConfigAlertTextLocation_QNAME, String.class, ChannelConfig.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "nameFontSize", scope = ChannelConfig.class)
    public JAXBElement<Integer> createChannelConfigNameFontSize(Integer value) {
        return new JAXBElement<Integer>(_ChannelConfigNameFontSize_QNAME, Integer.class, ChannelConfig.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "dateTimeFontSize", scope = ChannelConfig.class)
    public JAXBElement<Integer> createChannelConfigDateTimeFontSize(Integer value) {
        return new JAXBElement<Integer>(_ChannelConfigDateTimeFontSize_QNAME, Integer.class, ChannelConfig.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "alertFontSize", scope = ChannelConfig.class)
    public JAXBElement<Integer> createChannelConfigAlertFontSize(Integer value) {
        return new JAXBElement<Integer>(_ChannelConfigAlertFontSize_QNAME, Integer.class, ChannelConfig.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "outputURI", scope = ChannelConfig.class)
    public JAXBElement<String> createChannelConfigOutputURI(String value) {
        return new JAXBElement<String>(_ChannelConfigOutputURI_QNAME, String.class, ChannelConfig.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "sourceURI", scope = ChannelConfig.class)
    public JAXBElement<String> createChannelConfigSourceURI(String value) {
        return new JAXBElement<String>(_ChannelConfigSourceURI_QNAME, String.class, ChannelConfig.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "recordingStatusLocation", scope = ChannelConfig.class)
    public JAXBElement<Integer> createChannelConfigRecordingStatusLocation(Integer value) {
        return new JAXBElement<Integer>(_ChannelConfigRecordingStatusLocation_QNAME, Integer.class, ChannelConfig.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "metadataTextLocation", scope = ChannelConfig.class)
    public JAXBElement<Integer> createChannelConfigMetadataTextLocation(Integer value) {
        return new JAXBElement<Integer>(_ChannelConfigMetadataTextLocation_QNAME, Integer.class, ChannelConfig.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "showAnalyticsOverlay", scope = ChannelConfig.class)
    public JAXBElement<Integer> createChannelConfigShowAnalyticsOverlay(Integer value) {
        return new JAXBElement<Integer>(_ChannelConfigShowAnalyticsOverlay_QNAME, Integer.class, ChannelConfig.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "displayType", scope = MonitorConfig.class)
    public JAXBElement<Integer> createMonitorConfigDisplayType(Integer value) {
        return new JAXBElement<Integer>(_MonitorConfigDisplayType_QNAME, Integer.class, MonitorConfig.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "borderColor", scope = MonitorConfig.class)
    public JAXBElement<String> createMonitorConfigBorderColor(String value) {
        return new JAXBElement<String>(_MonitorConfigBorderColor_QNAME, String.class, MonitorConfig.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "activeBorderColor", scope = MonitorConfig.class)
    public JAXBElement<String> createMonitorConfigActiveBorderColor(String value) {
        return new JAXBElement<String>(_MonitorConfigActiveBorderColor_QNAME, String.class, MonitorConfig.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "textColor", scope = MonitorConfig.class)
    public JAXBElement<String> createMonitorConfigTextColor(String value) {
        return new JAXBElement<String>(_MonitorConfigTextColor_QNAME, String.class, MonitorConfig.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "textBackgroundColor", scope = MonitorConfig.class)
    public JAXBElement<String> createMonitorConfigTextBackgroundColor(String value) {
        return new JAXBElement<String>(_MonitorConfigTextBackgroundColor_QNAME, String.class, MonitorConfig.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "alertTextColor", scope = MonitorConfig.class)
    public JAXBElement<String> createMonitorConfigAlertTextColor(String value) {
        return new JAXBElement<String>(_MonitorConfigAlertTextColor_QNAME, String.class, MonitorConfig.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "alertTextBackgroundColor", scope = MonitorConfig.class)
    public JAXBElement<String> createMonitorConfigAlertTextBackgroundColor(String value) {
        return new JAXBElement<String>(_MonitorConfigAlertTextBackgroundColor_QNAME, String.class, MonitorConfig.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "alertTextBlinkFrequency", scope = MonitorConfig.class)
    public JAXBElement<Integer> createMonitorConfigAlertTextBlinkFrequency(Integer value) {
        return new JAXBElement<Integer>(_MonitorConfigAlertTextBlinkFrequency_QNAME, Integer.class, MonitorConfig.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "timeDisplayMode", scope = MonitorConfig.class)
    public JAXBElement<Integer> createMonitorConfigTimeDisplayMode(Integer value) {
        return new JAXBElement<Integer>(_MonitorConfigTimeDisplayMode_QNAME, Integer.class, MonitorConfig.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "zoomIndicator", scope = MonitorConfig.class)
    public JAXBElement<Integer> createMonitorConfigZoomIndicator(Integer value) {
        return new JAXBElement<Integer>(_MonitorConfigZoomIndicator_QNAME, Integer.class, MonitorConfig.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "statusIndicator", scope = MonitorConfig.class)
    public JAXBElement<Integer> createMonitorConfigStatusIndicator(Integer value) {
        return new JAXBElement<Integer>(_MonitorConfigStatusIndicator_QNAME, Integer.class, MonitorConfig.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "audioEnable", scope = MonitorConfig.class)
    public JAXBElement<Integer> createMonitorConfigAudioEnable(Integer value) {
        return new JAXBElement<Integer>(_MonitorConfigAudioEnable_QNAME, Integer.class, MonitorConfig.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link com.cmos.ipa.service.video_surveillance.monitorConfigurationV1.Layouts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "layouts", scope = MonitorConfig.class)
    public JAXBElement<Layouts> createMonitorConfigLayouts(Layouts value) {
        return new JAXBElement<Layouts>(_MonitorConfigLayouts_QNAME, Layouts.class, MonitorConfig.class, value);
    }

}
