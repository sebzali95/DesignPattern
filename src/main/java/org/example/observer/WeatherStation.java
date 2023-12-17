package org.example.observer;

import java.util.ArrayList;

public class WeatherStation implements ISubject {
    private final ArrayList<IOServer> ioServers;

    private double temperature;
    private double pressure;
    private double humidity;

    public WeatherStation() {
        ioServers = new ArrayList<>();
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        notifyObServer();
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
        notifyObServer();
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
        notifyObServer();
    }

    @Override
    public void addObServer(IOServer ioServer) {
        ioServers.add(ioServer);
    }

    @Override
    public void removeObServer(IOServer ioServer) {
        int index = ioServers.indexOf(ioServer);
        if (index >= 0) {
            ioServers.remove(ioServer);
        }
    }

    @Override
    public void notifyObServer() {
        for (int i = 0; i < ioServers.size(); i++) {
            ioServers.get(i).update(this.pressure, this.temperature, this.humidity);
        }

    }
}
