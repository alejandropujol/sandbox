package com.aeps.sandbox.headfirst.chapter09;

/**
 * Created by Alejandro on 10/18/2016.
 */
public class Waitress {

    private MenuComponent allMenues;

    public Waitress(MenuComponent allMenues) {
        this.allMenues = allMenues;
    }

    public void printMenu() {
        allMenues.print();
    }

}