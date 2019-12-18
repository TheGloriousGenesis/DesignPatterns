package main.observer_pattern.WeatherData.behaviour;

public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObeservers();
}
