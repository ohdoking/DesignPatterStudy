package com.ohdoking.designpattern.day8.decorator;

public class RoadDisplayWithLane extends RoadDisplay {
    public void display(){
        super.display();
        drawLane();
    }

    private void drawLane() {
        System.out.println("draw lane");
    }
}
