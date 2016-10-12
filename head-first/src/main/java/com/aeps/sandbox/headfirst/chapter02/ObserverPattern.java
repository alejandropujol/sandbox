package com.aeps.sandbox.headfirst.chapter02;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Alejandro on 10/11/2016.
 */
public class ObserverPattern {

    public ObserverPattern() {
        MyObservable myObservable = new MyObservable();

        Observer observer1 = new Observer() {
            @Override
            public void update(Observable o, Object arg) {
                System.out.println("My name is Alejandro and I get " + arg.toString());
            }
        };

        Observer observer2 = new Observer() {
            @Override
            public void update(Observable o, Object arg) {
                System.out.println("My name is Isa and I get " + arg.toString());
            }
        };

        myObservable.addObserver(observer1);

        myObservable.setChanged();
        myObservable.notifyObservers("A");

        myObservable.addObserver(observer2);

        myObservable.setChanged();
        myObservable.notifyObservers("B");

        myObservable.setChanged();
        myObservable.notifyObservers("C");

        myObservable.deleteObserver(observer1);

        myObservable.setChanged();
        myObservable.notifyObservers("D");

        myObservable.setChanged();
        myObservable.notifyObservers("E");
    }

    public static void main(String[] args) {
        new ObserverPattern();
    }

    private class MyObservable extends Observable {
        @Override
        public synchronized void setChanged() {
            super.setChanged();
        }
    }

}