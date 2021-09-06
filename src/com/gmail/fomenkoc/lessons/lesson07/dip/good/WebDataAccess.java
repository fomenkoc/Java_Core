package com.gmail.fomenkoc.lessons.lesson07.dip.good;

public class WebDataAccess implements DataAccessable {

	@Override
	public void executeAccess() {
		System.out.println("Web data access");
	}

}