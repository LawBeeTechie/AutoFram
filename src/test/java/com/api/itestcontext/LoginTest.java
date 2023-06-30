package com.api.itestcontext;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.api.pojo.LoginPojo;
import com.utils.TestUtility;

import io.restassured.http.Header;
import io.restassured.response.Response;

public class LoginTest {


	private String loginRequestBody;
	
	@BeforeMethod (description = "Setting up the baserURI and the login POJO")
	public void setup() {
		baseURI = "http://139.59.91.96:9000/v1"; 
		 LoginPojo loginpojo = new LoginPojo("iamfd", "password");
		 loginRequestBody = TestUtility.toJson(loginpojo);	 
	}
	
	@Test(description = "verify if login api works for from desk and returns 200 status code with message as success", groups = {"e2e", "smoke",
			"sanity"}, priority = 1 )//, retryAnalyzer = com.utils.MyRetryAnalyzer.class)
	/*
	 * ITestContext allows the parsing of one @test function which would be needed in other @test fuction
	 * it is a way of hiding away hard codes from your framework . Another way to do this is in
	 * the other com.api.test package where i used Enums
	 */
	public void test_login_api(ITestContext ctx) { 
		String token = given()
			 		.header(new Header("Content-Type", "application/json")).body(loginRequestBody)
			 		.when().log().all().post("/login").then()
						.log().all().assertThat().statusCode(200).and().extract().body()
						.jsonPath().getString("data.token");
							System.out.println(token);
							ctx.setAttribute("FDToken", token);
		
	}
}
