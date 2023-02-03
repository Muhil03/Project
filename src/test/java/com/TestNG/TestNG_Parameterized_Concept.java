package com.TestNG;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_Parameterized_Concept {

	@Test
	@Parameters({"itemno","name"})
	public void item_receipt(@Optional("100")int itemno, @Optional("Mouse")String name) {		
		
		System.out.println("Item Number : "+ itemno);
		
		System.out.println("Item Name : "+ name);
	}
}
