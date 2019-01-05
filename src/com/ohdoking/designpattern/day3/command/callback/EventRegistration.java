package com.ohdoking.designpattern.day3.command.callback;

public class EventRegistration {

	private CallbackEvent callbackEvent;
	
	public EventRegistration(CallbackEvent callbackEvent) {
		this.callbackEvent = callbackEvent;
	}
	
	public void doWork(String arg){
		callbackEvent.callMethod(arg);
	}
}
