package com.ohdoking.designpattern.day1.duck.strategy.quack;

public class Quack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("quack!quack!");
	}

}
