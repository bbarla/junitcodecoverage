package com.myjunit.codecoverage;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.math.calculator.Calculator;

public class CalculatorTest {
	Calculator c = new Calculator();
	private void setup() {
		// TODO Auto-generated method stub
		
	}

	@Test
	public void test() {
		System.out.println("Starting Junit ...");
		int i=10;int j = 20; int sum = 30;
		boolean condition = false;
		int sumc = c.add(i, j);
		if(sum==sumc) {
			condition = true;
		} 
		assertTrue(condition);
	}

}
