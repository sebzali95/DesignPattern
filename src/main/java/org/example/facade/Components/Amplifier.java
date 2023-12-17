package org.example.facade.Components;

public class Amplifier implements Multiplayer{

    @Override
    public void on() {
        System.out.println("Amplifier active");
    }

    @Override
    public void off() {
        System.out.println("Amplifier is not active");
    }
}
