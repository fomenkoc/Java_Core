package com.gmail.fomenkoc.homeworks.homework21.classes;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

import com.gmail.fomenkoc.homeworks.homework21.annotations.MyAnnotation;

public class ClassFieldsDescription {

	public static void makeFile(Class<?> inputClass) {

		File file = new File(inputClass.getSimpleName()
				+ "FieldsDescription.txt");
		Field[] fields = inputClass.getDeclaredFields();
		StringBuilder stringBuilder = new StringBuilder("");

		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];

			if (field.getAnnotation(
					MyAnnotation.class) instanceof MyAnnotation) {

				stringBuilder.append(field.getName() + " (" + field.getType()
						+ ") " + " ----->  ");
				stringBuilder.append(
						field.getAnnotation(MyAnnotation.class).value() + "\n");
			}
		}

		FileWriter fileWriter;
		try {
			fileWriter = new FileWriter(file);
			fileWriter.write(stringBuilder.toString());
			fileWriter.close();
			System.out.println("File \"" + file.toString()+"\" created.");
		} catch (IOException e) {

			e.printStackTrace();
		}

	}
}
