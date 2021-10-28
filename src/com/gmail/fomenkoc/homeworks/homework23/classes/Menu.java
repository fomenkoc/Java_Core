package com.gmail.fomenkoc.homeworks.homework23.classes;

import java.util.Scanner;
import java.util.function.Consumer;

public class Menu {

	static boolean isRun = true;
	static int menuStatus = 0;
	static VerkhovnaRada verkhovnaRada = VerkhovnaRada.getInstance();

	public static void run() {

		while (isRun) {

			menuItems.accept(menuStatus);
			userInput.accept(menuStatus);
		}
	}

	static void showMenu(String msg) {
		System.out.println(msg.toString());
	}

	static Consumer<Integer> menuItems = status -> {
		String msg = "";
		switch (menuStatus) {
		case 0: {
			msg = 	"\n1 - Homework 13 \n" 
					+ "2 - Homework 14, task 1 \n"
					+ "3 - Homework 14, task 2 \n" 
					+ "0 - Exit";
			break;
		}

		case 1: {
			msg =   "\nEnter 1 to add a faction\n"
					+ "Enter 2 to delete a specific faction\n"
					+ "Enter 3 to display all factions\n"
					+ "Enter 4 to clear a specific faction\n"
					+ "Enter 5 to display a specific faction\n"
					+ "Enter 6 to add a deputy to the faction\n"
					+ "Enter 7 to remove the deputy from the faction\n"
					+ "Enter 8 to display a list of bribe-takers\n"
					+ "Enter 9 to display the largest bribe taker\n"
					+ "Enter 0 to Main menu\n"
					+ "Enter 10 to fill in the test data\n";
			break;
		}
		default: {
			msg = "Incorrect input, try again.";
			break;
		}
		}
		System.out.println(msg);
	};

	static Consumer<Integer> userInput = status -> {
		Scanner scanner = new Scanner(System.in);

		String input = scanner.next();
		switch (menuStatus) {
		case 0: {
			switch (input) {
			case "0": {
				isRun = false;
				break;
			}
			case "1": {
				menuStatus = 1;
				break;
			}
			case "2": {
				menuStatus = 0;
				TaskOne.run();
				break;
			}
			case "3": {
				menuStatus = 0;
				TaskTwo.run();
				break;
			}
			default: {
				menuStatus = 0;
				System.out.println("Incorrect input, try again.");
				break;
			}
			}
			break;
		}
		case 1: {
			switch (input) {
			case "0": {
				menuStatus = 0;
				break;
			}
			case "1": {
				verkhovnaRada.addFaction();
				break;
			}
			case "2": {
				verkhovnaRada.removeFaction();
				break;
			}
			case "3": {
				verkhovnaRada.showAllFactions();
				break;
			}
			case "4": {
				verkhovnaRada.cleanFaction();
				break;
			}
			case "5": {
				verkhovnaRada.showFaction();
				break;
			}
			case "6": {
				verkhovnaRada.addDeputyToFaction();
				break;
			}
			case "7": {
				verkhovnaRada.removeDeputyFromFaction();
				break;
			}
			case "8": {
				verkhovnaRada.showBribers();
				break;
			}
			case "9": {
				verkhovnaRada.showTopBriber();
				break;
			}
			case "10": {
				TestData.fill();
				break;
			}

			default: {
				System.out.println("Incorrect input, try again.");
				break;
			}
			}
			break;
		}
//		case 2:{
//			TaskOne.run();
//			break;
//		}
//		case 3:{
//			TaskTwo.run();
//			break;
//		}
		
		}
//		scanner.close();
	};
}
