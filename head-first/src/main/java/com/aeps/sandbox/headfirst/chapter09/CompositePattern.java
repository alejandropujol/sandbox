package com.aeps.sandbox.headfirst.chapter09;

/**
 * Created by Alejandro on 10/18/2016.
 */
public class CompositePattern {

    public CompositePattern() {

        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course!");

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        pancakeHouseMenu.add(new MenuItem("Pancakes with Syrup", "3 Pancakes covered with Syrup", true, 3.99));
        pancakeHouseMenu.add(new MenuItem("Scrambled Eggs", "2 Scrambled Eggs with Ham", true, 5.99));

        dinerMenu.add(new MenuItem("Double Cheese Burger", "Hamburger with Cheese", true, 6.49));
        dinerMenu.add(new MenuItem("Pasta", "Spaghetti with Marinara Sauce", true, 7.99));
        dinerMenu.add(dessertMenu);

        cafeMenu.add(new MenuItem("Pizza", "Pizza with Ham and Mushrooms", true, 11.99));

        Waitress waitress = new Waitress(allMenus);

        waitress.printMenu();
    }

    public static void main(String[] args) {
        new CompositePattern();
    }

}