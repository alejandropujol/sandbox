package com.aeps.sandbox.headfirst.chapter04;

/**
 * Created by Alejandro on 10/15/2016.
 */
public class VeggiePizza extends Pizza {

    protected PizzaIngredientFactory ingredientFactory;

    public VeggiePizza() {}

    public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    protected void prepare() {
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
    }

}