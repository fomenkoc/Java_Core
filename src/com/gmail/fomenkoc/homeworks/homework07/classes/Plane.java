package com.gmail.fomenkoc.homeworks.homework07.classes;

import com.gmail.fomenkoc.homeworks.homework07.interfaces.Randomness;

public abstract class Plane {

	private double length;
	private double width;
	private double weight;

	public Plane(double length, double width, double weight) {
		super();
		this.length = length;
		this.width = width;
		this.weight = weight;
	}

	public abstract void startingEngines();

	public abstract void takeoff();

	public abstract void landing();

}
