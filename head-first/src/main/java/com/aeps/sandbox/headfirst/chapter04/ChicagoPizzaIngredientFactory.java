package com.aeps.sandbox.headfirst.chapter04;

/**
 * Created by Alejandro on 10/15/2016.
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new MultigrainDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

}