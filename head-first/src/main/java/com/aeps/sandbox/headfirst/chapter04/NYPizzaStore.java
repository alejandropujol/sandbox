package com.aeps.sandbox.headfirst.chapter04;

/**
 * Created by Alejandro on 10/15/2016.
 */
public class NYPizzaStore extends AbstractPizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        switch (type) {
            case "cheese":
                return new NYStyleCheesePizza(new NYPizzaIngredientFactory());
            case "pepperoni":
                return new NYStylePepperoniPizza(new NYPizzaIngredientFactory());
            default:
                throw new RuntimeException("Invalid pizza type");
        }
    }

}