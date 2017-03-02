package com.ohdoking.designpattern.day1.duck.strategy.quack;

public class Squeak implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Squeak!Squeak!");
	}

}
