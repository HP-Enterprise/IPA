
package com.cmos.ipa.service.video_surveillance.motionDetectionV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rows" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="columns" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="asyncId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
    "rows",
    "columns",
    "asyncId"
})
@XmlRootElement(name = "GetGridSizeResponse")
public class GetGridSizeResponse {

    protected int rows;
    protected int columns;
    protected Integer asyncId;

    /**
     * ��ȡrows���Ե�ֵ��
     * 
     */
    public int getRows() {
        return rows;
    }

    /**
     * ����rows���Ե�ֵ��
     * 
     */
    public void setRows(int value) {
        this.rows = value;
    }

    /**
     * ��ȡcolumns���Ե�ֵ��
     * 
     */
    public int getColumns() {
        return columns;
    }

    /**
     * ����columns���Ե�ֵ��
     * 
     */
    public void setColumns(int value) {
        this.columns = value;
    }

    /**
     * ��ȡasyncId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAsyncId() {
        return asyncId;
    }

    /**
     * ����asyncId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAsyncId(Integer value) {
        this.asyncId = value;
    }

}
