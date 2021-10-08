package com.gmail.fomenkoc.homeworks.homework18;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HW18App {

	public static void main(String[] args) {

		List<Integer> listInt = new ArrayList<>();
		List listAnyObj = new ArrayList<>();
		
		
		listAnyObj.add(123);
		listAnyObj.add(321);
		listAnyObj.add(321.555);
		listAnyObj.add("qwe");
		listAnyObj.add("lkiuy7");
		listAnyObj.add(new Scanner(System.in));
		
		listInt.addAll(listAnyObj);
		
		
		for (int i = 0; i < listInt.size(); i++) {
			System.out.println(listInt.get(i));
		}
		

	}


}
