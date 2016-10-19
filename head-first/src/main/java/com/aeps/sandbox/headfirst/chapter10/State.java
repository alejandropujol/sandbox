package com.aeps.sandbox.headfirst.chapter10;

/**
 * Created by Alejandro on 10/19/2016.
 */
public interface State {

    public void insertQuarter();

    public void ejectQuarter();

    public void turnCrank();

    public void dispense();

}