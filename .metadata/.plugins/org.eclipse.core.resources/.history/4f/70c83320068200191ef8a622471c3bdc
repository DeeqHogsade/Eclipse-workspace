package com.qa.calculatorTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.qa.calculator.Calculator;
import com.qa.calculator.UserInput;

public class CalculatorTest {
	Calculator calc;

	@Before
	public void setup() {
		calc = new Calculator();
	}

	@Test
	public void userInputTest() {
		UserInput input = new UserInput();
		int user = input.input();
		System.out.println(user);
		assertEquals("User input error", 2, user);
	}

	@Test
	public void subtractNumbersTest() {
		int actualValue = calc.sub(5, 3);
		System.out.println(actualValue);
		assertEquals("Subtraction error", 2, actualValue);
	}

}
