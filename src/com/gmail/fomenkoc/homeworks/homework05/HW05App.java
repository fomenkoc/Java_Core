package com.gmail.fomenkoc.homeworks.homework05;

public class HW05App {

	public static void main(String[] args) {
		
		Cat cat = new Cat();
		Cow cow = new Cow();
		Dog dog = new Dog();
		
		cat.voice();
		cow.voice();
		dog.voice();
		
		Overload ovld1 = new Overload(1, "John Connor ", 44);
		Overload ovld2 = new Overload(2, 33);
		
		System.out.println(ovld1);
		System.out.println(ovld2);
		
		Amphibia frog = new Frog();
				
		frog.eat();
		frog.sleep();
		frog.swim();
		frog.walk();
		
		

	}

}
