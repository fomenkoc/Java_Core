package com.gmail.fomenkoc.lessons.lesson07.isp.bad;

public class Penguin implements Bird {

	@Override
	public void fly() {
		//do not working
	}

	@Override
	public void molt() {
		System.out.println("Penguin is molting");
	}

	
	public void swim() {
		System.out.println("Penguin is swimming");
	}
}
