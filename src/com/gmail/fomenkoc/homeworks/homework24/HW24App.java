package com.gmail.fomenkoc.homeworks.homework24;


import com.gmail.fomenkoc.homeworks.homework24.classes.Cinema;
import com.gmail.fomenkoc.homeworks.homework24.classes.Movie;
import com.gmail.fomenkoc.homeworks.homework24.classes.Schedule;
import com.gmail.fomenkoc.homeworks.homework24.classes.Seance;
import com.gmail.fomenkoc.homeworks.homework24.classes.Time;


public class HW24App {

	public static void main(String[] args) {
		Time time = new Time(12, 00);
		Time time2 = new Time(15, 00);
		Time time3 = new Time(18, 00);
		
		Movie movie = new Movie("Batman Bigins", 2, 20);
		Movie movie2 = new Movie("The Dark Knight", 2, 32);
		Movie movie3 = new Movie("The Dark Knight Rises", 2, 45);
		Movie movie4 = new Movie("Test", 2, 45);
		
		Seance seance = new Seance(movie, time);
		Seance seance2 = new Seance(movie2, time2);
		Seance seance3 = new Seance(movie3, time3);

		
		Schedule schedule = new Schedule();
		schedule.addSeance(seance);
		schedule.addSeance(seance2);
		schedule.addSeance(seance3);
//		System.out.println(schedule);
		
		Cinema cinema = new Cinema();
		cinema.addSeance(seance, "friday");
		cinema.addSeance(seance2, "friday");
		cinema.addSeance(seance3, "friday");
		System.out.println(cinema.getSchedules());
		
		cinema.addMovie(movie);
		cinema.addMovie(movie2);
		cinema.addMovie(movie3);
//		System.out.println(cinema.getMoviesLibrary());
		
		
		System.out.println();
		System.out.println();
//		cinema.removeMovie(movie3);
//		cinema.removeMovie(movie4);
		cinema.removeSeance(seance3, "friday");

		System.out.println(cinema.getSchedules());
		
		
		
		
		
		

	}

}
