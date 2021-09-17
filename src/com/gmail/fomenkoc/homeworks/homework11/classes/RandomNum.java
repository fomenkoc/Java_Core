package com.gmail.fomenkoc.homeworks.homework11.classes;

import java.util.Random;

public class RandomNum {

    public static int getInt(int min, int max) {
	if (min >= max) {
	    throw new IllegalArgumentException(
		    "min value must be smaller than max value");
	}

	Random r = new Random();
	return r.nextInt(max - min + 1) + min;
    }
}
