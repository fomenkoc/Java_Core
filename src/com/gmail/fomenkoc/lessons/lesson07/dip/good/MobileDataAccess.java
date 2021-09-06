package com.gmail.fomenkoc.lessons.lesson07.dip.good;

public class MobileDataAccess implements DataAccessable{

	@Override
	public void executeAccess() {
		System.out.println("Mobile data access");
	}

}
