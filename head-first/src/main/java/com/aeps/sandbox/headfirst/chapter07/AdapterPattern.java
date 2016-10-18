package com.aeps.sandbox.headfirst.chapter07;

import java.util.Iterator;
import java.util.Vector;

/**
 * Created by Alejandro on 10/17/2016.
 */
public class AdapterPattern {

    public AdapterPattern() {
        Vector<String> animals = new Vector<>();

        animals.add("Dog");
        animals.add("Cat");
        animals.add("Mouse");

        Iterator<String> iterator = new EnumerationIterator<String>(animals.elements());

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        new AdapterPattern();
    }

}