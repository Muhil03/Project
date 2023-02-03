package com.TestNG;

import org.testng.annotations.Test;

public class TestNG_Expected_Exception {

	@Test(expectedExceptions = ArithmeticException.class)
	public void exception() {
		int i = 10;
		System.out.println(i/0);
	}
}
