package com.TestNG;

import org.testng.annotations.Test;

public class TestNG_Grouping {

	@Test(groups="Asset")
	public void laptop() {
		System.out.println("Laptop");
	}
	
	@Test(groups="Asset")
	public void mouse() {
		System.out.println("Mouse");
	}
	
	@Test(groups="Capacity")
	public void hdd() {
		System.out.println("Hard Disk Drive");
	}
	
	@Test(groups="Capacity")
	public void ram() {
		System.out.println("Random Access Memory");
	}
	
	@Test(groups="Scrap Item")
	public void damage() {
		System.out.println("Damage");
	}
	
}
