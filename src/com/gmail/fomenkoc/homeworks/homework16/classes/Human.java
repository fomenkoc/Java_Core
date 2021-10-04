package com.gmail.fomenkoc.homeworks.homework16.classes;

import java.util.Objects;

public class Human {
	private String firstName;
	private String secondName;

	public Human(String firstName, String secondName) {
		super();
		this.firstName = firstName;
		this.secondName = secondName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstName, secondName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Human other = (Human) obj;
		return Objects.equals(firstName, other.firstName)
				&& Objects.equals(secondName, other.secondName);
	}

	@Override
	public String toString() {
		return "Human [firstName=" + firstName + ", secondName=" + secondName
				+ "]";
	}

}
