package com.gmail.fomenkoc.homeworks.homework14;

import java.util.Scanner;

import com.gmail.fomenkoc.homeworks.homework14.classes.TaskOne;
import com.gmail.fomenkoc.homeworks.homework14.classes.TaskTwo;

public class HW14App {

    public static void main(String[] args) {

	String input;
	boolean run = true;
	Scanner scanner = new Scanner(System.in);

	while (run) {
	    System.out.println("\nHomework 14:");
	    System.out.println("Enter 1 to display task one.");
	    System.out.println("Enter 2 to display task two.");
	    System.out.println("Enter 0 to Exit.");
	    input = scanner.nextLine();

	    switch (input) {
	    case "1":
		TaskOne.run();
		break;
	    case "2":
		TaskTwo.run();
		break;
	    case "0":
		run = false;
		break;

	    default:
		System.out.println("Incorrect input, try again.");
		break;
	    }
	}

    }

}
