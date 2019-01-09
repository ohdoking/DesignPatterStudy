package com.ohdoking.designpattern.day2.mediator;

public class A extends Colleage {
	
	String name = "A";

	@Override
	public void fireEvent(String event) {
		mediator.sendEvent(name, event);
	}

	@Override
	public void recieveEvent(String name, String event) {
		System.out.println(name + " / " + event);

	}

	@Override
	public String getName() {
		return this.name;
	}

}
