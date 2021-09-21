package com.gmail.fomenkoc.homeworks.homework12;

import java.util.Scanner;

import com.gmail.fomenkoc.homeworks.homework12.classes.*;

public class HW12App {

    public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	boolean run = true;
	String input;
	
	
	
	while (run) {
	    System.out.println("1 - Task One");
	    System.out.println("2 - Task Two");
	    System.out.println("3 - Task Tree");
	    System.out.println("0 - Exit");
	    input = scanner.next();
	    
	    switch (input) {
	    case "0": {
		System.out.println("Good-bye");
		run = false;
		break;
	    }
	    case "1":{
		TaskOne.run();
		break;
	    }
	    case "2":{
		TaskTwo.run();
		break;
	    }
	    case "3":{
		TaskThree.run();
		break;
	    }

	    default:
		System.out.println("Incorrect parameter, try agin.");
		break;
	    }
	}
	
	
	
	
	
	
    }

}
