package com.ohdoking.designpattern.day1.game;

public class Queen extends Character{

	public Queen(){
		System.out.println("I'm Queen!! yeah fight");
		setWeaponBehavior(new BowAndArrowBehavior());
	}

}
