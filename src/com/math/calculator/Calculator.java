package com.math.calculator;

public class Calculator {

	public Calculator() {
		System.out.println("Welcome to Calculator...");
	}
	public int add(int i, int j) {
		if(i < Integer.MIN_VALUE+1) {
			return -1;
		}
		if(i==0 && j==0) {
			System.out.println("Please input only non zero integers");
			return -1;
		}
		if((i<0 || j<0)){
			System.out.println("Please input only positive integers");
			return -1;
		}
		return i+j;
	}
}
