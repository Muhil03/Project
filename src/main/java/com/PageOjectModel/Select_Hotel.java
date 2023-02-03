package com.PageOjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {

	private WebDriver driver;
	
	@FindBy(id = "radiobutton_0")
	private WebElement rdbtn;	

	@FindBy(id = "continue")
	private WebElement cntnbtn;
	
	public Select_Hotel(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);		
	}

	public WebElement getRdbtn() {
		return rdbtn;
	}

	public WebElement getCntnbtn() {
		return cntnbtn;
	}
}
