package com.ohdoking.designpattern.day5;

public class DinnerMenu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinnerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("vegeterian BLT", "Menu with (vegeterian)bacon, lettuce and tomato on top of whole wheat", true, 2.99);
        addItem("BLT", "Menu with bacon, lettuce and tomato on top of whole wheat", false, 2.99);
        addItem("Today soup", "Today soup with potato salad", false, 3.29);
        addItem("Hotdog", "Hotdog with shower crout, all seasoned, onion, cheese.", true, 2.99);
    }

    private void addItem(String name, String description, boolean vegeterian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegeterian, price);
        if(numberOfItems >= MAX_ITEMS){
            System.err.println("Sorry, menu is full, you can't add anymore.");
        }
        else{
            menuItems[numberOfItems] = menuItem;
            numberOfItems += 1;
        }
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    //method related in etc menu.
}
