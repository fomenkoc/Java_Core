package com.gmail.fomenkoc.homeworks.homework22.classes;

public class Amphibia {

	Lambda lambda = msg -> System.out.println(msg);

	public void eat() {

		lambda.action("Amphibian eats");
	}

	public void sleep() {

		lambda.action("Amphibian sleeps");
	}

	public void swim() {

		lambda.action("Amphibian swims");
	}

	public void walk() {

		lambda.action("Amphibian walks");
	}
}

interface Lambda {
	void action(String msg);
}