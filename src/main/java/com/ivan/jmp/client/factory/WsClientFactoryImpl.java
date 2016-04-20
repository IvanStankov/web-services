package com.ivan.jmp.client.factory;

import com.ivan.jmp.client.football.Info;
import com.ivan.jmp.client.football.InfoSoapType;
import com.ivan.jmp.client.weather.GlobalWeather;
import com.ivan.jmp.client.weather.GlobalWeatherSoap;

import javax.enterprise.context.ApplicationScoped;

/**
 * Created by Иван on 06.04.2016.
 */
@ApplicationScoped
public class WsClientFactoryImpl implements WsClientFactory {

    public InfoSoapType createFootballWebService() {
        Info info = new Info();
        return info.getInfoSoap();
    }

    public GlobalWeatherSoap createWeatherWebService() {
        GlobalWeather globalWeather = new GlobalWeather();
        return globalWeather.getGlobalWeatherSoap();
    }

}
