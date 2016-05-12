
package com.cmos.ipa.service.video_surveillance.pelcoConfigurationV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 						A thread pool's configuration.
 * 					
 * 
 * <p>ThreadPool complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ThreadPool"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="minThreads" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="maxThreads" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="jobsPerThread" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="threadIdleTime" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThreadPool", propOrder = {
    "minThreads",
    "maxThreads",
    "jobsPerThread",
    "threadIdleTime"
})
public class ThreadPool {

    protected int minThreads;
    protected int maxThreads;
    protected int jobsPerThread;
    protected int threadIdleTime;

    /**
     * 获取minThreads属性的值。
     * 
     */
    public int getMinThreads() {
        return minThreads;
    }

    /**
     * 设置minThreads属性的值。
     * 
     */
    public void setMinThreads(int value) {
        this.minThreads = value;
    }

    /**
     * 获取maxThreads属性的值。
     * 
     */
    public int getMaxThreads() {
        return maxThreads;
    }

    /**
     * 设置maxThreads属性的值。
     * 
     */
    public void setMaxThreads(int value) {
        this.maxThreads = value;
    }

    /**
     * 获取jobsPerThread属性的值。
     * 
     */
    public int getJobsPerThread() {
        return jobsPerThread;
    }

    /**
     * 设置jobsPerThread属性的值。
     * 
     */
    public void setJobsPerThread(int value) {
        this.jobsPerThread = value;
    }

    /**
     * 获取threadIdleTime属性的值。
     * 
     */
    public int getThreadIdleTime() {
        return threadIdleTime;
    }

    /**
     * 设置threadIdleTime属性的值。
     * 
     */
    public void setThreadIdleTime(int value) {
        this.threadIdleTime = value;
    }

}
