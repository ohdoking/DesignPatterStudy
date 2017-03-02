package com.ohdoking.designpattern.day1.duck.strategy.quack;

import com.ohdoking.designpattern.day1.duck.strategy.Duck;
import com.ohdoking.designpattern.day1.duck.strategy.fly.FlyNoWay;

public class ModelDuck extends Duck{

	public ModelDuck(){
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("I'm Duck Model");
	}
}
