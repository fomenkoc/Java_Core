package com.gmail.fomenkoc.lessons.lesson07.isp.good;

public class Penguin implements Swimable, Moltable {

	@Override
	public void molt() {
		System.out.println("Penguin is mlting ");
	}

	@Override
	public void swim() {
		System.out.println("Penguin is swimming");
	}

}
