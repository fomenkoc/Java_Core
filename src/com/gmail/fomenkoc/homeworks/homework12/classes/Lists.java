package com.gmail.fomenkoc.homeworks.homework12.classes;

import java.util.ArrayList;

public class Lists {
    private static final ArrayList<Season> seasons = new ArrayList<Season>() {
	{
	    add(new Season("WINTER"));
	    add(new Season("SPRING"));
	    add(new Season("SUMMER"));
	    add(new Season("FALL"));
	}
    };
    
    private static final ArrayList<Month> months = new ArrayList<Month>() {
	{
	    add(new Month("JANUARY", seasons.get(0), 31));
	    add(new Month("FEBRUARY", seasons.get(0), 28));
	    add(new Month("MARCH", seasons.get(1), 31));
	    add(new Month("APRIL", seasons.get(1), 30));
	    add(new Month("MAY", seasons.get(1), 31));
	    add(new Month("JUNE", seasons.get(2), 30));
	    add(new Month("JULY", seasons.get(2), 31));
	    add(new Month("AUGUST", seasons.get(2), 31));
	    add(new Month("SEPTEMBER", seasons.get(3), 30));
	    add(new Month("OCTOBER", seasons.get(3), 31));
	    add(new Month("NOVEMBER", seasons.get(3), 30));
	    add(new Month("DECEMBER", seasons.get(0), 31));
	}
    };

    public static ArrayList<Season> getSeasons() {
        return seasons;
    }

    public static ArrayList<Month> getMonths() {
        return months;
    }

    
    
}
