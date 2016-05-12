
package com.cmos.ipa.service.video_surveillance.streamConfigurationV1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ConfigurationInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ConfigurationInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="resourceUtilization" type="{urn:schemas-pelco-com:service:StreamConfiguration:1}ResourceUtilization" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="streamInfo" type="{urn:schemas-pelco-com:service:StreamConfiguration:1}StreamConfigurationInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigurationInfo", propOrder = {
    "resourceUtilization",
    "streamInfo"
})
public class ConfigurationInfo {

    protected List<ResourceUtilization> resourceUtilization;
    protected List<StreamConfigurationInfo> streamInfo;

    /**
     * Gets the value of the resourceUtilization property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceUtilization property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceUtilization().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceUtilization }
     * 
     * 
     */
    public List<ResourceUtilization> getResourceUtilization() {
        if (resourceUtilization == null) {
            resourceUtilization = new ArrayList<ResourceUtilization>();
        }
        return this.resourceUtilization;
    }

    /**
     * Gets the value of the streamInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the streamInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStreamInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StreamConfigurationInfo }
     * 
     * 
     */
    public List<StreamConfigurationInfo> getStreamInfo() {
        if (streamInfo == null) {
            streamInfo = new ArrayList<StreamConfigurationInfo>();
        }
        return this.streamInfo;
    }

}
