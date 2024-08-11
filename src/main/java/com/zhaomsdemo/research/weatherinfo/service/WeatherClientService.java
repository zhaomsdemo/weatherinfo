package com.zhaomsdemo.research.weatherinfo.service;

import java.util.List;

public interface WeatherClientService {

    List<String> getSupportedProvinces();
    List<String> getSupportedCitys(String province);
}
