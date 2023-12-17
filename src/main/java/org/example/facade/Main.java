package org.example.facade;
import org.example.facade.Components.*;

public class Main {
    public static void main(String[] args) {
        var theaterFacade = new HomeTheaterFacade(
                new Amplifier(),
                new Tuner(),
                new DvdPlayer(),
                new CdPlayer(),
                new Projector(),
                new TheatreLights(),
                new Screen(),
                new PopcornPopper());

        theaterFacade.watchMovie("Troy");
        System.out.println("--------------------------------");
        theaterFacade.endMovie();
    }
}
