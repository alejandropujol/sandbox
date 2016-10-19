package com.aeps.sandbox.headfirst.chapter10;

/**
 * Created by Alejandro on 10/19/2016.
 */
public class StatePattern {

    public StatePattern() {
        GumballMachine gumballMachine = new GumballMachine(100);
        System.out.println(gumballMachine);

        for (int i = 0; i < 100; i++) {
            gumballMachine.insertQuarter();
            gumballMachine.turnCrank();
            System.out.println(gumballMachine);
        }
    }

    public static void main(String[] args) {
        new StatePattern();
    }

}