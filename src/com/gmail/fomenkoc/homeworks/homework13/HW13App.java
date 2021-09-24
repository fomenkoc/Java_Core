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
		String mainMenu = "\nВведіть 1 щоб додати фракцію\n"
				+ "Введіть 2 щоб видалити конкретну фракцію\n"
				+ "Введіть 3 щоб вивести усі  фракції\n"
				+ "Введіть 4 щоб очистити конкретну фракцію\n"
				+ "Введіть 5 щоб вивести конкретну фракцію\n"
				+ "Введіть 6 щоб додати депутата в фракцію\n"
				+ "Введіть 7 щоб видалити депутата з фракції\n"
				+ "Введіть 8 щоб вивести список хабарників\n"
				+ "Введіть 9 щоб вивести найбільшого хабарника\n"
				+ "Введіть 0 щоб завершити програму\n"
				+ "Введіть 10 щоб заповнити тестовими даними\n";
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
			case "9":{
				verkhovnaRada.showTopBriber();
				break;
			}
			case "10":{
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
