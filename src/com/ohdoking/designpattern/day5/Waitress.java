package com.ohdoking.designpattern.day5;

import com.ohdoking.designpattern.day5.iterator.Menu;
import java.util.Iterator;

/**
 * simulate iterator pattern.
 *
 * if you use iterator pattern,
 * you can access all list in the aggregate without exposing inner implementation method.
 *
 *
 * simulate composite pattern
 *
 * if you use composite pattern, you can build object as tree type that has node composite and individual object
 * (The Composite pattern allows you to build objects in a tree-like configuration with objects and individual objects as nodes.)
 *
 *
 */
public class Waitress {
    Menu pancakeHouseMenu;
    Menu dinnerMenu;
    Menu cafeMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinnerMenu, Menu cafeMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinnerMenu = dinnerMenu;
        this.cafeMenu = cafeMenu;
    }

    public void printMenu(){
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinnerIterator = dinnerMenu.createIterator();
        Iterator cafeIterator = cafeMenu.createIterator();
        System.out.println("---------- Menu -----------");
        System.out.println("------ Morning Menu -------");
        printMenu(pancakeIterator);
        System.out.println("------- Lunch Menu --------");
        printMenu(dinnerIterator);
        System.out.println("------- Cafe Menu --------");
        printMenu(cafeIterator);
    }

    public void printMenu(Iterator iterator){
        while(iterator.hasNext()){
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.getName() + ", ");
            System.out.println(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescritpion());
        }
    }

    public static void main(String[] args) {

        PancakeHouseMenu phm = new PancakeHouseMenu();
        DinnerMenu dm = new DinnerMenu();
        CafeMenu cm = new CafeMenu();

        Waitress w = new Waitress(phm, dm, cm);
        w.printMenu();
    }
}
