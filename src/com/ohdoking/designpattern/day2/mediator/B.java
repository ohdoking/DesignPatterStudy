package com.ohdoking.designpattern.day2.mediator;

public class B extends Colleage {

	String name = "B";

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
