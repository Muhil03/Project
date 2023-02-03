package com.TestNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNG_Dependency {

	@Ignore	
	@Test
	public void item_receipt() {
		System.out.println("Item Receipt");
	}
	
	@Test
	public void asset_request() {
		System.out.println("Asset Request");
	}
	
	@Test(dependsOnMethods="item_receipt")
	public void report() {
		System.out.println("Reports");
	}
}
