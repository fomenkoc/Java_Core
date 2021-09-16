package com.gmail.fomenkoc.homeworks.homework10.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sentence {

    public static void wordsCount(String string) {
	String[] strings = string.split(" ", 0);
	int wordsCount = 0;

	for (int i = 0; i < strings.length; i++) {
	    if (strings[i].contains("!")) {
		strings[i] = strings[i].replace("!", "");
	    }
	    if (strings[i].contains("?")) {
		strings[i] = strings[i].replace("?", "");
	    }
	    if (strings[i].contains(",")) {
		strings[i] = strings[i].replace(",", "");
	    }
	    if (strings[i].contains(".")) {
		strings[i] = strings[i].replace(".", "");
	    }
	    if (strings[i].contains(":")) {
		strings[i] = strings[i].replace(":", "");
	    }
	    if (strings[i].contains(";")) {
		strings[i] = strings[i].replace(";", "");
	    }
	    if (strings[i].contains("(")) {
		strings[i] = strings[i].replace("(", "");
	    }
	    if (strings[i].contains(")")) {
		strings[i] = strings[i].replace(")", "");
	    }
	    if (strings[i].contains("\"")) {
		strings[i] = strings[i].replace("\"", "");
	    }
	    if (strings[i].contains("\'")) {
		strings[i] = strings[i].replace("\'", "");
	    }
	}

	for (String str : strings) {
	    if (str.length() > 2)
		wordsCount++;
	}

	System.out.println("\"" + string + "\"" + " - contains "
		+ wordsCount + " words");
    }

}
