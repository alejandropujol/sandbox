package com.aeps.sandbox.headfirst.chapter01;

/**
 * Created by Alejandro on 10/10/2016.
 */
public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }

}