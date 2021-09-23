package com.gmail.fomenkoc.homeworks.homework13;

import java.util.Collections;
import java.util.Scanner;

import com.gmail.fomenkoc.homeworks.homework13.classes.Deputy;
import com.gmail.fomenkoc.homeworks.homework13.classes.Faction;
import com.gmail.fomenkoc.homeworks.homework13.classes.TopBriberComparator;
import com.gmail.fomenkoc.homeworks.homework13.classes.VerkhovnaRada;

public class HW13App {

    public static void main(String[] args) {

//	Faction faction = new Faction("Comic Con");
//	Deputy deputy = new Deputy(99.9, 150.5, "General", "Zod",
//		true);
//	deputy.setBribe(1000);
//	faction.getDeputies().add(deputy);
//	deputy = new Deputy(99.9, 150.5, "Lex", "Luthor", true);
//	deputy.setBribe(3000);
//	faction.getDeputies().add(deputy);
//	deputy = new Deputy(99.9, 150.5, "Tony", "Stark", true);
//	deputy.setBribe(100);
//	faction.getDeputies().add(deputy);
//	deputy = new Deputy(99.9, 150.5, "Peter", "Parker", false);
//	faction.getDeputies().add(deputy);
//	deputy = new Deputy(99.9, 150.5, "Barry", "Allen", false);
//	faction.getDeputies().add(deputy);
//	deputy = new Deputy(99.9, 150.5, "Clark", "Kent", false);
//	faction.getDeputies().add(deputy);
//	deputy = new Deputy(99.9, 150.5, "Bruce", "Wayne", false);
//	faction.getDeputies().add(deputy);
//	deputy = new Deputy(99.9, 150.5, "Ghost", "Rider", false);
//	faction.getDeputies().add(deputy);
//	deputy = new Deputy(99.9, 150.5, "Luke", "Skywalker", false);
//	faction.getDeputies().add(deputy);
//	deputy = new Deputy(99.9, 150.5, "Darth", "Vader", false);
//	faction.getDeputies().add(deputy);
//	System.out.println(faction);
//
//	System.out.println();
//	Collections.sort(faction.getDeputies());
//	System.out.println(faction);
//	System.out.println();
//	Collections.sort(faction.getDeputies(),
//		new TopBriberComparator());
//	System.out.println(faction);
//	System.out.println();
//	faction.showTopBribers();
//	System.out.println();
//	faction.showAllDeputy();
//	System.out.println();
//	faction.removeAllDeputy();
//	System.out.println(faction);
	VerkhovnaRada verkhovnaRada = VerkhovnaRada.getInstance();

	boolean run = true;
	Scanner scanner = new Scanner(System.in);
	String mainMenu = "\nВведіть 1 щоб додати фракцію\n"
		+ "Введіть 2 щоб видалити конкретну фракцію\n"
		+ "Введіть 3 щоб вивести усі  фракції\n"
		+ "Введіть 4 щоб очистити конкретну фракцію\n"
		+ "Введіть 5 щоб вивести конкретну фракцію\n"
		+ "Введіть 6 щоб додати депутата в фракцію\n"
		+ "Введіть 7 щоб видалити депутата з фракції\n"
		+ "Введіть 8 щоб вивести список хабарників\n"
		+ "Введіть 9 щоб вивести найбільшого хабарника\n"
		+ "Введіть 0 щоб завершити програму\n";
	while (run) {
	    System.out.println(mainMenu);
	    String input = scanner.next();
	    switch (input) {
	    case "1":
		verkhovnaRada.addFaction();
		break;
	    case "2":
		verkhovnaRada.removeFaction();
		break;
	    case "3":
		verkhovnaRada.showAllFactions();
		break;
	    case "4":
		verkhovnaRada.cleanFaction();
		break;
	    case "5":
		verkhovnaRada.showFaction();
		break;
	    case "6":
		verkhovnaRada.addDeputyToFaction();
		break;
	    case "7":
		verkhovnaRada.removeDeputyFromFaction();
		break;
	    case "8":
		verkhovnaRada.showBribers();
		break;

	    default:
		System.out.println("Incorrect input, try again.");
		break;
	    }
	}

    }

}
