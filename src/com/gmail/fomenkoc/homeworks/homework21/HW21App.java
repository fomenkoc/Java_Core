package com.gmail.fomenkoc.homeworks.homework21;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import com.gmail.fomenkoc.homeworks.homework21.classes.AstromechDroid;
import com.gmail.fomenkoc.homeworks.homework21.classes.ClassFieldsDescription;
import com.gmail.fomenkoc.homeworks.homework21.classes.DateConvertor;

public class HW21App {

	public static void main(String[] args) {

		System.out.println("Task 1.");
//		AstromechDroid droid = new AstromechDroid("R2", "Millennium Falcon",
//				LocalDate.now());
//		ClassFieldsDescription.makeFile(droid.getClass());
		ClassFieldsDescription.makeFile(AstromechDroid.class);

		System.out.println();
		System.out.println("Task 2.");
		Date date = new GregorianCalendar(2021, Calendar.OCTOBER, 18, 23, 32)
				.getTime();
		LocalDate localDate = DateConvertor.getLocalDate(date);
		LocalTime localTime = DateConvertor.getLocalTime(date);
		LocalDateTime localDateTime = DateConvertor.getLocalDateTime(date);
		
		System.out.println("Date: " + date);
		System.out.println("LocalDate: " + localDate);
		System.out.println("LocalTime: " + localTime);
		System.out.println("LocalDateTime: " + localDateTime);

	}

}
