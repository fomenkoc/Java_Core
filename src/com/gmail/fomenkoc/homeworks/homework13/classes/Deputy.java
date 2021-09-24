package com.gmail.fomenkoc.homeworks.homework13.classes;

import java.util.Scanner;

public class Deputy extends Human implements Comparable<Deputy> {
    private String firstName;
    private String lastName;
    private boolean bribeTaker;
    private double bribe;

    public Deputy(double weight, double height, String firstName,
	    String secondName, boolean bribeTaker) {
	super(weight, height);
	this.firstName = firstName;
	this.lastName = secondName;
	this.bribeTaker = bribeTaker;
	this.bribe = 0;
    }

    public String getFirstName() {
	return this.firstName;
    }

    public void setFirstName(String firstName) {
	this.firstName = firstName;
    }

    public String getLastName() {
	return this.lastName;
    }

    public void setLastName(String secondName) {
	this.lastName = secondName;
    }

    public String getFullName() {
	return this.firstName + " " + this.lastName;
    }

    public boolean isBribeTaker() {
	return this.bribeTaker;
    }

    public void setBribeTaker(boolean bribeTaker) {
	this.bribeTaker = bribeTaker;
    }

    public double getBribe() {
	return this.bribe;
    }

    public void setBribe(double bribe) {
	this.bribe = bribe;
    }

    @Override
    public String toString() {
	return "\nDeputy [firstName=" + firstName + ", lastName=" + lastName
		+ ", bribeTaker=" + bribeTaker + ", bribe=" + bribe + "]";
    }

    public void giveBribe() {
	if (!this.bribeTaker) {
	    System.out.println("This deputy doesn't take bribes.");
	} else {
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter bribe sum:");
	    double bribeSum = scanner.nextDouble();
	    if (bribeSum > 5000) {
		System.out.println("The police will imprison the deputy");
	    } else {
		this.bribe += bribeSum;
	    }
	}
    }

    @Override
    public int compareTo(Deputy o) {
	if (this.getFirstName().compareToIgnoreCase(o.getFirstName()) > 0) {
	    return 1;
	} else if (this.getFirstName()
		.compareToIgnoreCase(o.getFirstName()) < 0) {
	    return -1;
	} else {
	    if (this.getLastName().compareToIgnoreCase(o.getLastName()) > 0) {
		return 1;
	    } else if (this.getLastName()
		    .compareToIgnoreCase(o.getLastName()) < 0) {
		return -1;
	    }

	}
	return 0;
    }

}
