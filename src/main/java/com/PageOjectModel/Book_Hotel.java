package com.PageOjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {

	private WebDriver driver;
	
	@FindBy(id = "first_name")
	private WebElement frstname;		

	@FindBy(id = "last_name")
	private WebElement lstname;
	
	@FindBy(id = "address")
	private WebElement addrs;
	
	@FindBy(id = "cc_num")
	private WebElement ccnum;
	
	@FindBy(id = "cc_type")
	private WebElement cctype;
	
	@FindBy(id = "cc_exp_month")
	private WebElement expmnth;
	
	@FindBy(id = "cc_exp_year")
	private WebElement expyr;
	
	@FindBy(id = "cc_cvv")
	private WebElement cvv;
	
	@FindBy(id = "book_now")
	private WebElement bknwbtn;
	
	public Book_Hotel(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);		
	}

	public WebElement getFrstname() {
		return frstname;
	}

	public WebElement getLstname() {
		return lstname;
	}

	public WebElement getAddrs() {
		return addrs;
	}

	public WebElement getCcnum() {
		return ccnum;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getExpmnth() {
		return expmnth;
	}

	public WebElement getExpyr() {
		return expyr;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBknwbtn() {
		return bknwbtn;
	}
}
