package com.gmail.fomenkoc.lessons.lesson07.dip.good;

public class MobileClient {
	DataAccessable dataAccessable = new MobileDataAccess();
	
	void fetchData() {
		dataAccessable.executeAccess();
		System.out.println("Data is fetched");
	}
}
