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
 *
 */
public class Waitress {
    Menu pancakeHouseMenu;
    Menu dinnerMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinnerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinnerMenu = dinnerMenu;
    }

    public void printMenu(){
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinnerIterator = dinnerMenu.createIterator();
        System.out.println("---------- Menu -----------");
        System.out.println("------ Morning Menu -------");
        printMenu(pancakeIterator);
        System.out.println("------- Lunch Menu --------");
        printMenu(dinnerIterator);
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

        Waitress w = new Waitress(phm, dm);
        w.printMenu();
    }
}
