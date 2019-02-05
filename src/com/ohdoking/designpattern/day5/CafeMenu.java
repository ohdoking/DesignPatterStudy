package com.ohdoking.designpattern.day5;

import com.ohdoking.designpattern.day5.iterator.Menu;

import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu implements Menu {

    Hashtable menuItems = new Hashtable();

    public CafeMenu() {
        addItem("Vegi buger and air frie", "vegi buger with whole meal bread, lettect, tomato, potato frie", true, 3.99);
        addItem("Today soup", "vegi buger with whole meal bread, lettect, tomato, potato frie", true, 3.99);
        addItem("Buritto", "Buritto with a lot of pinto bean and salsa, cuakamoly", true, 3.99);
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }

    @Override
    public Iterator createIterator() {
        //hashtable just return values's iterator no more than all's iterator
        return menuItems.values().iterator();
    }
}
