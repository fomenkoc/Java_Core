package com.gmail.fomenkoc.homeworks.homework21.classes;

import java.time.LocalDate;

import com.gmail.fomenkoc.homeworks.homework21.annotations.MyAnnotation;

public class AstromechDroid {
	@MyAnnotation("Astromech droid series")
	private String series;
	@MyAnnotation("Spaceship, place of service")
	private String vehicle;
	@MyAnnotation("Date of commissioning")
	private LocalDate commissioned;
	
	private LocalDate lastService;

	public AstromechDroid(String series, String vehicle,
			LocalDate commissioned) {
		super();
		this.series = series;
		this.vehicle = vehicle;
		this.commissioned = commissioned;
	}

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public String getVehicle() {
		return vehicle;
	}

	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}

	public LocalDate getCommissioned() {
		return commissioned;
	}

	public void setCommissioned(LocalDate commissioned) {
		this.commissioned = commissioned;
	}
	
	

	public LocalDate getLastService() {
		return lastService;
	}

	public void setLastService(LocalDate lastService) {
		this.lastService = lastService;
	}
	
	public void doService() {
		this.lastService = LocalDate.now();
	}

	@Override
	public String toString() {
		return "AstromechDroid [series=" + series + ", vehicle=" + vehicle
				+ ", commissioned=" + commissioned + "]";
	}

}
