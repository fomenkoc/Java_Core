package com.gmail.fomenkoc.homeworks.homework12.classes;

import java.util.Arrays;

public class MyArrayList {
    private final int START_CAPACITY = 10;
    private Object data[];
    private int currentSize = 0;
    private int currentCapacity = 0;

    public MyArrayList(Object data) {
	super();
	this.data = new Object[START_CAPACITY];
	this.data[this.currentSize] = data;
	this.currentSize++;
	this.currentCapacity = this.START_CAPACITY;

    }

    public void add(Object data) {
	if (this.currentSize < this.currentCapacity) {
	    this.data[this.currentSize] = data;
	    this.currentSize++;
	} else {
	    this.currentCapacity *= 1.5;
	    Object newData[] = new Object[this.currentCapacity];
	    for (int i = 0; i < this.data.length; i++) {
		newData[i] = this.data[i];
	    }
	    this.data = newData;
	    this.data[currentSize] = data;
	    this.currentSize++;
	}
    }

    public void remove(int index) {
	Object newData[] = new Object[this.currentCapacity];
	int newIndex = 0;
	for (int i = 0; i < this.data.length; i++) {
	    if (i == index) {
		i++;
	    } 
	    newData[newIndex] = this.data[i];
	    newIndex++;
	}
	this.data = newData;
	this.currentCapacity--;
    }

    public int size() {
	return this.currentSize;
    }

    @Override
    public String toString() {
	return Arrays.toString(data);
    }

}
