package com.zhaomsdemo.research.weatherinfo.service;

import com.zhaomsdemo.research.weatherinfo.client.GetSupportProvince;
import com.zhaomsdemo.research.weatherinfo.client.GetSupportProvinceResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import java.util.List;

@Service(value = "weatherTemplateImpl")
public class WeatherClientServiceTemplateImpl implements WeatherClientService {

    @Autowired
    private WebServiceTemplate webServiceTemplate;

    private String url = "http://www.webxml.com.cn/WebServices/WeatherWebService.asmx";
    private String getSupportProviceAction = "http://WebXml.com.cn/getSupportProvince";

    @Override
    public List<String> getSupportedProvinces() {
        GetSupportProvinceResponse response = new GetSupportProvinceResponse();
        GetSupportProvince request = new GetSupportProvince();
        response = (GetSupportProvinceResponse) webServiceTemplate.marshalSendAndReceive(url,  request, new SoapActionCallback(getSupportProviceAction));
        return response.getGetSupportProvinceResult().getString();
    }

    @Override
    public List<String> getSupportedCitys(String province) {
        return List.of();
    }
}
