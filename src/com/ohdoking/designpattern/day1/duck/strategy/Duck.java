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
	
	//�������� �ൿ�� �߰��ϱ� ���� set �޼ҵ带 ���	
	public void setFlyBehavior(FlyBehavior flyBehavior){
		this.flyBehavior= flyBehavior;
	}
	
	public void setQuackBehavior(QuackBehavior quackBehavior){
		this.quackBehavior = quackBehavior;
	}
	
	public abstract void display();
}
