package com.gmail.fomenkoc.homeworks.homework04;

public class HW04App {

	public static void main(String[] args) {
		System.out.println("Hi");
		
//�������� ���� Robot i ����� CoffeRobot, RobotDancer, RobotCoocker, �� ������ ��������� Robot. 
//��������� � Robot ����� work(), � ����� ��� ������� ������ ��� ���� ���������� ����� � ������ (�����, ����� ������� ���������������):
//
//��� Robot, ��� �� ������� ��������� ����� �� Robot � � ������ �������.
//��� CoffeRobot, ��� �� ������� ��������� ����� �� CoffeRobot � � ���� ����.
//��� RobotDancer, ��� �� ������� ��������� ����� �� RobotDancer � � ������ �������.
//��� RobotCoocker, ��� �� ������� ��������� ����� �� RobotCoocker � � ������ ������.
//�������� � Main ���� ���������� ������������ ����� � ��������� �� ������� � ��� ����� work().
//
//�������� � Main ���� ����� ����� Robot , ��������� ����� ������������ ������������ �����. 
//�������� ���� for , �������� �� ��� ��������� ������ � ��������� ��� ������� ������� ������ ����� work().

		Robot r = new Robot();
		r.work();
		
		CoffeRobot cr = new CoffeRobot();
		cr.work();
	
	}

}
