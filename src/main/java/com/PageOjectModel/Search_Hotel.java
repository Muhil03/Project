package com.PageOjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {	
	
	private WebDriver driver;
	
	@FindBy(id = "location")
	private WebElement lctn;	

	@FindBy(id = "hotels")
	private WebElement htl;
	
	@FindBy(id = "room_type")
	private WebElement rmtype;
	
	@FindBy(id = "room_nos")
	private WebElement rmno;
	
	@FindBy(id = "datepick_in")
	private WebElement chckindate;
	
	@FindBy(id = "datepick_out")
	private WebElement chckoutdate;
	
	@FindBy(id = "adult_room")
	private WebElement adltrm;
	
	@FindBy(id = "child_room")
	private WebElement chldrm;
	
	@FindBy(id = "Submit")
	private WebElement sbmtbtn;
	
	public Search_Hotel(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLctn() {
		return lctn;
	}

	public WebElement getHtl() {
		return htl;
	}

	public WebElement getRmtype() {
		return rmtype;
	}

	public WebElement getRmno() {
		return rmno;
	}

	public WebElement getChckindate() {
		return chckindate;
	}

	public WebElement getChckoutdate() {
		return chckoutdate;
	}

	public WebElement getAdltrm() {
		return adltrm;
	}

	public WebElement getChldrm() {
		return chldrm;
	}

	public WebElement getSbmtbtn() {
		return sbmtbtn;
	}
}
