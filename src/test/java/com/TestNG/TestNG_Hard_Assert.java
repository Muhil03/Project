package com.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_Hard_Assert {

	@Test
	public void item_receipt() {
		String exp = "Laptop";
		String act = "Laptops";
		Assert.assertEquals(exp, act);
		System.out.println("Item Received");
	}
}
