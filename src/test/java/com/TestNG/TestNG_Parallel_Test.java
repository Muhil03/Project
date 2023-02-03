package com.TestNG;

import org.testng.annotations.Test;

public class TestNG_Parallel_Test {

	@Test
	public void item_receipt() {
		System.out.println("Item Receipt");
	}
	
	@Test
	public void asset_request() {
		System.out.println("Asset Request");

	}
}
