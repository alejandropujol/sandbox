package com.aeps.sandbox.headfirst.chapter03;

/**
 * Created by Alejandro on 10/12/2016.
 */
public class Marmalade extends DessertTopping {

    public Marmalade(Dessert dessert) {
        this.dessert = dessert;
    }

    @Override
    public String getDescription() {
        return dessert.getDescription().concat(", Marmalade");
    }

    @Override
    public float getPrice() {
        return dessert.getPrice() + 400.00f;
    }

}