package main.observer_pattern.WeatherData.models;

import main.observer_pattern.WeatherData.behaviour.DisplayElement;
import main.observer_pattern.WeatherData.behaviour.Observer;
import main.observer_pattern.WeatherData.behaviour.Subject;

public class ForecastDisplay implements Observer, DisplayElement {
    private Subject weatherData;
    private float temperature;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Today's temperature: " + temperature + "C degrees");
    }

    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        display();
    }
}
