package org.example.facade.Components;

public class CdPlayer implements Multiplayer {

    @Override
    public void on() {
        System.out.println("CdPlayer active");
    }

    @Override
    public void off() {
        System.out.println("CdPlayer is not active");
    }
}
