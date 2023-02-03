package com.TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG_DataProvider {

	@Test(dataProvider="item_details")
	public void itemreceipt(int item_no, String name) {
		System.out.println("Item Number : "+ item_no );
		System.out.println("Item Name : "+ name);
	}
	
	@DataProvider
	public Object[][] item_details() {
		return new Object[][]{
			{100,"Laptop"},{101,"Mouse"},{102,"Keyboard"},{103,"HDD"}
	};
	}
}
