package com.ivan.jmp.model;

import java.util.List;

/**
 * Created by Иван on 05.04.2016.
 */
public class Weather {

    private List<CityWeather> cityWeathers;

    public Weather() {
    }

    public Weather(List<CityWeather> cityWeathers) {
        this.cityWeathers = cityWeathers;
    }

    public List<CityWeather> getCityWeathers() {
        return cityWeathers;
    }

    public void setCityWeathers(List<CityWeather> cityWeathers) {
        this.cityWeathers = cityWeathers;
    }
}
