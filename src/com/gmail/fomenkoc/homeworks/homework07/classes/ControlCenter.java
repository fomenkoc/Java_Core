package com.gmail.fomenkoc.homeworks.homework07.classes;

import java.util.Random;

import com.gmail.fomenkoc.homeworks.homework07.interfaces.Randomness;

public class ControlCenter implements Randomness {

	public void moveUp(String name) {
		double distance = getRadnom(1, 100);
		System.out.println("Unit " + name + " moving UP to " + distance + " kilometers");
	}

	public void moveDown(String name) {
		double distance = getRadnom(1, 100);
		System.out.println("Unit " + name + " moving DOWN to " + distance + " kilometers");
	}

	public void moveLeft(String name) {
		double distance = getRadnom(1, 100);
		System.out.println("Unit " + name + " moving LEFT to " + distance + " kilometers");
	}

	public void moveRight(String name) {
		double distance = getRadnom(1, 100);
		System.out.println("Unit " + name + " moving RIGHT to " + distance + " kilometers");
	}

	@Override
	public double getRadnom(int min, int max) {
		Random random = new Random();
		double ret = min + (max - min) * random.nextDouble();
		return Math.round(ret * 1000) / 1000.0;
	}

}
