package com.gmail.fomenkoc.homeworks.homework20.classes;

import java.math.BigInteger;
import java.util.Scanner;

public class MyThread extends Thread {
	private int numbersCount;
	private int delay;

	@Override
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("MyThread");
		System.out.print("Enter numbers count: ");
		this.numbersCount = scanner.nextInt();
		Fibonacci fibonacci = new Fibonacci(this.numbersCount);
		BigInteger[] array = fibonacci.getFibonacciNumber();

		System.out.print("Потік Thread : ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");

			try {
				Thread.sleep(this.delay);

			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
		System.out.println("\nMyThread finished work");
		System.out.println();

	}

	public MyThread() {
		super();
		this.delay = 1000;
	}

}
