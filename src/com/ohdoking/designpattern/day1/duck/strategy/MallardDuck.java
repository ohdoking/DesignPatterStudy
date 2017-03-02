package com.ohdoking.designpattern.day1.duck.strategy;

import com.ohdoking.designpattern.day1.duck.strategy.fly.FlyWithWing;
import com.ohdoking.designpattern.day1.duck.strategy.quack.Quack;

public class MallardDuck extends Duck {

	public MallardDuck(){
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWing();
	}
	
	@Override
	public void display(){
		System.out.println("mallard duck");
	}
}
