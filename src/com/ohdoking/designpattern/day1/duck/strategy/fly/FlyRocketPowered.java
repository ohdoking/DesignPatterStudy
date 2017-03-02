package com.ohdoking.designpattern.day1.duck.strategy.fly;

public class FlyRocketPowered implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("Rocket Fly!!");
	}

}
