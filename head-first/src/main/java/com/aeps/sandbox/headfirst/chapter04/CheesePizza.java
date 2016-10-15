package com.aeps.sandbox.headfirst.chapter04;

/**
 * Created by Alejandro on 10/15/2016.
 */
public class CheesePizza extends Pizza {

    protected PizzaIngredientFactory ingredientFactory;

    public CheesePizza() {}

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    protected void prepare() {
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
    }

}