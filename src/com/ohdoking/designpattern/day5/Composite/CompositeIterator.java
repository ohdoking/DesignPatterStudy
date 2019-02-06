package com.ohdoking.designpattern.day5.Composite;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator {
    Stack<Iterator> stack = new Stack();
    public CompositeIterator(Iterator<MenuComponent> iterator) {
        stack.push(iterator);
    }


    @Override
    public boolean hasNext() {
        if(stack.isEmpty()){
            return false;
        }
        else{
            Iterator iterator = stack.peek();
            if(!iterator.hasNext()){
                stack.pop();
                return hasNext();
            }
            else{
                return true;
            }
        }
    }

    @Override
    public Object next() {
        if(hasNext()){
            Iterator iterator = stack.iterator();
            MenuComponent component = (MenuComponent) iterator.next();
            if(component instanceof  Menu){
                stack.push(component.createIterator());
            }
            return component;
        }
        else{
            return null;
        }
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
