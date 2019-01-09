package com.ohdoking.designpattern.day2.mediator;

public class TestMain {

	public static void main(String[] args) {
		
		A a = new A();
		B b = new B();
		
		Mediator mediator = new Mediator();
		mediator.addColleage(a);
		mediator.addColleage(b);
		
		mediator.sendEvent("A", "A event");
		a.fireEvent("A event shoot");
		
	}
}
