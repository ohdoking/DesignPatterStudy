package com.ohdoking.designpattern.day1.duck.nopattern;

public class TestMain {

	public static void main(String[] args) {
		Duck mallardDuck = new MallardDuck();
		mallardDuck.display();
		mallardDuck.fly();
		
		Duck redHeadDuck = new RedHeadDuck();
		redHeadDuck.display();
		redHeadDuck.fly();
		
		Duck rubberDuck = new RubberDuck();
		rubberDuck.display();
		rubberDuck.fly();
	}
}
