
package com.cmos.ipa.service.video_surveillance.cameraConfigurationV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Represents an element with a mode and value pair data.
 * 
 * <p>MVElement complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="MVElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MVElement", propOrder = {
    "mode",
    "value"
})
public class MVElement {

    protected int mode;
    protected int value;

    /**
     * ��ȡmode���Ե�ֵ��
     * 
     */
    public int getMode() {
        return mode;
    }

    /**
     * ����mode���Ե�ֵ��
     * 
     */
    public void setMode(int value) {
        this.mode = value;
    }

    /**
     * ��ȡvalue���Ե�ֵ��
     * 
     */
    public int getValue() {
        return value;
    }

    /**
     * ����value���Ե�ֵ��
     * 
     */
    public void setValue(int value) {
        this.value = value;
    }

}
