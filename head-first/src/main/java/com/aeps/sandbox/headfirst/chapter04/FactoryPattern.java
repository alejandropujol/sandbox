package com.aeps.sandbox.headfirst.chapter04;

/**
 * Created by Alejandro on 10/15/2016.
 */
public class FactoryPattern {

    public FactoryPattern() {
        /** Simple Factory */
        SimplePizzaStore simplePizzaStore = new SimplePizzaStore(new SimplePizzaFactory());

        System.out.println(simplePizzaStore.orderPizza("cheese").getClass().getSimpleName());
        System.out.println(simplePizzaStore.orderPizza("pepperoni").getClass().getSimpleName());
        System.out.println(simplePizzaStore.orderPizza("clam").getClass().getSimpleName());
        System.out.println(simplePizzaStore.orderPizza("veggie").getClass().getSimpleName());

        /** Factory Method + Abstract Factory */
        AbstractPizzaStore nyPizzaStore = new NYPizzaStore();

        Pizza nyCheesePizza = nyPizzaStore.orderPizza("cheese");
        System.out.println(nyCheesePizza.getClass().getSimpleName() + " :: " + nyCheesePizza.getDough().getClass().getSimpleName() + " :: " + nyCheesePizza.getSauce().getClass().getSimpleName());

        Pizza nyPepperoniPizza = nyPizzaStore.orderPizza("pepperoni");
        System.out.println(nyPepperoniPizza.getClass().getSimpleName() + " :: " + nyPepperoniPizza.getDough().getClass().getSimpleName() + " :: " + nyPepperoniPizza.getSauce().getClass().getSimpleName());

        AbstractPizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        Pizza chicagoCheesePizza = chicagoPizzaStore.orderPizza("cheese");
        System.out.println(chicagoCheesePizza.getClass().getSimpleName() + " :: " + chicagoCheesePizza.getDough().getClass().getSimpleName() + " :: " + chicagoCheesePizza.getSauce().getClass().getSimpleName());

        Pizza chicagoPepperoniPizza = chicagoPizzaStore.orderPizza("pepperoni");
        System.out.println(chicagoPepperoniPizza.getClass().getSimpleName() + " :: " + chicagoPepperoniPizza.getDough().getClass().getSimpleName() + " :: " + chicagoPepperoniPizza.getSauce().getClass().getSimpleName());
    }

    public static void main(String[] args) {
        new FactoryPattern();
    }

}