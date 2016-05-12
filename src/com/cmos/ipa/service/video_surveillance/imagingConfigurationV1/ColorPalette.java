
package com.cmos.ipa.service.video_surveillance.imagingConfigurationV1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ColorPalette�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="ColorPalette"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="WhiteHot"/&gt;
 *     &lt;enumeration value="Rainbow"/&gt;
 *     &lt;enumeration value="BlackHot"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ColorPalette")
@XmlEnum
public enum ColorPalette {

    @XmlEnumValue("WhiteHot")
    WHITE_HOT("WhiteHot"),
    @XmlEnumValue("Rainbow")
    RAINBOW("Rainbow"),
    @XmlEnumValue("BlackHot")
    BLACK_HOT("BlackHot");
    private final String value;

    ColorPalette(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ColorPalette fromValue(String v) {
        for (ColorPalette c: ColorPalette.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
