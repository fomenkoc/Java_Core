package com.gmail.fomenkoc.homeworks.homework03;

public class HW3App {
	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(128, 256);
		
		r1.msgToConsole("Perimeter");
		r1.msgToConsole("area");
		
		r2.msgToConsole("��������");
		r2.msgToConsole("�����");
		r2.msgToConsole("qwe");
		
		
		Circle c = new Circle(42);
		
		System.out.println("����� ���� = " + c.getArea());
		System.out.println("������� ���� = " + c.getLength());
		
		
	}

}
