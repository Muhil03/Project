package com.TestNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNG_Featuress {

	@Test
	public void lap() {		
		System.out.println("Laptop");
	}
	
	@Ignore
	@Test
	public void hdd() {
		System.out.println("Hard Disk Drive");
	}
	
	@Test
	public void mouse() {
		System.out.println("Mouse");
	}
	
	@Test
	public void keyboard() {
		System.out.println("Keyboard");
	}
	
	@Test(enabled=false)
	public void headphone() {
		System.out.println("Headphone");
	}
}
