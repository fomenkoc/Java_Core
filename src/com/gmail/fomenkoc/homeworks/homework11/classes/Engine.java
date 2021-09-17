package com.gmail.fomenkoc.homeworks.homework11.classes;

public class Engine {
	private int cylinders;

	
	public Engine() {
		super();
		this.cylinders = RandomNum.getInt(4, 16);
	}
	
	public Engine(int cylinders) {
		super();
		this.cylinders = cylinders;
	}

	@Override
	public String toString() {
		return "[cylinders=" + cylinders + "]";
	}
	
	

}
