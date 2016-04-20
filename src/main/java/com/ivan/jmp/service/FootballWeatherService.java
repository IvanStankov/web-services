package com.ivan.jmp.service;

import com.ivan.jmp.model.CardsOfTeam;
import com.ivan.jmp.model.Weather;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlElement;

/**
 * Created by Иван on 05.04.2016.
 */
@WebService
public interface FootballWeatherService {

    @WebMethod
    CardsOfTeam getCards(@WebParam(name = "teamName") @XmlElement(required=true) String teamName);

    @WebMethod
    Weather weatherOfWMCities();

    @WebMethod
    String sayHello();

}
