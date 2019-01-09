package com.ohdoking.designpattern.day2.mediator;

public abstract class Colleage {
	Imediator mediator;
	
	public void setMediator(Imediator mediator){
		this.mediator = mediator;
	}

	public void sendEvent(String name, String event){
		mediator.sendEvent(name, event);
	}
	
	abstract public void fireEvent(String event);
	abstract public void recieveEvent(String name, String event);
	abstract public String getName();
}
