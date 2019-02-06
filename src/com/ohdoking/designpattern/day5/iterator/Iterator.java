package com.ohdoking.designpattern.day5.iterator;

public interface Iterator extends java.util.Iterator {
    boolean hasNext();
    Object next();
    void remove();
}
