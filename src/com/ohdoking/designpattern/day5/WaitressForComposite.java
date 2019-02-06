package com.ohdoking.designpattern.day5;

import com.ohdoking.designpattern.day5.Composite.Menu;
import com.ohdoking.designpattern.day5.Composite.MenuComponent;

import java.util.Iterator;

public class WaitressForComposite {
    MenuComponent allMenus;

    public WaitressForComposite(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }


    public void printMenu(){
        allMenus.print();
    }

    public void printVegiterianMenu(){
        Iterator iterator = allMenus.createIterator();
        System.out.println("------------ Vegitarian Menu ------------");
        while(iterator.hasNext()){
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            try{
                if(menuComponent.isVegetarian()){
                    menuComponent.print();
                }
            }
            catch (UnsupportedOperationException e){
                e.printStackTrace();
            }
        }
    }
}
