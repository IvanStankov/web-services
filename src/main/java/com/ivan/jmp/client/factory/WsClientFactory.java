package com.ivan.jmp.client.factory;

import com.ivan.jmp.client.football.InfoSoapType;
import com.ivan.jmp.client.weather.GlobalWeatherSoap;

/**
 * Created by Иван on 06.04.2016.
 */
public interface WsClientFactory {

    InfoSoapType createFootballWebService();

    GlobalWeatherSoap createWeatherWebService();

}
