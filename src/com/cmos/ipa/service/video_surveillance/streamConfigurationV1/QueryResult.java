
package com.cmos.ipa.service.video_surveillance.streamConfigurationV1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Encapsulates the results of a query
 *             for streams.
 * 
 * <p>QueryResult complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="QueryResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="setting" type="{urn:schemas-pelco-com:service:StreamConfiguration:1}Setting" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="settingOptions" type="{urn:schemas-pelco-com:service:StreamConfiguration:1}SettingOptions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryResult", propOrder = {
    "setting",
    "settingOptions"
})
public class QueryResult {

    protected List<Setting> setting;
    protected List<SettingOptions> settingOptions;

    /**
     * Gets the value of the setting property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the setting property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSetting().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link com.cmos.ipa.service.video_surveillance.streamConfigurationV1.Setting }
     * 
     * 
     */
    public List<Setting> getSetting() {
        if (setting == null) {
            setting = new ArrayList<Setting>();
        }
        return this.setting;
    }

    /**
     * Gets the value of the settingOptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the settingOptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSettingOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SettingOptions }
     * 
     * 
     */
    public List<SettingOptions> getSettingOptions() {
        if (settingOptions == null) {
            settingOptions = new ArrayList<SettingOptions>();
        }
        return this.settingOptions;
    }

}
