package com.gmail.fomenkoc.lessons.lesson07.lsp.good;

public class Square implements Squire{
	int width;
	
	
	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public int calculateSquire() {
		return width * width;
	}

}
