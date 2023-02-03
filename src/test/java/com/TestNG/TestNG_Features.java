package com.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Features {
	@BeforeSuite
		public void propertysetting() {
			System.out.println("Property Setting");
		}
	@BeforeTest
		public void browserlaunch() {
		System.out.println("Chrome");
	}
	@BeforeClass
		public void urllaunch() {
		System.out.println("www.hmcl.in");
	}
	@BeforeMethod
		public void Login() {
			System.out.println("Login Credentials");
		}
	@Test(priority=-1)
		public void laptop() {
			System.out.println("Laptop");
		}
	@Test(priority=2)
		public void keyboard() {
			System.out.println("Keyboard");
		}
	@Test(priority=1)
		public void mouse() {
			System.out.println("Mouse");
		}
	@Test(invocationCount=2)
		public void hdd() {
			System.out.println("Hard Disk Drive");
		}
	@AfterMethod
		public void logout() {
			System.out.println("Logout");
		}
	@AfterClass
		public void screenshot() {
			System.out.println("Screen Shot");
		}
	@AfterTest
		public void refresh() {
			System.out.println("Refresh");
		}
	@AfterSuite
		public void close() {
			System.out.println("Close");
		}
}
