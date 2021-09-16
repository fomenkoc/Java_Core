package com.gmail.fomenkoc.homeworks.homework10.classes;

public class IsFiveLettersPalindrome {

    public static void check(String s) {
	check(new StringBuilder(s));
    }

    public static void check(StringBuilder inputStringBuilder) {

	if (inputStringBuilder.length() != 5) {
	    System.out.println("\"" + inputStringBuilder + "\""
		    + " has wrong quantity of letters!");

	} else {

	    StringBuilder reversedStringBuilder = new StringBuilder(
		    inputStringBuilder.toString()).reverse();

	    if (inputStringBuilder.toString().equalsIgnoreCase(
		    reversedStringBuilder.toString())) {
		System.out.println("\"" + inputStringBuilder + "\""
			+ " is a palindrome.");
	    } else {
		System.out.println("\"" + inputStringBuilder + "\""
			+ " is not a palindrome.");
	    }
	}
    }
}
