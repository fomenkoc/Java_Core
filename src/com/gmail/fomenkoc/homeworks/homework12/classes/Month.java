package com.gmail.fomenkoc.homeworks.homework12.classes;

public class Month {
    private String monthName;
    private Season season;
    private int daysCount;

    public Month(String monthName, Season season, int daysCount) {
	super();
	this.monthName = monthName;
	this.season = season;
	this.daysCount = daysCount;
    }

    public String getMonthName() {
	return monthName;
    }

    public void setMonthName(String monthName) {
	this.monthName = monthName;
    }

    public Season getSeason() {
	return season;
    }

    public void setSeason(Season season) {
	this.season = season;
    }

    public int getDaysCount() {
	return daysCount;
    }

    public void setDaysCount(int daysCount) {
	this.daysCount = daysCount;
    }

    @Override
    public String toString() {
	return "Month [monthName=" + monthName + ", season=" + season
		+ ", daysCount=" + daysCount + "]";
    }

    
}
