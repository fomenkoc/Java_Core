package com.gmail.fomenkoc.homeworks.homework10;

import com.gmail.fomenkoc.homeworks.homework10.classes.*;

public class HW10App {

    public static void main(String[] args) {

	IsFiveLettersPalindrome.check("РОТОР");
	IsFiveLettersPalindrome.check("РОТОРq");
	IsFiveLettersPalindrome.check("Комок");
	IsFiveLettersPalindrome.check("qwert");
	IsFiveLettersPalindrome.check("Civic");
	
	System.out.println();
	
	
	System.out.println( Vowels.replace("тестова стрічка"));
	System.out.println( Vowels.replace("test string"));
	System.out.println( Vowels.replace("TEST STRING"));
	
	System.out.println();
	
	
	String string = "A long time ago in a galaxy far, far away....";
	
	Sentence.wordsCount(string);
	
	
    }

}
