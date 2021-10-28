package com.gmail.fomenkoc.homeworks.homework23.classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class VerkhovnaRada {
    private static VerkhovnaRada instance;
    private ArrayList<Faction> factions;

    private VerkhovnaRada() {
	factions = new ArrayList<Faction>();
    };

    public static VerkhovnaRada getInstance() {
	if (instance == null) {
	    instance = new VerkhovnaRada();
	}
	return instance;
    }

    public ArrayList<Faction> getFactions() {
	return factions;
    }

    public void setFactions(ArrayList<Faction> factions) {
	this.factions = factions;
    }

    public void showAllFactions() {
	System.out.println("Current factions:");

	factions.stream().peek(e -> System.out.println(e.getFactionName()))
			.collect(Collectors.toList());
    }

    public void addFaction() {
	this.showAllFactions();
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter new faction name: ");
	String factionName = scanner.nextLine();
	this.factions.add(new Faction(factionName));
    }

    public void removeFaction() {
	this.showAllFactions();
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter faction name to remove: ");
	String factionName = scanner.nextLine();
	Iterator<Faction> iterator = this.factions.iterator();
	while (iterator.hasNext()) {
	    Faction faction = iterator.next();
	    if (faction.getFactionName().equalsIgnoreCase(factionName)) {
		System.out.println(
			"Faction " + faction.getFactionName() + " removed.");
		iterator.remove();
	    }

	}
    }

    public void cleanFaction() {
	this.showAllFactions();
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter faction name to clean: ");
	String factionName = scanner.nextLine();
	Iterator<Faction> iterator = this.factions.iterator();
	while (iterator.hasNext()) {
	    Faction faction = iterator.next();
	    if (faction.getFactionName().equalsIgnoreCase(factionName)) {
		System.out.println(
			"Faction " + faction.getFactionName() + " cleaned.");
		faction.removeAllDeputy();
	    }
	}
    }

    public void showFaction() {
	this.showAllFactions();
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter faction name to show: ");
	String factionName = scanner.nextLine();
	Iterator<Faction> iterator = this.factions.iterator();
	while (iterator.hasNext()) {
	    Faction faction = iterator.next();
	    if (faction.getFactionName().equalsIgnoreCase(factionName)) {
		System.out.println(faction);
	    }
	}
    }

    public void addDeputyToFaction() {
	this.showAllFactions();
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter faction name to add deputy: ");
	String factionName = scanner.nextLine();
	Iterator<Faction> iterator = this.factions.iterator();
	while (iterator.hasNext()) {
	    Faction faction = iterator.next();
	    if (faction.getFactionName().equalsIgnoreCase(factionName)) {
		faction.addDeputy();
	    }
	}
    }

    public void removeDeputyFromFaction() {
	this.showAllFactions();
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter faction name to add deputy: ");
	String factionName = scanner.nextLine();
	Iterator<Faction> iterator = this.factions.iterator();
	while (iterator.hasNext()) {
	    Faction faction = iterator.next();
	    if (faction.getFactionName().equalsIgnoreCase(factionName)) {
		faction.removeDeputy();
	    }
	}
    }

    public void showBribers() {
    	factions.stream().peek(e -> e.showAllBribers())
		.collect(Collectors.toList());
    }

    public void showTopBriber() {
	ArrayList<Deputy> briberDeputies = new ArrayList<Deputy>();
	Iterator<Faction> iterator = this.factions.iterator();
	while (iterator.hasNext()) {
	    Faction faction = iterator.next();
	    if (faction.getDeputies().size() > 0) {
		briberDeputies.add(faction.getTopBriber());
	    }
	}
	Collections.sort(briberDeputies, new TopBriberComparator());
	System.out.println(briberDeputies.get(0).getFullName());
    }
}
