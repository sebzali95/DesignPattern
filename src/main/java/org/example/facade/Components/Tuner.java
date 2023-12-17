package org.example.facade.Components;

public class Tuner implements Multiplayer {

    @Override
    public void on() {
        System.out.println("Tuner  active");
    }

    @Override
    public void off() {
        System.out.println("Tuner is not active");
    }
}
