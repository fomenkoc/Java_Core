package com.gmail.fomenkoc.homeworks.homework13.classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

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
	Iterator<Faction> iterator = this.factions.iterator();
	while (iterator.hasNext()) {
	    Faction faction = (Faction) iterator.next();
	    System.out.println(faction.getFactionName());
	}
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
	Iterator<Faction> iterator = this.factions.iterator();
	while (iterator.hasNext()) {
	    Faction faction = iterator.next();
	    faction.showAllBribers();
	}
    }

    public void showTopBriber() {
	ArrayList<Deputy> briberDeputies = new ArrayList<Deputy>();
	Iterator<Faction> iterator = this.factions.iterator();
	while (iterator.hasNext()) {
	    Faction faction = iterator.next();
	    briberDeputies.add(faction.getTopBriber());
	}
	Collections.sort(briberDeputies, new TopBriberComparator());
	System.out.println(briberDeputies.get(0).getFullName());
    }
}
