package com.gmail.fomenkoc.homeworks.homework16.classes;

import java.util.Objects;

public class Batman extends Human {
	private int batarangsCount;
	private boolean masked;
	private Human assistant;

	public Batman() {
		super("Bruce", "Wayne");
		this.batarangsCount = 5;
		this.masked = true;
		this.assistant = null;
	}

	public int getBatarangsCount() {
		return batarangsCount;
	}

	public void setBatarangsCount(int batarangsCount) {
		this.batarangsCount = batarangsCount;
	}

	public boolean isMasked() {
		return masked;
	}

	public void setMasked(boolean masked) {
		this.masked = masked;
	}

	public Human getAssistant() {
		return assistant;
	}

	public void setAssistant(Human assistant) {
		this.assistant = assistant;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ Objects.hash(assistant, batarangsCount, masked);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Batman other = (Batman) obj;
		return Objects.equals(assistant, other.assistant)
				&& batarangsCount == other.batarangsCount
				&& masked == other.masked;
	}

	@Override
	public String toString() {
		return "Batman [batarangsCount=" + batarangsCount + ", masked=" + masked
				+ ", assistant=" + assistant + "]";
	}

	public void myMethod(String a, int... ints) {
		System.out.println(a);
		for (int i : ints) {
			System.out.println(i);
		}
	}

	public void myMethod(int... ints) {
		for (int i : ints) {
			System.out.println(i);
		}
	}

}
