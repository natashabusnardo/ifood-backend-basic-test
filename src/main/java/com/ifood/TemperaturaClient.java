package com.ifood;
import com.ifood.model.Informacoes;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/*
Essa classe de interface esta simulando o postman mandando
um request, onde o controller ira realizar o response.
 */
@FeignClient(name="temperaturaclient", url="https://api.openweathermap.org/data/2.5/weather?q=sao%20paulo&appid=b77e07f479efe92156376a8b07640ced&units=metric")
public interface TemperaturaClient {

    @RequestMapping(method = RequestMethod.GET)
    Informacoes getInformacoes();
}
