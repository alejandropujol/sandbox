package com.aeps.sandbox.headfirst.chapter04;

/**
 * Created by Alejandro on 10/15/2016.
 */
public class ChicagoPizzaStore extends AbstractPizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        switch (type) {
            case "cheese":
                return new ChicagoStyleCheesePizza(new ChicagoPizzaIngredientFactory());
            case "pepperoni":
                return new ChicagoStylePepperoniPizza(new ChicagoPizzaIngredientFactory());
            default:
                throw new RuntimeException("Invalid pizza type");
        }
    }

}