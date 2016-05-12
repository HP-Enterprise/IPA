
package com.cmos.ipa.service.video_surveillance.videoOutputV1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>H264StreamType�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="H264StreamType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BYTE_STREAM"/&gt;
 *     &lt;enumeration value="RFC_3984"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "H264StreamType")
@XmlEnum
public enum H264StreamType {


    /**
     * 
     *                 Byte stream format
     *               
     * 
     */
    BYTE_STREAM,

    /**
     * 
     *                 RFC 3984 format
     *               
     * 
     */
    RFC_3984;

    public String value() {
        return name();
    }

    public static H264StreamType fromValue(String v) {
        return valueOf(v);
    }

}
