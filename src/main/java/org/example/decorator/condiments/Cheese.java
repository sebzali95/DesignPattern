package org.example.decorator.condiments;

import org.example.decorator.food.Food;

public class Cheese extends CondimentsDecorator {
    private final Food food;

    public Cheese(Food food) {
        this.food = food;
    }

    @Override
    public String getDescription() {
        return food.getDescription() + " , Cheese";
    }


    @Override
    public double cost() {
        return food.cost() + 2.5;
    }
}
