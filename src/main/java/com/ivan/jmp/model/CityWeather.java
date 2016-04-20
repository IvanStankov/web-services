package com.ivan.jmp.model;

/**
 * Created by Иван on 05.04.2016.
 */
public class CityWeather {

    private String cityName;
    private String cityWeather;

    public CityWeather() {
    }

    public CityWeather(String cityName, String cityWeather) {
        this.cityName = cityName;
        this.cityWeather = cityWeather;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityWeather() {
        return cityWeather;
    }

    public void setCityWeather(String cityWeather) {
        this.cityWeather = cityWeather;
    }
}
