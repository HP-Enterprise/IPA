
package com.cmos.ipa.service.video_surveillance.imagingConfigurationV1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RecalibrationMode的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="RecalibrationMode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Auto"/&gt;
 *     &lt;enumeration value="Periodic"/&gt;
 *     &lt;enumeration value="Manual"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RecalibrationMode")
@XmlEnum
public enum RecalibrationMode {


    /**
     * The camera decides when to re-calibrate based on temperature
     * 
     */
    @XmlEnumValue("Auto")
    AUTO("Auto"),

    /**
     * A set time interval between periodic recalibrations (in minutes)
     * 
     */
    @XmlEnumValue("Periodic")
    PERIODIC("Periodic"),

    /**
     * Begins recalibration when the Recalibrate Now button is selected on the live page
     * 
     */
    @XmlEnumValue("Manual")
    MANUAL("Manual");
    private final String value;

    RecalibrationMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RecalibrationMode fromValue(String v) {
        for (RecalibrationMode c: RecalibrationMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
