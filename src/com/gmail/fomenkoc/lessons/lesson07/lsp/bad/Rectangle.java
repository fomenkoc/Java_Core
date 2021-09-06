package com.gmail.fomenkoc.lessons.lesson07.lsp.bad;

public class Rectangle {
	int weight;
	int height;
	
	
	
	
	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void setHeight(int height) {
		this.height = height;
	}




	int calculateSquire() {
		return weight * height;
	}
}
