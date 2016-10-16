package com.aeps.sandbox.headfirst.chapter06;

/**
 * Created by Alejandro on 10/16/2016.
 */
public class CommandPattern {

    public CommandPattern() {
        RemoteControl remote = new RemoteControl();

        remote.pushOnButton(0);
        remote.pushOffButton(0);

        remote.pushOnButton(1);
        remote.pushOffButton(1);

        remote.pushOnButton(2);
        remote.pushOffButton(2);

        remote.pushUndoButton();
    }

    public static void main(String[] args) {
        new CommandPattern();
    }

}