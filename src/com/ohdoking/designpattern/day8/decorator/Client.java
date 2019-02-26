package com.ohdoking.designpattern.day8.decorator;

public class Client {
  public static void main(String[] args) {
      Display road = new RoadDisplay();
      road.display();
      Display roadWithLane = new LaneDecorator(new RoadDisplay());
      roadWithLane.display();
      Display roadWithTraffic = new TrafficDecorator(new RoadDisplay());
      roadWithTraffic.display();
  }
}