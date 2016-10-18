package com.aeps.sandbox.headfirst.chapter08;

/**
 * Created by Alejandro on 10/18/2016.
 */
public class Coffee extends CaffeineBeverage {

    @Override
    protected void brew() {
        System.out.println("Dripping coffee through filter...");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding milk and sugar...");
    }

}