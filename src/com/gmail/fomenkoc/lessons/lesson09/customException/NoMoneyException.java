package com.gmail.fomenkoc.lessons.lesson09.customException;

public class NoMoneyException extends Exception{
	private String amount;

	public NoMoneyException(String amount) {
		super(amount);
		this.amount = amount;
	}

	public String getAmount() {
		return amount;
	}

}
