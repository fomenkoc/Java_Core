package com.gmail.fomenkoc.homeworks.homework23.classes;

public class Commodity implements Comparable<Commodity> {

    private String name;
    private double length;
    private double width;
    private double weigth;

    public Commodity(String name, double length, double width, double weigth) {
	super();
	this.name = name;
	this.length = length;
	this.width = width;
	this.weigth = weigth;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public double getLength() {
	return length;
    }

    public void setLength(double length) {
	this.length = length;
    }

    public double getWidth() {
	return width;
    }

    public void setWidth(double width) {
	this.width = width;
    }

    public double getWeigth() {
	return weigth;
    }

    public void setWeigth(double weigth) {
	this.weigth = weigth;
    }

    @Override
    public int compareTo(Commodity o) {
	if (this.getName().compareToIgnoreCase(o.getName()) > 0) {
	    return 1;
	} else if (this.getName().compareToIgnoreCase(o.getName()) < 0) {
	    return -1;
	} else {
	    if (this.getLength() > o.getLength()) {
		return 1;
	    } else if (this.getLength() < o.getLength()) {
		return -1;
	    } else if (this.getWidth() > o.getWidth()) {
		return 1;
	    } else if (this.getWidth() < o.getWidth()) {
		return -1;
	    } else if (this.getWeigth() > o.getWeigth()) {
		return 1;
	    } else if (this.getWeigth() < o.getWeigth()) {
		return -1;
	    }
	}

	return 0;
    }

    @Override
    public String toString() {
	return "Commodity [name=" + name + ", length=" + length + ", width="
		+ width + ", weigth=" + weigth + "]";
    }

}
