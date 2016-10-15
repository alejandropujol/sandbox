package com.aeps.sandbox.headfirst.chapter05;

/**
 * Created by Alejandro on 10/14/2016.
 */
public class SingletonPattern {

    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            new Thread(() -> {
                Singleton singleton = Singleton.getInstance();
                System.out.println(Thread.currentThread().getId() + " -> " + singleton.getReference());
            }).start();
        }
    }

}