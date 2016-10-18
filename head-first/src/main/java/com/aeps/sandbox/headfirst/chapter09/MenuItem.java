package com.aeps.sandbox.headfirst.chapter09;

import java.text.MessageFormat;

/**
 * Created by Alejandro on 10/18/2016.
 */
public class MenuItem extends MenuComponent {

    private String name;

    private String description;

    private boolean vegetarian;

    private double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.println(MessageFormat.format("{0}{1}, {2, number, currency} -- {3}", getName(), isVegetarian() ? "(v)" : "", getPrice(), getDescription()));
    }

}