package org.example.observer;

public class Main {

    public static void main(String[] args) {

        IOServer ioServer = new Monitor();
        var weatherStation = new WeatherStation();

        weatherStation.addObServer(ioServer);
        weatherStation.setHumidity(100);
    }
}
