package com.Maven_Project;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.Page_Object_Manager.Page_Object_Manager_Class;
import com.Property_File.Input_Instance;

public class Runner extends Baseclass{
	
	private static WebDriver driver = launchbrowser("chrome");
	
	private static Page_Object_Manager_Class pom = new Page_Object_Manager_Class(driver);
	
	public static void main(String[] args) throws IOException {										
				
		urllaunch(Input_Instance.getInstanceInput().geturl());
		
		implicitwait(10);								
		
		passinput(pom.getLp().getUsername(),Input_Instance.getInstanceInput().getUsername());				
		
		passinput(pom.getLp().getPassword(),Input_Instance.getInstanceInput().getPassword());			
		
		clickonelement(pom.getLp().getLoginbtn());								
		
		selectbyvalue(pom.getSh().getLctn(),Input_Instance.getInstanceInput().getLctn());			
		
		selectbyvalue(pom.getSh().getHtl(),Input_Instance.getInstanceInput().getHtl());				
		
		selectbyvalue(pom.getSh().getRmtype(),Input_Instance.getInstanceInput().getRmtype());				
		
		selectbyvalue(pom.getSh().getRmno(),Input_Instance.getInstanceInput().getRmno());				
		
		clear(pom.getSh().getChckindate());
		
		passinput(pom.getSh().getChckindate(),Input_Instance.getInstanceInput().getChckindate());				
		
		clear(pom.getSh().getChckoutdate());
		
		passinput(pom.getSh().getChckoutdate(),Input_Instance.getInstanceInput().getChckoutdate());				
		
		selectbyvalue(pom.getSh().getAdltrm(),Input_Instance.getInstanceInput().getAdltrm());				
		
		selectbyvalue(pom.getSh().getChldrm(),Input_Instance.getInstanceInput().getChldrm());				
		
		clickonelement(pom.getSh().getSbmtbtn());				
			
		clickonelement(pom.getHtl().getRdbtn());			
		
		clickonelement(pom.getHtl().getCntnbtn());						
		
		passinput(pom.getBh().getFrstname(),Input_Instance.getInstanceInput().getFrstname());			
		
		passinput(pom.getBh().getLstname(),Input_Instance.getInstanceInput().getLstname());				
		
		passinput(pom.getBh().getAddrs(),Input_Instance.getInstanceInput().getAddrs());				
		
		passinput(pom.getBh().getCcnum(),Input_Instance.getInstanceInput().getCcnum());				
		
		selectbyvalue(pom.getBh().getCctype(),Input_Instance.getInstanceInput().getCctype());				
		
		selectbyvalue(pom.getBh().getExpmnth(),Input_Instance.getInstanceInput().getExpmnth());				
		
		selectbyvalue(pom.getBh().getExpyr(),Input_Instance.getInstanceInput().getExpyr());				
		
		passinput(pom.getBh().getCvv(),Input_Instance.getInstanceInput().getCvv());				
		
		clickonelement(pom.getBh().getBknwbtn());
		
		takescreenshot("C:\\Users\\USER\\eclipse-workspace\\Maven_Project\\Screenshot\\Booking Confirmation.png");				
		
		clickonelement(pom.getBc().getMyitnrybtn());
		
		takescreenshot("C:\\Users\\USER\\eclipse-workspace\\Maven_Project\\Screenshot\\MyItenary.png");
		
		closetab();
	}

}
