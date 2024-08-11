package com.zhaomsdemo.research.weatherinfo.controller;

import com.zhaomsdemo.research.weatherinfo.service.WeatherClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    @Qualifier("weatherTemplateImpl")
    @Autowired
    private WeatherClientService weatherClientService;

    @GetMapping("/supportedProvinces")
    public List<String> getSupportedProvinces() {
        return weatherClientService.getSupportedProvinces();
    }
}
