
package com.cmos.ipa.service.video_surveillance.deviceCapability;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ErrorCodes�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="ErrorCodes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="InvalidCompressionFormat"/&gt;
 *     &lt;enumeration value="IncompatibleConfiguration"/&gt;
 *     &lt;enumeration value="InvalidServiceNamespace"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ErrorCodes")
@XmlEnum
public enum ErrorCodes {

    @XmlEnumValue("InvalidCompressionFormat")
    INVALID_COMPRESSION_FORMAT("InvalidCompressionFormat"),
    @XmlEnumValue("IncompatibleConfiguration")
    INCOMPATIBLE_CONFIGURATION("IncompatibleConfiguration"),
    @XmlEnumValue("InvalidServiceNamespace")
    INVALID_SERVICE_NAMESPACE("InvalidServiceNamespace");
    private final String value;

    ErrorCodes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ErrorCodes fromValue(String v) {
        for (ErrorCodes c: ErrorCodes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
