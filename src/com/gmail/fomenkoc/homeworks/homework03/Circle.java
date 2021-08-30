package com.gmail.fomenkoc.homeworks.homework03;

public class Circle {

	private double radius;
	private double diameter;

	public Circle(double radius) {
		this.radius = radius;
		this.diameter = radius * 2;
	}

	public double getArea() {
		return Math.PI * Math.pow(this.radius, 2);
	}

	public double getLength() {
		return 2 * Math.PI * (this.diameter / 2);
	}
}
