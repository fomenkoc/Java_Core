package com.gmail.fomenkoc.homeworks.homework16;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.gmail.fomenkoc.homeworks.homework16.classes.Batman;

public class HW16App {

	public static void main(String[] args) throws NoSuchFieldException,
			SecurityException, IllegalArgumentException, IllegalAccessException,
			NoSuchMethodException, InvocationTargetException {

		Batman batman = new Batman();

		Class batClass = batman.getClass();
		System.out.println("Simple Name:");
		System.out.println(batClass.getSimpleName());
		System.out.println("Simple Name:");
		System.out.println(batClass.getName());
		System.out.println("Package Name:");
		System.out.println(batClass.getPackageName());
		System.out.println("SuperClass Name:");
		System.out.println(batClass.getSuperclass());
		System.out.println();
		System.out.println("Methods: ");
		for (Method method : batClass.getMethods()) {
			System.out.println(method);
		}
		System.out.println();
		System.out.println("Class constrictors:");
		for (Constructor<Batman> constructor : batClass.getConstructors()) {
			System.out.println(constructor);
		}

		System.out.println();
		System.out.println("Class fields:");
		for (Field field : batClass.getDeclaredFields()) {
			System.out.println(field);
		}

		System.out.println();
		Field batarangsCountField = batClass.getDeclaredField("batarangsCount");
		batarangsCountField.setAccessible(true);
		batarangsCountField.set(batman, 100);
		System.out
				.println("New BatarangsCount = " + batman.getBatarangsCount());

		System.out.println();
		
		int[] ints = {3,2,1};
		
		Method method = batClass.getMethod("myMethod", String.class,
				int[].class);
		System.out.println();
		System.out.println(method);
		method.invoke(batman, "Bat-Signal", ints);
		
		method = batClass.getMethod("myMethod", int[].class);
		System.out.println();
		System.out.println(method);
		method.invoke(batman, ints);

	}

}
