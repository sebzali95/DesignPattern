package org.example.observer;

public interface ISubject {

    void addObServer(IOServer ioServer);

    void removeObServer(IOServer ioServer);

    void notifyObServer();
}
