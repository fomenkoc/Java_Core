package com.gmail.fomenkoc.homeworks.homework06;

import com.gmail.fomenkoc.homeworks.homework06.classes.EmployeeFixed;
import com.gmail.fomenkoc.homeworks.homework06.classes.EmployeeHourly;
import com.gmail.fomenkoc.homeworks.homework06.interface2.MyCalculator;

public class HW06App {
	public static void main(String[] args) {

		EmployeeFixed empFixed = new EmployeeFixed("Bill", 5000);
		EmployeeHourly empHourly = new EmployeeHourly("Jim", 200);
		
		System.out.println(empFixed.getName() +"'s salary = " + empFixed.getSalaty(1));
		System.out.println(empHourly.getName() +"'s salary = " + empHourly.getSalaty(20));
		
		
		MyCalculator myCalculator = new MyCalculator();
		
		System.out.println(myCalculator.add(651, 654));
		System.out.println(myCalculator.subtract(741, 132));
		System.out.println(myCalculator.multiplication(357, 147));
		System.out.println(myCalculator.division(951, 123));
		
	}
}
