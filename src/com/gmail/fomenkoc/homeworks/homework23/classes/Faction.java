package com.gmail.fomenkoc.homeworks.homework23.classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

import com.gmail.fomenkoc.homeworks.homework23.classes.TopBriberComparator;

public class Faction {
    private String factionName;
    private ArrayList<Deputy> deputies;

    public Faction(String factionName) {
	super();
	this.factionName = factionName;
	this.deputies = new ArrayList<Deputy>();
    }

    public String getFactionName() {
	return factionName;
    }

    public void setFactionName(String factionName) {
	this.factionName = factionName;
    }

    public ArrayList<Deputy> getDeputies() {
	return deputies;
    }

    public void setDeputies(ArrayList<Deputy> deputies) {
	this.deputies = deputies;
    }

    @Override
    public String toString() {
	return "Faction [factionName=" + factionName + ", deputies=" + deputies
		+ "]";
    }

    public void addDeputy() {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter first name: ");
	String firstNmae = scanner.next();
	System.out.print("Enter last name: ");
	String lastNmae = scanner.next();
	System.out.print("Enter his weight: ");
	double weight = scanner.nextDouble();
	System.out.print("Enter his height: ");
	double height = scanner.nextDouble();
	System.out.print("Is he a briber? : ");
	String briber = scanner.next();
	boolean bribeTaker = false;
	if (briber.equalsIgnoreCase("yes") || briber.equalsIgnoreCase("так")
		|| briber.equalsIgnoreCase("true")) {
	    bribeTaker = true;
	}

	this.deputies.add(
		new Deputy(weight, height, firstNmae, lastNmae, bribeTaker));
	Collections.sort(this.deputies);
    }

    public void removeDeputy() {
	for (int i = 0; i < deputies.size(); i++) {
	    System.out.println(deputies.get(i).getFullName());
	}
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter first name:");
	String firstNmae = scanner.next();
	System.out.print("Enter last name:");
	String lastNmae = scanner.next();
	Iterator<Deputy> iterator = this.deputies.iterator();

	while (iterator.hasNext()) {
	    Deputy nextDeputy = iterator.next();
	    if (nextDeputy.getFirstName().equalsIgnoreCase(firstNmae)
		    && nextDeputy.getLastName().equalsIgnoreCase(lastNmae)) {
		System.out.println("Deputy " + nextDeputy.getFullName()
			+ " removed from " + this.getFactionName());
		iterator.remove();
	    }
	}
    }

    public void showAllBribers() {
	Iterator<Deputy> iterator = deputies.iterator();
	while (iterator.hasNext()) {
	    Deputy nextDeputy = iterator.next();
	    if (nextDeputy.isBribeTaker()) {
		System.out.println(nextDeputy.getFullName());
	    }
	}
    }

    public void showTopBriber() {
	Collections.sort(this.deputies, new TopBriberComparator());
	System.out.println(this.deputies.get(0).getFullName());
    }

    public Deputy getTopBriber() {
	Collections.sort(this.deputies, new TopBriberComparator());
	return this.deputies.get(0);
    }

    public void showAllDeputy() {
	Collections.sort(this.deputies);
	Iterator<Deputy> iterator = deputies.iterator();
	while (iterator.hasNext()) {
	    Deputy nextDeputy = iterator.next();
	    System.out.println(nextDeputy.getFullName());

	}
    }

    public void removeAllDeputy() {
	this.deputies.clear();
    }

}

