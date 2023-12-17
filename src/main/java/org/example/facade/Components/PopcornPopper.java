package org.example.facade.Components;

public class PopcornPopper implements Multiplayer{

    @Override
    public void on() {
        System.out.println("PopcornPopper active");
    }

    @Override
    public void off() {
        System.out.println("PopcornPopper is not active");
    }
}
