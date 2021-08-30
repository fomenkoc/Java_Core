package com.gmail.fomenkoc.homeworks.homework04;

public class Animal {

	private String kind;
	private int speed;
	private int age;
	
	
	public Animal(String kind, int speed, int age) {
		super();
		this.kind = kind;
		this.speed = speed;
		this.age = age;
	}


	public String getKind() {
		return kind;
	}


	public void setKind(String kind) {
		this.kind = kind;
	}


	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
