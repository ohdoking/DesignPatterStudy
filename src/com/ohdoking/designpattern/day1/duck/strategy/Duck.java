package com.ohdoking.designpattern.day1.duck.strategy;

import com.ohdoking.designpattern.day1.duck.strategy.fly.FlyBehavior;
import com.ohdoking.designpattern.day1.duck.strategy.quack.QuackBehavior;

public abstract class Duck {

	public FlyBehavior flyBehavior;
	public QuackBehavior quackBehavior;
	
	public void performQuack(){
		quackBehavior.quack();
	}
	
	public void swim(){
		System.out.println("Swim!!");
	}
	
	
	public void performFly(){
		flyBehavior.fly();
	}
	
	//동적으로 행동을 추가하기 위해 set 메소드를 사용	
	public void setFlyBehavior(FlyBehavior flyBehavior){
		this.flyBehavior= flyBehavior;
	}
	
	public void setQuackBehavior(QuackBehavior quackBehavior){
		this.quackBehavior = quackBehavior;
	}
	
	public abstract void display();
}
