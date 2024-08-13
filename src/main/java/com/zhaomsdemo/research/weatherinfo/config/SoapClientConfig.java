package com.zhaomsdemo.research.weatherinfo.config;

import com.zhaomsdemo.research.weatherinfo.client.WeatherWebService;
import com.zhaomsdemo.research.weatherinfo.client.WeatherWebServiceSoap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.transport.http.HttpComponentsMessageSender;

@Configuration
public class SoapClientConfig {

    @Bean
    public WeatherWebServiceSoap weatherWebServiceSoap() {
        WeatherWebService weatherWebService = new WeatherWebService();
        return weatherWebService.getWeatherWebServiceSoap();
    }

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        // 设置上下文路径 (这里你需要替换为你的JAXB生成的包名)
        marshaller.setContextPath("com.example.generated");
        return marshaller;
    }

    @Bean
    public WebServiceTemplate webServiceTemplate(Jaxb2Marshaller marshaller) {
        WebServiceTemplate webServiceTemplate = new WebServiceTemplate();
        webServiceTemplate.setMarshaller(marshaller);
        webServiceTemplate.setUnmarshaller(marshaller);

        // 设置HTTP消息发送器，支持HTTPS
        HttpComponentsMessageSender messageSender = new HttpComponentsMessageSender();
        webServiceTemplate.setMessageSender(messageSender);

        return webServiceTemplate;
    }
}
