package com.gmail.fomenkoc.homeworks.homework24;

import com.gmail.fomenkoc.homeworks.homework24.classes.Time;

public class HW24App {

	public static void main(String[] args) {
		Time time = new Time(3, 9);
		System.out.println(time);

		time.setHours(22);
		System.out.println(time);
		
		time.setMinutes(55);
		System.out.println(time);

	}

}
