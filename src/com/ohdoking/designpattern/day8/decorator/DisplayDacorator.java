package com.ohdoking.designpattern.day8.decorator;

public abstract class DisplayDacorator extends Display {

    private Display decoratedDisplay;

    public DisplayDacorator(Display decoratedDisplay) {
        this.decoratedDisplay = decoratedDisplay;
    }

    @Override
    public void display() {
        decoratedDisplay.display();
    }
}
