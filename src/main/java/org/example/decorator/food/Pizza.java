package org.example.decorator.food;

public class Pizza extends Food {

    public Pizza() {
        description = "Food.Pizza";
    }

    @Override
    public double cost() {
        return 3.0;
    }
}
