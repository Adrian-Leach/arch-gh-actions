package com.qaa.module3.unit_testing_exercises.exercise1;

public class Calculator {

	//Comment 1
	public double add(double num1, double num2) {
		return num1 + num2;
	}
	// Comment 2
	public double subtract(double num1, double num2) {
		return num1 - num2;
	}
	
	public double multiply(double num1, double num2) {
		return num1 * num2;
	}
	
	public double divide(double num1, double num2) {
		if (num2 == 0) throw new IllegalArgumentException("Division by zero: divisor must not be 0");
		return num1 / num2;
	}
}
