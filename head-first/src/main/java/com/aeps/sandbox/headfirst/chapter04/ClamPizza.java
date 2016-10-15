package com.aeps.sandbox.headfirst.chapter04;

/**
 * Created by Alejandro on 10/15/2016.
 */
public class ClamPizza extends Pizza {

    protected PizzaIngredientFactory ingredientFactory;

    public ClamPizza() {}

    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    protected void prepare() {
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
    }

}