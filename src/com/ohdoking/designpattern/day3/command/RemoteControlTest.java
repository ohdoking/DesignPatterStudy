package com.ohdoking.designpattern.day3.command;

public class RemoteControlTest {
	public static void main(String[] args) {
		
		SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
		simpleRemoteControl.setCommand(new LightOnCommand(new Light()));
		
		simpleRemoteControl.buttonWasPressed();
		
		simpleRemoteControl.setCommand(new Command() {
			
			@Override
			public void execute() {
				System.out.println("Radio ON!");
			}
		});
		
		simpleRemoteControl.buttonWasPressed();
		
	}
}