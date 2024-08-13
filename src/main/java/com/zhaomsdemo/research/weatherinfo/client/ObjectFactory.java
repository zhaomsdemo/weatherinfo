
package com.zhaomsdemo.research.weatherinfo.client;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.zhaomsdemo.research.weatherinfo.client package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _ArrayOfString_QNAME = new QName("http://WebXml.com.cn/", "ArrayOfString");
    private static final QName _DataSet_QNAME = new QName("http://WebXml.com.cn/", "DataSet");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.zhaomsdemo.research.weatherinfo.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetSupportDataSetResponse }
     * 
     * @return
     *     the new instance of {@link GetSupportDataSetResponse }
     */
    public GetSupportDataSetResponse createGetSupportDataSetResponse() {
        return new GetSupportDataSetResponse();
    }

    /**
     * Create an instance of {@link GetSupportCity }
     * 
     * @return
     *     the new instance of {@link GetSupportCity }
     */
    public GetSupportCity createGetSupportCity() {
        return new GetSupportCity();
    }

    /**
     * Create an instance of {@link GetSupportCityResponse }
     * 
     * @return
     *     the new instance of {@link GetSupportCityResponse }
     */
    public GetSupportCityResponse createGetSupportCityResponse() {
        return new GetSupportCityResponse();
    }

    /**
     * Create an instance of {@link ArrayOfString }
     * 
     * @return
     *     the new instance of {@link ArrayOfString }
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link GetSupportProvince }
     * 
     * @return
     *     the new instance of {@link GetSupportProvince }
     */
    public GetSupportProvince createGetSupportProvince() {
        return new GetSupportProvince();
    }

    /**
     * Create an instance of {@link GetSupportProvinceResponse }
     * 
     * @return
     *     the new instance of {@link GetSupportProvinceResponse }
     */
    public GetSupportProvinceResponse createGetSupportProvinceResponse() {
        return new GetSupportProvinceResponse();
    }

    /**
     * Create an instance of {@link GetSupportDataSet }
     * 
     * @return
     *     the new instance of {@link GetSupportDataSet }
     */
    public GetSupportDataSet createGetSupportDataSet() {
        return new GetSupportDataSet();
    }

    /**
     * Create an instance of {@link GetSupportDataSetResponse.GetSupportDataSetResult }
     * 
     * @return
     *     the new instance of {@link GetSupportDataSetResponse.GetSupportDataSetResult }
     */
    public GetSupportDataSetResponse.GetSupportDataSetResult createGetSupportDataSetResponseGetSupportDataSetResult() {
        return new GetSupportDataSetResponse.GetSupportDataSetResult();
    }

    /**
     * Create an instance of {@link GetWeatherbyCityName }
     * 
     * @return
     *     the new instance of {@link GetWeatherbyCityName }
     */
    public GetWeatherbyCityName createGetWeatherbyCityName() {
        return new GetWeatherbyCityName();
    }

    /**
     * Create an instance of {@link GetWeatherbyCityNameResponse }
     * 
     * @return
     *     the new instance of {@link GetWeatherbyCityNameResponse }
     */
    public GetWeatherbyCityNameResponse createGetWeatherbyCityNameResponse() {
        return new GetWeatherbyCityNameResponse();
    }

    /**
     * Create an instance of {@link GetWeatherbyCityNamePro }
     * 
     * @return
     *     the new instance of {@link GetWeatherbyCityNamePro }
     */
    public GetWeatherbyCityNamePro createGetWeatherbyCityNamePro() {
        return new GetWeatherbyCityNamePro();
    }

    /**
     * Create an instance of {@link GetWeatherbyCityNameProResponse }
     * 
     * @return
     *     the new instance of {@link GetWeatherbyCityNameProResponse }
     */
    public GetWeatherbyCityNameProResponse createGetWeatherbyCityNameProResponse() {
        return new GetWeatherbyCityNameProResponse();
    }

    /**
     * Create an instance of {@link DataSet }
     * 
     * @return
     *     the new instance of {@link DataSet }
     */
    public DataSet createDataSet() {
        return new DataSet();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebXml.com.cn/", name = "ArrayOfString")
    public JAXBElement<ArrayOfString> createArrayOfString(ArrayOfString value) {
        return new JAXBElement<>(_ArrayOfString_QNAME, ArrayOfString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataSet }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DataSet }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebXml.com.cn/", name = "DataSet")
    public JAXBElement<DataSet> createDataSet(DataSet value) {
        return new JAXBElement<>(_DataSet_QNAME, DataSet.class, null, value);
    }

}
