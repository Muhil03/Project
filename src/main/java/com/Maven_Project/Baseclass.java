package com.Maven_Project;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {
	
	public static WebDriver driver;

	public static WebDriver launchbrowser(String browsername) {
		
		if(browsername.equalsIgnoreCase("chrome")) {
			
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		}
		else if(browsername.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Driver\\geckodriver.exe");
			
			driver = new FirefoxDriver();
			
			driver.manage().window().maximize();
		}
		
		return driver;		
		}
	
	//get
	public static void urllaunch(String url) {
		driver.get(url);
	}
	
	//close
	public static void closetab() {
		driver.close();
	}
	
	//quit
	public static void terminatebrowser() {
		driver.quit();
	}
	
	//send keys
	public static void passinput(WebElement element, String input) {
		element.sendKeys(input);
	}
	
	//click
	public static void clickonelement(WebElement element) {
		element.click();
	}
	
	//select by index
	public static void selectbyindex(WebElement element, int index) {
		Select s = new Select(element);
		s.selectByIndex(index);
	}
	
	//select by value
	public static void selectbyvalue(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}
	
	//select by visible text
	public static void selectbyvisibletext(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}
	
	//Screen shot
	public static void takescreenshot(String path) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dstn = new File(path); 
		FileUtils.copyFile(src, dstn);
	}
	
	//Implicit wait
	public static void implicitwait(int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	
	//clear
	public static void clear(WebElement element) {
		element.clear();
	}
	}

