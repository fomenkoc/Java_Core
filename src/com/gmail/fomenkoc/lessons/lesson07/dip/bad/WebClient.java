package com.gmail.fomenkoc.lessons.lesson07.dip.bad;

public class WebClient {
	DataAccess dataAccess = new DataAccess();
	
	void fetchData() {
		dataAccess.executeAccess();
		System.out.println("Data is fetched");
	}
	
}
