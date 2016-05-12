
package com.cmos.ipa.service.video_surveillance.audioInputRtspV1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * 
 * 						This represents information pertaining to an audio channel.
 * 					
 * 
 * <p>ChannelInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ChannelInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="channelId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="channelStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;any processContents='skip' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChannelInfo", propOrder = {
    "channelId",
    "channelStatus",
    "any"
})
public class ChannelInfo {

    protected int channelId;
    @XmlElement(required = true)
    protected String channelStatus;
    @XmlAnyElement
    protected List<Element> any;

    /**
     * ��ȡchannelId���Ե�ֵ��
     * 
     */
    public int getChannelId() {
        return channelId;
    }

    /**
     * ����channelId���Ե�ֵ��
     * 
     */
    public void setChannelId(int value) {
        this.channelId = value;
    }

    /**
     * ��ȡchannelStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelStatus() {
        return channelStatus;
    }

    /**
     * ����channelStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelStatus(String value) {
        this.channelStatus = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link org.w3c.dom.Element }
     * 
     * 
     */
    public List<Element> getAny() {
        if (any == null) {
            any = new ArrayList<Element>();
        }
        return this.any;
    }

}
