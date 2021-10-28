package com.gmail.fomenkoc.homeworks.homework23.classes;

import java.util.HashSet;
import java.util.TreeSet;

public class TaskOne {

    public static void run() {

	RDR2Weapon weapon;
	HashSet<RDR2Weapon> hashSet = new HashSet<RDR2Weapon>();
	TreeSet<RDR2Weapon> treeSetAllField = new TreeSet<RDR2Weapon>();
	TreeSet<RDR2Weapon> treeSetPrice = new TreeSet<RDR2Weapon>(
		new RDR2WeaponComparatorPrice());

	// shotguns
	weapon = new RDR2Weapon("SEMI-AUTO SHOTGUN", 225);
	hashSet.add(weapon);
	treeSetAllField.add(weapon);
	treeSetPrice.add(weapon);
	weapon = new RDR2Weapon("REPEATING SHOTGUN", 185);
	hashSet.add(weapon);
	treeSetAllField.add(weapon);
	treeSetPrice.add(weapon);
	weapon = new RDR2Weapon("PUMP-ACTION SHOTGUN", 148);
	hashSet.add(weapon);
	treeSetAllField.add(weapon);
	treeSetPrice.add(weapon);
	weapon = new RDR2Weapon("DOUBLE-BARRELED SHOTGUN", 95);
	hashSet.add(weapon);
	treeSetAllField.add(weapon);
	treeSetPrice.add(weapon);
	weapon = new RDR2Weapon("SAWED-OFF SHOTGUN", 85);
	hashSet.add(weapon);
	treeSetAllField.add(weapon);
	treeSetPrice.add(weapon);

	// rifles
	weapon = new RDR2Weapon("CARCANO RIFLE", 190);
	hashSet.add(weapon);
	treeSetAllField.add(weapon);
	treeSetPrice.add(weapon);
	weapon = new RDR2Weapon("ROLLING BLOCK RIFLE", 187);
	hashSet.add(weapon);
	treeSetAllField.add(weapon);
	treeSetPrice.add(weapon);
	weapon = new RDR2Weapon("BOLT-ACTION RIFLE", 180);
	hashSet.add(weapon);
	treeSetAllField.add(weapon);
	treeSetPrice.add(weapon);
	weapon = new RDR2Weapon("SPRINGFIELD RIFLE", 120);
	hashSet.add(weapon);
	treeSetAllField.add(weapon);
	treeSetPrice.add(weapon);
	weapon = new RDR2Weapon("VARMINT RIFLE", 72);
	hashSet.add(weapon);
	treeSetAllField.add(weapon);
	treeSetPrice.add(weapon);

	// pistols
	weapon = new RDR2Weapon("MAUSER PISTOL", 250);
	hashSet.add(weapon);
	treeSetAllField.add(weapon);
	treeSetPrice.add(weapon);
	weapon = new RDR2Weapon("SEMI-AUTOMATIC PISTOL", 210);
	hashSet.add(weapon);
	treeSetAllField.add(weapon);
	treeSetPrice.add(weapon);
	weapon = new RDR2Weapon("VOLCANIC PISTOL", 150);
	hashSet.add(weapon);
	treeSetAllField.add(weapon);
	treeSetPrice.add(weapon);

	// revolvers
	weapon = new RDR2Weapon("SCHOFIELD REVOLVER", 84);
	hashSet.add(weapon);
	treeSetAllField.add(weapon);
	treeSetPrice.add(weapon);
	weapon = new RDR2Weapon("DOUBLE-ACTION REVOLVER", 65);
	hashSet.add(weapon);
	treeSetAllField.add(weapon);
	treeSetPrice.add(weapon);
	weapon = new RDR2Weapon("CATTLEMAN REVOLVER", 50);
	hashSet.add(weapon);
	treeSetAllField.add(weapon);
	treeSetPrice.add(weapon);
	
	// repeaters
	weapon = new RDR2Weapon("LITCHFIELD REPEATER", 145);
	hashSet.add(weapon);
	treeSetAllField.add(weapon);
	treeSetPrice.add(weapon);
	weapon = new RDR2Weapon("LANCASTER REPEATER", 135);
	hashSet.add(weapon);
	treeSetAllField.add(weapon);
	treeSetPrice.add(weapon);
	weapon = new RDR2Weapon("CARBINE REPEATER", 90);
	hashSet.add(weapon);
	treeSetAllField.add(weapon);
	treeSetPrice.add(weapon);

	System.out.println("Unsorted set:");
	for (RDR2Weapon rdr2Weapon : hashSet) {
	    System.out.println(rdr2Weapon);
	}
	System.out.println();
	System.out.println("Set sorted by all fields:");
	for (RDR2Weapon rdr2Weapon : treeSetAllField) {
	    System.out.println(rdr2Weapon);
	}
	System.out.println();
	System.out.println("Set sorted by price:");
	for (RDR2Weapon rdr2Weapon : treeSetPrice) {
	    System.out.println(rdr2Weapon);

	}

    }
}
