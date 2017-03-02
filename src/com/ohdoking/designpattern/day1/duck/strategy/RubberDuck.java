package com.ohdoking.designpattern.day1.duck.strategy;

import com.ohdoking.designpattern.day1.duck.strategy.fly.FlyNoWay;
import com.ohdoking.designpattern.day1.duck.strategy.quack.Squeak;

public class RubberDuck extends Duck {

	public RubberDuck(){
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squeak();
	}
	
	@Override
	public void display() {
		System.out.println("RubberDuck!!!!");
	}

}
