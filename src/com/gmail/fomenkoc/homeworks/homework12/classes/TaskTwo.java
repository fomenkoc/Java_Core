package com.gmail.fomenkoc.homeworks.homework12.classes;

import java.util.Scanner;
import java.util.ArrayList;

public class TaskTwo {
    private static boolean isRun;
    private static Scanner scanner = new Scanner(System.in);

    public static void run() {
	String input = "0";

	setRun(true);

	while (isRun()) {

	    showMainMenu();
	    
	    input = scanner.next();
	    
	    showSubMenu(input);
	    
	}
    }

    
    static void showMainMenu() {
	String mainMenu = 
		"Enter number to execute action:" 
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
		+ "9 - Display whether the month entered from the console has an even "
		+ "number of days"
		+ "\r\n" 
		+ "0 - Exit";
	System.out.println(mainMenu);
	

    }

    
    static void showSubMenu(String menuItem) {

	switch (menuItem) {
	case "0": {
	    System.out.println();
	    setRun(false);
	    break;
	}

	case "1":
	case "5":
	case "6":{
	    System.out.println("Enter season");
	    actions(menuItem, scanner.next());
	    break;
	}
	case "2":
	case "3": 
	case "4": {
	    System.out.println("Enter day count");
	    actions(menuItem, scanner.next());
	    break;
	}
	case "7": 
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
	ArrayList<Month> months = Lists.getMonths();

	switch (menuItem) {
	case "1": {

	    for (Month month : months) {
		if (month.getSeason().getSeasonName().equals(input)) {
		    System.out.println(month.getMonthName());
		}
	    }
	    break;
	}
	case "2": {

	    for (Month month : months) {
		if (month.getDaysCount() == Integer.parseInt(input)) {
		    System.out.println(month.getMonthName());
		}
	    }
	    break;
	}
	case "3": {

	    for (Month month : months) {
		if (month.getDaysCount() < Integer.parseInt(input)) {
		    System.out.println(month.getMonthName());
		}
	    }
	    break;
	}
	case "4": {

	    for (Month month : months) {
		if (month.getDaysCount() > Integer.parseInt(input)) {
		    System.out.println(month.getMonthName());
		}
	    }
	    break;
	}
	case "5": {
	    int seasonID = -1;
	    ArrayList<Season> seasons = Lists.getSeasons();
	    for (int i = 0; i < seasons.size(); i++) {
		if (seasons.get(i).getSeasonName().equals(input)) {
		    seasonID = i;
		}
	    }
	    if (seasonID == -1) {
		System.out.println("Incorrect season.");
		break;
	    } else if (seasonID == seasons.size() - 1) {
		seasonID = 0;
	    } else {
		seasonID++;
	    }
	    System.out.println(seasons.get(seasonID).getSeasonName());
	    break;
	}
	case "6": {
	    int seasonID = -1;
	    ArrayList<Season> seasons = Lists.getSeasons();
	    for (int i = 0; i < seasons.size(); i++) {
		if (seasons.get(i).getSeasonName().equals(input)) {
		    seasonID = i;
		}
	    }
	    if (seasonID == -1) {
		System.out.println("Incorrect season.");
		break;
	    } else if (seasonID == 0) {
		seasonID = seasons.size() - 1;
	    } else {
		seasonID--;
	    }
	    System.out.println(seasons.get(seasonID).getSeasonName());
	    break;
	}
	case "7": {
	    for (Month month : months) {
		if (month.getDaysCount() % 2 == 0) {
		    System.out.println(month.getMonthName());
		}
	    }
	    break;
	}
	case "8": {
	    for (Month month : months) {
		if (month.getDaysCount() % 2 != 0) {
		    System.out.println(month.getMonthName());
		}
	    }
	    break;
	}
	case "9": {
	    for (Month month : months) {
		if (month.getMonthName().equals(input)) {
		    System.out.println(month.getDaysCount() % 2 == 0);
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
	TaskTwo.isRun = isRun;
    }
    
    
    
    
}

