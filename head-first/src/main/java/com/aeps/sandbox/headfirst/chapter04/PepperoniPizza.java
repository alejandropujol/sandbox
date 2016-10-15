package com.aeps.sandbox.headfirst.chapter04;

/**
 * Created by Alejandro on 10/15/2016.
 */
public class PepperoniPizza extends Pizza {

    protected PizzaIngredientFactory ingredientFactory;

    public PepperoniPizza() {}

    public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    protected void prepare() {
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
    }

}