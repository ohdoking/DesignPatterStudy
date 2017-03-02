package com.ohdoking.designpattern.day1.game;

public class Character {

	WeaponBehavior weaponBehavior;
	
	public void fight(){
		weaponBehavior.useWeapon();
	};
	
	public void setWeaponBehavior(WeaponBehavior weaponBehavior){
		this.weaponBehavior = weaponBehavior;
	}
}
