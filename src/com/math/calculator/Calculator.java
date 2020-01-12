package com.math.calculator;

public class Calculator {

	public Calculator() {
		System.out.println("Welcome to Calculato");
	}
	public int add(int i, int j) {
		if(i < Integer.MIN_VALUE+1) {
			return -1;
		}
		return i+j;
	}
}
