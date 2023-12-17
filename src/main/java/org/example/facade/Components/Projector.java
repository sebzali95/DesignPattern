package org.example.facade.Components;

public class Projector implements Multiplayer{

    @Override
    public void on() {
        System.out.println("Projector active");
    }

    @Override
    public void off() {
        System.out.println("Projector is not active");
    }
}
