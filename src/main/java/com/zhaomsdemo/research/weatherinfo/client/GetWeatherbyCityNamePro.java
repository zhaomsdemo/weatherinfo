
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
 *         <element name="theCityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="theUserID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "theCityName",
    "theUserID"
})
@XmlRootElement(name = "getWeatherbyCityNamePro")
public class GetWeatherbyCityNamePro {

    protected String theCityName;
    protected String theUserID;

    /**
     * Gets the value of the theCityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTheCityName() {
        return theCityName;
    }

    /**
     * Sets the value of the theCityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTheCityName(String value) {
        this.theCityName = value;
    }

    /**
     * Gets the value of the theUserID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTheUserID() {
        return theUserID;
    }

    /**
     * Sets the value of the theUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTheUserID(String value) {
        this.theUserID = value;
    }

}
