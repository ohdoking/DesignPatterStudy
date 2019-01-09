package com.ohdoking.designpattern.day2.mediator;

import java.util.ArrayList;
import java.util.List;

public class Mediator implements Imediator{

	List<Colleage> colleageList = new ArrayList<Colleage>();
	@Override
	public void sendEvent(String name, String event) {
		for(Colleage colleage : colleageList){
			if(colleage.getName().equals(name)){
				colleage.recieveEvent(name, event);
			}
		}
		
	}
	
	public void addColleage(Colleage colleage){
		colleage.setMediator(this);
		colleageList.add(colleage);
	}

}
