package main.observer_pattern.WeatherData.behaviour;

public interface Observer {
    void update(float temperature, float pressure, float humidity);
}
