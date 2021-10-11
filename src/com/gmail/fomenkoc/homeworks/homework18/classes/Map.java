package com.gmail.fomenkoc.homeworks.homework18.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Map<K, V> {

	private MyEntry<K, V>[] entry;
	private int size;
	private int capacity;

	public Map() {
		super();
		this.size = 0;
		this.capacity = 10;
		this.entry = new MyEntry[this.capacity];
	}

	public Map(MyEntry<K, V>[] entry) {
		super();
		this.size = entry.length;
		this.capacity = entry.length;
		this.entry = entry;

	}

//	Додавали новий об’єкт в мапу
	public void add(K key, V value) {
		if (this.size == this.capacity) {
			increaseCapacity();
		}
		this.entry[this.size] = new MyEntry(key, value);
		this.size++;
	}

	public void add(MyEntry<K, V> myEntry) {
		if (this.size == this.capacity) {
			increaseCapacity();
		}
		this.entry[this.size] = myEntry;
		this.size++;
	}

	public MyEntry<K, V> getEntry(int i) {
		return entry[i];
	}

	public V getValue(K key) {
		MyEntry<K, V> myEntry = null;
		for (int i = 0; i < this.size; i++) {
			if (this.entry[i].getKey().equals(key)) {
				myEntry = this.entry[i];
			}
		}

		return myEntry.getValue();
	}

	public K getKey(V value) {
		MyEntry<K, V> myEntry = null;
		for (int i = 0; i < this.size; i++) {
			if (this.entry[i].getValue().equals(value)) {
				myEntry = this.entry[i];
			}
		}

		return myEntry.getKey();
	}

	public void setEntry(MyEntry<K, V>[] entry) {
		this.entry = entry;
	}

	public int size() {

		return this.size;
	}

	public boolean isEmpty() {

		return (this.size == 0);
	}

//	Видаляли об’єкт мапи за ключем 
	public void removeByKey(K key) {
		MyEntry<K, V>[] tmpEntry = Arrays.copyOf(this.entry, this.capacity);
		this.entry = new MyEntry[this.capacity];
		int tmpSize = this.size;
		this.size = 0;
		for (int i = 0; i < tmpSize; i++) {
			if (!tmpEntry[i].getKey().equals(key)) {
				add(tmpEntry[i]);
			}
		}

	}

//	Видаляли об’єкт мапи за значенням
	public void removeByValue(V value) {
		MyEntry<K, V>[] tmpEntry = Arrays.copyOf(this.entry, this.capacity);
		this.entry = new MyEntry[this.capacity];
		int tmpSize = this.size;
		this.size = 0;
		for (int i = 0; i < tmpSize; i++) {
			if (!tmpEntry[i].getValue().equals(value)) {
				add(tmpEntry[i]);
			}
		}
	}

//	Виводили на екран Set ключів
	public HashSet<K> getKeysSet() {
		HashSet<K> set = new HashSet<>();
		for (int i = 0; i < this.size; i++) {
			set.add(this.entry[i].getKey());
		}
		return set;
	}

//	Виводили на екран List значень
	public ArrayList<V> getValuesList() {
		ArrayList<V> arrayList = new ArrayList<V>();
		for (int i = 0; i < this.size; i++) {
			arrayList.add(this.entry[i].getValue());
		}
		return arrayList;
	}

//	Виводили на екран цілу мапу
	@Override
	public String toString() {
		return "Map [entry=" + Arrays.toString(entry) + "]";
	}

	void increaseCapacity() {
		this.capacity += 10;
		this.entry = Arrays.copyOf(this.entry, this.capacity);
	}

}
