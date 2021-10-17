package com.gmail.fomenkoc.homeworks.homework20.classes;

import java.math.BigInteger;
import java.util.Arrays;

public class Fibonacci {
	private BigInteger[] fibonacciNumber;

	public Fibonacci(int fibonacciNumberCount) {
		super();
		this.fibonacciNumber = new BigInteger[fibonacciNumberCount];
		fillArray();
	}

	void fillArray() {
		BigInteger n0 = BigInteger.valueOf(1);
		BigInteger n1 = BigInteger.valueOf(1);
		BigInteger n2 = BigInteger.valueOf(0);
		this.fibonacciNumber[0] = n2;
		if (this.fibonacciNumber.length > 1)
		this.fibonacciNumber[1] = n0;
		if (this.fibonacciNumber.length > 2)
		this.fibonacciNumber[2] = n1;
		if (this.fibonacciNumber.length > 3) {
			for (int i = 3; i < this.fibonacciNumber.length; i++) {
				n2 = n0.add(n1);
				n0 = n1;
				n1 = n2;
				this.fibonacciNumber[i] = n2;
			}
		}
	}

	public BigInteger[] getFibonacciNumber() {
		return fibonacciNumber;
	}

	public void setFibonacciNumber(BigInteger[] fibonacciNumber) {
		this.fibonacciNumber = fibonacciNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(fibonacciNumber);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fibonacci other = (Fibonacci) obj;
		return Arrays.equals(fibonacciNumber, other.fibonacciNumber);
	}

	@Override
	public String toString() {
		return "Fibonacci [fibonacciNumber=" + Arrays.toString(fibonacciNumber)
				+ "]";
	}

}
