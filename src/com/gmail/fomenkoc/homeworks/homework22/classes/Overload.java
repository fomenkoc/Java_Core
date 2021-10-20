package com.gmail.fomenkoc.homeworks.homework22.classes;

public class Overload {
	
	private int id;
	private String name;
	private int age;
	
	
	public Overload(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}


	public Overload(int id, int age) {
		this(id, "Default Name", age);
	}


	@Override
	public String toString() {
		return "Overload [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
	
	

}
