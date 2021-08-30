package com.gmail.fomenkoc.homeworks.homework03;

public class Rectangle {

	private int width;
	private int height;

	public Rectangle() {
		this.width = 64;
		this.height = 32;
	}

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int getPerimeter() {
		return (this.width + this.height) * 2;
	}

	public int getArea() {
		return (this.width * this.height);
	}

	public void msgToConsole(String s) {

		s = s.toLowerCase();

		switch (s) {
		case "perimeter":
		case "��������":
			System.out.println("�������� ������������ = " + this.getPerimeter());
			break;
		case "area":
		case "�����":
			System.out.println("����� ������������ = " + this.getArea());
			break;
		default:
			System.out.println("���������� ��������");
			break;
		}
	}
}
