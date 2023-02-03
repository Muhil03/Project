package com.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_IRetryAnalyser {

	@Test
	public void item_receipt() {
		String exp = "Laptop";
		String act = "Laptop";
		Assert.assertEquals(exp, act);		
	}
	
	@Test
	//(retryAnalyzer=Rerun.class)
	public void asset_request() {
		String exp = "Mouse";
		String act = "Keyboard";
		Assert.assertEquals(act, exp);

	}
}
