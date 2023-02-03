package com.RestAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Get {

@Test
  public void getalluser() {
	  RestAssured.given().log().all().headers("Content-Type","application/json")
	  .get("https://reqres.in/api/users?page=2").then().log().all();
	  
  }
}
