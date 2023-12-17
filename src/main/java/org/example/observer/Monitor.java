package org.example.observer;

public class Monitor implements IOServer {
    @Override
    public void update(double temperature, double humidity, double pressure) {
        System.out.println("temp: " + temperature + " humidity: " + humidity + " pressure " + pressure);
    }
}
