package com.gmail.fomenkoc.homeworks.homework15;

import java.util.Scanner;

import com.gmail.fomenkoc.homeworks.homework15.classes.ZooClub;

public class HW15App {

    public static void main(String[] args) {

	ZooClub zooClub = new ZooClub();
	zooClub.fillTestData();
	String msg = "\nEnter number to action: \n" 
		+ "1 - add club member \n"
		+ "2 - add pet to club member \n"
		+ "3 - remove pet from club member \n"
		+ "4 - remove club member \n" 
		+ "5 - remove all pet by name \n"
		+ "6 - remove all pet by type \n" 
		+ "7 - display club \n"
		+ "0 - exit program";

	while (true) {
	    String menuItem;
	    String personName;
	    int personAge;
	    String petName;
	    String petType;
	    Scanner scanner = new Scanner(System.in);
	    System.out.println(msg);
	    menuItem = scanner.nextLine();

	    switch (menuItem) {
	    case "1": {
		System.out.print("Enter new club member's name: ");
		personName = scanner.nextLine();
		System.out.print("Enter new club member's age: ");
		personAge = scanner.nextInt();
		zooClub.addPerson(personName, personAge);
		break;
	    }
	    case "2": {
		System.out.print("Enter club member's name: ");
		personName = scanner.nextLine();
		System.out.print("Enter pet name: ");
		petName = scanner.nextLine();
		System.out.print("Enter pet type: ");
		petType = scanner.nextLine();
		zooClub.addPetToPerson(personName, petName, petType);
		break;
	    }
	    case "3": {
		System.out.print("Enter club member's name: ");
		personName = scanner.nextLine();
		System.out.print("Enter pet name: ");
		petName = scanner.nextLine();
		zooClub.removePetFromPerson(personName, petName);
		break;
	    }
	    case "4": {
		System.out.print("Enter club member's name: ");
		personName = scanner.nextLine();
		zooClub.removePerson(personName);
		break;
	    }
	    case "5": {
		System.out.print("Enter pet name: ");
		petName = scanner.nextLine();
		zooClub.removePetByName(petName);
		break;
	    }
	    case "6": {
		System.out.print("Enter pet type: ");
		petType = scanner.nextLine();
		zooClub.removePetByType(petType);
		break;
	    }
	    case "7": {
		System.out.println(zooClub.toString());
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

}
