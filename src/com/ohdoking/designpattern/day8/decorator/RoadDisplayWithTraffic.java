package com.ohdoking.designpattern.day8.decorator;

public class RoadDisplayWithTraffic extends RoadDisplay {
   public void display() {
     super.display();
     drawTraffic();
   }
   private void drawTraffic() {
       System.out.println("draw traffic volume");
   }
}