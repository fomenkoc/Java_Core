package com.gmail.fomenkoc.homeworks.homework12.classes;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class TaskOne {

    public static void run() {

	List<Auto> autos = new ArrayList<Auto>();
	int startSize = RandomNum.getInt(10, 20);
	for (int i = 0; i < startSize; i++) {

	    autos.add(new Auto());

	}

	boolean run = true;
	Scanner scanner = new Scanner(System.in);
	while (run) {
	    System.out.println("Enter number to action:");
	    System.out.println("1 - show the List.");
	    System.out.println("2 - fill the List.");
	    System.out.println("0 - exit.");
	    String inputStr = scanner.next();

	    switch (inputStr) {
	    case "0": {
		run = false;
		System.out.println();
		break;
	    }
	    case "1": {
		System.out.println(autos);
		break;
	    }
	    case "2": {
		Auto auto = new Auto();
		startSize = autos.size();
		autos.clear();
		for (int i = 0; i < startSize; i++) {
		    autos.add(auto);
		}
		break;
	    }
	    default: {
		System.out.println("Incorect input.");
	    }
	    }
	}

    }
}
