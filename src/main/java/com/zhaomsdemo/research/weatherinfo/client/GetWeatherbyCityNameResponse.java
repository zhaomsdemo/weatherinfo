
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
 *         <element name="getWeatherbyCityNameResult" type="{http://WebXml.com.cn/}ArrayOfString" minOccurs="0"/>
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
    "getWeatherbyCityNameResult"
})
@XmlRootElement(name = "getWeatherbyCityNameResponse")
public class GetWeatherbyCityNameResponse {

    protected ArrayOfString getWeatherbyCityNameResult;

    /**
     * Gets the value of the getWeatherbyCityNameResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getGetWeatherbyCityNameResult() {
        return getWeatherbyCityNameResult;
    }

    /**
     * Sets the value of the getWeatherbyCityNameResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setGetWeatherbyCityNameResult(ArrayOfString value) {
        this.getWeatherbyCityNameResult = value;
    }

}
