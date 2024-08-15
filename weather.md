http://www.webxml.com.cn/WebServices/WeatherWebService.asmx?wsdl

curl --request POST \
--url http://www.webxml.com.cn/WebServices/WeatherWebService.asmx \
--header 'Accept: application/xml' \
--header 'Content-Type: text/xml' \
--header 'SOAPAction: http://WebXml.com.cn/getSupportProvince' \
--data '<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:web="http://WebXml.com.cn/">
<soapenv:Header/>
<soapenv:Body>
<web:getSupportProvince/>
</soapenv:Body>
</soapenv:Envelope>'