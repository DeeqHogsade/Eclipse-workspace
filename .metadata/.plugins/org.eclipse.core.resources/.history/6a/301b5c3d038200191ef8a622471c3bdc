package com.qa.calculatorTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.qa.calculator.Calculator;

public class CalculatorTest {
	Calculator calc;
	
	@Before
	public void setup(){
		calc = new Calculator();
	}
	
	@Test
	public void subtractNumbers() {
		Calculator calc = new Calculator();
		int actualValue = calc.sub(5,3);
		assertEquals("Subtraction error", 2, actualValue);
	}
}
