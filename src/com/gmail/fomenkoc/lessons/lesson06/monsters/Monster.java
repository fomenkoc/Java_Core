package com.gmail.fomenkoc.lessons.lesson06.monsters;

public interface Monster {
	void eat();
	
	 default void testKillALL() {
		 System.out.println("Default kill all method");
	 };
}