package org.example.decorator.food;

public abstract class Food {
    String description;

    public String getDescription() {
        return description;
    }

    public abstract double cost();

}
