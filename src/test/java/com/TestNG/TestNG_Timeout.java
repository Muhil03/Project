package com.TestNG;

import org.testng.annotations.Test;

public class TestNG_Timeout {

	@Test(timeOut=5000)
	public void login() throws InterruptedException {
		
		Thread.sleep(2000);
		System.out.println("Browser Launch");
		
		Thread.sleep(2000);
		System.out.println("URL Launch");
		
		Thread.sleep(2000);
		System.out.println("Login");

	}
}
