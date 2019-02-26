package com.ohdoking.designpattern.day8.decorator;

public class TrafficDecorator extends DisplayDacorator {

  public TrafficDecorator(Display decoratedDisplay) {
      super(decoratedDisplay);
  }

  @Override
  public void display() {
      super.display();
      drawTraffic();
  }

  private void drawTraffic() {
      System.out.println("draw traffic volume");
  }
}