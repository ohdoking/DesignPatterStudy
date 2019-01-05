package com.ohdoking.designpattern.day3.command.detail;

import java.util.ArrayList;
import java.util.List;

import com.ohdoking.designpattern.day3.command.Command;

public class RemoteControl {
	List<Command> onCommands;
	List<Command> offCommands;
	
	public RemoteControl() {
		onCommands = new ArrayList<Command>();
		offCommands = new ArrayList<Command>();
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands.set(slot, onCommand);
		offCommands.set(slot, offCommand);
	}
	
	public void onButtonWasPushed(int slot) {
		onCommands.get(slot).execute();
	}
	
	public void offButtonWasPushed(int slot) {
		offCommands.get(slot).execute();
	}
	
}
