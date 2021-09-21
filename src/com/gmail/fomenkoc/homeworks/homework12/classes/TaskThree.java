package com.gmail.fomenkoc.homeworks.homework12.classes;

public class TaskThree {

    public static void run() {
	MyArrayList myArrayList = new MyArrayList("String 1");
	myArrayList.add("String 2");
	myArrayList.add("String 3");
	myArrayList.add("String 4");
	myArrayList.add("String 5");
	myArrayList.add("String 6");
	myArrayList.add("String 7");
	myArrayList.add("String 8");
	myArrayList.add("String 9");
	myArrayList.add("String 10");
	myArrayList.add("String 11");
	myArrayList.add("String 12");
	myArrayList.add(123);
	myArrayList.add(123.654);
	myArrayList.add(123.111);
	myArrayList.add(9581.6587);
	System.out.println(myArrayList);
	System.out.println("Remove idex 0");
	myArrayList.remove(0);
	System.out.println(myArrayList);
	System.out.println("Remove idex 10");
	myArrayList.remove(10);
	System.out.println(myArrayList);
    }
}
