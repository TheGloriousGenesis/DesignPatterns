package main.observer_pattern.WeatherData.models;

import main.observer_pattern.WeatherData.behaviour.Observer;
import main.observer_pattern.WeatherData.behaviour.Subject;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObeservers() {
        observers.forEach(ob -> {
            ((Observer) ob).update(temperature, pressure, humidity);
        });
    }

    public void measurementsChanged() {
        notifyObeservers();
    }

    public void setMeasurements(final float temperature, final float humidity, final float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
