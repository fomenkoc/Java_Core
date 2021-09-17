package com.gmail.fomenkoc.homeworks.homework11;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import com.gmail.fomenkoc.homeworks.homework11.classes.*;

public class HW11App {

	public static void main(String[] args) {
		/*
		 * 1. Створити масив Integer, заповнити його рандомними числовими
		 * значеннями. Відсортувати його в порядку спадання та в порядку
		 * зростання значень.
		 */

		Integer[] intArray = new Integer[10];

		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = RandomNum.getInt(0, 100);
		}

		System.out.println("Before sort:");
		System.out.println(Arrays.toString(intArray));
		Arrays.sort(intArray);
		System.out.println("Sorted:");
		System.out.println(Arrays.toString(intArray));
		Arrays.sort(intArray, Collections.reverseOrder());
		System.out.println("Reverse sorted:");
		System.out.println(Arrays.toString(intArray));
		System.out.println();

		// 2
		Auto[][] autos = new Auto[RandomNum.getInt(2, 10)][RandomNum.getInt(2,
				10)];

		for (int i = 0; i < autos.length; i++) {
			for (int j = 0; j < autos[i].length; j++) {
				autos[i][j] = new Auto();
			}
		}

		

		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		while (run) {
			System.out.println("Enter number to action:");
			System.out.println("1 - show the array.");
			System.out.println("2 - fill the array.");
			System.out.println("0 - exit.");
			String inputStr = scanner.next();

			switch (inputStr) {
			case "0": {
				run = false;
				break;
			}
			case "1": {
				System.out.println(Arrays.deepToString(autos));
				break;
			}
			case "2": {
				Auto auto = new Auto();
				for (int i = 0; i < autos.length; i++) {
					Arrays.fill(autos[i], auto);
				}
				break;
			}
			default:{
				System.out.println("Incorect input.");
			}
			}
		}

	}

}
