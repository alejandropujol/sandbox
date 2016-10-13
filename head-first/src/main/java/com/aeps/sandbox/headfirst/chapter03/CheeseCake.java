package com.aeps.sandbox.headfirst.chapter03;

/**
 * Created by Alejandro on 10/12/2016.
 */
public class CheeseCake implements Dessert {

    @Override
    public String getDescription() {
        return "Cheese Cake";
    }

    @Override
    public float getPrice() {
        return 4000.00f;
    }

}