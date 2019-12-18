package main.observer_pattern.WeatherData.models;

import main.observer_pattern.WeatherData.behaviour.DisplayElement;
import main.observer_pattern.WeatherData.behaviour.Observer;
import main.observer_pattern.WeatherData.behaviour.Subject;

public class HeatIndexDisplay implements Observer, DisplayElement {

    private Subject weatherData;
    private float temperature;
    private float pressure;
    private float humidity;
    private double heatIndex;

    public HeatIndexDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Heat index: " + heatIndex);
    }

    @Override
    public void update(float temperature, float pressure, float humidity) {
        double heatIndex = 16.923 + 1.85212 * Math.pow(10,-1) * temperature + 5.37941 * humidity - 1.00254 * Math.pow(10,-1) * temperature*humidity
                + 9.41685 * Math.pow(10,-3) * Math.pow(temperature,2) + 7.28898 *Math.pow(10,-3) *Math.pow(humidity,2) +
                3.45372 * Math.pow(10,-4) *Math.pow(temperature,2) * humidity - 8.14971 * Math.pow(10,-4) *temperature *Math.pow(humidity,2);
        this.heatIndex = heatIndex;
        display();
    }
}
