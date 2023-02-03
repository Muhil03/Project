package com.Property_File;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Input_Reader {

	public static Properties p;
	
	public Input_Reader() throws IOException {
		
		File f = new File("C:\\Users\\USER\\eclipse-workspace\\Maven_Project\\src\\main\\java\\com\\Property_File\\Input_Store.properties");
		
		FileInputStream fis = new FileInputStream(f);
		
		p = new Properties();
		
		p.load(fis);		
	}
	
	public String geturl() throws IOException {
						
		String url = p.getProperty("url");
		
		return url;		
	}
	
	public String getUsername() {
		
		String username = p.getProperty("Username");
		
		return username;
	}
	
	public String getPassword() {
		
		String password = p.getProperty("Password");
		
		return password;		
	}
	
	public String getLctn() {
		
		String Lctn = p.getProperty("Lctn");
		
		return Lctn;
	}
	
	public String getHtl() {
		
		String Htl = p.getProperty("Htl");

		return Htl;
	}
	
	public String getRmtype() {
		
		String Rmtype = p.getProperty("Rmtype");
		
		return Rmtype;		
	}
	
	public String getRmno() {

		String Rmno = p.getProperty("Rmno");

		return Rmno;
	}
	
	public String getChckindate() {
		
		String Chckindate = p.getProperty("Chckindate");
		
		return Chckindate;
	}
	
	public String getChckoutdate() {
		
		String Chckoutdate = p.getProperty("Chckoutdate");
		
		return Chckoutdate;
	}
	
	public String getAdltrm() {
		
		String Adltrm = p.getProperty("Adltrm");
		
		return Adltrm;
	}
	
	public String getChldrm() {
		
		String Chldrm = p.getProperty("Chldrm");
		
		return Chldrm;
	}
	
	public String getFrstname() {

		String Frstname = p.getProperty("Frstname");
		
		return Frstname;
	}
	
	public String getLstname() {
		
		String Lstname = p.getProperty("Lstname");
		
		return Lstname;		
	}
	
	public String getAddrs() {
		
		String Addrs = p.getProperty("Addrs");
		
		return Addrs;
	}
	
	public String getCcnum() {
		
		String Ccnum = p.getProperty("Ccnum");
		
		return Ccnum;
	}
	
	public String getCctype() {
		
		String Cctype = p.getProperty("Cctype");
		
		return Cctype;
	}
	
	public String getExpmnth() {
		
		String Expmnth = p.getProperty("Expmnth");
		
		return Expmnth;
	}
	
	public String getExpyr() {
		
		String Expyr = p.getProperty("Expyr");
		
		return Expyr;
	}
	
	public String getCvv() {
		
		String Cvv = p.getProperty("Cvv");
		
		return Cvv;		
	}	
}

