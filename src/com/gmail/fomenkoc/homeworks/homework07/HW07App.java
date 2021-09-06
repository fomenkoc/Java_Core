package com.gmail.fomenkoc.homeworks.homework07;

import com.gmail.fomenkoc.homeworks.homework07.classes.Su27;

public class HW07App {

	public static void main(String[] args) {
		
		Su27 su27 = new Su27("Annihilator", 2500, "Gray-blue");
		su27.startingEngines();
		su27.takeoff();
		su27.flyingUp();
		su27.flyingDown();
		su27.flyingLeft();
		su27.flyingRight();
		su27.landing();
		
		
		
	}

}
