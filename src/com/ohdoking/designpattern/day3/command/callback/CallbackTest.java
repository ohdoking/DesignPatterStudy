package com.ohdoking.designpattern.day3.command.callback;

public class CallbackTest {

	
	public static void main(String[] args) {
		
		String testString = "ohdoking";
		
		EventRegistration eventRegistration = new EventRegistration((arg)-> System.out.println("callback : " + arg));
		
		eventRegistration.doWork(testString);
	}
}
