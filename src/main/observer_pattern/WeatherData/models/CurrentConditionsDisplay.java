package main.observer_pattern.WeatherData.models;

import main.observer_pattern.WeatherData.behaviour.DisplayElement;
import main.observer_pattern.WeatherData.behaviour.Observer;
import main.observer_pattern.WeatherData.behaviour.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private Subject weatherData;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "C degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();

    }
}
