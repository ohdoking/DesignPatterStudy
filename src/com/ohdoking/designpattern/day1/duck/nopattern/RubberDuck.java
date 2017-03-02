package com.ohdoking.designpattern.day1.duck.nopattern;

public class RubberDuck extends Duck {

	@Override
	public void quack(){
		System.out.println("pickpick");
	}
	
	@Override
	public void display(){
		System.out.println("I'm rubberduck");
	}
	
	@Override
	public void fly(){
		
	}
}
