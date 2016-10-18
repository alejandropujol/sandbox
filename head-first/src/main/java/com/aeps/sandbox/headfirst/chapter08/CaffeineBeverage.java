package com.aeps.sandbox.headfirst.chapter08;

/**
 * Created by Alejandro on 10/18/2016.
 */
public abstract class CaffeineBeverage {

    public void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    protected void boilWater() {
        System.out.println("Boiling water...");
    }

    protected void pourInCup() {
        System.out.println("Pouring into cup...");
    }

    protected abstract void brew();

    protected abstract void addCondiments();

    /** Hooks */

    protected boolean customerWantsCondiments() {
        return true;
    }

}