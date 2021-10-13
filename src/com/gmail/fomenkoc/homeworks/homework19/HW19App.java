package com.gmail.fomenkoc.homeworks.homework19;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.gmail.fomenkoc.homeworks.homework19.classes.Employee;
import com.gmail.fomenkoc.homeworks.homework19.classes.Methods;

public class HW19App {

	public static void main(String[] args)
			throws IOException, ClassNotFoundException {
		Employee emp = new Employee("John Deere", 1, 5000);

		System.out.println(emp);

		File empFile = new File("Employee.obj");

		Methods.serialize(emp, empFile);

		System.out.println();
		System.out.println(Methods.deserealize(empFile));
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(emp);
		employees.add(new Employee("Jack Daniel", 2, 6587));
		employees.add(new Employee("Steve Rogers", 3, 3574));
		employees.add(new Employee("Bruce Banner", 4, 3574));
		employees.add(new Employee("Peter Parker", 5, 9511));
		employees.add(new Employee("Eddie Brock", 6, 3571));
		employees.add(new Employee("Anthony Stark", 7, 3574));
		employees.add(new Employee("Scott Lang", 8, 1287));
		
		System.out.println();
		System.out.println("ArrayList:");
		System.out.println(employees);
		
		File arrayFile = new File("Employees.obj");
		
		Methods.serialize(employees, arrayFile);
		
		System.out.println();
		System.out.println(Methods.deserealize(arrayFile));

	}

}
