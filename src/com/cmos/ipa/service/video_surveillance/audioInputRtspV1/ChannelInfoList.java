
package com.cmos.ipa.service.video_surveillance.audioInputRtspV1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 						This is a list of channels.
 * 					
 * 
 * <p>ChannelInfoList complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ChannelInfoList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="channelInfo" type="{urn:schemas-pelco-com:service:AudioInputRtsp:1}ChannelInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChannelInfoList", propOrder = {
    "channelInfo"
})
public class ChannelInfoList {

    protected List<ChannelInfo> channelInfo;

    /**
     * Gets the value of the channelInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the channelInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChannelInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link com.cmos.ipa.service.video_surveillance.audioInputRtspV1.ChannelInfo }
     * 
     * 
     */
    public List<ChannelInfo> getChannelInfo() {
        if (channelInfo == null) {
            channelInfo = new ArrayList<ChannelInfo>();
        }
        return this.channelInfo;
    }

}
