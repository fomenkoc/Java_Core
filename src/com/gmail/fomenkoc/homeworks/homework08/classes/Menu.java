package com.gmail.fomenkoc.homeworks.homework08.classes;

import java.util.Scanner;

public class Menu {
	private static boolean isRun;
	private static Scanner scanner = new Scanner(System.in);

	public static void start() {


		setRun(true);

		while (isRun()) {

			showMainMenu();
			showSubMenu(scanner.nextInt());

		}
	}

	static void showMainMenu() {
		System.out.println("Enter number to execute action:");
		System.out.println("1 - Display all months with the same time of year");
		System.out.println("2 - Display all months that have the same number of days");
		System.out.println("3 - Display all months with fewer days");
		System.out.println("4 - Display all months that have more days");
		System.out.println("5 - Display the next season");
		System.out.println("6 - Display the previous season");
		System.out.println("7 - Display all months that have an even number of days");
		System.out.println("8 - Display all months that have an odd number of days");
		System.out.println("9 - Display whether the month entered from the console has an even number of days");
		System.out.println("0 - Exit");
	}

	static void showSubMenu(int menuItem) {
		System.out.println("Submenu"); // TODO remove this

		switch (menuItem) {
		case 0: {
			System.out.println("Good-bye");
			setRun(false);
		}

		case 1: {
			System.out.println("Enter season");
			System.out.println(scanner.nextInt());
			break;
		}

		default:
			System.out.println("Incorrect parameter, try agin.");
			break;
		}

	}

	public static boolean isRun() {
		return isRun;
	}

	public static void setRun(boolean isRun) {
		Menu.isRun = isRun;
	}
}
