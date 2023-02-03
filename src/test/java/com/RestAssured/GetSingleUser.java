package com.RestAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetSingleUser {
  @Test
  public void getsingleuser() {
	  RestAssured.given().log().all().header("Content-Type","application/json")
	  .get("https://reqres.in/api/users/9").then().log().all();
  }
}
