package com.gmail.fomenkoc.homeworks.homework07.classes;

public class Su27 extends Plane {
	private String name;
	private int topSpeed;
	private String color;
	private ControlCenter controlCenter = new ControlCenter();

	public Su27(String name, int topSpeed, String color) {
		super(21.935, 14.7, 16380);
		this.name = name;
		this.topSpeed = topSpeed;
	}

	public void flyingUp() {
		this.controlCenter.moveUp(this.name);
	}

	public void flyingDown() {
		this.controlCenter.moveDown(this.name);
	}

	public void flyingLeft() {
		this.controlCenter.moveLeft(this.name);
	}

	public void flyingRight() {
		this.controlCenter.moveRight(this.name);
	}

	@Override
	public void startingEngines() {
		int seconds = (int) controlCenter.getRadnom(20, 88);
		System.out.println("Preparing for takeoff, " + seconds + " seconds");

	}

	@Override
	public void takeoff() {
		double km = controlCenter.getRadnom(1, 1000);
		System.out.println("Take off, fuel supply for " + km + " km");

	}

	@Override
	public void landing() {
		System.out.println("Bird at home, " + this.name + " going to land");

	}

}
