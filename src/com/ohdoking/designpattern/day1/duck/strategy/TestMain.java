package com.ohdoking.designpattern.day1.duck.strategy;

import com.ohdoking.designpattern.day1.duck.strategy.fly.FlyRocketPowered;

public class TestMain {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		
		mallard.performFly();
		mallard.performQuack();
		
		Duck rubber = new RubberDuck();
		rubber.performFly();
		rubber.performQuack();
		
		
		Duck model  = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
