package com.gmail.fomenkoc.homeworks.homework14.classes;

import java.util.Comparator;

public class RDR2WeaponComparatorPrice implements Comparator<RDR2Weapon> {

    @Override
    public int compare(RDR2Weapon o1, RDR2Weapon o2) {
	if (o1.getWeaponPrice() > o2.getWeaponPrice()) {
	    return 1;
	} else if (o1.getWeaponPrice() < o2.getWeaponPrice()) {
	    return -1;
	} else {
	    return 0;
	}
    }

}
