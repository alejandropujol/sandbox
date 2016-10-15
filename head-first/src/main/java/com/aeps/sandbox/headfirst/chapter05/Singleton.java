package com.aeps.sandbox.headfirst.chapter05;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Alejandro on 10/14/2016.
 */
public class Singleton {

    private static Singleton singleton;

    private AtomicInteger reference;

    private Singleton() {
        reference = new AtomicInteger(0);
    }

    public static synchronized Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    public int getReference() {
        return reference.incrementAndGet();
    }

}