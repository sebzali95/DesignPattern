package org.example.facade.Components;

public class DvdPlayer implements Multiplayer {

    @Override
    public void on() {
        System.out.println("DvdPlayer active");
    }

    @Override
    public void off() {
        System.out.println("DvdPlayer is not active");
    }
}
