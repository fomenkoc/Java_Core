package com.gmail.fomenkoc.homeworks.homework24;

import com.gmail.fomenkoc.homeworks.homework24.classes.Movie;
import com.gmail.fomenkoc.homeworks.homework24.classes.Schedule;
import com.gmail.fomenkoc.homeworks.homework24.classes.Seance;
import com.gmail.fomenkoc.homeworks.homework24.classes.Time;

public class HW24App {

	public static void main(String[] args) {
		Time time = new Time(12, 00);
		Time time2 = new Time(15, 00);
//		System.out.println(time);

		
		
		Movie movie = new Movie("Batman Bigins", 2, 20);
		Movie movie2 = new Movie("Batman Bigins 2", 2, 30);
//		System.out.println(movie);
		
		Seance seance = new Seance(movie, time);
		Seance seance2 = new Seance(movie2, time2);
//		System.out.println(seance);
		
		Schedule schedule = new Schedule();
		schedule.addSeance(seance);
		schedule.addSeance(seance2);
		System.out.println(schedule);
		schedule.removeSeance(seance);
		System.out.println();
		System.out.println(schedule);

	}

}
