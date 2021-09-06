package com.gmail.fomenkoc.lessons.lesson07.ocp.good;

public class Greeter {
	Personality  personality;
	
	public Greeter(Personality personality) {
		this.personality = personality;
	}
	
	public String greet() {
		return personality.greet();
	}
}
