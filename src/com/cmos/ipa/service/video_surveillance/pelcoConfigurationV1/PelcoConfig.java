
package com.cmos.ipa.service.video_surveillance.pelcoConfigurationV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 						A device's current UPnP configuration.
 * 					
 * 
 * <p>PelcoConfig complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="PelcoConfig"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="renewInterval" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="startupInterval" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ntpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shutdownWatchdogTimeout" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="isDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="allowSystemUpdate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isSynced" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="dstChangeTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="dstOffset" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="gmtOffset" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ssdp" type="{urn:schemas-pelco-com:service:PelcoConfiguration:1}SSDP" minOccurs="0"/&gt;
 *         &lt;element name="threadPool" type="{urn:schemas-pelco-com:service:PelcoConfiguration:1}ThreadPool" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PelcoConfig", propOrder = {
    "renewInterval",
    "startupInterval",
    "ntpAddress",
    "shutdownWatchdogTimeout",
    "isDefault",
    "allowSystemUpdate",
    "isSynced",
    "dstChangeTime",
    "dstOffset",
    "gmtOffset",
    "ssdp",
    "threadPool"
})
public class PelcoConfig {

    protected int renewInterval;
    protected int startupInterval;
    protected String ntpAddress;
    protected boolean shutdownWatchdogTimeout;
    protected Boolean isDefault;
    protected Boolean allowSystemUpdate;
    protected Boolean isSynced;
    protected Boolean dstChangeTime;
    protected Integer dstOffset;
    protected Integer gmtOffset;
    protected SSDP ssdp;
    protected ThreadPool threadPool;

    /**
     * ��ȡrenewInterval���Ե�ֵ��
     * 
     */
    public int getRenewInterval() {
        return renewInterval;
    }

    /**
     * ����renewInterval���Ե�ֵ��
     * 
     */
    public void setRenewInterval(int value) {
        this.renewInterval = value;
    }

    /**
     * ��ȡstartupInterval���Ե�ֵ��
     * 
     */
    public int getStartupInterval() {
        return startupInterval;
    }

    /**
     * ����startupInterval���Ե�ֵ��
     * 
     */
    public void setStartupInterval(int value) {
        this.startupInterval = value;
    }

    /**
     * ��ȡntpAddress���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtpAddress() {
        return ntpAddress;
    }

    /**
     * ����ntpAddress���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNtpAddress(String value) {
        this.ntpAddress = value;
    }

    /**
     * ��ȡshutdownWatchdogTimeout���Ե�ֵ��
     * 
     */
    public boolean isShutdownWatchdogTimeout() {
        return shutdownWatchdogTimeout;
    }

    /**
     * ����shutdownWatchdogTimeout���Ե�ֵ��
     * 
     */
    public void setShutdownWatchdogTimeout(boolean value) {
        this.shutdownWatchdogTimeout = value;
    }

    /**
     * ��ȡisDefault���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDefault() {
        return isDefault;
    }

    /**
     * ����isDefault���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDefault(Boolean value) {
        this.isDefault = value;
    }

    /**
     * ��ȡallowSystemUpdate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowSystemUpdate() {
        return allowSystemUpdate;
    }

    /**
     * ����allowSystemUpdate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowSystemUpdate(Boolean value) {
        this.allowSystemUpdate = value;
    }

    /**
     * ��ȡisSynced���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSynced() {
        return isSynced;
    }

    /**
     * ����isSynced���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSynced(Boolean value) {
        this.isSynced = value;
    }

    /**
     * ��ȡdstChangeTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDstChangeTime() {
        return dstChangeTime;
    }

    /**
     * ����dstChangeTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDstChangeTime(Boolean value) {
        this.dstChangeTime = value;
    }

    /**
     * ��ȡdstOffset���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDstOffset() {
        return dstOffset;
    }

    /**
     * ����dstOffset���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDstOffset(Integer value) {
        this.dstOffset = value;
    }

    /**
     * ��ȡgmtOffset���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGmtOffset() {
        return gmtOffset;
    }

    /**
     * ����gmtOffset���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGmtOffset(Integer value) {
        this.gmtOffset = value;
    }

    /**
     * ��ȡssdp���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.pelcoConfigurationV1.SSDP }
     *     
     */
    public SSDP getSsdp() {
        return ssdp;
    }

    /**
     * ����ssdp���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link com.cmos.ipa.service.video_surveillance.pelcoConfigurationV1.SSDP }
     *     
     */
    public void setSsdp(SSDP value) {
        this.ssdp = value;
    }

    /**
     * ��ȡthreadPool���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link com.cmos.ipa.service.video_surveillance.pelcoConfigurationV1.ThreadPool }
     *     
     */
    public ThreadPool getThreadPool() {
        return threadPool;
    }

    /**
     * ����threadPool���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link com.cmos.ipa.service.video_surveillance.pelcoConfigurationV1.ThreadPool }
     *     
     */
    public void setThreadPool(ThreadPool value) {
        this.threadPool = value;
    }

}
