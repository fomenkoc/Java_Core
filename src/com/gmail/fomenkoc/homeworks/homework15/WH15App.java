package com.gmail.fomenkoc.homeworks.homework15;

import com.gmail.fomenkoc.homeworks.homework15.classes.ZooClub;

public class WH15App {
	
	public static void main(String[] args) {
	
		ZooClub zooClub = new ZooClub();
		
		System.out.println(zooClub);
		zooClub.addPerson("Bill", 0);
		zooClub.addPerson("Stan", 0);
		zooClub.addPerson("John", 0);
		
		zooClub.addPetToPerson("Stan", "Spike", "Dog");
		zooClub.addPetToPerson("Stan1", "Spike", "Dog");
		System.out.println(zooClub);

	}

}
