package com.aeps.sandbox.headfirst.chapter03;

/**
 * Created by Alejandro on 10/12/2016.
 */
public class IceCream implements Dessert {

    @Override
    public String getDescription() {
        return "Ice Cream";
    }

    @Override
    public float getPrice() {
        return 2500.00f;
    }

}