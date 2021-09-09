package com.gmail.fomenkoc.homeworks.homework09.classes;

import java.util.Scanner;

import com.gmail.fomenkoc.homeworks.homework08.enumeration.Month;
import com.gmail.fomenkoc.homeworks.homework08.enumeration.Season;

public class Menu {
    private static boolean isRun;
    private static Scanner scanner = new Scanner(System.in);

    public static void start() {

	setRun(true);

	while (isRun()) {

	    showMainMenu();
	    showSubMenu(scanner.next());

	}
    }
/**
 * @
 * */
    static void showMainMenu() {
	String mainMenu = "Enter number to execute action:" 
		+ "\r\n"
		+ "1 - Display all months with the same time of year"
		+ "\r\n"
		+ "2 - Display all months that have the same number of days"
		+ "\r\n" 
		+ "3 - Display all months with fewer days"
		+ "\r\n"
		+ "4 - Display all months that have more days"
		+ "\r\n" 
		+ "5 - Display the next season" 
		+ "\r\n"
		+ "6 - Display the previous season" 
		+ "\r\n"
		+ "7 - Display all months that have an even number of days"
		+ "\r\n"
		+ "8 - Display all months that have an odd number of days"
		+ "\r\n"
		+ "9 - Display whether the month entered from the console has an even number of days"
		+ "\r\n" 
		+ "0 - Exit";
	System.out.println(mainMenu);
//	System.out.println("Enter number to execute action:");
//	System.out.println(
//		"1 - Display all months with the same time of year");
//	System.out.println(
//		"2 - Display all months that have the same number of days");
//	System.out.println("3 - Display all months with fewer days");
//	System.out.println(
//		"4 - Display all months that have more days");
//	System.out.println("5 - Display the next season");
//	System.out.println("6 - Display the previous season");
//	System.out.println(
//		"7 - Display all months that have an even number of days");
//	System.out.println(
//		"8 - Display all months that have an odd number of days");
//	System.out.println(
//		"9 - Display whether the month entered from the console has an even number of days");
//	System.out.println("0 - Exit");
    }

    static void showSubMenu(String menuItem) {

	switch (menuItem) {
	case "0": {
	    System.out.println("Good-bye");
	    setRun(false);
	    break;
	}

	case "1": {
	    System.out.println("Enter season");
	    actions(menuItem, scanner.next());
	    break;
	}
	case "2": {
	    System.out.println("Enter day count");
	    actions(menuItem, scanner.next());
	    break;
	}
	case "3": {
	    System.out.println("Enter day count");
	    actions(menuItem, scanner.next());
	    break;
	}
	case "4": {
	    System.out.println("Enter day count");
	    actions(menuItem, scanner.next());
	    break;
	}
	case "5": {
	    System.out.println("Enter season");
	    actions(menuItem, scanner.next());
	    break;
	}
	case "6": {
	    System.out.println("Enter season");
	    actions(menuItem, scanner.next());
	    break;
	}
	case "7": {
	    actions(menuItem, "");
	    break;
	}
	case "8": {
	    actions(menuItem, "");
	    break;
	}
	case "9": {
	    System.out.println("Enter month");
	    actions(menuItem, scanner.next());
	    break;
	}

	default:
	    System.out.println("Incorrect parameter, try agin.");
	    break;
	}

    }

    static void actions(String menuItem, String input) {
	input = input.toUpperCase();
	Month[] months = Month.values();

	switch (menuItem) {
	case "1": {

	    for (Month month : months) {
		if (month.getSeasonStr().equals(input)) {
		    System.out.println(month.name());
		}
	    }
	    break;
	}
	case "2": {

	    for (Month month : months) {
		if (month.getDayCount() == Integer.parseInt(input)) {
		    System.out.println(month.name());
		}
	    }
	    break;
	}
	case "3": {

	    for (Month month : months) {
		if (month.getDayCount() < Integer.parseInt(input)) {
		    System.out.println(month.name());
		}
	    }
	    break;
	}
	case "4": {

	    for (Month month : months) {
		if (month.getDayCount() > Integer.parseInt(input)) {
		    System.out.println(month.name());
		}
	    }
	    break;
	}
	case "5": {
	    int seasonID = -1;
	    Season[] seasons = Season.values();
	    for (int i = 0; i < seasons.length; i++) {
		if (seasons[i].name().equals(input)) {
		    seasonID = i;
		}
	    }
	    if (seasonID == -1) {
		System.out.println("Incorrect season.");
		break;
	    } else if (seasonID == seasons.length - 1) {
		seasonID = 0;
	    } else {
		seasonID++;
	    }
	    System.out.println(seasons[seasonID]);
	    break;
	}
	case "6": {
	    int seasonID = -1;
	    Season[] seasons = Season.values();
	    for (int i = 0; i < seasons.length; i++) {
		if (seasons[i].name().equals(input)) {
		    seasonID = i;
		}
	    }
	    if (seasonID == -1) {
		System.out.println("Incorrect season.");
		break;
	    } else if (seasonID == 0) {
		seasonID = seasons.length - 1;
	    } else {
		seasonID--;
	    }
	    System.out.println(seasons[seasonID]);
	    break;
	}
	case "7": {
	    for (Month month : months) {
		if (month.getDayCount() % 2 == 0) {
		    System.out.println(month.name());
		}
	    }
	    break;
	}
	case "8": {
	    for (Month month : months) {
		if (month.getDayCount() % 2 != 0) {
		    System.out.println(month.name());
		}
	    }
	    break;
	}
	case "9": {
	    for (Month month : months) {
		if (month.name().equals(input)) {
		    System.out.println(month.getDayCount() % 2 == 0);
		}
	    }
	    break;
	}

	}
    }

    public static boolean isRun() {
	return isRun;
    }

    public static void setRun(boolean isRun) {
	Menu.isRun = isRun;
    }
}
