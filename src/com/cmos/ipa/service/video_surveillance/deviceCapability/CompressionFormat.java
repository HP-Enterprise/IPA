
package com.cmos.ipa.service.video_surveillance.deviceCapability;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CompressionFormat的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="CompressionFormat"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MPEG-4"/&gt;
 *     &lt;enumeration value="H.264"/&gt;
 *     &lt;enumeration value="MJPEG"/&gt;
 *     &lt;enumeration value="JPEG"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CompressionFormat")
@XmlEnum
public enum CompressionFormat {

    @XmlEnumValue("MPEG-4")
    MPEG_4("MPEG-4"),
    @XmlEnumValue("H.264")
    H_264("H.264"),
    MJPEG("MJPEG"),
    JPEG("JPEG");
    private final String value;

    CompressionFormat(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CompressionFormat fromValue(String v) {
        for (CompressionFormat c: CompressionFormat.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
