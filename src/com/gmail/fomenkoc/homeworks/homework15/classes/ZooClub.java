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
	    Entry<Person, ArrayList<Animal>> entry = iterator.next();
	    if (entry.getKey().getName().equalsIgnoreCase(personName)) {
		entry.getValue().add(new Animal(petName, petType));
	    }
	}
    }

    public void removePetFromPerson(String personName, String petName) {
	Iterator<Entry<Person, ArrayList<Animal>>> iteratorTop = this.map
		.entrySet().iterator();
	while (iteratorTop.hasNext()) {
	    Entry<Person, ArrayList<Animal>> entry = iteratorTop.next();
	    if (entry.getKey().getName().equalsIgnoreCase(personName)) {
		Iterator<Animal> iteratorBottom = entry.getValue().iterator();
		while (iteratorBottom.hasNext()) {
		    Animal animal = iteratorBottom.next();
		    if (animal.getName().equalsIgnoreCase(petName)) {
			iteratorBottom.remove();
		    }
		}
	    }
	}
    }

    public void removePerson(String name) {
	Iterator<Entry<Person, ArrayList<Animal>>> iterator = this.map
		.entrySet().iterator();
	while (iterator.hasNext()) {
	    Entry<Person, ArrayList<Animal>> entry = iterator.next();
	    if (entry.getKey().getName().equalsIgnoreCase(name)) {
		iterator.remove();
	    }
	}
    }

    public void removePetByName(String name) {
	Iterator<Entry<Person, ArrayList<Animal>>> iteratorTop = this.map
		.entrySet().iterator();
	while (iteratorTop.hasNext()) {
	    Entry<Person, ArrayList<Animal>> entry = iteratorTop.next();
	    Iterator<Animal> iteratorBottom = entry.getValue().iterator();
	    while (iteratorBottom.hasNext()) {
		Animal animal = iteratorBottom.next();
		if (animal.getName().equalsIgnoreCase(name)) {
		    iteratorBottom.remove();
		}
	    }

	}
    }

    public void removePetByType(String type) {
	Iterator<Entry<Person, ArrayList<Animal>>> iteratorTop = this.map
		.entrySet().iterator();
	while (iteratorTop.hasNext()) {
	    Entry<Person, ArrayList<Animal>> entry = iteratorTop.next();
	    Iterator<Animal> iteratorBottom = entry.getValue().iterator();
	    while (iteratorBottom.hasNext()) {
		Animal animal = iteratorBottom.next();
		if (animal.getType().equalsIgnoreCase(type)) {
		    iteratorBottom.remove();
		}
	    }

	}
    }

    public void fillTestData() {
	this.addPerson("Bill", 27);
	this.addPerson("Stan", 8);
	this.addPerson("Wendy", 23);
	this.addPerson("John", 39);
	this.addPerson("Kyle", 17);
	this.addPerson("Lisa", 16);
	this.addPetToPerson("Bill", "Spike", "Dog");
	this.addPetToPerson("Bill", "Tom", "Cat");
	this.addPetToPerson("Bill", "Claus", "Fish");
	this.addPetToPerson("Stan", "Hades", "Dog");
	this.addPetToPerson("Wendy", "Thor", "Cat");
	this.addPetToPerson("John", "Silvester", "Cat");
	this.addPetToPerson("John", "Tweety", "Bird");
	this.addPetToPerson("Kyle", "Bugs", "Rabbit");
	this.addPetToPerson("Kyle", "Jerry", "Mouse");
	this.addPetToPerson("Lisa", "Santa's Little Helper", "Dog");
	this.addPetToPerson("Lisa", "Snowball", "Cat");
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
