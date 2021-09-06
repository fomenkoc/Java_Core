package com.gmail.fomenkoc.lessons.lesson07.lsp.bad;

public class Main {

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle();
		r1.setHeight(10);
		r1.setWeight(5);
		System.out.println(r1.calculateSquire());
		
		
		 r1 = new Square();
		r1.setHeight(10);
		r1.setWeight(5);
		System.out.println(r1.calculateSquire());
	}

}
