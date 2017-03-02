package com.ohdoking.designpattern.day1.game;

public class Knight extends Character{
	public Knight(){
		System.out.println("I'm Night hahaah");
		setWeaponBehavior(new SwordBehavior());
	}
}
