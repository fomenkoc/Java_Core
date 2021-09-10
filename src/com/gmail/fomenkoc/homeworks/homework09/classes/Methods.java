package com.gmail.fomenkoc.homeworks.homework09.classes;

public class Methods {

    public void addition(double a, double b) throws MyException {
	if ((a < 0) & (b < 0)) {
	    throw new IllegalArgumentException();
	} else if (((a == 0) & (b != 0)) | ((a != 0) & (b == 0))) {
	    throw new ArithmeticException();
	} else if ((a == 0) & (b == 0)) {
	    throw new IllegalArgumentException();
	} else if((a > 0) & (b > 0)) {
	    throw new MyException("MyException");
	} else {
	    System.out.println(a + b);
	}
    }

    public void subtraction(double a, double b) throws MyException {
	if ((a < 0) & (b < 0)) {
	    throw new IllegalArgumentException();
	} else if (((a == 0) & (b != 0)) | ((a != 0) & (b == 0))) {
	    throw new ArithmeticException();
	} else if ((a == 0) & (b == 0)) {
	    throw new IllegalArgumentException();
	} else if((a > 0) & (b > 0)) {
	    throw new MyException("MyException");
	} else {
	    System.out.println(a - b);
	}
    }

    public void multiplication(double a, double b) throws MyException {
	if ((a < 0) & (b < 0)) {
	    throw new IllegalArgumentException();
	} else if (((a == 0) & (b != 0)) | ((a != 0) & (b == 0))) {
	    throw new ArithmeticException();
	} else if ((a == 0) & (b == 0)) {
	    throw new IllegalArgumentException();
	} else if((a > 0) & (b > 0)) {
	    throw new MyException("MyException");
	} else {
	    System.out.println(a * b);
	}
    }

    public void division(double a, double b) throws MyException {
	if ((a < 0) & (b < 0)) {
	    throw new IllegalArgumentException();
	} else if (((a == 0) & (b != 0)) | ((a != 0) & (b == 0))) {
	    throw new ArithmeticException();
	} else if ((a == 0) & (b == 0)) {
	    throw new IllegalArgumentException();
	} else if((a > 0) & (b > 0)) {
	    throw new MyException("MyException");
	} else {
	    System.out.println(a / b);
	}
    }
}
