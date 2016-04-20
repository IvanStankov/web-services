package com.ivan.jmp.impl;

import com.ivan.jmp.client.factory.WsClientFactory;
import com.ivan.jmp.client.football.ArrayOftPlayersWithCards;
import com.ivan.jmp.client.football.Info;
import com.ivan.jmp.client.football.InfoSoapType;
import com.ivan.jmp.client.weather.GlobalWeather;
import com.ivan.jmp.client.weather.GlobalWeatherSoap;
import com.ivan.jmp.model.CardsOfTeam;
import com.ivan.jmp.model.CityWeather;
import com.ivan.jmp.model.UserCards;
import com.ivan.jmp.model.Weather;
import com.ivan.jmp.service.FootballWeatherService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Иван on 05.04.2016.
 */
@ApplicationScoped
@WebService(endpointInterface = "com.ivan.jmp.service.FootballWeatherService")
public class FootballWeatherServiceImpl implements FootballWeatherService {

    @Inject
    private WsClientFactory wsClientFactory;

    @Override
    public CardsOfTeam getCards(String teamName) {
        InfoSoapType footballWebService = wsClientFactory.createFootballWebService();

        ArrayOftPlayersWithCards arrayOftPlayersWithCards = footballWebService.allPlayersWithYellowOrRedCards(false, true, true);
        List<UserCards> userCards = arrayOftPlayersWithCards.getTPlayersWithCards()
                .stream()
                .filter(player -> teamName.equals(player.getSTeamName()))
                .map(player -> new UserCards(player.getSName(), player.getIYellowCards(), player.getIRedCards()))
                .collect(Collectors.toList());

        return new CardsOfTeam(userCards);
    }

    @Override
    public Weather weatherOfWMCities() {
        GlobalWeatherSoap weatherWebService = wsClientFactory.createWeatherWebService();
        InfoSoapType footballWebService = wsClientFactory.createFootballWebService();

        List<CityWeather> cityWeathers = new ArrayList<>();

        footballWebService.cities().getString()
                .stream()
                .forEach(city -> {
                    String weatherResult = weatherWebService.getWeather(city, "South Africa");
                    if (!"Data Not Found".equals(weatherResult)) {
                        cityWeathers.add(new CityWeather(city, weatherResult));
                    }
                });
        return new Weather(cityWeathers);
    }

    @Override
    public String sayHello() {
        return "Hello!";
    }

}
