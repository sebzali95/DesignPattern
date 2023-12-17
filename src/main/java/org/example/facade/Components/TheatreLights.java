package org.example.facade.Components;

public class TheatreLights implements Multiplayer{

    @Override
    public void on() {
        System.out.println("TheatreLights  active");
    }

    @Override
    public void off() {
        System.out.println("TheatreLights is not active");
    }
}
