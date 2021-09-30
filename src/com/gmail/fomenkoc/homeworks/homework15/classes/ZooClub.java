package com.gmail.fomenkoc.homeworks.homework15.classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Objects;

public class ZooClub {
	private HashMap<Person, ArrayList<Animal>> map;

	public ZooClub() {
		super();
		this.map = new HashMap<Person, ArrayList<Animal>>();
	}

	public void addPerson(String name, int age) {
		this.getMap().put(new Person(name, age), new ArrayList<Animal>());
	}

	public void addPerson(Person person) {
		this.getMap().put(person, new ArrayList<Animal>());
	}

	public void addPetToPerson(String personName, String petName,
			String petType) {
		Iterator<Entry<Person, ArrayList<Animal>>> iterator = this.map
				.entrySet().iterator();
		while (iterator.hasNext()) {
			if (iterator.next().getKey().getName()
					.equalsIgnoreCase(personName)) {
				iterator.next().getValue().add(new Animal(petName, petType));
			}
		}
	}

	public HashMap<Person, ArrayList<Animal>> getMap() {
		return map;
	}

	public void setMap(HashMap<Person, ArrayList<Animal>> map) {
		this.map = map;
	}

	@Override
	public int hashCode() {
		return Objects.hash(map);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ZooClub other = (ZooClub) obj;
		return Objects.equals(map, other.map);
	}

	@Override
	public String toString() {
		return "ZooClub [map=" + map + "]";
	}

}
