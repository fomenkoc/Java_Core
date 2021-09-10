package com.gmail.fomenkoc.homeworks.homework09.classes;

import java.util.InputMismatchException;

public class WrongInputParameter extends InputMismatchException{
    private String message;

    public WrongInputParameter(String message) {
	super(message);
	this.message = message;
    }

    public String getMessage() {
        return message;
    }
    
    
}
