package com.ohdoking.designpattern.day5;

import com.ohdoking.designpattern.day5.Composite.Menu;
import com.ohdoking.designpattern.day5.Composite.MenuComponent;

public class WaitressForComposite {
    MenuComponent allMenus;

    public WaitressForComposite(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }


    public void printMenu(){
        allMenus.print();
    }
}
