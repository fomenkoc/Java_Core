package com.gmail.fomenkoc.homeworks.homework18;

import java.util.ArrayList;
import java.util.List;

import com.gmail.fomenkoc.homeworks.homework18.classes.Map;
import com.gmail.fomenkoc.homeworks.homework18.classes.MyEntry;

public class HW18App {

	public static void main(String[] args) {

//		Task One
		System.out.println("Task One:");

		List<Integer> listInt = new ArrayList<>();
		List listAnyObj = new ArrayList<>();

		listAnyObj.add(123);
		listAnyObj.add(321);
		listAnyObj.add(321.555);
		listAnyObj.add("qwe");
		listAnyObj.add("lkiuy7");
		listAnyObj.add(new MyEntry<>(999, "Anything can be inserted in list)"));

		/*
		 * Під час компеляції дженеріки знеособлюються, тому якщо їх не
		 * вказувати явно у ліста донора - наповнення можна скопіювати в
		 * типізований
		 */
		listInt.addAll(listAnyObj);

		for (int i = 0; i < listInt.size(); i++) {
			System.out.println(listInt.get(i));
		}

		System.out.println();

//		Task Two
		System.out.println("Task Two:");
		MyEntry<Integer, String> myEntry = new MyEntry<>(1, "Some string");
		System.out.println(myEntry);
		System.out.println();

//		Task Three
		System.out.println("Task Three");
		Map<Integer, String> map = new Map<>();

		System.out.println("Add new objects:");
		map.add(1, "One");
		map.add(2, "Two");
		map.add(3, "Thee");
		map.add(4, "Four");
		map.add(5, "Five");
		map.add(6, "Six");
		map.add(7, "Seven");
		map.add(8, "Eight");
		map.add(9, "Nine");
		map.add(10, "Ten");
		map.add(11, "Eleven");
		map.add(12, "Twelve");

		for (int i = 0; i < map.size(); i++) {
			System.out.println(map.getEntry(i));
		}

		System.out.println();

		System.out.println("Get value by key:");
		System.out.println(map.getValue(8));
		System.out.println();
		System.out.println("Get key by value:");
		System.out.println(map.getKey("Two"));

		System.out.println();
		System.out.println("Remove object by key (3)");
		map.removeByKey(3);

		for (int i = 0; i < map.size(); i++) {
			System.out.println(map.getEntry(i));
		}

		System.out.println();
		System.out.println("Remove object by value (Nine)");
		map.removeByValue("Nine");

		for (int i = 0; i < map.size(); i++) {
			System.out.println(map.getEntry(i));
		}

		System.out.println();
		System.out.println("KeysSet:");
		System.out.println(map.getKeysSet());

		System.out.println();
		System.out.println("ValuesList:");
		System.out.println(map.getValuesList());

		System.out.println();
		System.out.println("Map:");
		System.out.println(map);

	}

}
