package main.observer_pattern.WeatherData;

import main.observer_pattern.WeatherData.models.*;

public class WeatherDataStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(10, 20, 15);
        weatherData.setMeasurements(20.5f, 5.9f, 1.5f);

    }
}
