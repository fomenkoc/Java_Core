package com.gmail.fomenkoc.homeworks.homework11;

import java.util.Arrays;
import java.util.Collections;

import com.gmail.fomenkoc.homeworks.homework11.classes.*;

public class HW11App {

    public static void main(String[] args) {
	/*1. Створити масив Integer, заповнити його рандомними 
	 * числовими значеннями. 
	 * Відсортувати його в порядку спадання 
	 * та в порядку зростання значень.*/
	
	Integer [] intArray = new Integer[10];

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
	
	
	
	
    }

}
