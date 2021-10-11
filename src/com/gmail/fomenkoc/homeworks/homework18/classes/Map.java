package com.gmail.fomenkoc.homeworks.homework18.classes;

import java.util.Arrays;

public class Map<K, V> {
	MyEntry<K, V>[] entries;

	public Map() {
		super();
		this.entries = new MyEntry();
	}

	public Map(MyEntry<K, V>[] entries) {
		super();
		this.entries = entries;
	}

//	Додавали новий об’єкт в мапу
//	Видаляли об’єкт мапи за ключем 
//	Видаляли об’єкт мапи за значенням
//	Виводили на екран Set ключів
//	Виводили на екран List значень
//	Виводили на екран цілу мапу

	public MyEntry<K, V>[] getEntries() {
		return entries;
	}

	public void setEntries(MyEntry<K, V>[] entries) {
		this.entries = entries;
	}

	@Override
	public String toString() {
		return "Map [entries=" + Arrays.toString(entries) + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(entries);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Map other = (Map) obj;
		return Arrays.equals(entries, other.entries);
	}

}
