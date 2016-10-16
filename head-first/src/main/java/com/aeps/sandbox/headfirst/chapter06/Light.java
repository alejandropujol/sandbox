package com.aeps.sandbox.headfirst.chapter06;

/**
 * Created by Alejandro on 10/16/2016.
 */
public class Light {

    private String location;

    public Light(String location) {
        this.location = location;
    }

    public void turnOn() {
        System.out.println("Light in " + location + " was turned on");
    }

    public void turnOff() {
        System.out.println("Light in " + location + " was turned off");
    }

    @Override
    public String toString() {
        return "Light(" + location + ")";
    }

}