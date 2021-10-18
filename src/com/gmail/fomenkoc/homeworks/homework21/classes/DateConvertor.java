package com.gmail.fomenkoc.homeworks.homework21.classes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class DateConvertor {

	public static LocalDate getLocalDate(Date date) {

		LocalDateTime localDateTime = getLocalDateTime(date);
		LocalDate localDate = localDateTime.toLocalDate();
		return localDate;
	}
	
	public static LocalTime getLocalTime(Date date) {
		
		LocalDateTime localDateTime = getLocalDateTime(date);
		LocalTime localTime = localDateTime.toLocalTime();
		return localTime;
	}
	
	public static LocalDateTime getLocalDateTime(Date date) {
	
		LocalDateTime localDateTime = new java.sql.Timestamp(date.getTime())
				.toLocalDateTime();
		return localDateTime;
	}

}
