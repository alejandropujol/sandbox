package com.aeps.sandbox.headfirst.chapter03;

/**
 * Created by Alejandro on 10/12/2016.
 */
public class DecorationPattern {

    public DecorationPattern() {
        Dessert iceCream = new ChocolateSyrup(new IceCream());
        Dessert cheeseCake = new Marmalade(new CheeseCake());
        Dessert cheeseCake2 = new Marmalade(new Marmalade(new CheeseCake()));

        System.out.println(iceCream.getDescription().concat(" Bs").concat(String.valueOf(iceCream.getPrice())));
        System.out.println(cheeseCake.getDescription().concat(" Bs").concat(String.valueOf(cheeseCake.getPrice())));
        System.out.println(cheeseCake2.getDescription().concat(" Bs").concat(String.valueOf(cheeseCake2.getPrice())));
    }

    public static void main(String[] args) {
        new DecorationPattern();
    }

}