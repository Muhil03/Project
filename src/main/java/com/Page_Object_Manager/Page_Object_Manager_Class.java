package com.Page_Object_Manager;

import org.openqa.selenium.WebDriver;

import com.PageOjectModel.Book_Hotel;
import com.PageOjectModel.Booking_Confirmation;
import com.PageOjectModel.Login_Page;
import com.PageOjectModel.Search_Hotel;
import com.PageOjectModel.Select_Hotel;

public class Page_Object_Manager_Class {
	
	private WebDriver driver;
	
	private Login_Page lp; 		
	
	private Search_Hotel sh;
	
	private Select_Hotel htl;  
	
	private Book_Hotel bh;	
	
	private Booking_Confirmation bc;

	public Page_Object_Manager_Class(WebDriver driver2) {
		this.driver = driver2;
	}

	public Login_Page getLp() {
		if(lp==null) {
		lp = new Login_Page(driver);
		}
		return lp;
	}

	public Search_Hotel getSh() {
		if(sh==null) {
		sh = new Search_Hotel(driver);
		}
		return sh;
	}

	public Select_Hotel getHtl() {
		if(htl==null) {
		htl = new Select_Hotel(driver);
		}
		return htl;
	}

	public Book_Hotel getBh() {
		if(bh==null) {
		bh = new Book_Hotel(driver);
		}
		return bh;
	}

	public Booking_Confirmation getBc() {
		if(bc==null) {
		bc = new Booking_Confirmation(driver);
		}
		return bc;
	}

}
