package com.gmail.fomenkoc.homeworks.homework08.enumeration;

public enum Month {
	JANUARY(Season.WINTER, 31), FEBRUARY(Season.WINTER, 28), MARCH(Season.SPRING, 31), APRIL(Season.SPRING, 30),
	MAY(Season.SPRING, 31), JUNE(Season.SUMMER, 30), JULY(Season.SUMMER, 31), AUGUST(Season.SUMMER, 31),
	SEPTEMBER(Season.FALL, 30), OCTOBER(Season.FALL, 31), NOVEMBER(Season.FALL, 30), DECEMBER(Season.WINTER, 31);

	int dayCount;
	Season season;

	Month(Season season, int dayCount) {
		this.season = season;
		this.dayCount = dayCount;
	}

	public int getDayCount() {
		return dayCount;
	}

	public Season getSeason() {
		return season;
	}
	
	public String getSeasonStr() {
		return season.toString();
	}
	
	
}
