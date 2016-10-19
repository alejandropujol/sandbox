package com.aeps.sandbox.headfirst.chapter10;

/**
 * Created by Alejandro on 10/19/2016.
 */
public class SoldOutState implements State {

    private GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert a quarter, the gumball machine is sold out");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned, but the gumball machine is sold out");
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed, the gumball machine is sold out");
    }

    @Override
    public String toString() {
        return "Sold Out State";
    }

}