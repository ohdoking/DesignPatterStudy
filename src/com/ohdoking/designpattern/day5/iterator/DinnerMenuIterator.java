package com.ohdoking.designpattern.day5.iterator;

import com.ohdoking.designpattern.day5.MenuItem;

public class DinnerMenuIterator implements  Iterator{
    MenuItem[] items;
    int position = 0;

    public DinnerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if(position >= items.length || items[position] == null){
            return false;
        }
        else{
            return true;
        }
    }

    @Override
    public Object next() {
        return items[position++];
    }
}
