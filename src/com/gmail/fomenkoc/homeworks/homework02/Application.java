package com.gmail.fomenkoc.homeworks.homework02;

public class Application {
public static void main(String[] args) {
		
		byte myByte = 100;
		short myShort = 1000;
		int myInt = 10000;
		long myLong = 100000L;
		float myFloat = 321.156F;
		double myDouble = 987.9363;
		boolean myBoolean = true;
		char myChar = 'G';
		
		System.out.println("byte example - " + myByte + ", min value = " + Byte.MIN_VALUE + ", max value = " + Byte.MAX_VALUE);
		System.out.println("short example - " + myShort + ", min value = " + Short.MIN_VALUE + ", max value = " + Short.MAX_VALUE);
		System.out.println("int example - " + myInt + ", min value = " + Integer.MIN_VALUE + ", max value = " + Integer.MAX_VALUE);
		System.out.println("long example - " + myLong + ", min value = " + Long.MIN_VALUE + ", max value = " + Long.MAX_VALUE);
		System.out.println("float example - " + myFloat + ", min value = " + Float.MIN_VALUE + ", max value = " + Float.MAX_VALUE);
		System.out.println("double example - " + myDouble + ", min value = " + Double.MIN_VALUE + ", max value = " + Double.MAX_VALUE);
		System.out.println("boolean example - " + myBoolean + ", min value = " + Boolean.FALSE + ", max value = " + Boolean.TRUE);
		System.out.println("char example - " + myChar + ", min value = " + Character.MIN_VALUE + ", max value = " + Character.MAX_VALUE);
		
		int [] myArray = {654, 987 ,32, 65, 44, 69, 822, 321, 753, 321};
		int minInt = myArray[0];
		int maxInt = myArray[0];
		
		for(int i = 0; i < myArray.length; i++) {
			minInt = (minInt > myArray[i])? myArray[i]: minInt;
			maxInt = (maxInt < myArray[i])? myArray[i]: maxInt;
		}
		
		System.out.println("Array min value = " + minInt);
		System.out.println("Array max value = " + maxInt);
		
		
		

		
	}
}
