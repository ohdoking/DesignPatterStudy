package com.ohdoking.designpattern.day5.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeMenuIterator implements Iterator{

    ArrayList menuList;
    int position = 0;

    public PancakeMenuIterator(ArrayList menuList) {
        this.menuList = menuList;
    }

    @Override
    public boolean hasNext() {
        if(position >= menuList.size()){
            return false;
        }
        else{
            return true;
        }
    }

    @Override
    public Object next() {
        return menuList.get(position++);
    }

    @Override
    public void remove() {
        menuList.remove(0);
    }


}
