package com.gmail.fomenkoc.homeworks.homework18.classes;

import java.util.Objects;

public class MyEntry<K, V> {
	K firstGen;
	V secondGen;

	public MyEntry() {
		super();

	}

	public MyEntry(K firstGen, V secondGen) {
		super();
		this.firstGen = firstGen;
		this.secondGen = secondGen;
	}

	public K getFirstGen() {
		return firstGen;
	}

	public void setFirstGen(K firstGen) {
		this.firstGen = firstGen;
	}

	public V getSecondGen() {
		return secondGen;
	}

	public void setSecondGen(V secondGen) {
		this.secondGen = secondGen;
	}

	@Override
	public String toString() {
		return "MyEntry [firstGen=" + firstGen + ", secondGen=" + secondGen
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstGen, secondGen);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyEntry other = (MyEntry) obj;
		return Objects.equals(firstGen, other.firstGen)
				&& Objects.equals(secondGen, other.secondGen);
	}

}
