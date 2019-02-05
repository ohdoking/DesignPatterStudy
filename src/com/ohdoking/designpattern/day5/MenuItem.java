package com.ohdoking.designpattern.day5;

public class MenuItem {
    String name;
    String descritpion;
    boolean vegetarian;
    double price;

    public MenuItem(String name, String descritpion, boolean vegetarian, double price) {
        this.name = name;
        this.descritpion = descritpion;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescritpion() {
        return descritpion;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public double getPrice() {
        return price;
    }
}
