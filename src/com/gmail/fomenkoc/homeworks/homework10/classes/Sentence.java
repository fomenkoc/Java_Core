package com.gmail.fomenkoc.homeworks.homework10.classes;

public class Sentence {

    public static void showWordsCount(String string) {
	String[] strings = getSplitWords(string);
	int wordsCount = 0;

	for (String str : strings) {
	    if (str.length() > 2)
		wordsCount++;
	}

	System.out.println("\"" + string + "\"" + " - contains "
		+ wordsCount + " words");
    }

    public static void showTopWord(String string) {
	String[] strings = getSplitWords(string);
	int[] repeat = new int[strings.length];
	int count;
	int topWordIndex;
	for (int i = 0; i < repeat.length; i++) {
	    count = 0;
	    if (strings[i].length() > 2) {
		for (int j = i; j < repeat.length; j++) {
		    if (strings[i].equalsIgnoreCase(strings[j])) {
			count++;
		    }
		}
	    }
	    repeat[i] = count;
	}

	count = 0;
	topWordIndex = 0;

	for (int i = 0; i < repeat.length; i++) {
	    if (repeat[i] > count) {
		count = repeat[i];
		topWordIndex = i;
	    }
	}

	System.out.println(
		"\"" + strings[topWordIndex] + "\" is a top word.");

    }

    static String[] getSplitWords(String string) {
	String[] strings = string.split(" ", 0);

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
	    if (strings[i].contains("-'")) {
		strings[i] = strings[i].replace("-'", "");
	    }
	}

	return strings;
    }

}
