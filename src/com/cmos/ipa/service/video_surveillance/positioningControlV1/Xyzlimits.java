
package com.cmos.ipa.service.video_surveillance.positioningControlV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The translational/rotational position limits of the device. 
 * 
 * <p>Xyzlimits complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="Xyzlimits"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="xMin" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="xMax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="yMin" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="yMax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="zMin" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="zMax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Xyzlimits", propOrder = {

})
public class Xyzlimits {

    protected Integer xMin;
    protected Integer xMax;
    protected Integer yMin;
    protected Integer yMax;
    protected Integer zMin;
    protected Integer zMax;

    /**
     * ��ȡxMin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getXMin() {
        return xMin;
    }

    /**
     * ����xMin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setXMin(Integer value) {
        this.xMin = value;
    }

    /**
     * ��ȡxMax���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getXMax() {
        return xMax;
    }

    /**
     * ����xMax���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setXMax(Integer value) {
        this.xMax = value;
    }

    /**
     * ��ȡyMin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getYMin() {
        return yMin;
    }

    /**
     * ����yMin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setYMin(Integer value) {
        this.yMin = value;
    }

    /**
     * ��ȡyMax���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getYMax() {
        return yMax;
    }

    /**
     * ����yMax���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setYMax(Integer value) {
        this.yMax = value;
    }

    /**
     * ��ȡzMin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getZMin() {
        return zMin;
    }

    /**
     * ����zMin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setZMin(Integer value) {
        this.zMin = value;
    }

    /**
     * ��ȡzMax���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getZMax() {
        return zMax;
    }

    /**
     * ����zMax���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setZMax(Integer value) {
        this.zMax = value;
    }

}
