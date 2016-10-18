package com.aeps.sandbox.headfirst.chapter07;

/**
 * Created by Alejandro on 10/17/2016.
 */
public class FacadePattern {

    public FacadePattern() {
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(new Amplifier(), new BlurayPlayer());

        homeTheater.watchMovie();
        homeTheater.endMovie();
    }

    public static void main(String[] args) {
        new FacadePattern();
    }

}