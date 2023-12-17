package org.example.decorator.food;

public class Tacos extends Food {

    public Tacos() {
        description = "Food.Tacos";
    }

    @Override
    public double cost() {
        return 3.0;
    }
}
