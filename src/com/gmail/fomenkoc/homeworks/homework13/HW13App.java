package com.gmail.fomenkoc.homeworks.homework13;

import java.util.Collections;
import java.util.Scanner;

import com.gmail.fomenkoc.homeworks.homework13.classes.Deputy;
import com.gmail.fomenkoc.homeworks.homework13.classes.Faction;
import com.gmail.fomenkoc.homeworks.homework13.classes.TestData;
import com.gmail.fomenkoc.homeworks.homework13.classes.TopBriberComparator;
import com.gmail.fomenkoc.homeworks.homework13.classes.VerkhovnaRada;

public class HW13App {

    public static void main(String[] args) {

	VerkhovnaRada verkhovnaRada = VerkhovnaRada.getInstance();

	boolean run = true;
	Scanner scanner = new Scanner(System.in);
	String mainMenu = "\nEnter 1 to add a faction\n"
		+ "Enter 2 to delete a specific faction\n"
		+ "Enter 3 to display all factions\n"
		+ "Enter 4 to clear a specific faction\n"
		+ "Enter 5 to display a specific faction\n"
		+ "Enter 6 to add a deputy to the faction\n"
		+ "Enter 7 to remove the deputy from the faction\n"
		+ "Enter 8 to display a list of bribe-takers\n"
		+ "Enter 9 to display the largest bribe taker\n"
		+ "Enter 0 to end the program\n"
		+ "Enter 10 to fill in the test data\n";
	while (run) {
	    System.out.println(mainMenu);
	    String input = scanner.next();
	    switch (input) {
	    case "0": {
		run = false;
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
	}

    }

}
