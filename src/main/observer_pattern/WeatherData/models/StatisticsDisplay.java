package main.observer_pattern.WeatherData.models;

import main.observer_pattern.WeatherData.behaviour.DisplayElement;
import main.observer_pattern.WeatherData.behaviour.Observer;
import main.observer_pattern.WeatherData.behaviour.Subject;

public class StatisticsDisplay implements Observer, DisplayElement {
    private Subject weatherData;
    private float temperature;
    private float humidity;
    private float pressure;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Statistics for today: Temperature: " + temperature + "C degrees, Humidity: " + humidity + "%, Pressure: " + pressure + "pa");
    }

    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }
}
