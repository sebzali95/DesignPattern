package org.example.facade.Components;

public class Screen implements Multiplayer {

    @Override
    public void on() {
        System.out.println("Screen  active");
    }

    @Override
    public void off() {
        System.out.println("Screen is not active");
    }
}
