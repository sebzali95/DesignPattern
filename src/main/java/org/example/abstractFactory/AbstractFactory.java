package org.example.abstractFactory;

public class AbstractFactory {

    public static Car getCar(String type) {
        if ("Sedan".equalsIgnoreCase(type)) {
            return new Sedan();
        } else if ("HatchBack".equalsIgnoreCase(type)) {
            return new HatchBack();
        }
        return null;
    }
}
