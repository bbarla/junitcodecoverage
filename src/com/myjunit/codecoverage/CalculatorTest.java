package com.myjunit.codecoverage;

import static org.junit.Assert.*;

import org.junit.Test;

import com.math.calculator.Calculator;

public class CalculatorTest {
	Calculator c = new Calculator();
	private void setup() {
		// TODO Auto-generated method stub
		
	}

	@Test
	public void test() {
		int i=0;int j = 0; int sum = 0;
		int sumc = c.add(i, j);
		assertEquals(sum, sumc);
	}

}
