package com.aeps.sandbox.headfirst.chapter08;

/**
 * Created by Alejandro on 10/18/2016.
 */
public class TemplatePattern {

    public TemplatePattern() {
        Tea tea = new Tea();
        tea.prepareRecipe();

        System.out.println("------------------------------------------");

        Coffee coffee = new Coffee();
        coffee.prepareRecipe();
    }

    public static void main(String[] args) {
        new TemplatePattern();
    }

}