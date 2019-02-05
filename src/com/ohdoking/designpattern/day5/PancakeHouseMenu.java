package com.ohdoking.designpattern.day5;

import com.ohdoking.designpattern.day5.iterator.Iterator;

import java.awt.*;
import java.util.ArrayList;

public class PancakeHouseMenu {
    ArrayList menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList();

        addItem("K&B pancake set", "pancake with toast and scrambled", true, 2.99);
        addItem("Regular pancake set", "pancake with sausage and egg frie", false, 2.99);
        addItem("Blueberry pancake", "pancake that made by blueberry syrup and fresh bleuberry", true, 3.49);
        addItem("Waffle", "waffle, you can put on strawberry or blueberry according to taste", true, 2.99);

    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public ArrayList getMenuItems() {
        return menuItems;
    }

    //.. and lots of code that related in arrayList.
}
