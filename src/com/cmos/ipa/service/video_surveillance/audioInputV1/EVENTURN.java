
package com.cmos.ipa.service.video_surveillance.audioInputV1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EVENT-URN�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="EVENT-URN"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AlarmRecord"/&gt;
 *     &lt;enumeration value="MotionRecord"/&gt;
 *     &lt;enumeration value="TimedRecord"/&gt;
 *     &lt;enumeration value="MarkRecord"/&gt;
 *     &lt;enumeration value="AllRecord"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EVENT-URN")
@XmlEnum
public enum EVENTURN {

    @XmlEnumValue("AlarmRecord")
    ALARM_RECORD("AlarmRecord"),
    @XmlEnumValue("MotionRecord")
    MOTION_RECORD("MotionRecord"),
    @XmlEnumValue("TimedRecord")
    TIMED_RECORD("TimedRecord"),
    @XmlEnumValue("MarkRecord")
    MARK_RECORD("MarkRecord"),
    @XmlEnumValue("AllRecord")
    ALL_RECORD("AllRecord");
    private final String value;

    EVENTURN(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EVENTURN fromValue(String v) {
        for (EVENTURN c: EVENTURN.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
