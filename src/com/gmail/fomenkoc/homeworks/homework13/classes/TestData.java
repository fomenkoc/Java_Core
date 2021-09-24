package com.gmail.fomenkoc.homeworks.homework13.classes;

import java.util.ArrayList;

public class TestData {

    public static void fill() {
	VerkhovnaRada rada = VerkhovnaRada.getInstance();
	ArrayList<Faction> factions = new ArrayList<Faction>();
	ArrayList<Deputy> deputies = new ArrayList<Deputy>();

	Faction faction = new Faction("DC");

	Deputy deputy = new Deputy(99.9, 180.5, "General", "Zod", true);
	deputy.setBribe(1000);
	faction.getDeputies().add(deputy);
	deputy = new Deputy(99.9, 180.5, "Lex", "Luthor", true);
	deputy.setBribe(3000);
	faction.getDeputies().add(deputy);
	deputy = new Deputy(99.9, 180.5, "Black", "Adam", true);
	deputy.setBribe(4300);
	faction.getDeputies().add(deputy);
	deputy = new Deputy(99.9, 180.5, "Barry", "Allen", false);
	faction.getDeputies().add(deputy);
	deputy = new Deputy(99.9, 180.5, "Clark", "Kent", false);
	faction.getDeputies().add(deputy);
	deputy = new Deputy(99.9, 180.5, "Bruce", "Wayne", false);
	faction.getDeputies().add(deputy);

	rada.getFactions().add(faction);

	faction = new Faction("Marvel");

	deputy = new Deputy(99.9, 180.5, "Ghost", "Rider", false);
	faction.getDeputies().add(deputy);
	deputy = new Deputy(99.9, 180.5, "Tony", "Stark", false);
	faction.getDeputies().add(deputy);
	deputy = new Deputy(99.9, 180.5, "Peter", "Parker", false);
	faction.getDeputies().add(deputy);
	deputy = new Deputy(99.9, 180.5, "God", "Loki", true);
	deputy.setBribe(3124);
	faction.getDeputies().add(deputy);
	deputy = new Deputy(99.9, 180.5, "Doctor", "Doom", true);
	deputy.setBribe(3200);
	faction.getDeputies().add(deputy);
	deputy = new Deputy(99.9, 180.5, "Ronan", "Accuser", true);
	deputy.setBribe(1100);
	faction.getDeputies().add(deputy);

	rada.getFactions().add(faction);

	faction = new Faction("Star Wars");

	deputy = new Deputy(99.9, 180.5, "Luke", "Skywalker", false);
	faction.getDeputies().add(deputy);
	deputy = new Deputy(99.9, 180.5, "Darth", "Vader", true);
	deputy.setBribe(87600);
	faction.getDeputies().add(deputy);

	rada.getFactions().add(faction);

    }
}
