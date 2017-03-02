package com.ohdoking.designpattern.day1.duck.strategy.fly;

public class FlyWithWing implements FlyBehavior {

	@Override
	public void fly() {

		System.out.println("I'm Fly");
	}

}
