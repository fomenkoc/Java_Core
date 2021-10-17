package com.gmail.fomenkoc.homeworks.homework20.classes;

import java.math.BigInteger;
import java.util.Scanner;

public class RunnableThread implements Runnable {
	private int numbersCount;
	private int delay;

	@Override
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("RunnableThread");
		System.out.print("Enter numbers count: ");
		this.numbersCount = scanner.nextInt();
		Fibonacci fibonacci = new Fibonacci(this.numbersCount);
		BigInteger[] array = fibonacci.getFibonacciNumber();

		System.out.print("Потік Runnable : ");
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");

			try {
				Thread.sleep(this.delay);

			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
		System.out.println("\nRunnableThread finished work");
		System.out.println();

	}

	public RunnableThread() {
		super();
		this.delay = 1000;

	}

}
