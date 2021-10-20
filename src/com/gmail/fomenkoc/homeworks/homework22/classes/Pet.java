package com.gmail.fomenkoc.homeworks.homework22.classes;

public abstract class Pet {

	public abstract void voice();
	
	Voice voiceLambda = msg -> System.out.println(msg);
}

interface Voice{
	void makeNoise(String msg);
}
