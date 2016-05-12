
package com.cmos.ipa.service.video_surveillance.audioInputV1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 						A list of StreamParameters.
 * 					
 * 
 * <p>Entries complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Entries"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="streamParameters" type="{urn:schemas-pelco-com:service:AudioInput:1}StreamParameters" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Entries", propOrder = {
    "streamParameters"
})
public class Entries {

    protected List<StreamParameters> streamParameters;

    /**
     * Gets the value of the streamParameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the streamParameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStreamParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StreamParameters }
     * 
     * 
     */
    public List<StreamParameters> getStreamParameters() {
        if (streamParameters == null) {
            streamParameters = new ArrayList<StreamParameters>();
        }
        return this.streamParameters;
    }

}
