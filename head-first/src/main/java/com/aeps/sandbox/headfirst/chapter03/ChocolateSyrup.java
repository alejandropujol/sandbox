package com.aeps.sandbox.headfirst.chapter03;

/**
 * Created by Alejandro on 10/12/2016.
 */
public class ChocolateSyrup extends DessertTopping {

    public ChocolateSyrup(Dessert dessert) {
        this.dessert = dessert;
    }

    @Override
    public String getDescription() {
        return dessert.getDescription().concat(", Chocolate Syrup");
    }

    @Override
    public float getPrice() {
        return dessert.getPrice() + 250.00f;
    }

}