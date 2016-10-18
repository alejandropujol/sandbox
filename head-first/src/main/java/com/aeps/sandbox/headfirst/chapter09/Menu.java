package com.aeps.sandbox.headfirst.chapter09;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Alejandro on 10/18/2016.
 */
public class Menu extends MenuComponent {

    private List<MenuComponent> menuComponents = new ArrayList<>();

    private String name;

    private String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int index) {
        return menuComponents.get(index);
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
    public void print() {
        System.out.println(MessageFormat.format("{0}, {1}", getName(), getDescription()));
        System.out.println("-----------------------------");

        Iterator<MenuComponent> iterator = menuComponents.iterator();

        while (iterator.hasNext()) {
            iterator.next().print();
        }
    }

}