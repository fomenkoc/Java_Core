package com.gmail.fomenkoc.homeworks.homework14.classes;

public class RDR2Weapon implements Comparable<RDR2Weapon> {
    private String weaponName;
    private double weaponPrice;

    public RDR2Weapon(String weaponName, double weaponPrice) {
	super();
	this.weaponName = weaponName;
	this.weaponPrice = weaponPrice;
    }

    public String getWeaponName() {
	return weaponName;
    }

    public void setWeaponName(String weaponName) {
	this.weaponName = weaponName;
    }

    public double getWeaponPrice() {
	return weaponPrice;
    }

    public void setWeaponPrice(double weaponPrice) {
	this.weaponPrice = weaponPrice;
    }

    @Override
    public String toString() {
	return "RDR2Weapon [weaponName=" + weaponName + ", weaponPrice="
		+ weaponPrice + "]";
    }

    @Override
    public int compareTo(RDR2Weapon o) {
	if (this.getWeaponName().compareToIgnoreCase(o.getWeaponName()) > 0) {
	    return 1;
	} else if (this.getWeaponName()
		.compareToIgnoreCase(o.getWeaponName()) < 0) {
	    return -1;
	} else {
	    if (this.getWeaponPrice() > o.getWeaponPrice()) {
		return 1;
	    } else if (this.getWeaponPrice() < o.getWeaponPrice()) {
		return -1;
	    }
	}
	return 0;
    }

}
