package com.gmail.fomenkoc.homeworks.homework06.classes;

import com.gmail.fomenkoc.homeworks.homework06.interfaces.Salary;

public class EmployeeFixed implements Salary {
	private String name;

	public String getName() {
		return name;
	}

	private double salary;

	public EmployeeFixed(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	@Override
	public double getSalaty(int hours) {
		if (hours > 0) {
			return this.salary;
		} else {
			return 0;
		}
	}

}
