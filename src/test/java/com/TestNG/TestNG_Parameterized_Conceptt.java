package com.TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_Parameterized_Conceptt {

	@Test
	@Parameters({"req_no","req_lctn"})
	public void assetrequest(int req_no, String req_lctn) {
		
		System.out.println("Asset Request Number : "+ req_no);
		
		System.out.println("Asset Request Location : "+ req_lctn);

	}
}
