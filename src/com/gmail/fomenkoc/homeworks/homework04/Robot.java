package com.gmail.fomenkoc.homeworks.homework04;

public class Robot {

	private String msg;
	
	public Robot() {
		this.msg = "� Robot � � ������ ������";
	}
	
	
	public void setMsg(String msg) {
		this.msg = msg;
	}


	public void work() {
		System.out.println(msg);
	}
}
