package com.gmail.fomenkoc.homeworks.homework24;

import java.util.Scanner;
import java.util.stream.Collectors;

import com.gmail.fomenkoc.homeworks.homework24.classes.Cinema;
import com.gmail.fomenkoc.homeworks.homework24.classes.Seance;
import com.gmail.fomenkoc.homeworks.homework24.classes.Time;
import com.gmail.fomenkoc.homeworks.homework24.enums.Days;

public class HW24App {

	public static void main(String[] args) {

		Cinema cinema = new Cinema();
		boolean run = true;
		Scanner scStr = new Scanner(System.in);
		Scanner scInt = new Scanner(System.in);
		String input;
		String menu = "\nEnter number to action:"
				+ "\n1 - Fill test data"
				+ "\n2 - Add movie to library"
				+ "\n3 - Add seance"
				+ "\n4 - Remove movie"
				+ "\n5 - Remove seance"
				+ "\n6 - Show movies library"
				+ "\n7 - Show schedules"
				+ "\n0 - Exit";
		
		while (run) {
			System.out.println(menu);
			input = scStr.next();
			switch (input) {
			case "1": {
				cinema.fillTestData();
				System.out.println(cinema.getMoviesLibrary()
						.stream()
						.filter(m -> m.getTitle().equalsIgnoreCase("man of steel"))
						.findFirst().get());
				break;
			}
			case "2": {
				System.out.print("Enter movie title:");
				String movieTitle = scStr.next();
				System.out.print("Enter mivie duration in minutes:");
				int durationMins = scInt.nextInt();
				cinema.addMovie(movieTitle, durationMins);
				break;
			}
			case "3": {
				cinema.showLibrary();
				System.out.print("Enter movie id:");
				int movieID = scInt.nextInt();
				System.out.print("Enter day:");
				String dayStr = scStr.next();
				System.out.println("Start time");
				System.out.print("Hours:");
				int hours = scInt.nextInt();
				System.out.print("Minutes:");
				int mins = scInt.nextInt();
				Time time = new Time(hours, mins); 
				Seance seance = new Seance(
						cinema.getMoviesLibrary().get(movieID), time);
				cinema.addSeance(seance, dayStr);
				break;
			}
			case "4":{
				cinema.showLibrary();
				System.out.print("Enter movie id to remove:");
				int movieID = scInt.nextInt();
				cinema.removeMovie(cinema.getMoviesLibrary().get(movieID));
				break;
			}
			case "5":{
				System.out.print("Enter day:");
				String dayStr = scStr.next();
				cinema.showSeancesByDay(dayStr);
				System.out.print("Enter movie title:");
				String movieTitle = scStr.next();
				System.out.println(movieTitle);
				System.out.println(cinema.getMovieByName.apply(movieTitle));
//				System.out.println("Start time");
//				System.out.print("Hours:");
//				int hours = scInt.nextInt();
//				System.out.print("Minutes:");
//				int mins = scInt.nextInt();
//				Time startTime = new Time(hours, mins);
//				cinema.removeSeance(new Seance(cinema.getMoviesLibrary()
//						.stream()
//						.filter(m -> m.getTitle().equalsIgnoreCase(movieTitle))
//						.findFirst().get(), startTime), dayStr);
				break;
			}
			case "0": {
				run = false;
				break;
			}
			default: {
				System.out.println("Incorrect input, try again.");
				break;
			}
			}
		}
		scStr.close();
		scInt.close();

	}

}
