package org.example.decorator;

import org.example.decorator.condiments.Cheese;
import org.example.decorator.condiments.Pepper;
import org.example.decorator.food.Pizza;

public class Main {

    public static void main(String[] args) {

        var pizza = new Pizza();
        var pizzaWithCheese = new Cheese(pizza);
        var pizzaWithCheeseWithPepper = new Pepper(pizzaWithCheese);
        var pizzaWithCheeseWithPepperWithCheese = new Cheese(pizzaWithCheeseWithPepper);
        var pizzaWithCheeseWithPepperWithCheeseWithPepper = new Pepper(pizzaWithCheeseWithPepperWithCheese);


        System.out.println(pizza.getDescription() + " " + pizza.cost());
        System.out.println(pizzaWithCheese.getDescription() + " " + pizzaWithCheese.cost());
        System.out.println(pizzaWithCheeseWithPepper.getDescription() + " " + pizzaWithCheeseWithPepper.cost());
        System.out.println(pizzaWithCheeseWithPepperWithCheese.getDescription() + " " + pizzaWithCheeseWithPepperWithCheese.cost());
        System.out.println(pizzaWithCheeseWithPepperWithCheeseWithPepper.getDescription() + " " + pizzaWithCheeseWithPepperWithCheeseWithPepper.cost());

    }
}
