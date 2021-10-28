package com.gmail.fomenkoc.homeworks.homework23.classes;

import java.util.Comparator;

public class TopBriberComparator implements Comparator<Deputy> {

    @Override
    public int compare(Deputy o1, Deputy o2) {
	if (o1.getBribe() > o2.getBribe()) {
	    return -1;
	} else if (o1.getBribe() < o2.getBribe()) {
	    return 1;
	}
	return 0;
    }

}
