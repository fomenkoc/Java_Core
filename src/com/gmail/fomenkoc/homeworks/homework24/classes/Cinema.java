package com.gmail.fomenkoc.homeworks.homework24.classes;

import java.util.ArrayList;
import java.util.Objects;
import java.util.TreeMap;

import com.gmail.fomenkoc.homeworks.homework24.enums.Days;

public class Cinema {
	private TreeMap<Days, Schedule> schedules;
	private ArrayList<Movie> moviesLibrary;
	private Time open;
	private Time close;
	
	
	public Cinema() {
		super();
		this.schedules = new TreeMap<Days, Schedule>();
		this.moviesLibrary = new ArrayList<Movie>();
		this.open = new Time(9, 0);
		this.close = new Time(22, 0);
	}
	
	public Cinema(TreeMap<Days, Schedule> schedules,
			ArrayList<Movie> moviesLibrary, Time open, Time close) {
		super();
		this.schedules = schedules;
		this.moviesLibrary = moviesLibrary;
		this.open = open;
		this.close = close;
	}
	
	public void addMovie(Movie movie) {
		this.moviesLibrary.add(movie);
	}
	
	public void addMovie(String movieTitle, int min) {
		this.moviesLibrary.add(new Movie(movieTitle, Time.newByMin.apply(min)));
	}

	public void addSeance(Seance seance, String dayStr) {
		Days day;
		if (Days.isCorrect.test(dayStr)) {
			day = Days.valueOf(dayStr.toUpperCase());
			
		} else {
			throw new IllegalArgumentException("\"" + dayStr 
									+ "\" is incorrect day name!");
		}
		Schedule schedule = new Schedule();
		schedule.addSeance(seance);
		this.schedules.put(day, schedule);
	}

	public TreeMap<Days, Schedule> getSchedules() {
		return schedules;
	}


	public void setSchedules(TreeMap<Days, Schedule> schedules) {
		this.schedules = schedules;
	}


	public ArrayList<Movie> getMoviesLibrary() {
		return moviesLibrary;
	}


	public void setMoviesLibrary(ArrayList<Movie> moviesLibrary) {
		this.moviesLibrary = moviesLibrary;
	}


	public Time getOpen() {
		return open;
	}


	public void setOpen(Time open) {
		this.open = open;
	}


	public Time getClose() {
		return close;
	}


	public void setClose(Time close) {
		this.close = close;
	}


	@Override
	public int hashCode() {
		return Objects.hash(close, moviesLibrary, open, schedules);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cinema other = (Cinema) obj;
		return Objects.equals(close, other.close)
				&& Objects.equals(moviesLibrary, other.moviesLibrary)
				&& Objects.equals(open, other.open)
				&& Objects.equals(schedules, other.schedules);
	}


	@Override
	public String toString() {
		return "Cinema [schedules=" + schedules + ", moviesLibrary="
				+ moviesLibrary + ", open=" + open + ", close=" + close + "]";
	}
	
	

}
