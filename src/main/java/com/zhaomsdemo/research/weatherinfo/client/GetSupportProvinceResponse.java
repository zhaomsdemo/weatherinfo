
package com.zhaomsdemo.research.weatherinfo.client;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="getSupportProvinceResult" type="{http://WebXml.com.cn/}ArrayOfString" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getSupportProvinceResult"
})
@XmlRootElement(name = "getSupportProvinceResponse")
public class GetSupportProvinceResponse {

    protected ArrayOfString getSupportProvinceResult;

    /**
     * Gets the value of the getSupportProvinceResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getGetSupportProvinceResult() {
        return getSupportProvinceResult;
    }

    /**
     * Sets the value of the getSupportProvinceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setGetSupportProvinceResult(ArrayOfString value) {
        this.getSupportProvinceResult = value;
    }

}
