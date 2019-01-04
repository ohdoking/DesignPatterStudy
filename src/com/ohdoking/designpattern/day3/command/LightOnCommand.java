package com.ohdoking.designpattern.day3.command;

public class LightOnCommand implements Command{

	Light light;
	
	public LightOnCommand(Light light) {
		this.light = light;
	}
	@Override
	public void execute() {
		light.on();
	}

}
