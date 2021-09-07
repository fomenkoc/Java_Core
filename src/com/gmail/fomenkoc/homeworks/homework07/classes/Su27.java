package com.gmail.fomenkoc.homeworks.homework07.classes;

import com.gmail.fomenkoc.homeworks.homework07.interfaces.Forsage;
import com.gmail.fomenkoc.homeworks.homework07.interfaces.NuclearStrike;
import com.gmail.fomenkoc.homeworks.homework07.interfaces.Stealth;

public class Su27 extends Plane implements Forsage, Stealth, NuclearStrike {
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

	@Override
	public void nuclearStrike() {
		int warheads = (int) controlCenter.getRadnom(1, 10);
		System.out.println("Delivery of the payload, " + warheads + " warheads gone");

	}

	@Override
	public void stealth() {
		int minutes = (int) controlCenter.getRadnom(1, 60);
		System.out.println("Disguise for " + minutes + " minutes");

	}

	@Override
	public void forsage() {
		double acceleration = controlCenter.getRadnom(10, 30) / 100.0 + 1;
		System.out.println("Afterburner is on, current speed - " + this.topSpeed * acceleration + " km/h");
	}

}
