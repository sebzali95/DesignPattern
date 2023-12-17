package org.example.abstractFactory;

public class Main {
    public static void main(String[] args) {
        Car hatchBackCar = AbstractFactory.getCar("HatchBack");
        Car sedanCar = AbstractFactory.getCar("Sedan");

        System.out.println(sedanCar.getTip());
        System.out.println(hatchBackCar.getTip());
    }
}
