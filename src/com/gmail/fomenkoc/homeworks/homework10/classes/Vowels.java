package com.gmail.fomenkoc.homeworks.homework10.classes;

public class Vowels {

    private static String volwels = "eyuioaуеїіаоєяию";
    
    public static String replace(String string) {
	String outPutStr = "";
	volwels = volwels + volwels.toUpperCase();
	
	for (char letter : string.toCharArray()) {
	    if (volwels.contains(String.valueOf(letter))) {
		outPutStr = outPutStr + "-";
	    } else {
		outPutStr = outPutStr + letter;
	    }

	}

	return outPutStr;
    }

}
