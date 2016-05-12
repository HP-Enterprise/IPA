
package com.cmos.ipa.service.video_surveillance.metaDataV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="X" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *         &lt;element name="Y" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *         &lt;element name="TIME" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *         &lt;element name="TEXT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "x",
    "y",
    "time",
    "text"
})
@XmlRootElement(name = "SetText")
public class SetText {

    @XmlElement(name = "X")
    @XmlSchemaType(name = "unsignedByte")
    protected short x;
    @XmlElement(name = "Y")
    @XmlSchemaType(name = "unsignedByte")
    protected short y;
    @XmlElement(name = "TIME")
    @XmlSchemaType(name = "unsignedInt")
    protected long time;
    @XmlElement(name = "TEXT", required = true)
    protected String text;

    /**
     * ��ȡx���Ե�ֵ��
     * 
     */
    public short getX() {
        return x;
    }

    /**
     * ����x���Ե�ֵ��
     * 
     */
    public void setX(short value) {
        this.x = value;
    }

    /**
     * ��ȡy���Ե�ֵ��
     * 
     */
    public short getY() {
        return y;
    }

    /**
     * ����y���Ե�ֵ��
     * 
     */
    public void setY(short value) {
        this.y = value;
    }

    /**
     * ��ȡtime���Ե�ֵ��
     * 
     */
    public long getTIME() {
        return time;
    }

    /**
     * ����time���Ե�ֵ��
     * 
     */
    public void setTIME(long value) {
        this.time = value;
    }

    /**
     * ��ȡtext���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTEXT() {
        return text;
    }

    /**
     * ����text���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTEXT(String value) {
        this.text = value;
    }

}
