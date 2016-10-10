package com.aeps.sandbox.headfirst.chapter01;

/**
 * Created by Alejandro on 10/10/2016.
 */
public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }

}
