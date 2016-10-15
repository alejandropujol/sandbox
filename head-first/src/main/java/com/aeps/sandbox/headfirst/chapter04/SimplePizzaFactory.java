package com.aeps.sandbox.headfirst.chapter04;

/**
 * Created by Alejandro on 10/15/2016.
 */
public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        switch (type) {
            case "cheese":
                return new CheesePizza();
            case "pepperoni":
                return new PepperoniPizza();
            case "clam":
                return new ClamPizza();
            case "veggie":
                return new VeggiePizza();
            default:
                throw new RuntimeException("Invalid pizza type");
        }
    }

}