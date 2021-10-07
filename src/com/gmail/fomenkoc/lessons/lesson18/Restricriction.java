package com.gmail.fomenkoc.lessons.lesson18;

public class Restricriction <T extends Number>{

	T[] nums;

	public Restricriction(T[] nums) {
		super();
		this.nums = nums;
	}
	
	double average () {
		double sum = 0;
		for (int i= 0; i<nums.length; i++) {
			sum+=nums[i].doubleValue();
		}
		
		return sum/nums.length;
	}
	
	
	
}
