package com.ohdoking.designpattern.day5;

import com.ohdoking.designpattern.day5.iterator.Iterator;

public class Waitress {
    PancakeHouseMenu pancakeHouseMenu;
    DinnerMenu dinnerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinnerMenu dinnerMenu) {
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
