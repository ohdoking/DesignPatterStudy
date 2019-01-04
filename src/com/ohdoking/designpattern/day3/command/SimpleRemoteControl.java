package com.ohdoking.designpattern.day3.command;

public class SimpleRemoteControl {

	Command slot;
	
	public void setCommand(Command slot) {
		this.slot = slot;
	}
	
	public void buttonWasPressed() {
		slot.execute();
	}
}
