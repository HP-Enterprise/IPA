
package com.cmos.ipa.service.video_surveillance.deviceRegistryV1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Str的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="Str"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="urn:schemas-pelco-com:device:SystemManagerDevice:1"/&gt;
 *     &lt;enumeration value="urn:schemas-pelco-com:device:SystemManagerLocatorDevice:1"/&gt;
 *     &lt;enumeration value="urn:schemas-pelco-com:device:Transcoder:1"/&gt;
 *     &lt;enumeration value="urn:schemas-pelco-com:device:Decoder:1"/&gt;
 *     &lt;enumeration value="urn:schemas-pelco-com:device:Pelco:1"/&gt;
 *     &lt;enumeration value="urn:schemas-pelco-com:device:Camera:1"/&gt;
 *     &lt;enumeration value="urn:schemas-pelco-com:device:Monitor:1"/&gt;
 *     &lt;enumeration value="urn:schemas-pelco-com:device:NetworkVideoRecorder:1"/&gt;
 *     &lt;enumeration value="urn:schemas-pelco-com:device:Alarm:1"/&gt;
 *     &lt;enumeration value="urn:schemas-pelco-com:device:AlarmArray:1"/&gt;
 *     &lt;enumeration value="urn:schemas-pelco-com:device:Relay:1"/&gt;
 *     &lt;enumeration value="urn:schemas-pelco-com:device:RelayArray:1"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Str")
@XmlEnum
public enum Str {

    @XmlEnumValue("urn:schemas-pelco-com:device:SystemManagerDevice:1")
    URN_SCHEMAS_PELCO_COM_DEVICE_SYSTEM_MANAGER_DEVICE_1("urn:schemas-pelco-com:device:SystemManagerDevice:1"),
    @XmlEnumValue("urn:schemas-pelco-com:device:SystemManagerLocatorDevice:1")
    URN_SCHEMAS_PELCO_COM_DEVICE_SYSTEM_MANAGER_LOCATOR_DEVICE_1("urn:schemas-pelco-com:device:SystemManagerLocatorDevice:1"),
    @XmlEnumValue("urn:schemas-pelco-com:device:Transcoder:1")
    URN_SCHEMAS_PELCO_COM_DEVICE_TRANSCODER_1("urn:schemas-pelco-com:device:Transcoder:1"),
    @XmlEnumValue("urn:schemas-pelco-com:device:Decoder:1")
    URN_SCHEMAS_PELCO_COM_DEVICE_DECODER_1("urn:schemas-pelco-com:device:Decoder:1"),
    @XmlEnumValue("urn:schemas-pelco-com:device:Pelco:1")
    URN_SCHEMAS_PELCO_COM_DEVICE_PELCO_1("urn:schemas-pelco-com:device:Pelco:1"),
    @XmlEnumValue("urn:schemas-pelco-com:device:Camera:1")
    URN_SCHEMAS_PELCO_COM_DEVICE_CAMERA_1("urn:schemas-pelco-com:device:Camera:1"),
    @XmlEnumValue("urn:schemas-pelco-com:device:Monitor:1")
    URN_SCHEMAS_PELCO_COM_DEVICE_MONITOR_1("urn:schemas-pelco-com:device:Monitor:1"),
    @XmlEnumValue("urn:schemas-pelco-com:device:NetworkVideoRecorder:1")
    URN_SCHEMAS_PELCO_COM_DEVICE_NETWORK_VIDEO_RECORDER_1("urn:schemas-pelco-com:device:NetworkVideoRecorder:1"),
    @XmlEnumValue("urn:schemas-pelco-com:device:Alarm:1")
    URN_SCHEMAS_PELCO_COM_DEVICE_ALARM_1("urn:schemas-pelco-com:device:Alarm:1"),
    @XmlEnumValue("urn:schemas-pelco-com:device:AlarmArray:1")
    URN_SCHEMAS_PELCO_COM_DEVICE_ALARM_ARRAY_1("urn:schemas-pelco-com:device:AlarmArray:1"),
    @XmlEnumValue("urn:schemas-pelco-com:device:Relay:1")
    URN_SCHEMAS_PELCO_COM_DEVICE_RELAY_1("urn:schemas-pelco-com:device:Relay:1"),
    @XmlEnumValue("urn:schemas-pelco-com:device:RelayArray:1")
    URN_SCHEMAS_PELCO_COM_DEVICE_RELAY_ARRAY_1("urn:schemas-pelco-com:device:RelayArray:1");
    private final String value;

    Str(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Str fromValue(String v) {
        for (Str c: Str.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
