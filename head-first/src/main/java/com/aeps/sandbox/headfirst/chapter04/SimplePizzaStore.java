package com.aeps.sandbox.headfirst.chapter04;

/**
 * Created by Alejandro on 10/15/2016.
 */
public class SimplePizzaStore {

    private SimplePizzaFactory factory;

    public SimplePizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        return factory.createPizza(type);
    }

}