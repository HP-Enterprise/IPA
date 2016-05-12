
package com.cmos.ipa.service.video_surveillance.audioInputRtspV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="channelInfoList" type="{urn:schemas-pelco-com:service:AudioInputRtsp:1}ChannelInfoList"/&gt;
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
    "channelInfoList"
})
@XmlRootElement(name = "QueryResponse")
public class QueryResponse {

    @XmlElement(required = true)
    protected ChannelInfoList channelInfoList;

    /**
     * 获取channelInfoList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ChannelInfoList }
     *     
     */
    public ChannelInfoList getChannelInfoList() {
        return channelInfoList;
    }

    /**
     * 设置channelInfoList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ChannelInfoList }
     *     
     */
    public void setChannelInfoList(ChannelInfoList value) {
        this.channelInfoList = value;
    }

}
