package com.gmail.fomenkoc.lessons.lesson06.monsters;

public interface Vampire extends DangerousMonster, Lethal{
	void drinkBlood();
	
	static void printKilledPerson(String name) {
		System.out.println("VAmpire killed "+ name);
	}
	
}
