package com.gmail.fomenkoc.homeworks.homework09;

import com.gmail.fomenkoc.homeworks.homework09.classes.Menu;
import com.gmail.fomenkoc.homeworks.homework09.classes.Methods;
import com.gmail.fomenkoc.homeworks.homework09.classes.MyException;

public class HW09App {

    public static void main(String[] args) throws MyException {
	Menu.start();

	Methods m = new Methods();
	m.addition(53321, -47174);
	m.subtraction(-654, 321);
	m.multiplication(169, -77);
	m.division(-6541, 19);
//	m.addition(-1, -2);
//	m.subtraction(0, 1);
//	m.multiplication(0, 0);
//	m.division(1, 2);
    }

}
