package com.aeps.sandbox.headfirst.chapter07;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Created by Alejandro on 10/17/2016.
 */
public class EnumerationIterator<T> implements Iterator<T> {

    private Enumeration<T> enumeration;

    public EnumerationIterator(Enumeration<T> enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public T next() {
        return enumeration.nextElement();
    }

}