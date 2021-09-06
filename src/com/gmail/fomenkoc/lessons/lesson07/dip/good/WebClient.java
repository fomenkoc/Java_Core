package com.gmail.fomenkoc.lessons.lesson07.dip.good;

public class WebClient {
	DataAccessable dataAccessable = new WebDataAccess();

	void fetchData() {
		dataAccessable.executeAccess();
		System.out.println("Data is fetched");
	}
}
