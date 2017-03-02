package com.ohdoking.designpattern.day1.game;

public class TestMain {

	public static void main(String[] args) {

		Character queen = new Queen();
		queen.fight();
		
		Character troll = new Troll();
		troll.fight();
		
		Character knight = new Knight();
		knight.fight();
	}

}
