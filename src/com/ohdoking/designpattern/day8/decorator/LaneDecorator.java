package com.ohdoking.designpattern.day8.decorator;

public class LaneDecorator extends DisplayDacorator {
    public LaneDecorator(Display decoratedDisplay) {
        super(decoratedDisplay);
    }

    @Override
    public void display() {
        super.display();
        drawLane();
    }

    private void drawLane() {
        System.out.println("draw lane");
    }
}