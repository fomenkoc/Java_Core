package com.gmail.fomenkoc.homeworks.homework18.classes;

import java.util.Objects;

public class MyEntry<K, V> {
	K key;
	V value;

	public MyEntry() {
		super();

	}

	public MyEntry(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "MyEntry [key=" + key + ", value=" + value + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(key, value);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyEntry other = (MyEntry) obj;
		return Objects.equals(key, other.key)
				&& Objects.equals(value, other.value);
	}

}
