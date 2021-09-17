package com.gmail.fomenkoc.homeworks.homework11.classes;

public class Auto {
	private Handlebar handlebar;
	private Engine engine;
	int power;
	int year;

	public Auto() {
		super();
		this.handlebar = new Handlebar();
		this.engine = new Engine();
		this.power = RandomNum.getInt(50, 500);
		this.year = RandomNum.getInt(1980, 2021);
	}

	public Auto(Handlebar handlebar, Engine engine, int power, int year) {
		super();
		this.handlebar = handlebar;
		this.engine = engine;
		this.power = power;
		this.year = year;
	}

	@Override
	public String toString() {
		return "Auto [handlebar " + this.handlebar.toString() + ", engine "
				+ engine.toString() + ", power=" + power + ", year=" + year
				+ "]";
	}

}
