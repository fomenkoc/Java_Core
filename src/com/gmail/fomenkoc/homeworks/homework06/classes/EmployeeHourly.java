package com.gmail.fomenkoc.homeworks.homework06.classes;

import com.gmail.fomenkoc.homeworks.homework06.interfaces.Salary;

public class EmployeeHourly implements Salary {
	private String name;
	private double salary;

	public String getName() {
		return name;
	}

	public EmployeeHourly(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	@Override
	public double getSalaty(int hours) {
		return this.salary * hours;
	}

}
