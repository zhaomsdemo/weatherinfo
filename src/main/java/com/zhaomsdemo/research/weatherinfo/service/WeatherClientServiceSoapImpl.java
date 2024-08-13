package com.zhaomsdemo.research.weatherinfo.service;

import com.zhaomsdemo.research.weatherinfo.client.ArrayOfString;
import com.zhaomsdemo.research.weatherinfo.client.WeatherWebServiceSoap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "weatherSoapService")
public class WeatherClientServiceSoapImpl implements WeatherClientService{

    @Autowired
    private WeatherWebServiceSoap weatherWebServiceSoap;

    public List<String> getSupportedProvinces() {
        ArrayOfString arrayOfString = new ArrayOfString();
        arrayOfString = weatherWebServiceSoap.getSupportProvince();
        return arrayOfString.getString();
    }

    public List<String> getSupportedCitys(String province) {
        ArrayOfString arrayOfString = new ArrayOfString();
        arrayOfString = weatherWebServiceSoap.getSupportCity(province);
        return arrayOfString.getString();
    }
}
