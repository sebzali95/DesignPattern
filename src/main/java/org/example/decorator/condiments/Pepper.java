package org.example.decorator.condiments;

import org.example.decorator.food.Food;

public class Pepper extends CondimentsDecorator {

    private final Food food;

    public Pepper(Food food) {
        this.food = food;
    }

    @Override
    public String getDescription() {
        return food.getDescription() + " , Pepper";
    }

    @Override
    public double cost() {
        return food.cost() + 2.0;
    }
}
