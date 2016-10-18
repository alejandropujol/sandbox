package com.aeps.sandbox.headfirst.chapter08;

import java.util.Scanner;

/**
 * Created by Alejandro on 10/18/2016.
 */
public class Tea extends CaffeineBeverage {

    @Override
    protected void brew() {
        System.out.println("Steeping the tea...");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding lemon...");
    }

    @Override
    protected boolean customerWantsCondiments() {
        System.out.println("Would you like lemon with your tea? (y/n): ");

        String answer = new Scanner(System.in).nextLine();

        return answer.equalsIgnoreCase("y");
    }

}