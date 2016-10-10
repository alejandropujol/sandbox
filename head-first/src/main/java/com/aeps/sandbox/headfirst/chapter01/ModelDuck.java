package com.aeps.sandbox.headfirst.chapter01;

/**
 * Created by Alejandro on 10/10/2016.
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }

}