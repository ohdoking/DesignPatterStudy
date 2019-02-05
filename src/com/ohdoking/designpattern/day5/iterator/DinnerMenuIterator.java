package com.ohdoking.designpattern.day5.iterator;

import com.ohdoking.designpattern.day5.MenuItem;
import java.util.Iterator;

public class DinnerMenuIterator implements Iterator{
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

    @Override
    public void remove() {
        if(position <= 0 ){
            throw new IllegalStateException("you can't delete wihtout state that don't call next() one times.");
        }
        if(items[position - 1] != null){
            for(int i = position - 1; i < (items.length - 1 );i++){
                items[i] = items[i + 1];
            }
            items[items.length - 1]= null;
        }
    }
}
