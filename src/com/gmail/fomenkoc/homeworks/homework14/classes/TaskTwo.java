package com.gmail.fomenkoc.homeworks.homework14.classes;

import java.util.HashSet;
import java.util.Scanner;

public class TaskTwo {

    private static HashSet<Commodity> commodities = new HashSet<Commodity>();

    public static void run() {

	String input;
	Scanner scanner = new Scanner(System.in);

	fillTestData();

	String mainMenu = "\nEnter number to action:\n"
		+ " 1 - Display all Commodities\n" 
		+ " 2 - Add Commodity\n"
		+ " 3 - Remove Commodity\n" 
		+ " 4 - Replace Commodity\n"
		+ " 5 - Display all Commodities, sorted by name\n"
		+ " 6 - Display all Commodities, sorted by length\n"
		+ " 7 - Display all Commodities, sorted by width\n"
		+ " 8 - Display all Commodities, sorted by weigth\n"
		+ " 9 - Display i-th element\n" 
		+ " 0 - Exit program\n";

	while (true) {
	    System.out.println(mainMenu);
	    input = scanner.nextLine();

	    switch (input) {
	    case "1": {
		showAllCommodities();
		break;
	    }
	    case "0": {
		System.exit(0);
		break;
	    }

	    default: {
		System.out.println("Incorrect input, try again.");
		break;
	    }
	    }

	}

    }

    public static void fillTestData() {

	commodities.add(new Commodity("SEMI-AUTO SHOTGUN", 57, 35, 55));
	commodities.add(new Commodity("REPEATING SHOTGUN", 61, 35, 50));
	commodities.add(new Commodity("PUMP-ACTION SHOTGUN", 61, 35, 47));
	commodities.add(new Commodity("DOUBLE-BARRELED SHOTGUN", 65, 35, 60));
	commodities.add(new Commodity("SAWED-OFF SHOTGUN", 65, 30, 60));
	commodities.add(new Commodity("CARCANO RIFLE", 75, 80, 40));
	commodities.add(new Commodity("ROLLING BLOCK RIFLE", 85, 80, 27));
	commodities.add(new Commodity("BOLT-ACTION RIFLE", 72, 75, 37));
	commodities.add(new Commodity("SPRINGFIELD RIFLE", 80, 75, 30));
	commodities.add(new Commodity("VARMINT RIFLE", 40, 65, 65));
	commodities.add(new Commodity("MAUSER PISTOL", 36, 50, 80));
	commodities.add(new Commodity("SEMI-AUTOMATIC PISTOL", 33, 50, 85));
	commodities.add(new Commodity("VOLCANIC PISTOL", 57, 50, 50));
	commodities.add(new Commodity("SCHOFIELD REVOLVER", 46, 50, 70));
	commodities.add(new Commodity("DOUBLE-ACTION REVOLVER", 38, 50, 82));
	commodities.add(new Commodity("CATTLEMAN REVOLVER", 42, 50, 75));
	commodities.add(new Commodity("LITCHFIELD REPEATER", 65, 65, 50));
	commodities.add(new Commodity("LANCASTER REPEATER", 55, 65, 59));
	commodities.add(new Commodity("CARBINE REPEATER", 60, 65, 53));

    }

    public static void showAllCommodities() {
	if (commodities.size() > 0) {
	    for (Commodity commodity : commodities) {
		System.out.println(commodity);
	    }

	} else {
	    System.out.println("Commodities list is empty.");
	}
    }
    
    public static Commodity createNewCommodity() {
	String name;
	double length;
	double width;
	double weigth;
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter new commodity atributes.");
	System.out.print("Name: ");
	name = scanner.nextLine();
	System.out.print("Length: ");
	length = scanner.nextDouble();
	System.out.print("Width: ");
	width = scanner.nextDouble();
	System.out.print("Weigth: ");
	weigth = scanner.nextDouble();
	
	return new Commodity(name, length, width, weigth);
    }

}
