package com.gmail.fomenkoc.homeworks.homework06.interface2;

import com.gmail.fomenkoc.homeworks.homework06.interface1.Numerable;

public class MyCalculator implements Numerable {

	@Override
	public double division(double x, double y) {

		return x / y;
	}

	@Override
	public double subtract(double x, double y) {
		return x - y;
	}

	@Override
	public double multiplication(double x, double y) {
		return x * y;
	}

	@Override
	public double add(double x, double y) {
		return x + y;
	}

}
