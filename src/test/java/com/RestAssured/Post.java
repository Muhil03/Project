package com.RestAssured;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Post {
  @Test
  public void createuser() {
	  
	  RestAssured.baseURI="https://reqres.in/api/users";
	  RequestSpecification given = RestAssured.given();
	  JSONObject obj = new JSONObject();
	  obj.put("name", "Maghen");
	  obj.put("job", "Tester");
	  given.header("Content-Type","application/json");
	  given.body(obj.toJSONString());
	  Response post = given.post("https://reqres.in/api/users");
	  System.out.println(post.getStatusCode());
	  System.out.println("Created User Successfully");
  }
}
