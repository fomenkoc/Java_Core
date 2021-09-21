package com.gmail.fomenkoc.homeworks.homework12.classes;

public class Season {
    private String seasonName;

    public Season(String seasonName) {
	super();
	this.seasonName = seasonName;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public void setSeasonName(String seasonName) {
        this.seasonName = seasonName;
    }

    @Override
    public String toString() {
	return "Season [seasonName=" + seasonName + "]";
    }
    
    
}
