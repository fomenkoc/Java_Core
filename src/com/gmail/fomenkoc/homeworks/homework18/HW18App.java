package com.gmail.fomenkoc.homeworks.homework18;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
		
		listInt.addAll(listAnyObj);
		
		
		for (int i = 0; i < listInt.size(); i++) {
			System.out.println(listInt.get(i));
		}
		
		System.out.println();
		
		
//		Task Two
		System.out.println("Task Two:");
		MyEntry<Integer, String> myEntry = new MyEntry<>(1, "Some string");
		System.out.println(myEntry);
		
		
//		Task Three
	}


}
