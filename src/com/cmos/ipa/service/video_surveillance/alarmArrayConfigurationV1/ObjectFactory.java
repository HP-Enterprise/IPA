
package com.cmos.ipa.service.video_surveillance.alarmArrayConfigurationV1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.cmos.ipa.service.video_surveillance.alarmArrayConfigurationV1 package. 
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

    private final static QName _AlarmStatesChanged_QNAME = new QName("", "changed");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.cmos.ipa.service.video_surveillance.alarmArrayConfigurationV1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAlarmStates }
     * 
     */
    public GetAlarmStates createGetAlarmStates() {
        return new GetAlarmStates();
    }

    /**
     * Create an instance of {@link GetAlarmStatesResponse }
     * 
     */
    public GetAlarmStatesResponse createGetAlarmStatesResponse() {
        return new GetAlarmStatesResponse();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.alarmArrayConfigurationV1.AlarmStates }
     * 
     */
    public AlarmStates createAlarmStates() {
        return new AlarmStates();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.alarmArrayConfigurationV1.GetArraySize }
     * 
     */
    public GetArraySize createGetArraySize() {
        return new GetArraySize();
    }

    /**
     * Create an instance of {@link GetArraySizeResponse }
     * 
     */
    public GetArraySizeResponse createGetArraySizeResponse() {
        return new GetArraySizeResponse();
    }

    /**
     * Create an instance of {@link SetAlarmState }
     * 
     */
    public SetAlarmState createSetAlarmState() {
        return new SetAlarmState();
    }

    /**
     * Create an instance of {@link SetAlarmStateResponse }
     * 
     */
    public SetAlarmStateResponse createSetAlarmStateResponse() {
        return new SetAlarmStateResponse();
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
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.alarmArrayConfigurationV1.AlarmConfig }
     * 
     */
    public AlarmConfig createAlarmConfig() {
        return new AlarmConfig();
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
     * Create an instance of {@link COMBINEDEVENTENTRY }
     * 
     */
    public COMBINEDEVENTENTRY createCOMBINEDEVENTENTRY() {
        return new COMBINEDEVENTENTRY();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.alarmArrayConfigurationV1.EVENTENTRIES }
     * 
     */
    public EVENTENTRIES createEVENTENTRIES() {
        return new EVENTENTRIES();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.alarmArrayConfigurationV1.EVENTENTRY }
     * 
     */
    public EVENTENTRY createEVENTENTRY() {
        return new EVENTENTRY();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.alarmArrayConfigurationV1.OPSTACK }
     * 
     */
    public OPSTACK createOPSTACK() {
        return new OPSTACK();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.alarmArrayConfigurationV1.PROPERTYSET }
     * 
     */
    public PROPERTYSET createPROPERTYSET() {
        return new PROPERTYSET();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.alarmArrayConfigurationV1.PROPERTY }
     * 
     */
    public PROPERTY createPROPERTY() {
        return new PROPERTY();
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "changed", scope = AlarmStates.class)
    public JAXBElement<String> createAlarmStatesChanged(String value) {
        return new JAXBElement<String>(_AlarmStatesChanged_QNAME, String.class, AlarmStates.class, value);
    }

}
