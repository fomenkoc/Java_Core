package com.gmail.fomenkoc.homeworks.homework04;

public class HW04App {

	public static void main(String[] args) {

		Robot r = new Robot();
		r.work();
		
		CoffeRobot cr = new CoffeRobot();
		cr.work();
		
		RobotDancer rd = new RobotDancer();
		rd.work();
		
		RobotCoocker rc = new RobotCoocker();
		rc.work();
		
		Robot[] robots = {r, cr, rd, rc};
		
		for(int i = 0; i < robots.length; i++) {
			robots[i].work();
		}
		
		
		
		Animal animal = new Animal("������", 112, 5);

		System.out.println("����� ������� = " + animal.getKind() + 
				", �������� ������� = " + animal.getSpeed() + 
				" ��/���, ³� ������� = " + animal.getAge() + " ����");
		
		animal.setKind("��������");
		animal.setSpeed(55);
		animal.setAge(10);
		
		System.out.println("����� ������� = " + animal.getKind() + 
				", �������� ������� = " + animal.getSpeed() + 
				" ��/���, ³� ������� = " + animal.getAge() + " ����");
		
		System.out.println("А так то взагалі воно вміє в людські літери");
	}

}
