
package com.cmos.ipa.service.video_surveillance.deviceCapability;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GOPStructure的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="GOPStructure"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NotSupported"/&gt;
 *     &lt;enumeration value="IP"/&gt;
 *     &lt;enumeration value="IBBrBP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GOPStructure")
@XmlEnum
public enum GOPStructure {

    @XmlEnumValue("NotSupported")
    NOT_SUPPORTED("NotSupported"),
    IP("IP"),
    @XmlEnumValue("IBBrBP")
    IB_BR_BP("IBBrBP");
    private final String value;

    GOPStructure(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GOPStructure fromValue(String v) {
        for (GOPStructure c: GOPStructure.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
