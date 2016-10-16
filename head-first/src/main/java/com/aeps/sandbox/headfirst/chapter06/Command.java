package com.aeps.sandbox.headfirst.chapter06;

/**
 * Created by Alejandro on 10/16/2016.
 */
public interface Command {

    public void execute();

    public void undo();

}