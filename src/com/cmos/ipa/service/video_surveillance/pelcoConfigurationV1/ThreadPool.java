
package com.cmos.ipa.service.video_surveillance.pelcoConfigurationV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 						A thread pool's configuration.
 * 					
 * 
 * <p>ThreadPool complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡminThreads���Ե�ֵ��
     * 
     */
    public int getMinThreads() {
        return minThreads;
    }

    /**
     * ����minThreads���Ե�ֵ��
     * 
     */
    public void setMinThreads(int value) {
        this.minThreads = value;
    }

    /**
     * ��ȡmaxThreads���Ե�ֵ��
     * 
     */
    public int getMaxThreads() {
        return maxThreads;
    }

    /**
     * ����maxThreads���Ե�ֵ��
     * 
     */
    public void setMaxThreads(int value) {
        this.maxThreads = value;
    }

    /**
     * ��ȡjobsPerThread���Ե�ֵ��
     * 
     */
    public int getJobsPerThread() {
        return jobsPerThread;
    }

    /**
     * ����jobsPerThread���Ե�ֵ��
     * 
     */
    public void setJobsPerThread(int value) {
        this.jobsPerThread = value;
    }

    /**
     * ��ȡthreadIdleTime���Ե�ֵ��
     * 
     */
    public int getThreadIdleTime() {
        return threadIdleTime;
    }

    /**
     * ����threadIdleTime���Ե�ֵ��
     * 
     */
    public void setThreadIdleTime(int value) {
        this.threadIdleTime = value;
    }

}
