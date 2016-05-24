
package com.cmos.ipa.service.access_control.aicThird;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="ipAddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="target" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="functioncode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
        "ipAddr",
        "target",
        "functioncode",
        "state"
})
@XmlRootElement(name = "CmdOutput")
public class CmdOutput {

    protected String ipAddr;
    protected int target;
    protected int functioncode;
    protected int state;

    /**
     * 获取ipAddr属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIpAddr() {
        return ipAddr;
    }

    /**
     * 设置ipAddr属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIpAddr(String value) {
        this.ipAddr = value;
    }

    /**
     * 获取target属性的值。
     *
     */
    public int getTarget() {
        return target;
    }

    /**
     * 设置target属性的值。
     *
     */
    public void setTarget(int value) {
        this.target = value;
    }

    /**
     * 获取functioncode属性的值。
     *
     */
    public int getFunctioncode() {
        return functioncode;
    }

    /**
     * 设置functioncode属性的值。
     *
     */
    public void setFunctioncode(int value) {
        this.functioncode = value;
    }

    /**
     * 获取state属性的值。
     *
     */
    public int getState() {
        return state;
    }

    /**
     * 设置state属性的值。
     *
     */
    public void setState(int value) {
        this.state = value;
    }

}
