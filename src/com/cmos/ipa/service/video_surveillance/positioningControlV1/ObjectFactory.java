
package com.cmos.ipa.service.video_surveillance.positioningControlV1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.cmos.ipa.service.video_surveillance.positioningControlV1 package. 
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

    private final static QName _AccelerationLimitsTranslation_QNAME = new QName("", "translation");
    private final static QName _AccelerationLimitsRotation_QNAME = new QName("", "rotation");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.cmos.ipa.service.video_surveillance.positioningControlV1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EnableSpeedProfile }
     * 
     */
    public EnableSpeedProfile createEnableSpeedProfile() {
        return new EnableSpeedProfile();
    }

    /**
     * Create an instance of {@link EnableSpeedProfileResponse }
     * 
     */
    public EnableSpeedProfileResponse createEnableSpeedProfileResponse() {
        return new EnableSpeedProfileResponse();
    }

    /**
     * Create an instance of {@link RestoreDefaultSpeedProfile }
     * 
     */
    public RestoreDefaultSpeedProfile createRestoreDefaultSpeedProfile() {
        return new RestoreDefaultSpeedProfile();
    }

    /**
     * Create an instance of {@link RestoreDefaultSpeedProfileResponse }
     * 
     */
    public RestoreDefaultSpeedProfileResponse createRestoreDefaultSpeedProfileResponse() {
        return new RestoreDefaultSpeedProfileResponse();
    }

    /**
     * Create an instance of {@link RestoreDefaultPositionLimits }
     * 
     */
    public RestoreDefaultPositionLimits createRestoreDefaultPositionLimits() {
        return new RestoreDefaultPositionLimits();
    }

    /**
     * Create an instance of {@link RestoreDefaultPositionLimitsResponse }
     * 
     */
    public RestoreDefaultPositionLimitsResponse createRestoreDefaultPositionLimitsResponse() {
        return new RestoreDefaultPositionLimitsResponse();
    }

    /**
     * Create an instance of {@link GetSpeedProfile }
     * 
     */
    public GetSpeedProfile createGetSpeedProfile() {
        return new GetSpeedProfile();
    }

    /**
     * Create an instance of {@link GetSpeedProfileResponse }
     * 
     */
    public GetSpeedProfileResponse createGetSpeedProfileResponse() {
        return new GetSpeedProfileResponse();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.positioningControlV1.SpeedProfile }
     * 
     */
    public SpeedProfile createSpeedProfile() {
        return new SpeedProfile();
    }

    /**
     * Create an instance of {@link GetAllSpeedProfiles }
     * 
     */
    public GetAllSpeedProfiles createGetAllSpeedProfiles() {
        return new GetAllSpeedProfiles();
    }

    /**
     * Create an instance of {@link GetAllSpeedProfilesResponse }
     * 
     */
    public GetAllSpeedProfilesResponse createGetAllSpeedProfilesResponse() {
        return new GetAllSpeedProfilesResponse();
    }

    /**
     * Create an instance of {@link GetEnabledSpeedProfile }
     * 
     */
    public GetEnabledSpeedProfile createGetEnabledSpeedProfile() {
        return new GetEnabledSpeedProfile();
    }

    /**
     * Create an instance of {@link GetEnabledSpeedProfileResponse }
     * 
     */
    public GetEnabledSpeedProfileResponse createGetEnabledSpeedProfileResponse() {
        return new GetEnabledSpeedProfileResponse();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.positioningControlV1.GetPosition }
     * 
     */
    public GetPosition createGetPosition() {
        return new GetPosition();
    }

    /**
     * Create an instance of {@link GetPositionResponse }
     * 
     */
    public GetPositionResponse createGetPositionResponse() {
        return new GetPositionResponse();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.positioningControlV1.Velocity }
     * 
     */
    public Velocity createVelocity() {
        return new Velocity();
    }

    /**
     * Create an instance of {@link GetPositionEventInterval }
     * 
     */
    public GetPositionEventInterval createGetPositionEventInterval() {
        return new GetPositionEventInterval();
    }

    /**
     * Create an instance of {@link GetPositionEventIntervalResponse }
     * 
     */
    public GetPositionEventIntervalResponse createGetPositionEventIntervalResponse() {
        return new GetPositionEventIntervalResponse();
    }

    /**
     * Create an instance of {@link GetPositionLimits }
     * 
     */
    public GetPositionLimits createGetPositionLimits() {
        return new GetPositionLimits();
    }

    /**
     * Create an instance of {@link GetPositionLimitsResponse }
     * 
     */
    public GetPositionLimitsResponse createGetPositionLimitsResponse() {
        return new GetPositionLimitsResponse();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.positioningControlV1.AxisLimits }
     * 
     */
    public AxisLimits createAxisLimits() {
        return new AxisLimits();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.positioningControlV1.GetVelocity }
     * 
     */
    public GetVelocity createGetVelocity() {
        return new GetVelocity();
    }

    /**
     * Create an instance of {@link GetVelocityResponse }
     * 
     */
    public GetVelocityResponse createGetVelocityResponse() {
        return new GetVelocityResponse();
    }

    /**
     * Create an instance of {@link GetVelocityLimits }
     * 
     */
    public GetVelocityLimits createGetVelocityLimits() {
        return new GetVelocityLimits();
    }

    /**
     * Create an instance of {@link GetVelocityLimitsResponse }
     * 
     */
    public GetVelocityLimitsResponse createGetVelocityLimitsResponse() {
        return new GetVelocityLimitsResponse();
    }

    /**
     * Create an instance of {@link VelocityLimits }
     * 
     */
    public VelocityLimits createVelocityLimits() {
        return new VelocityLimits();
    }

    /**
     * Create an instance of {@link GetVelocityURL }
     * 
     */
    public GetVelocityURL createGetVelocityURL() {
        return new GetVelocityURL();
    }

    /**
     * Create an instance of {@link GetVelocityURLResponse }
     * 
     */
    public GetVelocityURLResponse createGetVelocityURLResponse() {
        return new GetVelocityURLResponse();
    }

    /**
     * Create an instance of {@link InitializePosition }
     * 
     */
    public InitializePosition createInitializePosition() {
        return new InitializePosition();
    }

    /**
     * Create an instance of {@link InitializePositionResponse }
     * 
     */
    public InitializePositionResponse createInitializePositionResponse() {
        return new InitializePositionResponse();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.positioningControlV1.SetPosition }
     * 
     */
    public SetPosition createSetPosition() {
        return new SetPosition();
    }

    /**
     * Create an instance of {@link SetPositionResponse }
     * 
     */
    public SetPositionResponse createSetPositionResponse() {
        return new SetPositionResponse();
    }

    /**
     * Create an instance of {@link SetPositionEventInterval }
     * 
     */
    public SetPositionEventInterval createSetPositionEventInterval() {
        return new SetPositionEventInterval();
    }

    /**
     * Create an instance of {@link SetPositionEventIntervalResponse }
     * 
     */
    public SetPositionEventIntervalResponse createSetPositionEventIntervalResponse() {
        return new SetPositionEventIntervalResponse();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.positioningControlV1.SetVelocity }
     * 
     */
    public SetVelocity createSetVelocity() {
        return new SetVelocity();
    }

    /**
     * Create an instance of {@link SetVelocityResponse }
     * 
     */
    public SetVelocityResponse createSetVelocityResponse() {
        return new SetVelocityResponse();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.positioningControlV1.ViewObject }
     * 
     */
    public ViewObject createViewObject() {
        return new ViewObject();
    }

    /**
     * Create an instance of {@link ViewObjectResponse }
     * 
     */
    public ViewObjectResponse createViewObjectResponse() {
        return new ViewObjectResponse();
    }

    /**
     * Create an instance of {@link GetAzimuthZero }
     * 
     */
    public GetAzimuthZero createGetAzimuthZero() {
        return new GetAzimuthZero();
    }

    /**
     * Create an instance of {@link GetAzimuthZeroResponse }
     * 
     */
    public GetAzimuthZeroResponse createGetAzimuthZeroResponse() {
        return new GetAzimuthZeroResponse();
    }

    /**
     * Create an instance of {@link SetAzimuthZero }
     * 
     */
    public SetAzimuthZero createSetAzimuthZero() {
        return new SetAzimuthZero();
    }

    /**
     * Create an instance of {@link SetAzimuthZeroResponse }
     * 
     */
    public SetAzimuthZeroResponse createSetAzimuthZeroResponse() {
        return new SetAzimuthZeroResponse();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.positioningControlV1.Xyz }
     * 
     */
    public Xyz createXyz() {
        return new Xyz();
    }

    /**
     * Create an instance of {@link AccelerationLimits }
     * 
     */
    public AccelerationLimits createAccelerationLimits() {
        return new AccelerationLimits();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.positioningControlV1.Xyzlimits }
     * 
     */
    public Xyzlimits createXyzlimits() {
        return new Xyzlimits();
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link com.cmos.ipa.service.video_surveillance.positioningControlV1.Xyzlimits }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "translation", scope = AccelerationLimits.class)
    public JAXBElement<Xyzlimits> createAccelerationLimitsTranslation(Xyzlimits value) {
        return new JAXBElement<Xyzlimits>(_AccelerationLimitsTranslation_QNAME, Xyzlimits.class, AccelerationLimits.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link com.cmos.ipa.service.video_surveillance.positioningControlV1.Xyzlimits }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "rotation", scope = AccelerationLimits.class)
    public JAXBElement<Xyzlimits> createAccelerationLimitsRotation(Xyzlimits value) {
        return new JAXBElement<Xyzlimits>(_AccelerationLimitsRotation_QNAME, Xyzlimits.class, AccelerationLimits.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link com.cmos.ipa.service.video_surveillance.positioningControlV1.Xyzlimits }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "translation", scope = VelocityLimits.class)
    public JAXBElement<Xyzlimits> createVelocityLimitsTranslation(Xyzlimits value) {
        return new JAXBElement<Xyzlimits>(_AccelerationLimitsTranslation_QNAME, Xyzlimits.class, VelocityLimits.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link com.cmos.ipa.service.video_surveillance.positioningControlV1.Xyzlimits }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "rotation", scope = VelocityLimits.class)
    public JAXBElement<Xyzlimits> createVelocityLimitsRotation(Xyzlimits value) {
        return new JAXBElement<Xyzlimits>(_AccelerationLimitsRotation_QNAME, Xyzlimits.class, VelocityLimits.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link com.cmos.ipa.service.video_surveillance.positioningControlV1.Xyzlimits }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "translation", scope = AxisLimits.class)
    public JAXBElement<Xyzlimits> createAxisLimitsTranslation(Xyzlimits value) {
        return new JAXBElement<Xyzlimits>(_AccelerationLimitsTranslation_QNAME, Xyzlimits.class, AxisLimits.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link com.cmos.ipa.service.video_surveillance.positioningControlV1.Xyzlimits }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "rotation", scope = AxisLimits.class)
    public JAXBElement<Xyzlimits> createAxisLimitsRotation(Xyzlimits value) {
        return new JAXBElement<Xyzlimits>(_AccelerationLimitsRotation_QNAME, Xyzlimits.class, AxisLimits.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link com.cmos.ipa.service.video_surveillance.positioningControlV1.Xyz }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "translation", scope = Velocity.class)
    public JAXBElement<Xyz> createVelocityTranslation(Xyz value) {
        return new JAXBElement<Xyz>(_AccelerationLimitsTranslation_QNAME, Xyz.class, Velocity.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link com.cmos.ipa.service.video_surveillance.positioningControlV1.Xyz }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "rotation", scope = Velocity.class)
    public JAXBElement<Xyz> createVelocityRotation(Xyz value) {
        return new JAXBElement<Xyz>(_AccelerationLimitsRotation_QNAME, Xyz.class, Velocity.class, value);
    }

}
