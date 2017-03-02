package com.ohdoking.designpattern.day1.game;

public class Troll extends Character {

	public Troll(){
		System.out.println("I'm Troll and Fight!!! bou!");
		setWeaponBehavior(new AxeBehavior());
	}

}
