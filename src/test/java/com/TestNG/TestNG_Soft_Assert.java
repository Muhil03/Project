package com.TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNG_Soft_Assert {

	@Test
	public void item_receipt() {
		String exp = "Laptop";
		String act = "Laptops";
		SoftAssert s = new SoftAssert();
		s.assertEquals(exp, act);
		System.out.println("Item Received");
	}
}
