package com.gmail.fomenkoc.homeworks.homework11.classes;

public class Handlebar {
    private static String[] materials = { "Leather", "Alcantara",
    					"Plastic", "Titanium", "Adamantium" };
    private int diameter;
    private String material;

    public Handlebar(int diameter, String material) {
	super();
	this.diameter = diameter;
	this.material = material;
    }
    
    public Handlebar() {
	super();
	this.diameter = RandomNum.getInt(35, 40);
	this.material = materials[RandomNum.getInt(0, materials.length - 1)];
    }

    @Override
    public String toString() {
	return "[diameter=" + diameter + ", material="
		+ material + "]";
    }

}
